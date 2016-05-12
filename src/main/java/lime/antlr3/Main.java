package lime.antlr3;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.StringTemplateGroup;

import java.io.*;
import lime.antlr3.LimeParser.compilationUnit_return;
import lime.antlr3.Gen.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


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
		String filename = "src/main/lime/test4.lime";
		int i = 0;
		InputStream input = new FileInputStream(filename);
		LimeLexer lexer = new LimeLexer(new ANTLRInputStream(input));
		TokenRewriteStream tokens = new TokenRewriteStream(lexer);
        LimeParser parser = new LimeParser(tokens);
        parser.setTreeAdaptor(limeTreeAdaptor);
		LimeParser.compilationUnit_return ret = parser.compilationUnit();
		CommonTree t = (CommonTree)ret.getTree();
		//System.out.println("; "+t.toStringTree());
		DOTTreeGenerator dot = new DOTTreeGenerator();
		System.out.println(dot.toDOT(t));
		
		
		SymbolTable symtab = new SymbolTable();
		
		ClassLoader cl = Main.class.getClassLoader();
		
        InputStream in = cl.getResourceAsStream(templatesFilename);
		if(in == null){
			System.out.printf("can't find in %s", templatesFilename);
		}
        Reader rd = new InputStreamReader(in);
        StringTemplateGroup templates = new StringTemplateGroup(rd);
        rd.close();
		
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(limeTreeAdaptor, t);
        nodes.setTokenStream(tokens);

		DefRef def = new DefRef(nodes, symtab); // use custom constructor
        def.downup(t); // trigger symtab actions upon certain subtrees
        // DEFINE/RESOLVE SYMBOLS
        /*Def def = new Def(nodes, symtab); // use custom constructor
        def.downup(t); // trigger symtab actions upon certain subtrees
        System.out.println("globals: "+symtab.globals);
		
		// GENERATE CODE
        nodes.reset();
		Ref ref = new Ref(nodes);               // create Ref phase
        ref.downup(t);
		*/
		
        Gen walker = new Gen(nodes, symtab);
        walker.setTemplateLib(templates);
        Gen.translationunit_return ret2 = walker.translationunit();

        // EMIT IR
        // uncomment next line to learn which template emits what output
        templates.emitDebugStartStopStrings(true);
        String output = ret2.getTemplate().toString();
        System.out.println(output);

		
		return;
	}

}