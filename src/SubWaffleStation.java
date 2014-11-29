import org.antlr.v4.runtime.misc.NotNull;

import java.util.*;

/**
 * Created by Oliver on 24.11.2014.
 */
public class SubWaffleStation  extends WaffleStation {
    //public Map<String, Variable> passMem = new HashMap<String, Variable>();
    public WaffleParser.SubroutineContext subRoot;
    private WaffleStation parent;
    private Variable returnValue = null;

    public SubWaffleStation(WaffleStation parentWaffle, WaffleParser.SubroutineContext subRoot, WaffleParser.ExpCallContext call_expression)
    {
        this.subRoot = subRoot;
        parent = parentWaffle;

        if(!checkParamTypes(call_expression.expression()))
        {
            ERROR("Parameters in call do not match declaration: " + subRoot.subroutine_header().routine_name().getText() + "[" +  call_expression.getStart().getLine() + "]");
        }

        //copy call variables from parent to  varMem if
        int i = 0;
        List<WaffleParser.ExpressionContext> daList = call_expression.expression();

        for (String key : mem.keySet())
        {
            Variable callParam = null;
            if(subRoot.subroutine_header().param().get(i).OUT() != null) {
                callParam = (Variable) parent.visit(daList.get(i));
            } else if(subRoot.subroutine_header().param().get(i).IN() != null)
            {
                callParam = new Variable((Variable)parent.visit(daList.get(i)));
            }

            mem.put(key,callParam);
            i++;
        }

    }


    private boolean checkParamTypes(List<WaffleParser.ExpressionContext> callExps) {
        visitSubroutine_header(subRoot.subroutine_header());     //crazy code

        if(callExps.size() != mem.size())
        {
            return false;
        }

        int i = 0;

        for (Map.Entry<String, Variable> entry : mem.entrySet())
        {
            if(entry.getValue().getType() != parent.mem.get(callExps.get(i).getText()).getType())
                return false;
            i++;
        }
        return true;

    }

    @Override
    public Object visitReturn_statement(@NotNull WaffleParser.Return_statementContext ctx) {

        if(ctx.expression() != null)
            returnValue = (Variable) visit(ctx.expression());

        return null;
    }

    public Variable call() {
        visit(subRoot.body());
        if (returnValue == null)
            return new Variable();
        return new Variable(returnValue);
    }
}
