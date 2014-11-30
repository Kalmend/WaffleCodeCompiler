import java.io.IOException;
import java.io.InputStream;

        import org.antlr.v4.runtime.*;
        import org.antlr.v4.runtime.tree.ParseTree;

        import java.io.FileInputStream;

/**
 * BY: OLIVER AND VIL.jar
 */

public class Main {

    public static void main(String[] args) {

        String inputFile = null;
        if ( args.length > 0 ) inputFile = args[0];

        InputStream is = System.in;

        try {
            if (inputFile != null) { is = new FileInputStream(inputFile); }
            else {
                System.err.println("No arguments");
                return;
            }

            //give input to wafflecompiler.
            ANTLRInputStream input = new ANTLRInputStream(is);
            WaffleLexer lexer = new WaffleLexer(input);

            //get tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            //Create token parser
            WaffleParser parser = new WaffleParser(tokens);

            if (args.length == 2 && args[1].equals("--tree")) {
                //draw tree in gui
                ParserRuleContext ruleContext = parser.program();
                ruleContext.inspect(parser);
            } else {
                ParseTree tree = parser.program();
                //walk tree
               WaffleStation stat = new WaffleStation();
                stat.visit(tree);
            }
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
            return;
        } catch (Exception e)
        {
            System.out.println(e);
            return;
        }
    }
}