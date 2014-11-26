import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Oliver on 24.11.2014.
 */
public class SubWaffleStation  extends WaffleStation {
    public Map<String, Variable> globMem = new HashMap<String, Variable>();
    public WaffleParser.SubroutineContext subRoot;

    public SubWaffleStation(WaffleStation parentWaffle, WaffleParser.SubroutineContext subRoot)
    {
        this.subRoot = subRoot;

        for (Map.Entry<String, Variable> entry : parentWaffle.mem.entrySet())
        {
            Variable copy = new Variable(entry.getValue());
            globMem.put(entry.getKey(),copy);
        }

    }
}
