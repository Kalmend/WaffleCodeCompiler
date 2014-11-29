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
            String typ = ctx.getText();
            if(typ.equals("Int"))
                args = "(0));";
            else if (typ.equals("Double"))
                args = "(0.0));";
            else if (typ.equals("Boolean"))
                args = "(false));";
            else if (typ.equals("String"))
                args = "(\"\"));";
            else
                ERROR("Unrecognized type: " + typ + "[" + ctx.getStart().getLine() + "]");
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
        Variable result = null;
         if (ctx.operator.getText().equals("+")) {
             result = leftside.add(rightside);

        }

        if(result == null) {
            ERROR("Ivalid operation : " + leftside.getType() + " " + ctx.operator.getText() +  " " + rightside.getType()+ " [" + ctx.getStart().getLine() + "]");
        }
        return result;

    }

    @Override
    public Object visitExpList(@NotNull WaffleParser.ExpListContext ctx) {

        ArrayList<Variable> listObject = new ArrayList<Variable>();


        for(WaffleParser.ExpressionContext con : ctx.list_expression().expression()) {
            Variable obj = (Variable)visit(con);

                listObject.add(obj);

        }
        return new Variable(listObject);
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
        return new Variable(ctx.getText().replace("\\\"","_QUOTE_").replace("\"","").replace("_QUOTE_","\"").replace("\\n","\n").replace("\\t","\t"));
    }

    @Override
    public Object visitBoolean_literal(@NotNull WaffleParser.Boolean_literalContext ctx) {
        return new Variable(Boolean.parseBoolean(ctx.getText()));
    }

    @Override
    public Object visitExpCall(@NotNull WaffleParser.ExpCallContext ctx) {

        String funcName = ctx.variable().getText(); //get func name from call
        List<WaffleParser.ExpressionContext> callExps = ctx.expression();

        if(functions.containsKey(funcName))
        {

            SubWaffleStation subStation = new SubWaffleStation(this, functions.get(funcName), ctx);

            return subStation.call();

           // subStation.visit(functions.get(funcName).body());
            //System.out.println(subStation.mem);

        } else if (funcName.equals("println"))
        {

            if(callExps.size() != 1)
               ERROR("Parameter count does not match declaration: " + funcName + "[" + ctx.getStart().getLine() + "]");

            System.out.println(visit(callExps.get(0)));

        } else if (funcName.equals("print"))
        {
            System.out.print(visit(callExps.get(0)));

        } else if (funcName.equals("len"))
        {
            Variable var = ((Variable) visit(callExps.get(0))).getLength();
            if (var == null)
                ERROR("len functions only accepts String or Array type: " + funcName + "[" + ctx.getStart().getLine() + "]");
            return var;
        } else
        {
            ERROR("Could not find function: " + funcName + "[" + ctx.getStart().getLine() + "]");

        }
        return null;
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
                int index = ((Variable)(visit(left.indexed_expression().expression()))).getIntData();
                Variable var = null;
            try{
                var = arrayVar.getArrData().get(index);

            } catch(Exception e) {
                ERROR("Array index out of bounds " + left.indexed_expression().variable().getText() + " size is  " + arrayVar.getArrData().size() + ". [" + left.getStart().getLine() + "]");
            }

            return var;

        }

    }
}

