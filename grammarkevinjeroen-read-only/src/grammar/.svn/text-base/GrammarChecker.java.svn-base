// $ANTLR 3.2 Sep 23, 2009 12:02:23 src\\grammar\\GrammarChecker.g 2010-07-07 15:36:48

	//package
	package src.grammar;
	import src.checker.Checker;
	import src.myTree.MyTree;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GrammarChecker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COLON", "SEMICOLON", "LPAREN", "RPAREN", "COMMA", "LCURLY", "RCURLY", "ASSIGN", "PLUS", "MINUS", "DIVIDE", "MULTI", "SMALLER", "GREATER", "SMALLEREQ", "GREATEREQ", "EQUAL", "NOTEQUAL", "AND", "OR", "NOT", "QUOTE", "SINGLEQUOTE", "INTEGER", "STRING", "BOOLEAN", "DO", "OD", "IF", "FI", "THEN", "CHARAND", "CHAROR", "CHARNOT", "CHARTRUE", "CHARFALSE", "VOID", "RETURN", "CHAR", "AMPERSAND", "ELSE", "WHILE", "PROGRAM", "EXPRESSIONS", "COMPOUND", "CLOSEDCOMPOUND", "PRINT", "READ", "ARITHMETIC", "DECLARATION", "EXPRESSION", "SUBEXPRESSION", "CONDITIONAL", "FUNCTIONDECLARATION", "DECLARGUMENTS", "PROCEDUREDECLARATION", "ARGUMENTUSE", "CALLABLE", "ROUTINECALL", "ARG", "IDENTIFIER", "CHARACTER", "NUMBER", "TEXT", "LETTER", "DIGIT", "COMMENT", "WS", "LOWER", "UPPER"
    };
    public static final int WHILE=45;
    public static final int LETTER=68;
    public static final int SUBEXPRESSION=55;
    public static final int CHAR=42;
    public static final int DO=30;
    public static final int PROCEDUREDECLARATION=59;
    public static final int MULTI=15;
    public static final int NOT=24;
    public static final int AND=22;
    public static final int SMALLER=16;
    public static final int EOF=-1;
    public static final int DECLARATION=53;
    public static final int CHARACTER=65;
    public static final int LPAREN=6;
    public static final int COMPOUND=48;
    public static final int IF=32;
    public static final int NOTEQUAL=21;
    public static final int CLOSEDCOMPOUND=49;
    public static final int RPAREN=7;
    public static final int QUOTE=25;
    public static final int GREATER=17;
    public static final int BOOLEAN=29;
    public static final int THEN=34;
    public static final int ARG=63;
    public static final int COMMA=8;
    public static final int FUNCTIONDECLARATION=57;
    public static final int SINGLEQUOTE=26;
    public static final int IDENTIFIER=64;
    public static final int CHARNOT=37;
    public static final int EQUAL=20;
    public static final int ARITHMETIC=52;
    public static final int RETURN=41;
    public static final int PLUS=12;
    public static final int VOID=40;
    public static final int DIGIT=69;
    public static final int COMMENT=70;
    public static final int EXPRESSION=54;
    public static final int DIVIDE=14;
    public static final int GREATEREQ=19;
    public static final int INTEGER=27;
    public static final int ARGUMENTUSE=60;
    public static final int CHARTRUE=38;
    public static final int ELSE=44;
    public static final int CONDITIONAL=56;
    public static final int NUMBER=66;
    public static final int AMPERSAND=43;
    public static final int DECLARGUMENTS=58;
    public static final int LCURLY=9;
    public static final int SEMICOLON=5;
    public static final int MINUS=13;
    public static final int TEXT=67;
    public static final int EXPRESSIONS=47;
    public static final int OD=31;
    public static final int PRINT=50;
    public static final int ROUTINECALL=62;
    public static final int FI=33;
    public static final int COLON=4;
    public static final int CALLABLE=61;
    public static final int WS=71;
    public static final int CHARAND=35;
    public static final int READ=51;
    public static final int CHARFALSE=39;
    public static final int OR=23;
    public static final int RCURLY=10;
    public static final int ASSIGN=11;
    public static final int PROGRAM=46;
    public static final int CHAROR=36;
    public static final int SMALLEREQ=18;
    public static final int LOWER=72;
    public static final int UPPER=73;
    public static final int STRING=28;

    // delegates
    // delegators


        public GrammarChecker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public GrammarChecker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GrammarChecker.tokenNames; }
    public String getGrammarFileName() { return "src\\grammar\\GrammarChecker.g"; }



    // $ANTLR start "program"
    // src\\grammar\\GrammarChecker.g:23:1: program returns [int count] : ^( PROGRAM programBody ) ;
    public final int program() throws RecognitionException {
        int count = 0;

        try {
            // src\\grammar\\GrammarChecker.g:24:2: ( ^( PROGRAM programBody ) )
            // src\\grammar\\GrammarChecker.g:24:4: ^( PROGRAM programBody )
            {
            match(input,PROGRAM,FOLLOW_PROGRAM_in_program54); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_programBody_in_program56);
            programBody();

            state._fsp--;


            match(input, Token.UP, null); 
             count = Checker.afterProgram(); 

            }

        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return count;
    }
    // $ANTLR end "program"


    // $ANTLR start "programBody"
    // src\\grammar\\GrammarChecker.g:27:1: programBody : ^( COMPOUND compoundExpression ) ;
    public final void programBody() throws RecognitionException {
        try {
            // src\\grammar\\GrammarChecker.g:28:2: ( ^( COMPOUND compoundExpression ) )
            // src\\grammar\\GrammarChecker.g:28:4: ^( COMPOUND compoundExpression )
            {
            match(input,COMPOUND,FOLLOW_COMPOUND_in_programBody72); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_compoundExpression_in_programBody74);
            compoundExpression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return ;
    }
    // $ANTLR end "programBody"


    // $ANTLR start "closedCompoundExpression"
    // src\\grammar\\GrammarChecker.g:31:1: closedCompoundExpression returns [String type=\"\"] : ^( COMPOUND t= compoundExpression ) ;
    public final String closedCompoundExpression() throws RecognitionException {
        String type = "";

        String t = null;


        try {
            // src\\grammar\\GrammarChecker.g:32:2: ( ^( COMPOUND t= compoundExpression ) )
            // src\\grammar\\GrammarChecker.g:32:4: ^( COMPOUND t= compoundExpression )
            {
            match(input,COMPOUND,FOLLOW_COMPOUND_in_closedCompoundExpression92); 

             Checker.getSymbolTable().openScope(); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_compoundExpression_in_closedCompoundExpression98);
            t=compoundExpression();

            state._fsp--;


            match(input, Token.UP, null); 
            type=t; Checker.getSymbolTable().closeScope();

            }

        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return type;
    }
    // $ANTLR end "closedCompoundExpression"


    // $ANTLR start "compoundExpression"
    // src\\grammar\\GrammarChecker.g:35:1: compoundExpression returns [String type=\"\"] : ^( EXPRESSIONS (t= expression )+ ) ;
    public final String compoundExpression() throws RecognitionException {
        String type = "";

        String t = null;


        try {
            // src\\grammar\\GrammarChecker.g:36:2: ( ^( EXPRESSIONS (t= expression )+ ) )
            // src\\grammar\\GrammarChecker.g:36:4: ^( EXPRESSIONS (t= expression )+ )
            {
            match(input,EXPRESSIONS,FOLLOW_EXPRESSIONS_in_compoundExpression117); 

            String temp = "void"; 

            match(input, Token.DOWN, null); 
            // src\\grammar\\GrammarChecker.g:36:43: (t= expression )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ASSIGN||LA1_0==WHILE||(LA1_0>=CLOSEDCOMPOUND && LA1_0<=DECLARATION)||(LA1_0>=CONDITIONAL && LA1_0<=FUNCTIONDECLARATION)||LA1_0==PROCEDUREDECLARATION) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src\\grammar\\GrammarChecker.g:36:44: t= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_compoundExpression124);
            	    t=expression();

            	    state._fsp--;

            	    temp=t;

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
             type=temp; 

            }

        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return type;
    }
    // $ANTLR end "compoundExpression"


    // $ANTLR start "expression"
    // src\\grammar\\GrammarChecker.g:39:1: expression returns [String type=\"\"] : ( ^( ASSIGN t= assignStatement ) | ^( ARITHMETIC t= arithmeticExpression ) | ^( DECLARATION t= declaration ) | ^( READ t= readStatement ) | ^( PRINT t= printStatement ) | ^( CLOSEDCOMPOUND t= closedCompoundExpression ) | ^( CONDITIONAL t= conditionalStatement ) | ^( WHILE t= whileStatement ) | ^( FUNCTIONDECLARATION t= functionDeclaration ) | ^( PROCEDUREDECLARATION t= procedureDeclaration ) );
    public final String expression() throws RecognitionException {
        String type = "";

        String t = null;


        try {
            // src\\grammar\\GrammarChecker.g:40:2: ( ^( ASSIGN t= assignStatement ) | ^( ARITHMETIC t= arithmeticExpression ) | ^( DECLARATION t= declaration ) | ^( READ t= readStatement ) | ^( PRINT t= printStatement ) | ^( CLOSEDCOMPOUND t= closedCompoundExpression ) | ^( CONDITIONAL t= conditionalStatement ) | ^( WHILE t= whileStatement ) | ^( FUNCTIONDECLARATION t= functionDeclaration ) | ^( PROCEDUREDECLARATION t= procedureDeclaration ) )
            int alt2=10;
            switch ( input.LA(1) ) {
            case ASSIGN:
                {
                alt2=1;
                }
                break;
            case ARITHMETIC:
                {
                alt2=2;
                }
                break;
            case DECLARATION:
                {
                alt2=3;
                }
                break;
            case READ:
                {
                alt2=4;
                }
                break;
            case PRINT:
                {
                alt2=5;
                }
                break;
            case CLOSEDCOMPOUND:
                {
                alt2=6;
                }
                break;
            case CONDITIONAL:
                {
                alt2=7;
                }
                break;
            case WHILE:
                {
                alt2=8;
                }
                break;
            case FUNCTIONDECLARATION:
                {
                alt2=9;
                }
                break;
            case PROCEDUREDECLARATION:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // src\\grammar\\GrammarChecker.g:40:4: ^( ASSIGN t= assignStatement )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expression146); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_assignStatement_in_expression150);
                    t=assignStatement();

                    state._fsp--;

                    type=t;

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // src\\grammar\\GrammarChecker.g:41:5: ^( ARITHMETIC t= arithmeticExpression )
                    {
                    match(input,ARITHMETIC,FOLLOW_ARITHMETIC_in_expression159); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticExpression_in_expression163);
                    t=arithmeticExpression();

                    state._fsp--;

                    type=t;

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // src\\grammar\\GrammarChecker.g:42:4: ^( DECLARATION t= declaration )
                    {
                    match(input,DECLARATION,FOLLOW_DECLARATION_in_expression171); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_declaration_in_expression175);
                    t=declaration();

                    state._fsp--;

                    type=t;

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // src\\grammar\\GrammarChecker.g:43:4: ^( READ t= readStatement )
                    {
                    match(input,READ,FOLLOW_READ_in_expression183); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_readStatement_in_expression187);
                    t=readStatement();

                    state._fsp--;

                    type=t;

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // src\\grammar\\GrammarChecker.g:44:4: ^( PRINT t= printStatement )
                    {
                    match(input,PRINT,FOLLOW_PRINT_in_expression195); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_printStatement_in_expression199);
                    t=printStatement();

                    state._fsp--;

                    type=t;

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // src\\grammar\\GrammarChecker.g:45:4: ^( CLOSEDCOMPOUND t= closedCompoundExpression )
                    {
                    match(input,CLOSEDCOMPOUND,FOLLOW_CLOSEDCOMPOUND_in_expression207); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_closedCompoundExpression_in_expression211);
                    t=closedCompoundExpression();

                    state._fsp--;

                    type=t;

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // src\\grammar\\GrammarChecker.g:46:4: ^( CONDITIONAL t= conditionalStatement )
                    {
                    match(input,CONDITIONAL,FOLLOW_CONDITIONAL_in_expression219); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_conditionalStatement_in_expression223);
                    t=conditionalStatement();

                    state._fsp--;

                     type = t; 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // src\\grammar\\GrammarChecker.g:47:4: ^( WHILE t= whileStatement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_expression231); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_whileStatement_in_expression235);
                    t=whileStatement();

                    state._fsp--;

                     type=t; 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // src\\grammar\\GrammarChecker.g:48:4: ^( FUNCTIONDECLARATION t= functionDeclaration )
                    {
                    match(input,FUNCTIONDECLARATION,FOLLOW_FUNCTIONDECLARATION_in_expression243); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_functionDeclaration_in_expression247);
                    t=functionDeclaration();

                    state._fsp--;

                     type = t; 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // src\\grammar\\GrammarChecker.g:49:4: ^( PROCEDUREDECLARATION t= procedureDeclaration )
                    {
                    match(input,PROCEDUREDECLARATION,FOLLOW_PROCEDUREDECLARATION_in_expression255); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_procedureDeclaration_in_expression259);
                    t=procedureDeclaration();

                    state._fsp--;

                     type = t; 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return type;
    }
    // $ANTLR end "expression"


    // $ANTLR start "procedureDeclaration"
    // src\\grammar\\GrammarChecker.g:53:1: procedureDeclaration returns [String type=\"void\"] : VOID callableDeclaration[\"void\"] ;
    public final String procedureDeclaration() throws RecognitionException {
        String type = "void";

        try {
            // src\\grammar\\GrammarChecker.g:54:2: ( VOID callableDeclaration[\"void\"] )
            // src\\grammar\\GrammarChecker.g:54:4: VOID callableDeclaration[\"void\"]
            {
            match(input,VOID,FOLLOW_VOID_in_procedureDeclaration282); 
            pushFollow(FOLLOW_callableDeclaration_in_procedureDeclaration284);
            callableDeclaration("void");

            state._fsp--;


            }

        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return type;
    }
    // $ANTLR end "procedureDeclaration"


    // $ANTLR start "functionDeclaration"
    // src\\grammar\\GrammarChecker.g:57:1: functionDeclaration returns [String type=\"\"] : t= returnType callableDeclaration[t] ;
    public final String functionDeclaration() throws RecognitionException {
        String type = "";

        String t = null;


        try {
            // src\\grammar\\GrammarChecker.g:58:2: (t= returnType callableDeclaration[t] )
            // src\\grammar\\GrammarChecker.g:58:4: t= returnType callableDeclaration[t]
            {
            pushFollow(FOLLOW_returnType_in_functionDeclaration303);
            t=returnType();

            state._fsp--;

            type=t;
            pushFollow(FOLLOW_callableDeclaration_in_functionDeclaration306);
            callableDeclaration(t);

            state._fsp--;


            }

        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return type;
    }
    // $ANTLR end "functionDeclaration"


    // $ANTLR start "callableDeclaration"
    // src\\grammar\\GrammarChecker.g:61:1: callableDeclaration[String returnt] returns [String type=\"\"] : ^( CALLABLE id= IDENTIFIER argsDeclaration[$id.getText()] t= closedCompoundExpression ) ;
    public final String callableDeclaration(String returnt) throws RecognitionException {
        String type = "";

        MyTree id=null;
        String t = null;


        try {
            // src\\grammar\\GrammarChecker.g:62:2: ( ^( CALLABLE id= IDENTIFIER argsDeclaration[$id.getText()] t= closedCompoundExpression ) )
            // src\\grammar\\GrammarChecker.g:62:4: ^( CALLABLE id= IDENTIFIER argsDeclaration[$id.getText()] t= closedCompoundExpression )
            {
            match(input,CALLABLE,FOLLOW_CALLABLE_in_callableDeclaration325); 

            match(input, Token.DOWN, null); 
            id=(MyTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_callableDeclaration329); 
            Checker.checkCallableDec(id, returnt); Checker.getSymbolTable().openScope(); 
            pushFollow(FOLLOW_argsDeclaration_in_callableDeclaration332);
            argsDeclaration(id.getText());

            state._fsp--;


            		
            			// Zet de positie van de argumenten weer op 0
            			Checker.setArgumentPos(0);
            		
            pushFollow(FOLLOW_closedCompoundExpression_in_callableDeclaration339);
            t=closedCompoundExpression();

            state._fsp--;

            Checker.checkReturnType(t, returnt, id); type=t; Checker.getSymbolTable().closeScope(); 

            match(input, Token.UP, null); 

            }

        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return type;
    }
    // $ANTLR end "callableDeclaration"


    // $ANTLR start "argsDeclaration"
    // src\\grammar\\GrammarChecker.g:69:1: argsDeclaration[String name] : ^( DECLARGUMENTS ( argDec[name] )* ) ;
    public final void argsDeclaration(String name) throws RecognitionException {
        try {
            // src\\grammar\\GrammarChecker.g:70:2: ( ^( DECLARGUMENTS ( argDec[name] )* ) )
            // src\\grammar\\GrammarChecker.g:70:4: ^( DECLARGUMENTS ( argDec[name] )* )
            {
            match(input,DECLARGUMENTS,FOLLOW_DECLARGUMENTS_in_argsDeclaration356); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // src\\grammar\\GrammarChecker.g:70:20: ( argDec[name] )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==INTEGER||LA3_0==BOOLEAN||LA3_0==CHAR) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // src\\grammar\\GrammarChecker.g:70:20: argDec[name]
                	    {
                	    pushFollow(FOLLOW_argDec_in_argsDeclaration358);
                	    argDec(name);

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return ;
    }
    // $ANTLR end "argsDeclaration"


    // $ANTLR start "argDec"
    // src\\grammar\\GrammarChecker.g:73:1: argDec[String name] : ^(t= returnType ( ( AMPERSAND )? id= IDENTIFIER )+ ) ;
    public final void argDec(String name) throws RecognitionException {
        MyTree id=null;
        String t = null;


        try {
            // src\\grammar\\GrammarChecker.g:74:2: ( ^(t= returnType ( ( AMPERSAND )? id= IDENTIFIER )+ ) )
            // src\\grammar\\GrammarChecker.g:74:4: ^(t= returnType ( ( AMPERSAND )? id= IDENTIFIER )+ )
            {
            pushFollow(FOLLOW_returnType_in_argDec377);
            t=returnType();

            state._fsp--;


            match(input, Token.DOWN, null); 
            // src\\grammar\\GrammarChecker.g:74:19: ( ( AMPERSAND )? id= IDENTIFIER )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==AMPERSAND||LA5_0==IDENTIFIER) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src\\grammar\\GrammarChecker.g:74:20: ( AMPERSAND )? id= IDENTIFIER
            	    {
            	    // src\\grammar\\GrammarChecker.g:74:20: ( AMPERSAND )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==AMPERSAND) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // src\\grammar\\GrammarChecker.g:74:20: AMPERSAND
            	            {
            	            match(input,AMPERSAND,FOLLOW_AMPERSAND_in_argDec380); 

            	            }
            	            break;

            	    }

            	    id=(MyTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_argDec385); 
            	     Checker.checkArgDec(id, t, name); 

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

        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return ;
    }
    // $ANTLR end "argDec"


    // $ANTLR start "whileStatement"
    // src\\grammar\\GrammarChecker.g:77:1: whileStatement returns [String type=\"void\"] : ^(w= WHILE t= compoundExpression compoundExpression ) ;
    public final String whileStatement() throws RecognitionException {
        String type = "void";

        MyTree w=null;
        String t = null;


        try {
            // src\\grammar\\GrammarChecker.g:78:2: ( ^(w= WHILE t= compoundExpression compoundExpression ) )
            // src\\grammar\\GrammarChecker.g:78:4: ^(w= WHILE t= compoundExpression compoundExpression )
            {
            w=(MyTree)match(input,WHILE,FOLLOW_WHILE_in_whileStatement409); 

            Checker.getSymbolTable().openScope(); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_compoundExpression_in_whileStatement415);
            t=compoundExpression();

            state._fsp--;

             Checker.getSymbolTable().openScope(); 
            pushFollow(FOLLOW_compoundExpression_in_whileStatement419);
            compoundExpression();

            state._fsp--;

             Checker.getSymbolTable().closeScope(); Checker.getSymbolTable().closeScope(); 

            			Checker.checkWhileCondition(t, w);
            		

            match(input, Token.UP, null); 

            }

        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return type;
    }
    // $ANTLR end "whileStatement"


    // $ANTLR start "conditionalStatement"
    // src\\grammar\\GrammarChecker.g:83:1: conditionalStatement returns [String type = \"\"] : ^(r= IF tcond= compoundExpression tif= compoundExpression (telse= elseStatement )? ) ;
    public final String conditionalStatement() throws RecognitionException {
        String type =  "";

        MyTree r=null;
        String tcond = null;

        String tif = null;

        String telse = null;


        try {
            // src\\grammar\\GrammarChecker.g:84:2: ( ^(r= IF tcond= compoundExpression tif= compoundExpression (telse= elseStatement )? ) )
            // src\\grammar\\GrammarChecker.g:84:4: ^(r= IF tcond= compoundExpression tif= compoundExpression (telse= elseStatement )? )
            {
            r=(MyTree)match(input,IF,FOLLOW_IF_in_conditionalStatement444); 

            Checker.getSymbolTable().openScope(); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_compoundExpression_in_conditionalStatement453);
            tcond=compoundExpression();

            state._fsp--;

            Checker.getSymbolTable().openScope(); 
            pushFollow(FOLLOW_compoundExpression_in_conditionalStatement462);
            tif=compoundExpression();

            state._fsp--;

             Checker.getSymbolTable().closeScope(); 
            // src\\grammar\\GrammarChecker.g:87:8: (telse= elseStatement )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ELSE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // src\\grammar\\GrammarChecker.g:87:8: telse= elseStatement
                    {
                    pushFollow(FOLLOW_elseStatement_in_conditionalStatement471);
                    telse=elseStatement();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
             Checker.getSymbolTable().closeScope(); type=Checker.checkIfCondition(tcond, tif, telse, r); 

            }

        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return type;
    }
    // $ANTLR end "conditionalStatement"


    // $ANTLR start "elseStatement"
    // src\\grammar\\GrammarChecker.g:90:1: elseStatement returns [String type = \"\"] : ^( ELSE t= compoundExpression ) ;
    public final String elseStatement() throws RecognitionException {
        String type =  "";

        String t = null;


        try {
            // src\\grammar\\GrammarChecker.g:91:2: ( ^( ELSE t= compoundExpression ) )
            // src\\grammar\\GrammarChecker.g:91:4: ^( ELSE t= compoundExpression )
            {
            match(input,ELSE,FOLLOW_ELSE_in_elseStatement492); 

            Checker.getSymbolTable().openScope(); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_compoundExpression_in_elseStatement501);
            t=compoundExpression();

            state._fsp--;

            Checker.getSymbolTable().closeScope(); type = t;

            match(input, Token.UP, null); 

            }

        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return type;
    }
    // $ANTLR end "elseStatement"


    // $ANTLR start "arithmeticExpression"
    // src\\grammar\\GrammarChecker.g:95:1: arithmeticExpression returns [String type=\"\"] : ( ^( EXPRESSION (not= NOT )? type1= arithmeticExpression ) | ^(and2= AND type1= arithmeticExpression type2= arithmeticExpression ) | ^(or2= OR type1= arithmeticExpression type2= arithmeticExpression ) | ^(equal= EQUAL type1= arithmeticExpression type2= arithmeticExpression ) | ^(notequal= NOTEQUAL type1= arithmeticExpression type2= arithmeticExpression ) | ^(greater= GREATER type1= arithmeticExpression type2= arithmeticExpression ) | ^(smaller= SMALLER type1= arithmeticExpression type2= arithmeticExpression ) | ^(greatereq= GREATEREQ type1= arithmeticExpression type2= arithmeticExpression ) | ^(smallereq= SMALLEREQ type1= arithmeticExpression type2= arithmeticExpression ) | ^(plus= PLUS type1= arithmeticExpression type2= arithmeticExpression ) | ^(minus= MINUS type1= arithmeticExpression type2= arithmeticExpression ) | ^(multi= MULTI type1= arithmeticExpression type2= arithmeticExpression ) | ^(divide= DIVIDE type1= arithmeticExpression type2= arithmeticExpression ) | type1= operand );
    public final String arithmeticExpression() throws RecognitionException {
        String type = "";

        MyTree not=null;
        MyTree and2=null;
        MyTree or2=null;
        MyTree equal=null;
        MyTree notequal=null;
        MyTree greater=null;
        MyTree smaller=null;
        MyTree greatereq=null;
        MyTree smallereq=null;
        MyTree plus=null;
        MyTree minus=null;
        MyTree multi=null;
        MyTree divide=null;
        String type1 = null;

        String type2 = null;


        try {
            // src\\grammar\\GrammarChecker.g:96:2: ( ^( EXPRESSION (not= NOT )? type1= arithmeticExpression ) | ^(and2= AND type1= arithmeticExpression type2= arithmeticExpression ) | ^(or2= OR type1= arithmeticExpression type2= arithmeticExpression ) | ^(equal= EQUAL type1= arithmeticExpression type2= arithmeticExpression ) | ^(notequal= NOTEQUAL type1= arithmeticExpression type2= arithmeticExpression ) | ^(greater= GREATER type1= arithmeticExpression type2= arithmeticExpression ) | ^(smaller= SMALLER type1= arithmeticExpression type2= arithmeticExpression ) | ^(greatereq= GREATEREQ type1= arithmeticExpression type2= arithmeticExpression ) | ^(smallereq= SMALLEREQ type1= arithmeticExpression type2= arithmeticExpression ) | ^(plus= PLUS type1= arithmeticExpression type2= arithmeticExpression ) | ^(minus= MINUS type1= arithmeticExpression type2= arithmeticExpression ) | ^(multi= MULTI type1= arithmeticExpression type2= arithmeticExpression ) | ^(divide= DIVIDE type1= arithmeticExpression type2= arithmeticExpression ) | type1= operand )
            int alt8=14;
            switch ( input.LA(1) ) {
            case EXPRESSION:
                {
                alt8=1;
                }
                break;
            case AND:
                {
                alt8=2;
                }
                break;
            case OR:
                {
                alt8=3;
                }
                break;
            case EQUAL:
                {
                alt8=4;
                }
                break;
            case NOTEQUAL:
                {
                alt8=5;
                }
                break;
            case GREATER:
                {
                alt8=6;
                }
                break;
            case SMALLER:
                {
                alt8=7;
                }
                break;
            case GREATEREQ:
                {
                alt8=8;
                }
                break;
            case SMALLEREQ:
                {
                alt8=9;
                }
                break;
            case PLUS:
                {
                alt8=10;
                }
                break;
            case MINUS:
                {
                alt8=11;
                }
                break;
            case MULTI:
                {
                alt8=12;
                }
                break;
            case DIVIDE:
                {
                alt8=13;
                }
                break;
            case CHARTRUE:
            case CHARFALSE:
            case CLOSEDCOMPOUND:
            case SUBEXPRESSION:
            case ROUTINECALL:
            case IDENTIFIER:
            case CHARACTER:
            case NUMBER:
                {
                alt8=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // src\\grammar\\GrammarChecker.g:96:4: ^( EXPRESSION (not= NOT )? type1= arithmeticExpression )
                    {
                    match(input,EXPRESSION,FOLLOW_EXPRESSION_in_arithmeticExpression521); 

                    match(input, Token.DOWN, null); 
                    // src\\grammar\\GrammarChecker.g:96:20: (not= NOT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==NOT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // src\\grammar\\GrammarChecker.g:96:20: not= NOT
                            {
                            not=(MyTree)match(input,NOT,FOLLOW_NOT_in_arithmeticExpression525); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression530);
                    type1=arithmeticExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    			Checker.checkNotExpression(not == null ? null : not, type1);
                    			type=type1;
                    		

                    }
                    break;
                case 2 :
                    // src\\grammar\\GrammarChecker.g:100:4: ^(and2= AND type1= arithmeticExpression type2= arithmeticExpression )
                    {
                    and2=(MyTree)match(input,AND,FOLLOW_AND_in_arithmeticExpression540); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression544);
                    type1=arithmeticExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression548);
                    type2=arithmeticExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    			Checker.checkAndExpression(type1, type2, and2);
                    			type="boolean";
                    		

                    }
                    break;
                case 3 :
                    // src\\grammar\\GrammarChecker.g:104:4: ^(or2= OR type1= arithmeticExpression type2= arithmeticExpression )
                    {
                    or2=(MyTree)match(input,OR,FOLLOW_OR_in_arithmeticExpression558); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression562);
                    type1=arithmeticExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression566);
                    type2=arithmeticExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    			Checker.checkOrExpression(type1, type2, or2);			
                    			type="boolean";
                    		

                    }
                    break;
                case 4 :
                    // src\\grammar\\GrammarChecker.g:108:4: ^(equal= EQUAL type1= arithmeticExpression type2= arithmeticExpression )
                    {
                    equal=(MyTree)match(input,EQUAL,FOLLOW_EQUAL_in_arithmeticExpression576); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression580);
                    type1=arithmeticExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression584);
                    type2=arithmeticExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    			Checker.checkEqualExpression(type1, type2, equal);
                    			type="boolean";
                    		

                    }
                    break;
                case 5 :
                    // src\\grammar\\GrammarChecker.g:112:4: ^(notequal= NOTEQUAL type1= arithmeticExpression type2= arithmeticExpression )
                    {
                    notequal=(MyTree)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_arithmeticExpression594); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression598);
                    type1=arithmeticExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression602);
                    type2=arithmeticExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    			Checker.checkNotEqualExpression(type1, type2, notequal);
                    			type="boolean";
                    		

                    }
                    break;
                case 6 :
                    // src\\grammar\\GrammarChecker.g:117:4: ^(greater= GREATER type1= arithmeticExpression type2= arithmeticExpression )
                    {
                    greater=(MyTree)match(input,GREATER,FOLLOW_GREATER_in_arithmeticExpression615); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression619);
                    type1=arithmeticExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression623);
                    type2=arithmeticExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    			Checker.checkGreaterExpression(type1, type2, greater);
                    			type="boolean";
                    		

                    }
                    break;
                case 7 :
                    // src\\grammar\\GrammarChecker.g:121:4: ^(smaller= SMALLER type1= arithmeticExpression type2= arithmeticExpression )
                    {
                    smaller=(MyTree)match(input,SMALLER,FOLLOW_SMALLER_in_arithmeticExpression633); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression637);
                    type1=arithmeticExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression641);
                    type2=arithmeticExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    			Checker.checkSmallerExpression(type1, type2, smaller);
                    			type="boolean";
                    		

                    }
                    break;
                case 8 :
                    // src\\grammar\\GrammarChecker.g:125:4: ^(greatereq= GREATEREQ type1= arithmeticExpression type2= arithmeticExpression )
                    {
                    greatereq=(MyTree)match(input,GREATEREQ,FOLLOW_GREATEREQ_in_arithmeticExpression651); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression655);
                    type1=arithmeticExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression659);
                    type2=arithmeticExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    			Checker.checkGreaterEqExpression(type1, type2, greatereq);
                    			type="boolean";
                    		

                    }
                    break;
                case 9 :
                    // src\\grammar\\GrammarChecker.g:129:4: ^(smallereq= SMALLEREQ type1= arithmeticExpression type2= arithmeticExpression )
                    {
                    smallereq=(MyTree)match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_arithmeticExpression669); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression673);
                    type1=arithmeticExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression677);
                    type2=arithmeticExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    			Checker.checkSmallerEqExpression(type1, type2, smallereq);
                    			type="boolean";
                    		

                    }
                    break;
                case 10 :
                    // src\\grammar\\GrammarChecker.g:133:4: ^(plus= PLUS type1= arithmeticExpression type2= arithmeticExpression )
                    {
                    plus=(MyTree)match(input,PLUS,FOLLOW_PLUS_in_arithmeticExpression687); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression691);
                    type1=arithmeticExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression695);
                    type2=arithmeticExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    			Checker.checkPlusExpression(type1, type2, plus);
                    			type=type1;
                    		

                    }
                    break;
                case 11 :
                    // src\\grammar\\GrammarChecker.g:137:4: ^(minus= MINUS type1= arithmeticExpression type2= arithmeticExpression )
                    {
                    minus=(MyTree)match(input,MINUS,FOLLOW_MINUS_in_arithmeticExpression705); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression709);
                    type1=arithmeticExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression713);
                    type2=arithmeticExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    			Checker.checkMinusExpression(type1, type2, minus);
                    			type=type1;
                    		

                    }
                    break;
                case 12 :
                    // src\\grammar\\GrammarChecker.g:141:4: ^(multi= MULTI type1= arithmeticExpression type2= arithmeticExpression )
                    {
                    multi=(MyTree)match(input,MULTI,FOLLOW_MULTI_in_arithmeticExpression723); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression727);
                    type1=arithmeticExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression731);
                    type2=arithmeticExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    			Checker.checkMultiExpression(type1, type2, multi);
                    			type=type1;
                    		

                    }
                    break;
                case 13 :
                    // src\\grammar\\GrammarChecker.g:145:4: ^(divide= DIVIDE type1= arithmeticExpression type2= arithmeticExpression )
                    {
                    divide=(MyTree)match(input,DIVIDE,FOLLOW_DIVIDE_in_arithmeticExpression742); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression746);
                    type1=arithmeticExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_arithmeticExpression_in_arithmeticExpression750);
                    type2=arithmeticExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    			Checker.checkDivideExpression(type1, type2, divide);
                    			type=type1;
                    		

                    }
                    break;
                case 14 :
                    // src\\grammar\\GrammarChecker.g:149:4: type1= operand
                    {
                    pushFollow(FOLLOW_operand_in_arithmeticExpression759);
                    type1=operand();

                    state._fsp--;

                    type=type1;

                    }
                    break;

            }
        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return type;
    }
    // $ANTLR end "arithmeticExpression"


    // $ANTLR start "operand"
    // src\\grammar\\GrammarChecker.g:152:1: operand returns [String type=\"\"] : ( NUMBER | CHARTRUE | CHARACTER | CHARFALSE | ^( SUBEXPRESSION t= arithmeticExpression ) | id= IDENTIFIER | ^( ROUTINECALL t= callableUse ) | ^( CLOSEDCOMPOUND t= closedCompoundExpression ) );
    public final String operand() throws RecognitionException {
        String type = "";

        MyTree id=null;
        String t = null;


        try {
            // src\\grammar\\GrammarChecker.g:153:2: ( NUMBER | CHARTRUE | CHARACTER | CHARFALSE | ^( SUBEXPRESSION t= arithmeticExpression ) | id= IDENTIFIER | ^( ROUTINECALL t= callableUse ) | ^( CLOSEDCOMPOUND t= closedCompoundExpression ) )
            int alt9=8;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt9=1;
                }
                break;
            case CHARTRUE:
                {
                alt9=2;
                }
                break;
            case CHARACTER:
                {
                alt9=3;
                }
                break;
            case CHARFALSE:
                {
                alt9=4;
                }
                break;
            case SUBEXPRESSION:
                {
                alt9=5;
                }
                break;
            case IDENTIFIER:
                {
                alt9=6;
                }
                break;
            case ROUTINECALL:
                {
                alt9=7;
                }
                break;
            case CLOSEDCOMPOUND:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // src\\grammar\\GrammarChecker.g:153:4: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_operand777); 
                    type="int";

                    }
                    break;
                case 2 :
                    // src\\grammar\\GrammarChecker.g:154:4: CHARTRUE
                    {
                    match(input,CHARTRUE,FOLLOW_CHARTRUE_in_operand783); 
                    type="boolean";

                    }
                    break;
                case 3 :
                    // src\\grammar\\GrammarChecker.g:155:4: CHARACTER
                    {
                    match(input,CHARACTER,FOLLOW_CHARACTER_in_operand789); 
                    type="char";

                    }
                    break;
                case 4 :
                    // src\\grammar\\GrammarChecker.g:156:4: CHARFALSE
                    {
                    match(input,CHARFALSE,FOLLOW_CHARFALSE_in_operand795); 
                    type="boolean";

                    }
                    break;
                case 5 :
                    // src\\grammar\\GrammarChecker.g:157:4: ^( SUBEXPRESSION t= arithmeticExpression )
                    {
                    match(input,SUBEXPRESSION,FOLLOW_SUBEXPRESSION_in_operand802); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmeticExpression_in_operand806);
                    t=arithmeticExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    type=t;

                    }
                    break;
                case 6 :
                    // src\\grammar\\GrammarChecker.g:158:4: id= IDENTIFIER
                    {
                    id=(MyTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand815); 
                     type = Checker.checkVarUse(id); 

                    }
                    break;
                case 7 :
                    // src\\grammar\\GrammarChecker.g:159:4: ^( ROUTINECALL t= callableUse )
                    {
                    match(input,ROUTINECALL,FOLLOW_ROUTINECALL_in_operand822); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_callableUse_in_operand826);
                    t=callableUse();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    type=t;

                    }
                    break;
                case 8 :
                    // src\\grammar\\GrammarChecker.g:160:4: ^( CLOSEDCOMPOUND t= closedCompoundExpression )
                    {
                    match(input,CLOSEDCOMPOUND,FOLLOW_CLOSEDCOMPOUND_in_operand834); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_closedCompoundExpression_in_operand838);
                    t=closedCompoundExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    type=t;

                    }
                    break;

            }
        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return type;
    }
    // $ANTLR end "operand"


    // $ANTLR start "callableUse"
    // src\\grammar\\GrammarChecker.g:163:1: callableUse returns [String type=\"\"] : ^(id= IDENTIFIER (hasArguments= argUse[Checker.getSymbolTable().retrieve($id.getText()).getTree()] ) ) ;
    public final String callableUse() throws RecognitionException {
        String type = "";

        MyTree id=null;
        boolean hasArguments = false;


        try {
            // src\\grammar\\GrammarChecker.g:164:2: ( ^(id= IDENTIFIER (hasArguments= argUse[Checker.getSymbolTable().retrieve($id.getText()).getTree()] ) ) )
            // src\\grammar\\GrammarChecker.g:164:4: ^(id= IDENTIFIER (hasArguments= argUse[Checker.getSymbolTable().retrieve($id.getText()).getTree()] ) )
            {
            id=(MyTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_callableUse860); 

             Checker.checkFuncUse(id);

            match(input, Token.DOWN, null); 
            // src\\grammar\\GrammarChecker.g:165:3: (hasArguments= argUse[Checker.getSymbolTable().retrieve($id.getText()).getTree()] )
            // src\\grammar\\GrammarChecker.g:165:4: hasArguments= argUse[Checker.getSymbolTable().retrieve($id.getText()).getTree()]
            {
            pushFollow(FOLLOW_argUse_in_callableUse870);
            hasArguments=argUse(Checker.getSymbolTable().retrieve(id.getText()).getTree());

            state._fsp--;


            }


            match(input, Token.UP, null); 

            			Checker.checkArguments(id, hasArguments);
            			type=Checker.getSymbolTable().retrieve(id.getText()).getTree().getIdType();
            		

            }

        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return type;
    }
    // $ANTLR end "callableUse"


    // $ANTLR start "argUse"
    // src\\grammar\\GrammarChecker.g:171:1: argUse[MyTree routine] returns [boolean hasArguments = false] : ^( ARGUMENTUSE (id= ARG t= compoundExpression )* ) ;
    public final boolean argUse(MyTree routine) throws RecognitionException {
        boolean hasArguments =  false;

        MyTree id=null;
        String t = null;


        try {
            // src\\grammar\\GrammarChecker.g:172:2: ( ^( ARGUMENTUSE (id= ARG t= compoundExpression )* ) )
            // src\\grammar\\GrammarChecker.g:172:4: ^( ARGUMENTUSE (id= ARG t= compoundExpression )* )
            {
            match(input,ARGUMENTUSE,FOLLOW_ARGUMENTUSE_in_argUse894); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // src\\grammar\\GrammarChecker.g:172:18: (id= ARG t= compoundExpression )*
                loop10:
                do {
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ARG) ) {
                        alt10=1;
                    }


                    switch (alt10) {
                	case 1 :
                	    // src\\grammar\\GrammarChecker.g:172:19: id= ARG t= compoundExpression
                	    {
                	    id=(MyTree)match(input,ARG,FOLLOW_ARG_in_argUse899); 
                	    pushFollow(FOLLOW_compoundExpression_in_argUse903);
                	    t=compoundExpression();

                	    state._fsp--;


                	    			hasArguments = true;
                	    			Checker.checkArgExpression(id, routine, t);		
                	    		

                	    }
                	    break;

                	default :
                	    break loop10;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return hasArguments;
    }
    // $ANTLR end "argUse"


    // $ANTLR start "assignStatement"
    // src\\grammar\\GrammarChecker.g:178:1: assignStatement returns [String type=\"\"] : id= IDENTIFIER assign= ASSIGN t= expression ;
    public final String assignStatement() throws RecognitionException {
        String type = "";

        MyTree id=null;
        MyTree assign=null;
        String t = null;


        try {
            // src\\grammar\\GrammarChecker.g:179:2: (id= IDENTIFIER assign= ASSIGN t= expression )
            // src\\grammar\\GrammarChecker.g:179:4: id= IDENTIFIER assign= ASSIGN t= expression
            {
            id=(MyTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignStatement925); 
            assign=(MyTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignStatement929); 
            pushFollow(FOLLOW_expression_in_assignStatement933);
            t=expression();

            state._fsp--;

             Checker.checkAssignment(id, t, assign); type=t;

            }

        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return type;
    }
    // $ANTLR end "assignStatement"


    // $ANTLR start "declaration"
    // src\\grammar\\GrammarChecker.g:182:1: declaration returns [String type=\"void\"] : ^(t= returnType ( ( AMPERSAND )? id= IDENTIFIER )+ ) ;
    public final String declaration() throws RecognitionException {
        String type = "void";

        MyTree id=null;
        String t = null;


        try {
            // src\\grammar\\GrammarChecker.g:183:2: ( ^(t= returnType ( ( AMPERSAND )? id= IDENTIFIER )+ ) )
            // src\\grammar\\GrammarChecker.g:183:4: ^(t= returnType ( ( AMPERSAND )? id= IDENTIFIER )+ )
            {
            pushFollow(FOLLOW_returnType_in_declaration955);
            t=returnType();

            state._fsp--;


            match(input, Token.DOWN, null); 
            // src\\grammar\\GrammarChecker.g:183:19: ( ( AMPERSAND )? id= IDENTIFIER )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AMPERSAND||LA12_0==IDENTIFIER) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src\\grammar\\GrammarChecker.g:183:20: ( AMPERSAND )? id= IDENTIFIER
            	    {
            	    // src\\grammar\\GrammarChecker.g:183:20: ( AMPERSAND )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==AMPERSAND) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // src\\grammar\\GrammarChecker.g:183:20: AMPERSAND
            	            {
            	            match(input,AMPERSAND,FOLLOW_AMPERSAND_in_declaration958); 

            	            }
            	            break;

            	    }

            	    id=(MyTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration963); 
            	     Checker.checkVarDeclaration(id, t); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return type;
    }
    // $ANTLR end "declaration"


    // $ANTLR start "returnType"
    // src\\grammar\\GrammarChecker.g:186:1: returnType returns [String type=\"\"] : (t= INTEGER | t= BOOLEAN | t= CHAR );
    public final String returnType() throws RecognitionException {
        String type = "";

        MyTree t=null;

        try {
            // src\\grammar\\GrammarChecker.g:187:2: (t= INTEGER | t= BOOLEAN | t= CHAR )
            int alt13=3;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt13=1;
                }
                break;
            case BOOLEAN:
                {
                alt13=2;
                }
                break;
            case CHAR:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // src\\grammar\\GrammarChecker.g:187:4: t= INTEGER
                    {
                    t=(MyTree)match(input,INTEGER,FOLLOW_INTEGER_in_returnType987); 

                    			type = t.getText(); 
                    		

                    }
                    break;
                case 2 :
                    // src\\grammar\\GrammarChecker.g:190:4: t= BOOLEAN
                    {
                    t=(MyTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_returnType996); 

                    			type = t.getText(); 
                    		

                    }
                    break;
                case 3 :
                    // src\\grammar\\GrammarChecker.g:193:4: t= CHAR
                    {
                    t=(MyTree)match(input,CHAR,FOLLOW_CHAR_in_returnType1005); 

                    			type = t.getText();
                    		

                    }
                    break;

            }
        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return type;
    }
    // $ANTLR end "returnType"


    // $ANTLR start "readStatement"
    // src\\grammar\\GrammarChecker.g:198:1: readStatement returns [String type=\"\"] : ^(r= READ (id= IDENTIFIER )+ ) ;
    public final String readStatement() throws RecognitionException {
        String type = "";

        MyTree r=null;
        MyTree id=null;

        try {
            // src\\grammar\\GrammarChecker.g:199:2: ( ^(r= READ (id= IDENTIFIER )+ ) )
            // src\\grammar\\GrammarChecker.g:199:4: ^(r= READ (id= IDENTIFIER )+ )
            {
            r=(MyTree)match(input,READ,FOLLOW_READ_in_readStatement1027); 

            Checker.checkRead(); 

            match(input, Token.DOWN, null); 
            // src\\grammar\\GrammarChecker.g:199:37: (id= IDENTIFIER )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==IDENTIFIER) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // src\\grammar\\GrammarChecker.g:199:38: id= IDENTIFIER
            	    {
            	    id=(MyTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_readStatement1034); 
            	     Checker.checkReadVarList(id); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

             type=Checker.getT(); 

            match(input, Token.UP, null); 

            }

        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return type;
    }
    // $ANTLR end "readStatement"


    // $ANTLR start "printStatement"
    // src\\grammar\\GrammarChecker.g:202:1: printStatement returns [String type=\"\"] : ^(p= PRINT (texpr= expression )+ ) ;
    public final String printStatement() throws RecognitionException {
        String type = "";

        MyTree p=null;
        String texpr = null;


        try {
            // src\\grammar\\GrammarChecker.g:203:2: ( ^(p= PRINT (texpr= expression )+ ) )
            // src\\grammar\\GrammarChecker.g:203:4: ^(p= PRINT (texpr= expression )+ )
            {
            p=(MyTree)match(input,PRINT,FOLLOW_PRINT_in_printStatement1059); 

            Checker.checkPrint(); 

            match(input, Token.DOWN, null); 
            // src\\grammar\\GrammarChecker.g:203:39: (texpr= expression )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==ASSIGN||LA15_0==WHILE||(LA15_0>=CLOSEDCOMPOUND && LA15_0<=DECLARATION)||(LA15_0>=CONDITIONAL && LA15_0<=FUNCTIONDECLARATION)||LA15_0==PROCEDUREDECLARATION) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // src\\grammar\\GrammarChecker.g:203:40: texpr= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_printStatement1066);
            	    texpr=expression();

            	    state._fsp--;

            	     Checker.checkPrintExpr(texpr, p); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

             type=Checker.getT(); 

            match(input, Token.UP, null); 

            }

        }

        	catch(RecognitionException e){
        		throw e;
        	}
        finally {
        }
        return type;
    }
    // $ANTLR end "printStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAM_in_program54 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_programBody_in_program56 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPOUND_in_programBody72 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_compoundExpression_in_programBody74 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPOUND_in_closedCompoundExpression92 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_compoundExpression_in_closedCompoundExpression98 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRESSIONS_in_compoundExpression117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_compoundExpression124 = new BitSet(new long[]{0x0B3E200000000808L});
    public static final BitSet FOLLOW_ASSIGN_in_expression146 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_assignStatement_in_expression150 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARITHMETIC_in_expression159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticExpression_in_expression163 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATION_in_expression171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_expression175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_READ_in_expression183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_readStatement_in_expression187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINT_in_expression195 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_printStatement_in_expression199 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLOSEDCOMPOUND_in_expression207 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_closedCompoundExpression_in_expression211 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITIONAL_in_expression219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditionalStatement_in_expression223 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_expression231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_whileStatement_in_expression235 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTIONDECLARATION_in_expression243 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_functionDeclaration_in_expression247 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROCEDUREDECLARATION_in_expression255 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_procedureDeclaration_in_expression259 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_in_procedureDeclaration282 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_callableDeclaration_in_procedureDeclaration284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnType_in_functionDeclaration303 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_callableDeclaration_in_functionDeclaration306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALLABLE_in_callableDeclaration325 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_callableDeclaration329 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_argsDeclaration_in_callableDeclaration332 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_closedCompoundExpression_in_callableDeclaration339 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARGUMENTS_in_argsDeclaration356 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_argDec_in_argsDeclaration358 = new BitSet(new long[]{0x0000040028000008L});
    public static final BitSet FOLLOW_returnType_in_argDec377 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AMPERSAND_in_argDec380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_argDec385 = new BitSet(new long[]{0x0000080000000008L,0x0000000000000001L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_compoundExpression_in_whileStatement415 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_compoundExpression_in_whileStatement419 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_conditionalStatement444 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_compoundExpression_in_conditionalStatement453 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_compoundExpression_in_conditionalStatement462 = new BitSet(new long[]{0x0000100000000008L});
    public static final BitSet FOLLOW_elseStatement_in_conditionalStatement471 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_in_elseStatement492 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_compoundExpression_in_elseStatement501 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRESSION_in_arithmeticExpression521 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_arithmeticExpression525 = new BitSet(new long[]{0x40C200C000FFF000L,0x0000000000000007L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_arithmeticExpression540 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression544 = new BitSet(new long[]{0x40C200C000FFF000L,0x0000000000000007L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression548 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_arithmeticExpression558 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression562 = new BitSet(new long[]{0x40C200C000FFF000L,0x0000000000000007L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression566 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_arithmeticExpression576 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression580 = new BitSet(new long[]{0x40C200C000FFF000L,0x0000000000000007L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression584 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOTEQUAL_in_arithmeticExpression594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression598 = new BitSet(new long[]{0x40C200C000FFF000L,0x0000000000000007L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression602 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_in_arithmeticExpression615 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression619 = new BitSet(new long[]{0x40C200C000FFF000L,0x0000000000000007L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression623 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SMALLER_in_arithmeticExpression633 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression637 = new BitSet(new long[]{0x40C200C000FFF000L,0x0000000000000007L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression641 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATEREQ_in_arithmeticExpression651 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression655 = new BitSet(new long[]{0x40C200C000FFF000L,0x0000000000000007L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression659 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SMALLEREQ_in_arithmeticExpression669 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression673 = new BitSet(new long[]{0x40C200C000FFF000L,0x0000000000000007L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression677 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_arithmeticExpression687 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression691 = new BitSet(new long[]{0x40C200C000FFF000L,0x0000000000000007L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression695 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_arithmeticExpression705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression709 = new BitSet(new long[]{0x40C200C000FFF000L,0x0000000000000007L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression713 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MULTI_in_arithmeticExpression723 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression727 = new BitSet(new long[]{0x40C200C000FFF000L,0x0000000000000007L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression731 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIVIDE_in_arithmeticExpression742 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression746 = new BitSet(new long[]{0x40C200C000FFF000L,0x0000000000000007L});
    public static final BitSet FOLLOW_arithmeticExpression_in_arithmeticExpression750 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_operand_in_arithmeticExpression759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_operand777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARTRUE_in_operand783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_in_operand789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARFALSE_in_operand795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEXPRESSION_in_operand802 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmeticExpression_in_operand806 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_operand815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUTINECALL_in_operand822 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_callableUse_in_operand826 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLOSEDCOMPOUND_in_operand834 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_closedCompoundExpression_in_operand838 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_callableUse860 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_argUse_in_callableUse870 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTUSE_in_argUse894 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARG_in_argUse899 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_compoundExpression_in_argUse903 = new BitSet(new long[]{0x8000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_assignStatement925 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ASSIGN_in_assignStatement929 = new BitSet(new long[]{0x0B3E200000000808L});
    public static final BitSet FOLLOW_expression_in_assignStatement933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnType_in_declaration955 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AMPERSAND_in_declaration958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_declaration963 = new BitSet(new long[]{0x0000080000000008L,0x0000000000000001L});
    public static final BitSet FOLLOW_INTEGER_in_returnType987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_returnType996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_returnType1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_readStatement1027 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_readStatement1034 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000001L});
    public static final BitSet FOLLOW_PRINT_in_printStatement1059 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_printStatement1066 = new BitSet(new long[]{0x0B3E200000000808L});

}