package lime.antlr3;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.Token;
public class LimeAST extends CommonTree {
    public Scope scope;
	public Symbol symbol; // set during DefRef traversal
    public LimeAST(Token t) { super(t); }
}
