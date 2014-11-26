import com.sun.corba.se.impl.io.TypeMismatchException;
import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

/**
 * Created by Oliver on 24.11.2014.
 */
public class WaffleStation extends WaffleBaseVisitor<Object> {
    protected Map<String, Variable> mem = new HashMap<String, Variable>();
    static private Map<String, WaffleParser.SubroutineContext> functions = new HashMap<String, WaffleParser.SubroutineContext>();


    Binding binding = new Binding();

    @Override
    public Object visitSubroutine(@NotNull WaffleParser.SubroutineContext ctx) {
        String funcName = ctx.subroutine_header().routine_name().getText();
        functions.put(funcName,ctx);
        return null;
    }

    @Override
    public Object visitVar_decl(@NotNull WaffleParser.Var_declContext ctx) {

        String varName = ctx.variable().getText();
        if(mem.containsKey(varName))
        {
            ERROR("Variable " + varName + " already declared. ["+ctx.getStart().getLine()+"]");
        }

        Variable value = (Variable) visitType(ctx.type_decl().type());
        Variable expValue = null;
        if(ctx.expression() != null)
             expValue = (Variable) visit(ctx.expression());
        if(expValue != null && value.getType() == expValue.getType())
        {
            value = new Variable(expValue);
        } else if (expValue != null)
        {
            ERROR("Type mismatch while initializing " + varName + ". Expecting " + value.getTypeString() + ". [" + ctx.getStart().getLine() + "]");

        }
        mem.put(varName,value);

        return value;
    }

    @Override
    public Object visitType(@NotNull WaffleParser.TypeContext ctx) {

        String args = "";

        String constructString = "return new Variable(new ";
        String  typespec = ctx.getText();

        typespec = typespec.replace("Int","Integer");

        if(typespec.contains("Array")) {
            typespec = typespec.replace("Array", "ArrayList");
            args = "());";
        } else
        {
            String lol = ctx.getText();
            if(lol.contains("Int"))
                args = "(0));";
            else if (lol.contains("Double"))
                args = "(0.0));";
            else if (lol.contains("Boolean"))
                args = "(false));";
        }


        constructString += typespec;
        constructString += args ;
        GroovyShell xer = new GroovyShell(binding);
        Object value = xer.evaluate(constructString);
        //System.out.println(value);

        return value;
    }

    @Override
    public Object visitExpParenthesis(@NotNull WaffleParser.ExpParenthesisContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Object visitExpIndexed(@NotNull WaffleParser.ExpIndexedContext ctx) {
        return super.visitExpIndexed(ctx);
    }

    @Override
    public Object visitExpVariable(@NotNull WaffleParser.ExpVariableContext ctx) {
        return getVarByName(ctx.variable_expression());
    }

    @Override
    public Object visitExpUnary(@NotNull WaffleParser.ExpUnaryContext ctx) {
        return super.visitExpUnary(ctx);
    }



    @Override
    public Object visitExpBinary(@NotNull WaffleParser.ExpBinaryContext ctx) {
        Variable leftside = (Variable) visit(ctx.left);
        Variable rightside =(Variable) visit(ctx.right);

         if (ctx.operator.getText().equals("+")) {
             return leftside.add(rightside);

        }
        return null;

    }

    @Override
    public Object visitExpList(@NotNull WaffleParser.ExpListContext ctx) {

        List<Variable> listObject = new ArrayList<Variable>();

        Variable firstObj = null;
        for(WaffleParser.ExpressionContext con : ctx.list_expression().expression()) {
            Variable obj = (Variable)visit(con);

            if(firstObj == null)
            {
                firstObj = obj;
            }
            if(obj.getType() == firstObj.getType())
                listObject.add(obj);
            else {

                System.err.println("Trying to add multiple object types to array");
                System.exit(-1);
            }
        }
        return listObject;
    }

    @Override
    public Object visitNumeric_literal(@NotNull WaffleParser.Numeric_literalContext ctx) {
        if(ctx.getText().contains("."))
            return new Variable(Double.parseDouble(ctx.getText()));
        else
            return new Variable(Integer.parseInt(ctx.getText()));
    }

    @Override
    public Object visitString_literal(@NotNull WaffleParser.String_literalContext ctx) {
        return new Variable(ctx.getText().replace("\"",""));
    }

    @Override
    public Object visitExpCall(@NotNull WaffleParser.ExpCallContext ctx) {

        String funcName = ctx.variable().getText(); //get func name from call
        List<WaffleParser.ExpressionContext> callExps = ctx.expression();

        if(functions.containsKey(funcName))
        {

            SubWaffleStation subStation = new SubWaffleStation(this, functions.get(funcName));


            if(!checkParamTypes(callExps,subStation))
            {
                ERROR("Parameter count does not match declaration: " + funcName + "[" +  ctx.getStart().getLine() + "]");
            }

        } else if (funcName.equals("println"))
        {

            if(callExps.size() != 1)
               ERROR("Parameter count does not match declaration: " + funcName + "[" + ctx.getStart().getLine() + "]");
            System.out.println(mem.get(callExps.get(0).getText()).getData());

        } else if (funcName.equals("print"))
        {
            System.out.print("whatever it says tere");

        } else if (funcName.equals("len"))
        {
            System.out.println("length");
        } else
        {
            ERROR("Could not find function: " + funcName + "[" + ctx.getStart().getLine() + "]");

        }
        return null;
    }

    private boolean checkParamTypes(List<WaffleParser.ExpressionContext> callExps, SubWaffleStation subStation) {
        subStation.visitSubroutine_header(subStation.subRoot.subroutine_header());     //crazy code

        if(callExps.size() != subStation.mem.size())
        {
            return false;
        }

        int i = 0;

        for (Map.Entry<String, Variable> entry : subStation.mem.entrySet())
        {
            if(entry.getValue().getType() != mem.get(callExps.get(i).getText()).getType())
                return false;
            i++;
        }
        return true;

    }

    void ERROR(String txt)
    {
        System.err.println(txt);
        System.exit(-1);
    }


    @Override
    public Object visitAssign_statement(@NotNull WaffleParser.Assign_statementContext ctx) {

        Variable rightside = (Variable) visit(ctx.right);
        Variable leftside =  getVarByName(ctx.left);

        if(leftside.getType() == rightside.getType())
        {
            leftside.copy(rightside);
        }
        return leftside;
    }

    private Variable getVarByName(WaffleParser.Variable_expressionContext left) {


        if(left.indexed_expression() == null) {
            return mem.get(left.variable().getText());
        } else {
                Variable arrayVar =   mem.get(left.indexed_expression().variable().getText());
                int index = (Integer)(visit(left.indexed_expression().expression()));
                return arrayVar.getArrData().get(index);

        }

    }
}

