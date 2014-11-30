import com.sun.corba.se.impl.io.TypeMismatchException;
import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.codehaus.groovy.transform.tailrec.VariableAccessReplacer;

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
        return new Variable(Variable.VarType.NULL); // returning NULL variable == returns no info
    }

    @Override
    public Object visitBody(@NotNull WaffleParser.BodyContext ctx) {
        if(ctx.getParent().getClass().equals(WaffleParser.SubroutineContext.class))
        {
            Variable result = new Variable(Variable.VarType.NULL);
            for(WaffleParser.StatementContext statement : ctx.statement())
            {
                result  = (Variable) visit(statement);
                if(result.getType() == Variable.VarType.RETURN)
                    return new Variable(Variable.VarType.NULL); // returning NULL variable == returns no data
                else if (result.getType() == Variable.VarType.BREAK)
                {
                    ERROR("found break outside of loop. [" + ctx.getStart().getLine() + "]");
                }


            }
            return result;
        } else if (ctx.getParent().getClass().equals(WaffleParser.For_statementContext.class)){

            Variable result = new Variable(Variable.VarType.NULL);
            for (WaffleParser.StatementContext statement : ctx.statement())
            {
                result = (Variable) visit(statement);
                if(result.getType() == Variable.VarType.RETURN)
                    return new Variable(Variable.VarType.RETURN);
                else if (result.getType() == Variable.VarType.BREAK)
                {
                    return new Variable(Variable.VarType.BREAK);
                }


            }
            return result;
        } else {
            Variable result = new Variable(Variable.VarType.NULL);
            for (WaffleParser.StatementContext statement : ctx.statement())
            {
                result = (Variable) visit(statement);
            }
            return result;
        }
    }

    @Override
    public Object visitReturn_statement(@NotNull WaffleParser.Return_statementContext ctx) {

        ERROR("found return  outside of function. [" + ctx.getStart().getLine() + "]");
        return new Variable(Variable.VarType.NULL);
    }


    @Override
    public Object visitBreak_statement(@NotNull WaffleParser.Break_statementContext ctx) {
        ERROR("found break outside of loop. [" + ctx.getStart().getLine() + "]");
        return new Variable(Variable.VarType.NULL);
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
            value = expValue; //TODO. make sure this didnt break stuff new Value(expValue);
        } else if (expValue != null)
        {
            ERROR("Type mismatch while initializing " + varName + ". Expecting " + value.getTypeString() + " got " +  expValue.getTypeString()+ ". [" + ctx.getStart().getLine() + "]");

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
    public Object visitVariable_expression(@NotNull WaffleParser.Variable_expressionContext ctx) {
        return getVarByName(ctx);
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

        //TODO: Use tokens instead
        if (ctx.operator.getText().equals("+")) {
            result = leftside.add(rightside);
        }else if (ctx.operator.getText().equals("-")) {
            result = leftside.sub(rightside);
        }else if (ctx.operator.getText().equals("==")) {
            result = leftside.EQ(rightside);
        }else if (ctx.operator.getText().equals(">")) {
            result = leftside.GT(rightside);
        }else if (ctx.operator.getText().equals(">")) {
            result = leftside.LT(rightside);
        }

        if(result.getType() == Variable.VarType.NULL) {
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

            Variable retVal = subStation.call();

            return retVal;

           // subStation.visit(functions.get(funcName).body());
            //System.out.println(subStation.mem);

        } else if (funcName.equals("println"))
        {

            if(callExps.size() != 1)
               ERROR("Parameter count does not match declaration: " + funcName + "[" + ctx.getStart().getLine() + "]");
            Variable var = (Variable) visit(callExps.get(0));

            if(var.getType().equals(Variable.VarType.NULL))
            {
                ERROR("Parameter does not exist: " + funcName + "[" + ctx.getStart().getLine() + "]");
            }
            System.out.println(var);

        } else if (funcName.equals("print"))
        {
            Variable var = (Variable) visit(callExps.get(0));

            if(var.getType().equals(Variable.VarType.NULL))
            {
                ERROR("Parameter does not exist: " + funcName + "[" + ctx.getStart().getLine() + "]");
            }

            System.out.print(var);


        } else if (funcName.equals("len"))
        {
            Variable var = ((Variable) visit(callExps.get(0))).getLength();

            if(var.getType().equals(Variable.VarType.NULL))
            {
                ERROR("len functions only accepts String or Array type: " + funcName + "[" + ctx.getStart().getLine() + "]");
            }

            return var;
        } else
        {
            ERROR("Could not find function: " + funcName + " [" + ctx.getStart().getLine() + "]");

        }
        return new Variable(Variable.VarType.NULL);
    }



    void ERROR(String txt)
    {
        System.err.println(txt);
        System.exit(-1);
    }


    @Override
    public Object visitAssign_statement(@NotNull WaffleParser.Assign_statementContext ctx) {

        Variable rightside = (Variable) visit(ctx.right);
        Variable leftside =  (Variable) visit(ctx.left);

        if(leftside.getType() == rightside.getType())
        {
            leftside.copy(rightside);
        } else
        {
            ERROR("Type mismatch while assigning. Expecting " + leftside.getTypeString() + " got " +  rightside.getTypeString()+ ". [" + ctx.getStart().getLine() + "]");

        }

        return leftside;
    }

    @Override
    public Object visitFor_statement(@NotNull WaffleParser.For_statementContext ctx) {

        LoopWaffleStation subStation = new LoopWaffleStation(this, ctx);
        Variable retVal = subStation.Go();
        return retVal;
    }

    @Override
    public Object visitIf_statement(@NotNull WaffleParser.If_statementContext ctx) {
        Variable if_cond = (Variable) visit (ctx.ifer().condition());
        if (if_cond.getType() != Variable.VarType.tBoolean)
            ERROR("Type mismatch while evaluating conditional. Expecting tBoolean" + " got " +  if_cond.getTypeString()+ ". [" + ctx.getStart().getLine() + "]");

        if (if_cond.getBoolData()){
            return visit(ctx.ifer().body());
        }
        for (WaffleParser.ElifContext elCode: ctx.elif()){
            if_cond = (Variable) visit (elCode.condition());
            if (if_cond.getType() != Variable.VarType.tBoolean)
                ERROR("Type mismatch while evaluating conditional. Expecting tBoolean" + " got " +  if_cond.getTypeString()+ ". [" + ctx.getStart().getLine() + "]");

            if (if_cond.getBoolData()){
                return visit(elCode.body());
            }
        }
        if(ctx.elser() != null)
            return visit(ctx.elser().body());
        return new Variable(Variable.VarType.NULL);

    }

    protected Variable getVarByName(WaffleParser.Variable_expressionContext left) {

        Variable retVal = (Variable) mem.get(left.variable().getText());
        if(retVal == null) //Dont remove this == null part here.
            ERROR("Missing variable declaration for " + left.variable().getText() + ". [" + left.getStart().getLine() + "]");

        if(left.indexed_expression() == null) {
            return retVal;
        } else {

            int index = ((Variable)(visit(left.indexed_expression().expression()))).getIntData();
            Variable var = new Variable(Variable.VarType.NULL);
            try{
                var = retVal.getArrData().get(index);

            } catch(Exception e) {
                ERROR("Array index out of bounds " + left.indexed_expression().variable().getText() + " size is  " + var.getArrData().size() + ". [" + left.getStart().getLine() + "]");
            }

            return var;

        }


    }
}

