// $ANTLR 3.4 lime\\antlr3\\Gen.g 2016-04-28 23:29:49

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Action", "Add", "And", "Assert", "Assign", "Attr", "Begin", "Bool", "Booltype", "CBrace", "CBracket", "COMMENT", "CParen", "Class", "Colon", "Comma", "Divide", "Do", "Dot", "Else", "End", "Equals", "Excl", "GT", "GTEquals", "ID", "INT", "If", "Inherit", "Initialization", "Inttype", "LETTER", "LINE_COMMENT", "LT", "LTEquals", "Method", "Modulus", "Multiply", "NEquals", "New", "Null", "OBrace", "OBracket", "OParen", "Or", "Pow", "QMark", "Return", "SColon", "STRING", "Subtract", "Super", "Then", "This", "Var", "Voidtype", "WS", "When", "While", "ACTION", "ARGS_DECL", "ARG_DECL", "ASSIGN", "ATTR_DECL", "BLOCK", "CALL", "CLASS", "DOT", "ELIST", "EXPR", "FILE", "IF", "INHERIT", "INIT", "MEMBERS", "METHOD", "RETURN", "VAR_DECL", "WHILE"
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
    public static final int ARGS_DECL=64;
    public static final int ARG_DECL=65;
    public static final int ASSIGN=66;
    public static final int ATTR_DECL=67;
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
    public static final int VAR_DECL=81;
    public static final int WHILE=82;

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
    // lime\\antlr3\\Gen.g:32:1: translationunit : ^( FILE (d+= classdeclaration )+ ) -> file(decls=$dstrings=strings);
    public final Gen.translationunit_return translationunit() throws RecognitionException {
        Gen.translationunit_return retval = new Gen.translationunit_return();
        retval.start = input.LT(1);


        List list_d=null;
        RuleReturnScope d = null;
        try {
            // lime\\antlr3\\Gen.g:33:2: ( ^( FILE (d+= classdeclaration )+ ) -> file(decls=$dstrings=strings))
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
            // 34:3: -> file(decls=$dstrings=strings)
            {
                retval.st = templateLib.getInstanceOf("file",new STAttrMap().put("decls", list_d).put("strings", strings));
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
            match(input,CLASS,FOLLOW_CLASS_in_classdeclaration94); 

            match(input, Token.DOWN, null); 
            c=(LimeAST)match(input,ID,FOLLOW_ID_in_classdeclaration98); 

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
                    match(input,INHERIT,FOLLOW_INHERIT_in_classdeclaration102); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_classdeclaration104); 

                    match(input, Token.UP, null); 


                    }
                    break;

            }


            match(input,MEMBERS,FOLLOW_MEMBERS_in_classdeclaration111); 

            match(input, Token.DOWN, null); 
            // lime\\antlr3\\Gen.g:38:46: (m+= classMember )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case ACTION:
                case ATTR_DECL:
                case INIT:
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
            	    pushFollow(FOLLOW_classMember_in_classdeclaration115);
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
    // lime\\antlr3\\Gen.g:41:1: classMember : ( attrDeclaration -> {$attrDeclaration.st}| init -> {$init.st}| methodDeclaration -> {$methodDeclaration.st}| actionDeclaration -> {$actionDeclaration.st});
    public final Gen.classMember_return classMember() throws RecognitionException {
        Gen.classMember_return retval = new Gen.classMember_return();
        retval.start = input.LT(1);


        Gen.attrDeclaration_return attrDeclaration1 =null;

        Gen.init_return init2 =null;

        Gen.methodDeclaration_return methodDeclaration3 =null;

        Gen.actionDeclaration_return actionDeclaration4 =null;


        try {
            // lime\\antlr3\\Gen.g:42:2: ( attrDeclaration -> {$attrDeclaration.st}| init -> {$init.st}| methodDeclaration -> {$methodDeclaration.st}| actionDeclaration -> {$actionDeclaration.st})
            int alt4=4;
            switch ( input.LA(1) ) {
            case ATTR_DECL:
                {
                alt4=1;
                }
                break;
            case INIT:
                {
                alt4=2;
                }
                break;
            case METHOD:
                {
                alt4=3;
                }
                break;
            case ACTION:
                {
                alt4=4;
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
                    pushFollow(FOLLOW_attrDeclaration_in_classMember146);
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
                    // lime\\antlr3\\Gen.g:43:4: init
                    {
                    pushFollow(FOLLOW_init_in_classMember153);
                    init2=init();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 43:8: -> {$init.st}
                    {
                        retval.st = (init2!=null?init2.st:null);
                    }



                    }
                    break;
                case 3 :
                    // lime\\antlr3\\Gen.g:44:4: methodDeclaration
                    {
                    pushFollow(FOLLOW_methodDeclaration_in_classMember160);
                    methodDeclaration3=methodDeclaration();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 44:21: -> {$methodDeclaration.st}
                    {
                        retval.st = (methodDeclaration3!=null?methodDeclaration3.st:null);
                    }



                    }
                    break;
                case 4 :
                    // lime\\antlr3\\Gen.g:45:4: actionDeclaration
                    {
                    pushFollow(FOLLOW_actionDeclaration_in_classMember167);
                    actionDeclaration4=actionDeclaration();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 45:21: -> {$actionDeclaration.st}
                    {
                        retval.st = (actionDeclaration4!=null?actionDeclaration4.st:null);
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
    // lime\\antlr3\\Gen.g:47:1: attrDeclaration : ^( ATTR_DECL type= . ID ) -> attrdecl(sym=$ID.symbol);
    public final Gen.attrDeclaration_return attrDeclaration() throws RecognitionException {
        Gen.attrDeclaration_return retval = new Gen.attrDeclaration_return();
        retval.start = input.LT(1);


        LimeAST ID5=null;
        LimeAST type=null;

        try {
            // lime\\antlr3\\Gen.g:48:2: ( ^( ATTR_DECL type= . ID ) -> attrdecl(sym=$ID.symbol))
            // lime\\antlr3\\Gen.g:48:4: ^( ATTR_DECL type= . ID )
            {
            match(input,ATTR_DECL,FOLLOW_ATTR_DECL_in_attrDeclaration180); 

            match(input, Token.DOWN, null); 
            type=(LimeAST)input.LT(1);

            matchAny(input); 

            ID5=(LimeAST)match(input,ID,FOLLOW_ID_in_attrDeclaration186); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 49:3: -> attrdecl(sym=$ID.symbol)
            {
                retval.st = templateLib.getInstanceOf("attrdecl",new STAttrMap().put("sym", ID5.symbol));
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


    public static class init_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "init"
    // lime\\antlr3\\Gen.g:51:1: init : ^( INIT ( . )* ) -> init(;
    public final Gen.init_return init() throws RecognitionException {
        Gen.init_return retval = new Gen.init_return();
        retval.start = input.LT(1);


        try {
            // lime\\antlr3\\Gen.g:52:2: ( ^( INIT ( . )* ) -> init()
            // lime\\antlr3\\Gen.g:52:4: ^( INIT ( . )* )
            {
            match(input,INIT,FOLLOW_INIT_in_init209); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // lime\\antlr3\\Gen.g:52:11: ( . )*
                loop5:
                do {
                    int alt5=2;
                    switch ( input.LA(1) ) {
                    case Action:
                    case Add:
                    case And:
                    case Assert:
                    case Assign:
                    case Attr:
                    case Begin:
                    case Bool:
                    case Booltype:
                    case CBrace:
                    case CBracket:
                    case COMMENT:
                    case CParen:
                    case Class:
                    case Colon:
                    case Comma:
                    case Divide:
                    case Do:
                    case Dot:
                    case Else:
                    case End:
                    case Equals:
                    case Excl:
                    case GT:
                    case GTEquals:
                    case ID:
                    case INT:
                    case If:
                    case Inherit:
                    case Initialization:
                    case Inttype:
                    case LETTER:
                    case LINE_COMMENT:
                    case LT:
                    case LTEquals:
                    case Method:
                    case Modulus:
                    case Multiply:
                    case NEquals:
                    case New:
                    case Null:
                    case OBrace:
                    case OBracket:
                    case OParen:
                    case Or:
                    case Pow:
                    case QMark:
                    case Return:
                    case SColon:
                    case STRING:
                    case Subtract:
                    case Super:
                    case Then:
                    case This:
                    case Var:
                    case Voidtype:
                    case WS:
                    case When:
                    case While:
                    case ACTION:
                    case ARGS_DECL:
                    case ARG_DECL:
                    case ASSIGN:
                    case ATTR_DECL:
                    case BLOCK:
                    case CALL:
                    case CLASS:
                    case DOT:
                    case ELIST:
                    case EXPR:
                    case FILE:
                    case IF:
                    case INHERIT:
                    case INIT:
                    case MEMBERS:
                    case METHOD:
                    case RETURN:
                    case VAR_DECL:
                    case WHILE:
                        {
                        alt5=1;
                        }
                        break;
                    case UP:
                        {
                        alt5=2;
                        }
                        break;

                    }

                    switch (alt5) {
                	case 1 :
                	    // lime\\antlr3\\Gen.g:52:11: .
                	    {
                	    matchAny(input); 

                	    }
                	    break;

                	default :
                	    break loop5;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 53:3: -> init(
            {
                retval.st = templateLib.getInstanceOf("init");
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
    // $ANTLR end "init"


    public static class methodDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "methodDeclaration"
    // lime\\antlr3\\Gen.g:55:1: methodDeclaration : ^( METHOD ID ( . )* ) -> method(sym=$ID.symbol);
    public final Gen.methodDeclaration_return methodDeclaration() throws RecognitionException {
        Gen.methodDeclaration_return retval = new Gen.methodDeclaration_return();
        retval.start = input.LT(1);


        LimeAST ID6=null;

        try {
            // lime\\antlr3\\Gen.g:56:2: ( ^( METHOD ID ( . )* ) -> method(sym=$ID.symbol))
            // lime\\antlr3\\Gen.g:56:4: ^( METHOD ID ( . )* )
            {
            match(input,METHOD,FOLLOW_METHOD_in_methodDeclaration231); 

            match(input, Token.DOWN, null); 
            ID6=(LimeAST)match(input,ID,FOLLOW_ID_in_methodDeclaration233); 

            // lime\\antlr3\\Gen.g:56:16: ( . )*
            loop6:
            do {
                int alt6=2;
                switch ( input.LA(1) ) {
                case Action:
                case Add:
                case And:
                case Assert:
                case Assign:
                case Attr:
                case Begin:
                case Bool:
                case Booltype:
                case CBrace:
                case CBracket:
                case COMMENT:
                case CParen:
                case Class:
                case Colon:
                case Comma:
                case Divide:
                case Do:
                case Dot:
                case Else:
                case End:
                case Equals:
                case Excl:
                case GT:
                case GTEquals:
                case ID:
                case INT:
                case If:
                case Inherit:
                case Initialization:
                case Inttype:
                case LETTER:
                case LINE_COMMENT:
                case LT:
                case LTEquals:
                case Method:
                case Modulus:
                case Multiply:
                case NEquals:
                case New:
                case Null:
                case OBrace:
                case OBracket:
                case OParen:
                case Or:
                case Pow:
                case QMark:
                case Return:
                case SColon:
                case STRING:
                case Subtract:
                case Super:
                case Then:
                case This:
                case Var:
                case Voidtype:
                case WS:
                case When:
                case While:
                case ACTION:
                case ARGS_DECL:
                case ARG_DECL:
                case ASSIGN:
                case ATTR_DECL:
                case BLOCK:
                case CALL:
                case CLASS:
                case DOT:
                case ELIST:
                case EXPR:
                case FILE:
                case IF:
                case INHERIT:
                case INIT:
                case MEMBERS:
                case METHOD:
                case RETURN:
                case VAR_DECL:
                case WHILE:
                    {
                    alt6=1;
                    }
                    break;
                case UP:
                    {
                    alt6=2;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // lime\\antlr3\\Gen.g:56:16: .
            	    {
            	    matchAny(input); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 57:3: -> method(sym=$ID.symbol)
            {
                retval.st = templateLib.getInstanceOf("method",new STAttrMap().put("sym", ID6.symbol));
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


    public static class actionDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "actionDeclaration"
    // lime\\antlr3\\Gen.g:59:1: actionDeclaration : ^( ACTION ID ( . )* ) -> action(sym=$ID.symbol);
    public final Gen.actionDeclaration_return actionDeclaration() throws RecognitionException {
        Gen.actionDeclaration_return retval = new Gen.actionDeclaration_return();
        retval.start = input.LT(1);


        LimeAST ID7=null;

        try {
            // lime\\antlr3\\Gen.g:60:2: ( ^( ACTION ID ( . )* ) -> action(sym=$ID.symbol))
            // lime\\antlr3\\Gen.g:60:5: ^( ACTION ID ( . )* )
            {
            match(input,ACTION,FOLLOW_ACTION_in_actionDeclaration260); 

            match(input, Token.DOWN, null); 
            ID7=(LimeAST)match(input,ID,FOLLOW_ID_in_actionDeclaration262); 

            // lime\\antlr3\\Gen.g:60:17: ( . )*
            loop7:
            do {
                int alt7=2;
                switch ( input.LA(1) ) {
                case Action:
                case Add:
                case And:
                case Assert:
                case Assign:
                case Attr:
                case Begin:
                case Bool:
                case Booltype:
                case CBrace:
                case CBracket:
                case COMMENT:
                case CParen:
                case Class:
                case Colon:
                case Comma:
                case Divide:
                case Do:
                case Dot:
                case Else:
                case End:
                case Equals:
                case Excl:
                case GT:
                case GTEquals:
                case ID:
                case INT:
                case If:
                case Inherit:
                case Initialization:
                case Inttype:
                case LETTER:
                case LINE_COMMENT:
                case LT:
                case LTEquals:
                case Method:
                case Modulus:
                case Multiply:
                case NEquals:
                case New:
                case Null:
                case OBrace:
                case OBracket:
                case OParen:
                case Or:
                case Pow:
                case QMark:
                case Return:
                case SColon:
                case STRING:
                case Subtract:
                case Super:
                case Then:
                case This:
                case Var:
                case Voidtype:
                case WS:
                case When:
                case While:
                case ACTION:
                case ARGS_DECL:
                case ARG_DECL:
                case ASSIGN:
                case ATTR_DECL:
                case BLOCK:
                case CALL:
                case CLASS:
                case DOT:
                case ELIST:
                case EXPR:
                case FILE:
                case IF:
                case INHERIT:
                case INIT:
                case MEMBERS:
                case METHOD:
                case RETURN:
                case VAR_DECL:
                case WHILE:
                    {
                    alt7=1;
                    }
                    break;
                case UP:
                    {
                    alt7=2;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // lime\\antlr3\\Gen.g:60:17: .
            	    {
            	    matchAny(input); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 61:3: -> action(sym=$ID.symbol)
            {
                retval.st = templateLib.getInstanceOf("action",new STAttrMap().put("sym", ID7.symbol));
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
    // $ANTLR end "actionDeclaration"

    // Delegated rules


 

    public static final BitSet FOLLOW_FILE_in_translationunit58 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classdeclaration_in_translationunit62 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000040L});
    public static final BitSet FOLLOW_CLASS_in_classdeclaration94 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_classdeclaration98 = new BitSet(new long[]{0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_INHERIT_in_classdeclaration102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_classdeclaration104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEMBERS_in_classdeclaration111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classMember_in_classdeclaration115 = new BitSet(new long[]{0x8000000000000008L,0x000000000000A008L});
    public static final BitSet FOLLOW_attrDeclaration_in_classMember146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_in_classMember153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_classMember160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionDeclaration_in_classMember167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTR_DECL_in_attrDeclaration180 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_attrDeclaration186 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INIT_in_init209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_METHOD_in_methodDeclaration231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_methodDeclaration233 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x000000000007FFFFL});
    public static final BitSet FOLLOW_ACTION_in_actionDeclaration260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_actionDeclaration262 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x000000000007FFFFL});

}