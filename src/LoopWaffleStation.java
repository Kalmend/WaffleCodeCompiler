import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by Oliver on 30.11.2014.
 */
public class LoopWaffleStation extends WaffleStation{

    private WaffleStation parent;
    WaffleParser.BodyContext body;
    String forIter = "";
    Variable stopValue;
    Boolean countUp = true;

    public LoopWaffleStation(WaffleStation waffleStation, WaffleParser.For_statementContext ctx) {
        parent = waffleStation;
        body = ctx.body();
        //Create and initialize the iterator
        Variable iter = (Variable) visit(ctx.for_header().var_decl());
        iter.copy((Variable) visit(ctx.for_header().range_exp().start));
        forIter = ctx.for_header().var_decl().variable().getText();
        stopValue = (Variable) visit(ctx.for_header().range_exp().stop);

        if(iter.GT(stopValue).getBoolData())
        {
            countUp = false;
        }


    }

    public Variable Go() {

        Variable retCommand = new Variable(Variable.VarType.NULL);
        while (mem.get(forIter).NEQ(stopValue.add(new Variable(countUp ? 1 : -1))).getBoolData()){

            //TODO: Handle break and return statements
            //TODO: Handle scope variables
            retCommand = (Variable)visit(body);
            if(retCommand.getType() == Variable.VarType.RETURN )
            {
                return new Variable(Variable.VarType.RETURN);
            } else if (retCommand.getType() == Variable.VarType.BREAK) {
                return new Variable(Variable.VarType.NULL);
            }
            mem.get(forIter).copy(mem.get(forIter).add(new Variable(countUp ? 1 : -1)));
            clearLoopMem();
        }

        return retCommand;

    }

    private void clearLoopMem() {
        Variable iterTemp = mem.get(forIter);
        mem.clear();
        mem.put(forIter,iterTemp);
    }


    @Override
    public Object visitReturn_statement(@NotNull WaffleParser.Return_statementContext ctx) {

        return new Variable(Variable.VarType.RETURN);
    }


    @Override
    public Object visitBreak_statement(@NotNull WaffleParser.Break_statementContext ctx) {
        return new Variable(Variable.VarType.BREAK);
    }

    public Object visitVariable_expression(@NotNull WaffleParser.Variable_expressionContext ctx) {
        Variable var = getVarByName(ctx);

        if (var.getType() == Variable.VarType.NULL)
            return parent.visitVariable_expression(ctx);
        return var;
}

    protected Variable getVarByName(WaffleParser.Variable_expressionContext left) {
        Variable retVal = new Variable(Variable.VarType.NULL);
        if(left.indexed_expression() == null) {
             retVal = (Variable) mem.get(left.variable().getText());
        } else
        {
             retVal = (Variable) mem.get(left.indexed_expression().variable().getText());
        }
        if(retVal == null) //Dont remove this == null part here.
            return new Variable(Variable.VarType.NULL);

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
