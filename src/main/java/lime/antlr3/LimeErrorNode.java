package lime.antlr3;
import org.antlr.runtime.*;

public class LimeErrorNode extends LimeAST {
    public LimeErrorNode(TokenStream input, Token start, Token stop,
                            RecognitionException e)
    {
	super(start); // no need to record anything for this example
    }
}
