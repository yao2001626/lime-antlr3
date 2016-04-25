package lime.antlr3;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

import java.io.*;
import lime.antlr3.LimeParser.compilationUnit_return;


/**
 * Test driver program for the ANTLR3 Maven Architype demo
 *
 * @author Jim Idle (jimi@temporal-wave.com)
 */
class Main {
	
	/** An adaptor that tells ANTLR to build LimeAST nodes */
    public static TreeAdaptor limeTreeAdaptor = new CommonTreeAdaptor() {
        public Object create(Token token) {
            return new LimeAST(token);
        }
        public Object dupNode(Object t) {
            if ( t==null ) {
                return null;
            }
            return create(((LimeAST)t).token);
        }
        public Object errorNode(TokenStream input, Token start, Token stop,
                                RecognitionException e)
        {
            LimeErrorNode t = new LimeErrorNode(input, start, stop, e);
            //System.out.println("returning error node '"+t+"' @index="+input.index());
            return t;
        }
    };
	
	public static void main(String[] args) throws Exception {
		String templatesFilename = "llvm.stg";
		String filename = "src/main/lime/test.lime";
		int i = 0;
		InputStream input = new FileInputStream(filename);
		LimeLexer lexer = new LimeLexer(new ANTLRInputStream(input));
		TokenRewriteStream tokens = new TokenRewriteStream(lexer);
        LimeParser parser = new LimeParser(tokens);
        parser.setTreeAdaptor(limeTreeAdaptor);
		LimeParser.compilationUnit_return ret = parser.compilationUnit();
		CommonTree t = (CommonTree)ret.getTree();
		System.out.println("; "+t.toStringTree());
		DOTTreeGenerator dot = new DOTTreeGenerator();
		System.out.println(dot.toDOT(t));
		
		SymbolTable symtab = new SymbolTable();
		
		return;
	}

}