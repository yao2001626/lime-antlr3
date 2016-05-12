// $ANTLR 3.4 lime\\antlr3\\Gen.g 2016-05-02 09:59:51

    package lime.antlr3;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class Gen extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Action", "Add", "And", "Assert", "Assign", "Attr", "Begin", "Bool", "Booltype", "CBrace", "CBracket", "COMMENT", "CParen", "Class", "Colon", "Comma", "Divide", "Do", "Dot", "Else", "End", "Equals", "Excl", "GT", "GTEquals", "ID", "INT", "If", "Inherit", "Initialization", "Inttype", "LETTER", "LINE_COMMENT", "LT", "LTEquals", "Method", "Modulus", "Multiply", "NEquals", "New", "Null", "OBrace", "OBracket", "OParen", "Or", "Pow", "QMark", "Return", "SColon", "STRING", "Subtract", "Super", "Then", "This", "Var", "Voidtype", "WS", "When", "While", "ACTION", "ARG", "ARGS", "ASSIGN", "ATTR", "BLOCK", "CALL", "CLASS", "DOT", "ELIST", "EXPR", "FILE", "IF", "INHERIT", "INIT", "MEMBERS", "METHOD", "RETURN", "VAR", "VAR_DECL", "WHILE", "ARGS_DECL", "ARG_DECL"
    };

    public static final int EOF=-1;
    public static final int Action=4;
    public static final int Add=5;
    public static final int And=6;
    public static final int Assert=7;
    public static final int Assign=8;
    public static final int Attr=9;
    public static final int Begin=10;
    public static final int Bool=11;
    public static final int Booltype=12;
    public static final int CBrace=13;
    public static final int CBracket=14;
    public static final int COMMENT=15;
    public static final int CParen=16;
    public static final int Class=17;
    public static final int Colon=18;
    public static final int Comma=19;
    public static final int Divide=20;
    public static final int Do=21;
    public static final int Dot=22;
    public static final int Else=23;
    public static final int End=24;
    public static final int Equals=25;
    public static final int Excl=26;
    public static final int GT=27;
    public static final int GTEquals=28;
    public static final int ID=29;
    public static final int INT=30;
    public static final int If=31;
    public static final int Inherit=32;
    public static final int Initialization=33;
    public static final int Inttype=34;
    public static final int LETTER=35;
    public static final int LINE_COMMENT=36;
    public static final int LT=37;
    public static final int LTEquals=38;
    public static final int Method=39;
    public static final int Modulus=40;
    public static final int Multiply=41;
    public static final int NEquals=42;
    public static final int New=43;
    public static final int Null=44;
    public static final int OBrace=45;
    public static final int OBracket=46;
    public static final int OParen=47;
    public static final int Or=48;
    public static final int Pow=49;
    public static final int QMark=50;
    public static final int Return=51;
    public static final int SColon=52;
    public static final int STRING=53;
    public static final int Subtract=54;
    public static final int Super=55;
    public static final int Then=56;
    public static final int This=57;
    public static final int Var=58;
    public static final int Voidtype=59;
    public static final int WS=60;
    public static final int When=61;
    public static final int While=62;
    public static final int ACTION=63;
    public static final int ARG=64;
    public static final int ARGS=65;
    public static final int ASSIGN=66;
    public static final int ATTR=67;
    public static final int BLOCK=68;
    public static final int CALL=69;
    public static final int CLASS=70;
    public static final int DOT=71;
    public static final int ELIST=72;
    public static final int EXPR=73;
    public static final int FILE=74;
    public static final int IF=75;
    public static final int INHERIT=76;
    public static final int INIT=77;
    public static final int MEMBERS=78;
    public static final int METHOD=79;
    public static final int RETURN=80;
    public static final int VAR=81;
    public static final int VAR_DECL=82;
    public static final int WHILE=83;
    public static final int ARGS_DECL=84;
    public static final int ARG_DECL=85;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public Gen(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public Gen(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("GenTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return Gen.tokenNames; }
    public String getGrammarFileName() { return "lime\\antlr3\\Gen.g"; }


        SymbolTable symtab;
        Scope currentScope;
        public Gen(TreeNodeStream input, SymbolTable symtab) {
            this(input);
            this.symtab = symtab;
            currentScope = symtab.globals;
        }

        int reg = 1;
        public int getreg() { return reg++; }

        List<LimeString> strings = new ArrayList<LimeString>();
        public int getstr(String s) {
        	strings.add(new LimeString(s));
        	return strings.size();
        }


    public static class translationunit_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "translationunit"
    // lime\\antlr3\\Gen.g:32:1: translationunit : ^( FILE (d+= classdeclaration )+ ) -> file(decls=$d);
    public final Gen.translationunit_return translationunit() throws RecognitionException {
        Gen.translationunit_return retval = new Gen.translationunit_return();
        retval.start = input.LT(1);


        List list_d=null;
        RuleReturnScope d = null;
        try {
            // lime\\antlr3\\Gen.g:33:2: ( ^( FILE (d+= classdeclaration )+ ) -> file(decls=$d))
            // lime\\antlr3\\Gen.g:33:4: ^( FILE (d+= classdeclaration )+ )
            {
            match(input,FILE,FOLLOW_FILE_in_translationunit58); 

            match(input, Token.DOWN, null); 
            // lime\\antlr3\\Gen.g:33:12: (d+= classdeclaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case CLASS:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // lime\\antlr3\\Gen.g:33:12: d+= classdeclaration
            	    {
            	    pushFollow(FOLLOW_classdeclaration_in_translationunit62);
            	    d=classdeclaration();

            	    state._fsp--;

            	    if (list_d==null) list_d=new ArrayList();
            	    list_d.add(d.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 34:3: -> file(decls=$d)
            {
                retval.st = templateLib.getInstanceOf("file",new STAttrMap().put("decls", list_d));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "translationunit"


    public static class classdeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "classdeclaration"
    // lime\\antlr3\\Gen.g:37:1: classdeclaration : ^( CLASS c= ID ( ^( INHERIT ID ) )? ^( MEMBERS (m+= classMember )+ ) ) -> classdeclaration(sym=$c.symbolmember=$m);
    public final Gen.classdeclaration_return classdeclaration() throws RecognitionException {
        Gen.classdeclaration_return retval = new Gen.classdeclaration_return();
        retval.start = input.LT(1);


        LimeAST c=null;
        List list_m=null;
        RuleReturnScope m = null;
        try {
            // lime\\antlr3\\Gen.g:38:2: ( ^( CLASS c= ID ( ^( INHERIT ID ) )? ^( MEMBERS (m+= classMember )+ ) ) -> classdeclaration(sym=$c.symbolmember=$m))
            // lime\\antlr3\\Gen.g:38:4: ^( CLASS c= ID ( ^( INHERIT ID ) )? ^( MEMBERS (m+= classMember )+ ) )
            {
            match(input,CLASS,FOLLOW_CLASS_in_classdeclaration89); 

            match(input, Token.DOWN, null); 
            c=(LimeAST)match(input,ID,FOLLOW_ID_in_classdeclaration93); 

            // lime\\antlr3\\Gen.g:38:17: ( ^( INHERIT ID ) )?
            int alt2=2;
            switch ( input.LA(1) ) {
                case INHERIT:
                    {
                    alt2=1;
                    }
                    break;
            }

            switch (alt2) {
                case 1 :
                    // lime\\antlr3\\Gen.g:38:18: ^( INHERIT ID )
                    {
                    match(input,INHERIT,FOLLOW_INHERIT_in_classdeclaration97); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_classdeclaration99); 

                    match(input, Token.UP, null); 


                    }
                    break;

            }


            match(input,MEMBERS,FOLLOW_MEMBERS_in_classdeclaration106); 

            match(input, Token.DOWN, null); 
            // lime\\antlr3\\Gen.g:38:46: (m+= classMember )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case ATTR:
                case METHOD:
                    {
                    alt3=1;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // lime\\antlr3\\Gen.g:38:46: m+= classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classdeclaration110);
            	    m=classMember();

            	    state._fsp--;

            	    if (list_m==null) list_m=new ArrayList();
            	    list_m.add(m.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match(input, Token.UP, null); 


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 39:3: -> classdeclaration(sym=$c.symbolmember=$m)
            {
                retval.st = templateLib.getInstanceOf("classdeclaration",new STAttrMap().put("sym", c.symbol).put("member", list_m));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classdeclaration"


    public static class classMember_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "classMember"
    // lime\\antlr3\\Gen.g:41:1: classMember : ( attrDeclaration -> {$attrDeclaration.st}| methodDeclaration -> {$methodDeclaration.st});
    public final Gen.classMember_return classMember() throws RecognitionException {
        Gen.classMember_return retval = new Gen.classMember_return();
        retval.start = input.LT(1);


        Gen.attrDeclaration_return attrDeclaration1 =null;

        Gen.methodDeclaration_return methodDeclaration2 =null;


        try {
            // lime\\antlr3\\Gen.g:42:2: ( attrDeclaration -> {$attrDeclaration.st}| methodDeclaration -> {$methodDeclaration.st})
            int alt4=2;
            switch ( input.LA(1) ) {
            case ATTR:
                {
                alt4=1;
                }
                break;
            case METHOD:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // lime\\antlr3\\Gen.g:42:4: attrDeclaration
                    {
                    pushFollow(FOLLOW_attrDeclaration_in_classMember141);
                    attrDeclaration1=attrDeclaration();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 42:19: -> {$attrDeclaration.st}
                    {
                        retval.st = (attrDeclaration1!=null?attrDeclaration1.st:null);
                    }



                    }
                    break;
                case 2 :
                    // lime\\antlr3\\Gen.g:43:4: methodDeclaration
                    {
                    pushFollow(FOLLOW_methodDeclaration_in_classMember148);
                    methodDeclaration2=methodDeclaration();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 43:21: -> {$methodDeclaration.st}
                    {
                        retval.st = (methodDeclaration2!=null?methodDeclaration2.st:null);
                    }



                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classMember"


    public static class attrDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "attrDeclaration"
    // lime\\antlr3\\Gen.g:45:1: attrDeclaration : ^( ATTR ID t= type ) -> attrdecl(id=$ID.texttype=$t.text);
    public final Gen.attrDeclaration_return attrDeclaration() throws RecognitionException {
        Gen.attrDeclaration_return retval = new Gen.attrDeclaration_return();
        retval.start = input.LT(1);


        LimeAST ID3=null;
        Gen.type_return t =null;


        try {
            // lime\\antlr3\\Gen.g:46:2: ( ^( ATTR ID t= type ) -> attrdecl(id=$ID.texttype=$t.text))
            // lime\\antlr3\\Gen.g:46:4: ^( ATTR ID t= type )
            {
            match(input,ATTR,FOLLOW_ATTR_in_attrDeclaration161); 

            match(input, Token.DOWN, null); 
            ID3=(LimeAST)match(input,ID,FOLLOW_ID_in_attrDeclaration164); 

            pushFollow(FOLLOW_type_in_attrDeclaration169);
            t=type();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 47:3: -> attrdecl(id=$ID.texttype=$t.text)
            {
                retval.st = templateLib.getInstanceOf("attrdecl",new STAttrMap().put("id", (ID3!=null?ID3.getText():null)).put("type", (t!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(t.start),input.getTreeAdaptor().getTokenStopIndex(t.start))):null)));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attrDeclaration"


    public static class methodDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "methodDeclaration"
    // lime\\antlr3\\Gen.g:50:1: methodDeclaration : ^( METHOD ID ( ^( ARGS_DECL (p+= parameterdecl )+ ) )? type ( expr )? block ) -> method(sym=$ID.symbolargs=$pblock=$block.st);
    public final Gen.methodDeclaration_return methodDeclaration() throws RecognitionException {
        Gen.methodDeclaration_return retval = new Gen.methodDeclaration_return();
        retval.start = input.LT(1);


        LimeAST ID4=null;
        List list_p=null;
        Gen.block_return block5 =null;

        RuleReturnScope p = null;
        try {
            // lime\\antlr3\\Gen.g:51:2: ( ^( METHOD ID ( ^( ARGS_DECL (p+= parameterdecl )+ ) )? type ( expr )? block ) -> method(sym=$ID.symbolargs=$pblock=$block.st))
            // lime\\antlr3\\Gen.g:51:4: ^( METHOD ID ( ^( ARGS_DECL (p+= parameterdecl )+ ) )? type ( expr )? block )
            {
            match(input,METHOD,FOLLOW_METHOD_in_methodDeclaration198); 

            match(input, Token.DOWN, null); 
            ID4=(LimeAST)match(input,ID,FOLLOW_ID_in_methodDeclaration200); 

            // lime\\antlr3\\Gen.g:51:16: ( ^( ARGS_DECL (p+= parameterdecl )+ ) )?
            int alt6=2;
            switch ( input.LA(1) ) {
                case ARGS_DECL:
                    {
                    alt6=1;
                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // lime\\antlr3\\Gen.g:51:17: ^( ARGS_DECL (p+= parameterdecl )+ )
                    {
                    match(input,ARGS_DECL,FOLLOW_ARGS_DECL_in_methodDeclaration204); 

                    match(input, Token.DOWN, null); 
                    // lime\\antlr3\\Gen.g:51:30: (p+= parameterdecl )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        switch ( input.LA(1) ) {
                        case ARG_DECL:
                            {
                            alt5=1;
                            }
                            break;

                        }

                        switch (alt5) {
                    	case 1 :
                    	    // lime\\antlr3\\Gen.g:51:30: p+= parameterdecl
                    	    {
                    	    pushFollow(FOLLOW_parameterdecl_in_methodDeclaration208);
                    	    p=parameterdecl();

                    	    state._fsp--;

                    	    if (list_p==null) list_p=new ArrayList();
                    	    list_p.add(p.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    match(input, Token.UP, null); 


                    }
                    break;

            }


            pushFollow(FOLLOW_type_in_methodDeclaration214);
            type();

            state._fsp--;


            // lime\\antlr3\\Gen.g:51:55: ( expr )?
            int alt7=2;
            switch ( input.LA(1) ) {
                case Add:
                case Equals:
                case ID:
                case INT:
                case LT:
                case Subtract:
                case CALL:
                    {
                    alt7=1;
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // lime\\antlr3\\Gen.g:51:55: expr
                    {
                    pushFollow(FOLLOW_expr_in_methodDeclaration216);
                    expr();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_methodDeclaration219);
            block5=block();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 52:3: -> method(sym=$ID.symbolargs=$pblock=$block.st)
            {
                retval.st = templateLib.getInstanceOf("method",new STAttrMap().put("sym", ID4.symbol).put("args", list_p).put("block", (block5!=null?block5.st:null)));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodDeclaration"


    public static class parameterdecl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "parameterdecl"
    // lime\\antlr3\\Gen.g:55:1: parameterdecl : ^( ARG_DECL type ID ) -> defarg(id=$ID.texttype=$type.text);
    public final Gen.parameterdecl_return parameterdecl() throws RecognitionException {
        Gen.parameterdecl_return retval = new Gen.parameterdecl_return();
        retval.start = input.LT(1);


        LimeAST ID6=null;
        Gen.type_return type7 =null;


        try {
            // lime\\antlr3\\Gen.g:57:2: ( ^( ARG_DECL type ID ) -> defarg(id=$ID.texttype=$type.text))
            // lime\\antlr3\\Gen.g:57:3: ^( ARG_DECL type ID )
            {
            match(input,ARG_DECL,FOLLOW_ARG_DECL_in_parameterdecl254); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_parameterdecl257);
            type7=type();

            state._fsp--;


            ID6=(LimeAST)match(input,ID,FOLLOW_ID_in_parameterdecl259); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 58:3: -> defarg(id=$ID.texttype=$type.text)
            {
                retval.st = templateLib.getInstanceOf("defarg",new STAttrMap().put("id", (ID6!=null?ID6.getText():null)).put("type", (type7!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(type7.start),input.getTreeAdaptor().getTokenStopIndex(type7.start))):null)));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameterdecl"


    public static class type_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "type"
    // lime\\antlr3\\Gen.g:61:1: type : ( Inttype | Voidtype );
    public final Gen.type_return type() throws RecognitionException {
        Gen.type_return retval = new Gen.type_return();
        retval.start = input.LT(1);


        try {
            // lime\\antlr3\\Gen.g:62:2: ( Inttype | Voidtype )
            // lime\\antlr3\\Gen.g:
            {
            if ( input.LA(1)==Inttype||input.LA(1)==Voidtype ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class block_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "block"
    // lime\\antlr3\\Gen.g:66:1: block : ^( BLOCK (s+= statement )* ) -> block(stats=$s);
    public final Gen.block_return block() throws RecognitionException {
        Gen.block_return retval = new Gen.block_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // lime\\antlr3\\Gen.g:67:5: ( ^( BLOCK (s+= statement )* ) -> block(stats=$s))
            // lime\\antlr3\\Gen.g:67:8: ^( BLOCK (s+= statement )* )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_block316); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // lime\\antlr3\\Gen.g:67:17: (s+= statement )*
                loop8:
                do {
                    int alt8=2;
                    switch ( input.LA(1) ) {
                    case ASSIGN:
                    case BLOCK:
                    case CALL:
                    case IF:
                    case RETURN:
                    case WHILE:
                        {
                        alt8=1;
                        }
                        break;

                    }

                    switch (alt8) {
                	case 1 :
                	    // lime\\antlr3\\Gen.g:67:17: s+= statement
                	    {
                	    pushFollow(FOLLOW_statement_in_block320);
                	    s=statement();

                	    state._fsp--;

                	    if (list_s==null) list_s=new ArrayList();
                	    list_s.add(s.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop8;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 68:3: -> block(stats=$s)
            {
                retval.st = templateLib.getInstanceOf("block",new STAttrMap().put("stats", list_s));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block"


    public static class statement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "statement"
    // lime\\antlr3\\Gen.g:71:1: statement : ( block | ^( ASSIGN ID expr ) -> assign(id=$ID.textrhs=$expr.st)| call -> {$call.st}| ^( RETURN expr ) -> return(v=$expr.st)| ^( IF expr s1= statement (s2= statement )? ) -> if(cond=$expr.ststat1=$s1.ststat2=$s2.sttmp=getreg())| ^( WHILE expr s= statement ) -> while(cond=$expr.ststat=$s.sttmp=getreg()));
    public final Gen.statement_return statement() throws RecognitionException {
        Gen.statement_return retval = new Gen.statement_return();
        retval.start = input.LT(1);


        LimeAST ID8=null;
        Gen.statement_return s1 =null;

        Gen.statement_return s2 =null;

        Gen.statement_return s =null;

        Gen.expr_return expr9 =null;

        Gen.call_return call10 =null;

        Gen.expr_return expr11 =null;

        Gen.expr_return expr12 =null;

        Gen.expr_return expr13 =null;


        try {
            // lime\\antlr3\\Gen.g:73:2: ( block | ^( ASSIGN ID expr ) -> assign(id=$ID.textrhs=$expr.st)| call -> {$call.st}| ^( RETURN expr ) -> return(v=$expr.st)| ^( IF expr s1= statement (s2= statement )? ) -> if(cond=$expr.ststat1=$s1.ststat2=$s2.sttmp=getreg())| ^( WHILE expr s= statement ) -> while(cond=$expr.ststat=$s.sttmp=getreg()))
            int alt10=6;
            switch ( input.LA(1) ) {
            case BLOCK:
                {
                alt10=1;
                }
                break;
            case ASSIGN:
                {
                alt10=2;
                }
                break;
            case CALL:
                {
                alt10=3;
                }
                break;
            case RETURN:
                {
                alt10=4;
                }
                break;
            case IF:
                {
                alt10=5;
                }
                break;
            case WHILE:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // lime\\antlr3\\Gen.g:73:4: block
                    {
                    pushFollow(FOLLOW_block_in_statement346);
                    block();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // lime\\antlr3\\Gen.g:74:4: ^( ASSIGN ID expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_statement352); 

                    match(input, Token.DOWN, null); 
                    ID8=(LimeAST)match(input,ID,FOLLOW_ID_in_statement354); 

                    pushFollow(FOLLOW_expr_in_statement356);
                    expr9=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 74:22: -> assign(id=$ID.textrhs=$expr.st)
                    {
                        retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("id", (ID8!=null?ID8.getText():null)).put("rhs", (expr9!=null?expr9.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // lime\\antlr3\\Gen.g:75:4: call
                    {
                    pushFollow(FOLLOW_call_in_statement376);
                    call10=call();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 75:9: -> {$call.st}
                    {
                        retval.st = (call10!=null?call10.st:null);
                    }



                    }
                    break;
                case 4 :
                    // lime\\antlr3\\Gen.g:76:4: ^( RETURN expr )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement386); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_statement388);
                    expr11=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 76:19: -> return(v=$expr.st)
                    {
                        retval.st = templateLib.getInstanceOf("return",new STAttrMap().put("v", (expr11!=null?expr11.st:null)));
                    }



                    }
                    break;
                case 5 :
                    // lime\\antlr3\\Gen.g:77:4: ^( IF expr s1= statement (s2= statement )? )
                    {
                    match(input,IF,FOLLOW_IF_in_statement404); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_statement406);
                    expr12=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_statement_in_statement410);
                    s1=statement();

                    state._fsp--;


                    // lime\\antlr3\\Gen.g:77:29: (s2= statement )?
                    int alt9=2;
                    switch ( input.LA(1) ) {
                        case ASSIGN:
                        case BLOCK:
                        case CALL:
                        case IF:
                        case RETURN:
                        case WHILE:
                            {
                            alt9=1;
                            }
                            break;
                    }

                    switch (alt9) {
                        case 1 :
                            // lime\\antlr3\\Gen.g:77:29: s2= statement
                            {
                            pushFollow(FOLLOW_statement_in_statement414);
                            s2=statement();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 78:3: -> if(cond=$expr.ststat1=$s1.ststat2=$s2.sttmp=getreg())
                    {
                        retval.st = templateLib.getInstanceOf("if",new STAttrMap().put("cond", (expr12!=null?expr12.st:null)).put("stat1", (s1!=null?s1.st:null)).put("stat2", (s2!=null?s2.st:null)).put("tmp", getreg()));
                    }



                    }
                    break;
                case 6 :
                    // lime\\antlr3\\Gen.g:79:4: ^( WHILE expr s= statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement448); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_statement450);
                    expr13=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_statement_in_statement454);
                    s=statement();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 80:3: -> while(cond=$expr.ststat=$s.sttmp=getreg())
                    {
                        retval.st = templateLib.getInstanceOf("while",new STAttrMap().put("cond", (expr13!=null?expr13.st:null)).put("stat", (s!=null?s.st:null)).put("tmp", getreg()));
                    }



                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class expr_return extends TreeRuleReturnScope {
        public Type typ;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "expr"
    // lime\\antlr3\\Gen.g:83:1: expr returns [Type typ] : ( ^( ( Equals | Add | Subtract | LT ) a= expr b= expr ) -> bop(reg=getreg()op=$start.tokena=$a.stb=$b.st)| call -> {$call.st}| primary -> {$primary.st});
    public final Gen.expr_return expr() throws RecognitionException {
        Gen.expr_return retval = new Gen.expr_return();
        retval.start = input.LT(1);


        Gen.expr_return a =null;

        Gen.expr_return b =null;

        Gen.call_return call14 =null;

        Gen.primary_return primary15 =null;


        try {
            // lime\\antlr3\\Gen.g:87:2: ( ^( ( Equals | Add | Subtract | LT ) a= expr b= expr ) -> bop(reg=getreg()op=$start.tokena=$a.stb=$b.st)| call -> {$call.st}| primary -> {$primary.st})
            int alt12=3;
            switch ( input.LA(1) ) {
            case Add:
            case Equals:
            case LT:
            case Subtract:
                {
                alt12=1;
                }
                break;
            case CALL:
                {
                alt12=2;
                }
                break;
            case ID:
            case INT:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // lime\\antlr3\\Gen.g:87:4: ^( ( Equals | Add | Subtract | LT ) a= expr b= expr )
                    {
                    // lime\\antlr3\\Gen.g:87:7: ( Equals | Add | Subtract | LT )
                    int alt11=4;
                    switch ( input.LA(1) ) {
                    case Equals:
                        {
                        alt11=1;
                        }
                        break;
                    case Add:
                        {
                        alt11=2;
                        }
                        break;
                    case Subtract:
                        {
                        alt11=3;
                        }
                        break;
                    case LT:
                        {
                        alt11=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;

                    }

                    switch (alt11) {
                        case 1 :
                            // lime\\antlr3\\Gen.g:87:8: Equals
                            {
                            match(input,Equals,FOLLOW_Equals_in_expr500); 

                            }
                            break;
                        case 2 :
                            // lime\\antlr3\\Gen.g:87:15: Add
                            {
                            match(input,Add,FOLLOW_Add_in_expr502); 

                            }
                            break;
                        case 3 :
                            // lime\\antlr3\\Gen.g:87:19: Subtract
                            {
                            match(input,Subtract,FOLLOW_Subtract_in_expr504); 

                            }
                            break;
                        case 4 :
                            // lime\\antlr3\\Gen.g:87:28: LT
                            {
                            match(input,LT,FOLLOW_LT_in_expr506); 

                            }
                            break;

                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr511);
                    a=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr515);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 88:3: -> bop(reg=getreg()op=$start.tokena=$a.stb=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("bop",new STAttrMap().put("reg", getreg()).put("op", ((LimeAST)retval.start).token).put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // lime\\antlr3\\Gen.g:89:4: call
                    {
                    pushFollow(FOLLOW_call_in_expr547);
                    call14=call();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 89:9: -> {$call.st}
                    {
                        retval.st = (call14!=null?call14.st:null);
                    }



                    }
                    break;
                case 3 :
                    // lime\\antlr3\\Gen.g:90:4: primary
                    {
                    pushFollow(FOLLOW_primary_in_expr556);
                    primary15=primary();

                    state._fsp--;


                    retval.typ =(primary15!=null?primary15.typ:null);

                    // TEMPLATE REWRITE
                    // 91:10: -> {$primary.st}
                    {
                        retval.st = (primary15!=null?primary15.st:null);
                    }



                    }
                    break;

            }

            //System.out.println("expr: "+retval.st);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class call_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "call"
    // lime\\antlr3\\Gen.g:94:1: call : ^( CALL ID ( ^( ELIST (e+= expr )+ ) )? ) -> call(reg=getreg()sym=$ID.symbolargs=$e);
    public final Gen.call_return call() throws RecognitionException {
        Gen.call_return retval = new Gen.call_return();
        retval.start = input.LT(1);


        LimeAST ID16=null;
        List list_e=null;
        RuleReturnScope e = null;
        try {
            // lime\\antlr3\\Gen.g:95:2: ( ^( CALL ID ( ^( ELIST (e+= expr )+ ) )? ) -> call(reg=getreg()sym=$ID.symbolargs=$e))
            // lime\\antlr3\\Gen.g:95:4: ^( CALL ID ( ^( ELIST (e+= expr )+ ) )? )
            {
            match(input,CALL,FOLLOW_CALL_in_call583); 

            match(input, Token.DOWN, null); 
            ID16=(LimeAST)match(input,ID,FOLLOW_ID_in_call585); 

            // lime\\antlr3\\Gen.g:95:14: ( ^( ELIST (e+= expr )+ ) )?
            int alt14=2;
            switch ( input.LA(1) ) {
                case ELIST:
                    {
                    alt14=1;
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // lime\\antlr3\\Gen.g:95:16: ^( ELIST (e+= expr )+ )
                    {
                    match(input,ELIST,FOLLOW_ELIST_in_call590); 

                    match(input, Token.DOWN, null); 
                    // lime\\antlr3\\Gen.g:95:25: (e+= expr )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        switch ( input.LA(1) ) {
                        case Add:
                        case Equals:
                        case ID:
                        case INT:
                        case LT:
                        case Subtract:
                        case CALL:
                            {
                            alt13=1;
                            }
                            break;

                        }

                        switch (alt13) {
                    	case 1 :
                    	    // lime\\antlr3\\Gen.g:95:25: e+= expr
                    	    {
                    	    pushFollow(FOLLOW_expr_in_call594);
                    	    e=expr();

                    	    state._fsp--;

                    	    if (list_e==null) list_e=new ArrayList();
                    	    list_e.add(e.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    match(input, Token.UP, null); 


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 96:3: -> call(reg=getreg()sym=$ID.symbolargs=$e)
            {
                retval.st = templateLib.getInstanceOf("call",new STAttrMap().put("reg", getreg()).put("sym", ID16.symbol).put("args", list_e));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "call"


    public static class primary_return extends TreeRuleReturnScope {
        public Type typ;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "primary"
    // lime\\antlr3\\Gen.g:99:1: primary returns [Type typ] : ( ID -> loadvar(reg=getreg()id=$ID)| INT -> int(reg=getreg()v=$INT.text));
    public final Gen.primary_return primary() throws RecognitionException {
        Gen.primary_return retval = new Gen.primary_return();
        retval.start = input.LT(1);


        LimeAST ID17=null;
        LimeAST INT18=null;


        System.out.println("primary\n");

        try {
            // lime\\antlr3\\Gen.g:103:2: ( ID -> loadvar(reg=getreg()id=$ID)| INT -> int(reg=getreg()v=$INT.text))
            int alt15=2;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt15=1;
                }
                break;
            case INT:
                {
                alt15=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // lime\\antlr3\\Gen.g:103:4: ID
                    {
                    ID17=(LimeAST)match(input,ID,FOLLOW_ID_in_primary642); 


                    			retval.typ = (Type)symtab.globals.resolve("int");
                    			//retval.typ = (Type)symtab.resolveID(ID17.symbol.def);
                    			System.out.println("ID.symbol.type: "+retval.typ);
                    	

                    // TEMPLATE REWRITE
                    // 108:5: -> loadvar(reg=getreg()id=$ID)
                    {
                        retval.st = templateLib.getInstanceOf("loadvar",new STAttrMap().put("reg", getreg()).put("id", ID17));
                    }



                    }
                    break;
                case 2 :
                    // lime\\antlr3\\Gen.g:109:4: INT
                    {
                    INT18=(LimeAST)match(input,INT,FOLLOW_INT_in_primary667); 


                    			retval.typ = (Type)symtab.globals.resolve("int");
                    			System.out.println("ID.symbol.type: "+retval.typ);
                    			

                    // TEMPLATE REWRITE
                    // 113:5: -> int(reg=getreg()v=$INT.text)
                    {
                        retval.st = templateLib.getInstanceOf("int",new STAttrMap().put("reg", getreg()).put("v", (INT18!=null?INT18.getText():null)));
                    }



                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primary"

    // Delegated rules


 

    public static final BitSet FOLLOW_FILE_in_translationunit58 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classdeclaration_in_translationunit62 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000040L});
    public static final BitSet FOLLOW_CLASS_in_classdeclaration89 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_classdeclaration93 = new BitSet(new long[]{0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_INHERIT_in_classdeclaration97 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_classdeclaration99 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEMBERS_in_classdeclaration106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classMember_in_classdeclaration110 = new BitSet(new long[]{0x0000000000000008L,0x0000000000008008L});
    public static final BitSet FOLLOW_attrDeclaration_in_classMember141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_classMember148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTR_in_attrDeclaration161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_attrDeclaration164 = new BitSet(new long[]{0x0800000400000000L});
    public static final BitSet FOLLOW_type_in_attrDeclaration169 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_in_methodDeclaration198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_methodDeclaration200 = new BitSet(new long[]{0x0800000400000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ARGS_DECL_in_methodDeclaration204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameterdecl_in_methodDeclaration208 = new BitSet(new long[]{0x0000000000000008L,0x0000000000200000L});
    public static final BitSet FOLLOW_type_in_methodDeclaration214 = new BitSet(new long[]{0x0040002062000020L,0x0000000000000030L});
    public static final BitSet FOLLOW_expr_in_methodDeclaration216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_methodDeclaration219 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARG_DECL_in_parameterdecl254 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_parameterdecl257 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_parameterdecl259 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_block316 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_block320 = new BitSet(new long[]{0x0000000000000008L,0x0000000000090834L});
    public static final BitSet FOLLOW_block_in_statement346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_statement352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_statement354 = new BitSet(new long[]{0x0040002062000020L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_statement356 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_call_in_statement376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement386 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_statement388 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement404 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_statement406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000090834L});
    public static final BitSet FOLLOW_statement_in_statement410 = new BitSet(new long[]{0x0000000000000008L,0x0000000000090834L});
    public static final BitSet FOLLOW_statement_in_statement414 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_statement450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000090834L});
    public static final BitSet FOLLOW_statement_in_statement454 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Equals_in_expr500 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Add_in_expr502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Subtract_in_expr504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LT_in_expr506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr511 = new BitSet(new long[]{0x0040002062000020L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_expr515 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_call_in_expr547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_expr556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_call583 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_call585 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_ELIST_in_call590 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_call594 = new BitSet(new long[]{0x0040002062000028L,0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_primary642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary667 = new BitSet(new long[]{0x0000000000000002L});

}