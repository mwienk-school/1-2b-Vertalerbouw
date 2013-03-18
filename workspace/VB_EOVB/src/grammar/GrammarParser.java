// $ANTLR 3.4 /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g 2012-07-09 11:48:53

	package grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class GrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AMPERSAND", "AND", "ARG", "ARGUMENTUSE", "ARITHMETIC", "ASSIGN", "BOOLEAN", "CALLABLE", "CHAR", "CHARACTER", "CHARAND", "CHARFALSE", "CHARNOT", "CHAROR", "CHARTRUE", "CLOSEDCOMPOUND", "COLON", "COMMA", "COMMENT", "COMPOUND", "CONDITIONAL", "DECLARATION", "DECLARGUMENTS", "DIGIT", "DIVIDE", "DO", "ELSE", "EQUAL", "EXPRESSION", "EXPRESSIONS", "FI", "FUNCTIONDECLARATION", "GREATER", "GREATEREQ", "IDENTIFIER", "IF", "INTEGER", "LCURLY", "LETTER", "LOWER", "LPAREN", "MINUS", "MULTI", "NOT", "NOTEQUAL", "NUMBER", "OD", "OR", "PLUS", "PRINT", "PROCEDUREDECLARATION", "PROGRAM", "QUOTE", "RCURLY", "READ", "RETURN", "ROUTINECALL", "RPAREN", "SEMICOLON", "SINGLEQUOTE", "SMALLER", "SMALLEREQ", "STRING", "SUBEXPRESSION", "TEXT", "THEN", "UPPER", "VOID", "WHILE", "WS"
    };

    public static final int EOF=-1;
    public static final int AMPERSAND=4;
    public static final int AND=5;
    public static final int ARG=6;
    public static final int ARGUMENTUSE=7;
    public static final int ARITHMETIC=8;
    public static final int ASSIGN=9;
    public static final int BOOLEAN=10;
    public static final int CALLABLE=11;
    public static final int CHAR=12;
    public static final int CHARACTER=13;
    public static final int CHARAND=14;
    public static final int CHARFALSE=15;
    public static final int CHARNOT=16;
    public static final int CHAROR=17;
    public static final int CHARTRUE=18;
    public static final int CLOSEDCOMPOUND=19;
    public static final int COLON=20;
    public static final int COMMA=21;
    public static final int COMMENT=22;
    public static final int COMPOUND=23;
    public static final int CONDITIONAL=24;
    public static final int DECLARATION=25;
    public static final int DECLARGUMENTS=26;
    public static final int DIGIT=27;
    public static final int DIVIDE=28;
    public static final int DO=29;
    public static final int ELSE=30;
    public static final int EQUAL=31;
    public static final int EXPRESSION=32;
    public static final int EXPRESSIONS=33;
    public static final int FI=34;
    public static final int FUNCTIONDECLARATION=35;
    public static final int GREATER=36;
    public static final int GREATEREQ=37;
    public static final int IDENTIFIER=38;
    public static final int IF=39;
    public static final int INTEGER=40;
    public static final int LCURLY=41;
    public static final int LETTER=42;
    public static final int LOWER=43;
    public static final int LPAREN=44;
    public static final int MINUS=45;
    public static final int MULTI=46;
    public static final int NOT=47;
    public static final int NOTEQUAL=48;
    public static final int NUMBER=49;
    public static final int OD=50;
    public static final int OR=51;
    public static final int PLUS=52;
    public static final int PRINT=53;
    public static final int PROCEDUREDECLARATION=54;
    public static final int PROGRAM=55;
    public static final int QUOTE=56;
    public static final int RCURLY=57;
    public static final int READ=58;
    public static final int RETURN=59;
    public static final int ROUTINECALL=60;
    public static final int RPAREN=61;
    public static final int SEMICOLON=62;
    public static final int SINGLEQUOTE=63;
    public static final int SMALLER=64;
    public static final int SMALLEREQ=65;
    public static final int STRING=66;
    public static final int SUBEXPRESSION=67;
    public static final int TEXT=68;
    public static final int THEN=69;
    public static final int UPPER=70;
    public static final int VOID=71;
    public static final int WHILE=72;
    public static final int WS=73;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public GrammarParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public GrammarParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return GrammarParser.tokenNames; }
    public String getGrammarFileName() { return "/home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:91:1: program : programBody EOF -> ^( PROGRAM programBody ) ;
    public final GrammarParser.program_return program() throws RecognitionException {
        GrammarParser.program_return retval = new GrammarParser.program_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF2=null;
        GrammarParser.programBody_return programBody1 =null;


        Object EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_programBody=new RewriteRuleSubtreeStream(adaptor,"rule programBody");
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:92:2: ( programBody EOF -> ^( PROGRAM programBody ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:92:4: programBody EOF
            {
            pushFollow(FOLLOW_programBody_in_program1110);
            programBody1=programBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_programBody.add(programBody1.getTree());

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program1112); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: programBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 93:4: -> ^( PROGRAM programBody )
            {
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:93:7: ^( PROGRAM programBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROGRAM, "PROGRAM")
                , root_1);

                adaptor.addChild(root_1, stream_programBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class programBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "programBody"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:96:1: programBody : ( compoundExpression ) -> ^( COMPOUND compoundExpression ) ;
    public final GrammarParser.programBody_return programBody() throws RecognitionException {
        GrammarParser.programBody_return retval = new GrammarParser.programBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GrammarParser.compoundExpression_return compoundExpression3 =null;


        RewriteRuleSubtreeStream stream_compoundExpression=new RewriteRuleSubtreeStream(adaptor,"rule compoundExpression");
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:97:2: ( ( compoundExpression ) -> ^( COMPOUND compoundExpression ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:97:4: ( compoundExpression )
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:97:4: ( compoundExpression )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:97:5: compoundExpression
            {
            pushFollow(FOLLOW_compoundExpression_in_programBody1136);
            compoundExpression3=compoundExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compoundExpression.add(compoundExpression3.getTree());

            }


            // AST REWRITE
            // elements: compoundExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 98:4: -> ^( COMPOUND compoundExpression )
            {
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:98:7: ^( COMPOUND compoundExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPOUND, "COMPOUND")
                , root_1);

                adaptor.addChild(root_1, stream_compoundExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "programBody"


    public static class closedCompoundExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "closedCompoundExpression"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:101:1: closedCompoundExpression : ( LCURLY compoundExpression RCURLY ) -> ^( COMPOUND compoundExpression ) ;
    public final GrammarParser.closedCompoundExpression_return closedCompoundExpression() throws RecognitionException {
        GrammarParser.closedCompoundExpression_return retval = new GrammarParser.closedCompoundExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LCURLY4=null;
        Token RCURLY6=null;
        GrammarParser.compoundExpression_return compoundExpression5 =null;


        Object LCURLY4_tree=null;
        Object RCURLY6_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_compoundExpression=new RewriteRuleSubtreeStream(adaptor,"rule compoundExpression");
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:102:2: ( ( LCURLY compoundExpression RCURLY ) -> ^( COMPOUND compoundExpression ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:102:4: ( LCURLY compoundExpression RCURLY )
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:102:4: ( LCURLY compoundExpression RCURLY )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:102:5: LCURLY compoundExpression RCURLY
            {
            LCURLY4=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_closedCompoundExpression1161); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY4);


            pushFollow(FOLLOW_compoundExpression_in_closedCompoundExpression1163);
            compoundExpression5=compoundExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compoundExpression.add(compoundExpression5.getTree());

            RCURLY6=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_closedCompoundExpression1165); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY6);


            }


            // AST REWRITE
            // elements: compoundExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 103:4: -> ^( COMPOUND compoundExpression )
            {
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:103:7: ^( COMPOUND compoundExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPOUND, "COMPOUND")
                , root_1);

                adaptor.addChild(root_1, stream_compoundExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "closedCompoundExpression"


    public static class compoundExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compoundExpression"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:106:1: compoundExpression : ( expression ( SEMICOLON expression )* ) -> ^( EXPRESSIONS ( expression )+ ) ;
    public final GrammarParser.compoundExpression_return compoundExpression() throws RecognitionException {
        GrammarParser.compoundExpression_return retval = new GrammarParser.compoundExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMICOLON8=null;
        GrammarParser.expression_return expression7 =null;

        GrammarParser.expression_return expression9 =null;


        Object SEMICOLON8_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:107:2: ( ( expression ( SEMICOLON expression )* ) -> ^( EXPRESSIONS ( expression )+ ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:107:4: ( expression ( SEMICOLON expression )* )
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:107:4: ( expression ( SEMICOLON expression )* )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:107:5: expression ( SEMICOLON expression )*
            {
            pushFollow(FOLLOW_expression_in_compoundExpression1190);
            expression7=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression7.getTree());

            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:107:16: ( SEMICOLON expression )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SEMICOLON) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:107:17: SEMICOLON expression
            	    {
            	    SEMICOLON8=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_compoundExpression1193); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON8);


            	    pushFollow(FOLLOW_expression_in_compoundExpression1195);
            	    expression9=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression9.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 108:4: -> ^( EXPRESSIONS ( expression )+ )
            {
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:108:7: ^( EXPRESSIONS ( expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EXPRESSIONS, "EXPRESSIONS")
                , root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compoundExpression"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:111:1: expression : ( ( IDENTIFIER ASSIGN )=> assignStatement -> ^( ASSIGN assignStatement ) | ( returnType IDENTIFIER LPAREN )=> functionDeclaration -> ^( FUNCTIONDECLARATION functionDeclaration ) | ( VOID IDENTIFIER LPAREN )=> procedureDeclaration -> ^( PROCEDUREDECLARATION procedureDeclaration ) | arithmeticExpression -> ^( ARITHMETIC arithmeticExpression ) | declaration -> ^( DECLARATION declaration ) | readStatement -> ^( READ readStatement ) | printStatement -> ^( PRINT printStatement ) | conditionalStatement -> ^( CONDITIONAL conditionalStatement ) | whileStatement -> ^( WHILE whileStatement ) );
    public final GrammarParser.expression_return expression() throws RecognitionException {
        GrammarParser.expression_return retval = new GrammarParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GrammarParser.assignStatement_return assignStatement10 =null;

        GrammarParser.functionDeclaration_return functionDeclaration11 =null;

        GrammarParser.procedureDeclaration_return procedureDeclaration12 =null;

        GrammarParser.arithmeticExpression_return arithmeticExpression13 =null;

        GrammarParser.declaration_return declaration14 =null;

        GrammarParser.readStatement_return readStatement15 =null;

        GrammarParser.printStatement_return printStatement16 =null;

        GrammarParser.conditionalStatement_return conditionalStatement17 =null;

        GrammarParser.whileStatement_return whileStatement18 =null;


        RewriteRuleSubtreeStream stream_conditionalStatement=new RewriteRuleSubtreeStream(adaptor,"rule conditionalStatement");
        RewriteRuleSubtreeStream stream_arithmeticExpression=new RewriteRuleSubtreeStream(adaptor,"rule arithmeticExpression");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_procedureDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclaration");
        RewriteRuleSubtreeStream stream_whileStatement=new RewriteRuleSubtreeStream(adaptor,"rule whileStatement");
        RewriteRuleSubtreeStream stream_readStatement=new RewriteRuleSubtreeStream(adaptor,"rule readStatement");
        RewriteRuleSubtreeStream stream_assignStatement=new RewriteRuleSubtreeStream(adaptor,"rule assignStatement");
        RewriteRuleSubtreeStream stream_functionDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule functionDeclaration");
        RewriteRuleSubtreeStream stream_printStatement=new RewriteRuleSubtreeStream(adaptor,"rule printStatement");
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:112:2: ( ( IDENTIFIER ASSIGN )=> assignStatement -> ^( ASSIGN assignStatement ) | ( returnType IDENTIFIER LPAREN )=> functionDeclaration -> ^( FUNCTIONDECLARATION functionDeclaration ) | ( VOID IDENTIFIER LPAREN )=> procedureDeclaration -> ^( PROCEDUREDECLARATION procedureDeclaration ) | arithmeticExpression -> ^( ARITHMETIC arithmeticExpression ) | declaration -> ^( DECLARATION declaration ) | readStatement -> ^( READ readStatement ) | printStatement -> ^( PRINT printStatement ) | conditionalStatement -> ^( CONDITIONAL conditionalStatement ) | whileStatement -> ^( WHILE whileStatement ) )
            int alt2=9;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENTIFIER) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==BOOLEAN||LA2_0==CHAR||LA2_0==INTEGER) ) {
                int LA2_2 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt2=2;
                }
                else if ( (true) ) {
                    alt2=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==VOID) && (synpred3_Grammar())) {
                alt2=3;
            }
            else if ( (LA2_0==CHARACTER||LA2_0==CHARFALSE||LA2_0==CHARTRUE||LA2_0==LCURLY||LA2_0==LPAREN||LA2_0==NOT||LA2_0==NUMBER) ) {
                alt2=4;
            }
            else if ( (LA2_0==READ) ) {
                alt2=6;
            }
            else if ( (LA2_0==PRINT) ) {
                alt2=7;
            }
            else if ( (LA2_0==IF) ) {
                alt2=8;
            }
            else if ( (LA2_0==WHILE) ) {
                alt2=9;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:112:4: ( IDENTIFIER ASSIGN )=> assignStatement
                    {
                    pushFollow(FOLLOW_assignStatement_in_expression1230);
                    assignStatement10=assignStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignStatement.add(assignStatement10.getTree());

                    // AST REWRITE
                    // elements: assignStatement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 113:4: -> ^( ASSIGN assignStatement )
                    {
                        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:113:7: ^( ASSIGN assignStatement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ASSIGN, "ASSIGN")
                        , root_1);

                        adaptor.addChild(root_1, stream_assignStatement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:114:4: ( returnType IDENTIFIER LPAREN )=> functionDeclaration
                    {
                    pushFollow(FOLLOW_functionDeclaration_in_expression1256);
                    functionDeclaration11=functionDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionDeclaration.add(functionDeclaration11.getTree());

                    // AST REWRITE
                    // elements: functionDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:4: -> ^( FUNCTIONDECLARATION functionDeclaration )
                    {
                        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:115:7: ^( FUNCTIONDECLARATION functionDeclaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNCTIONDECLARATION, "FUNCTIONDECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_functionDeclaration.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:116:4: ( VOID IDENTIFIER LPAREN )=> procedureDeclaration
                    {
                    pushFollow(FOLLOW_procedureDeclaration_in_expression1282);
                    procedureDeclaration12=procedureDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureDeclaration.add(procedureDeclaration12.getTree());

                    // AST REWRITE
                    // elements: procedureDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 117:4: -> ^( PROCEDUREDECLARATION procedureDeclaration )
                    {
                        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:117:7: ^( PROCEDUREDECLARATION procedureDeclaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PROCEDUREDECLARATION, "PROCEDUREDECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_procedureDeclaration.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:118:5: arithmeticExpression
                    {
                    pushFollow(FOLLOW_arithmeticExpression_in_expression1300);
                    arithmeticExpression13=arithmeticExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arithmeticExpression.add(arithmeticExpression13.getTree());

                    // AST REWRITE
                    // elements: arithmeticExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 119:4: -> ^( ARITHMETIC arithmeticExpression )
                    {
                        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:119:7: ^( ARITHMETIC arithmeticExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ARITHMETIC, "ARITHMETIC")
                        , root_1);

                        adaptor.addChild(root_1, stream_arithmeticExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:120:4: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_expression1316);
                    declaration14=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration.add(declaration14.getTree());

                    // AST REWRITE
                    // elements: declaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 121:4: -> ^( DECLARATION declaration )
                    {
                        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:121:7: ^( DECLARATION declaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:122:4: readStatement
                    {
                    pushFollow(FOLLOW_readStatement_in_expression1332);
                    readStatement15=readStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_readStatement.add(readStatement15.getTree());

                    // AST REWRITE
                    // elements: readStatement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 123:4: -> ^( READ readStatement )
                    {
                        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:123:7: ^( READ readStatement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(READ, "READ")
                        , root_1);

                        adaptor.addChild(root_1, stream_readStatement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:124:4: printStatement
                    {
                    pushFollow(FOLLOW_printStatement_in_expression1348);
                    printStatement16=printStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_printStatement.add(printStatement16.getTree());

                    // AST REWRITE
                    // elements: printStatement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 125:4: -> ^( PRINT printStatement )
                    {
                        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:125:7: ^( PRINT printStatement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRINT, "PRINT")
                        , root_1);

                        adaptor.addChild(root_1, stream_printStatement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:126:4: conditionalStatement
                    {
                    pushFollow(FOLLOW_conditionalStatement_in_expression1364);
                    conditionalStatement17=conditionalStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalStatement.add(conditionalStatement17.getTree());

                    // AST REWRITE
                    // elements: conditionalStatement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 127:4: -> ^( CONDITIONAL conditionalStatement )
                    {
                        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:127:7: ^( CONDITIONAL conditionalStatement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONDITIONAL, "CONDITIONAL")
                        , root_1);

                        adaptor.addChild(root_1, stream_conditionalStatement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:128:4: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_expression1380);
                    whileStatement18=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_whileStatement.add(whileStatement18.getTree());

                    // AST REWRITE
                    // elements: whileStatement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 129:4: -> ^( WHILE whileStatement )
                    {
                        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:129:7: ^( WHILE whileStatement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(WHILE, "WHILE")
                        , root_1);

                        adaptor.addChild(root_1, stream_whileStatement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class procedureDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "procedureDeclaration"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:131:1: procedureDeclaration : VOID callableDeclaration ;
    public final GrammarParser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        GrammarParser.procedureDeclaration_return retval = new GrammarParser.procedureDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VOID19=null;
        GrammarParser.callableDeclaration_return callableDeclaration20 =null;


        Object VOID19_tree=null;

        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:132:2: ( VOID callableDeclaration )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:132:4: VOID callableDeclaration
            {
            root_0 = (Object)adaptor.nil();


            VOID19=(Token)match(input,VOID,FOLLOW_VOID_in_procedureDeclaration1400); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VOID19_tree = 
            (Object)adaptor.create(VOID19)
            ;
            adaptor.addChild(root_0, VOID19_tree);
            }

            pushFollow(FOLLOW_callableDeclaration_in_procedureDeclaration1402);
            callableDeclaration20=callableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, callableDeclaration20.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "procedureDeclaration"


    public static class functionDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionDeclaration"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:135:1: functionDeclaration : returnType callableDeclaration ;
    public final GrammarParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        GrammarParser.functionDeclaration_return retval = new GrammarParser.functionDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GrammarParser.returnType_return returnType21 =null;

        GrammarParser.callableDeclaration_return callableDeclaration22 =null;



        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:136:2: ( returnType callableDeclaration )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:136:4: returnType callableDeclaration
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_returnType_in_functionDeclaration1414);
            returnType21=returnType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, returnType21.getTree());

            pushFollow(FOLLOW_callableDeclaration_in_functionDeclaration1416);
            callableDeclaration22=callableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, callableDeclaration22.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionDeclaration"


    public static class callableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "callableDeclaration"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:139:1: callableDeclaration : ( IDENTIFIER LPAREN argDeclaration RPAREN closedCompoundExpression ) -> ^( CALLABLE IDENTIFIER argDeclaration closedCompoundExpression ) ;
    public final GrammarParser.callableDeclaration_return callableDeclaration() throws RecognitionException {
        GrammarParser.callableDeclaration_return retval = new GrammarParser.callableDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER23=null;
        Token LPAREN24=null;
        Token RPAREN26=null;
        GrammarParser.argDeclaration_return argDeclaration25 =null;

        GrammarParser.closedCompoundExpression_return closedCompoundExpression27 =null;


        Object IDENTIFIER23_tree=null;
        Object LPAREN24_tree=null;
        Object RPAREN26_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_closedCompoundExpression=new RewriteRuleSubtreeStream(adaptor,"rule closedCompoundExpression");
        RewriteRuleSubtreeStream stream_argDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule argDeclaration");
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:140:2: ( ( IDENTIFIER LPAREN argDeclaration RPAREN closedCompoundExpression ) -> ^( CALLABLE IDENTIFIER argDeclaration closedCompoundExpression ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:140:4: ( IDENTIFIER LPAREN argDeclaration RPAREN closedCompoundExpression )
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:140:4: ( IDENTIFIER LPAREN argDeclaration RPAREN closedCompoundExpression )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:140:5: IDENTIFIER LPAREN argDeclaration RPAREN closedCompoundExpression
            {
            IDENTIFIER23=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_callableDeclaration1429); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER23);


            LPAREN24=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_callableDeclaration1431); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN24);


            pushFollow(FOLLOW_argDeclaration_in_callableDeclaration1433);
            argDeclaration25=argDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argDeclaration.add(argDeclaration25.getTree());

            RPAREN26=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_callableDeclaration1435); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN26);


            pushFollow(FOLLOW_closedCompoundExpression_in_callableDeclaration1437);
            closedCompoundExpression27=closedCompoundExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_closedCompoundExpression.add(closedCompoundExpression27.getTree());

            }


            // AST REWRITE
            // elements: IDENTIFIER, closedCompoundExpression, argDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 141:4: -> ^( CALLABLE IDENTIFIER argDeclaration closedCompoundExpression )
            {
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:141:7: ^( CALLABLE IDENTIFIER argDeclaration closedCompoundExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CALLABLE, "CALLABLE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, stream_argDeclaration.nextTree());

                adaptor.addChild(root_1, stream_closedCompoundExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "callableDeclaration"


    public static class argDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argDeclaration"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:144:1: argDeclaration : ( ( declaration )? ( COMMA declaration )* ) -> ^( DECLARGUMENTS ( declaration )* ) ;
    public final GrammarParser.argDeclaration_return argDeclaration() throws RecognitionException {
        GrammarParser.argDeclaration_return retval = new GrammarParser.argDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA29=null;
        GrammarParser.declaration_return declaration28 =null;

        GrammarParser.declaration_return declaration30 =null;


        Object COMMA29_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:145:2: ( ( ( declaration )? ( COMMA declaration )* ) -> ^( DECLARGUMENTS ( declaration )* ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:145:4: ( ( declaration )? ( COMMA declaration )* )
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:145:4: ( ( declaration )? ( COMMA declaration )* )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:145:5: ( declaration )? ( COMMA declaration )*
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:145:5: ( declaration )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==BOOLEAN||LA3_0==CHAR||LA3_0==INTEGER) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:145:5: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_argDeclaration1467);
                    declaration28=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration.add(declaration28.getTree());

                    }
                    break;

            }


            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:145:18: ( COMMA declaration )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:145:19: COMMA declaration
            	    {
            	    COMMA29=(Token)match(input,COMMA,FOLLOW_COMMA_in_argDeclaration1471); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA29);


            	    pushFollow(FOLLOW_declaration_in_argDeclaration1473);
            	    declaration30=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration30.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            // AST REWRITE
            // elements: declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 146:4: -> ^( DECLARGUMENTS ( declaration )* )
            {
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:146:7: ^( DECLARGUMENTS ( declaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARGUMENTS, "DECLARGUMENTS")
                , root_1);

                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:146:23: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argDeclaration"


    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileStatement"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:149:1: whileStatement : WHILE compoundExpression DO compoundExpression OD -> ^( WHILE compoundExpression compoundExpression ) ;
    public final GrammarParser.whileStatement_return whileStatement() throws RecognitionException {
        GrammarParser.whileStatement_return retval = new GrammarParser.whileStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE31=null;
        Token DO33=null;
        Token OD35=null;
        GrammarParser.compoundExpression_return compoundExpression32 =null;

        GrammarParser.compoundExpression_return compoundExpression34 =null;


        Object WHILE31_tree=null;
        Object DO33_tree=null;
        Object OD35_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_OD=new RewriteRuleTokenStream(adaptor,"token OD");
        RewriteRuleSubtreeStream stream_compoundExpression=new RewriteRuleSubtreeStream(adaptor,"rule compoundExpression");
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:150:2: ( WHILE compoundExpression DO compoundExpression OD -> ^( WHILE compoundExpression compoundExpression ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:150:4: WHILE compoundExpression DO compoundExpression OD
            {
            WHILE31=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement1499); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE31);


            pushFollow(FOLLOW_compoundExpression_in_whileStatement1501);
            compoundExpression32=compoundExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compoundExpression.add(compoundExpression32.getTree());

            DO33=(Token)match(input,DO,FOLLOW_DO_in_whileStatement1504); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO33);


            pushFollow(FOLLOW_compoundExpression_in_whileStatement1506);
            compoundExpression34=compoundExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compoundExpression.add(compoundExpression34.getTree());

            OD35=(Token)match(input,OD,FOLLOW_OD_in_whileStatement1508); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OD.add(OD35);


            // AST REWRITE
            // elements: compoundExpression, WHILE, compoundExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 151:4: -> ^( WHILE compoundExpression compoundExpression )
            {
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:151:7: ^( WHILE compoundExpression compoundExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_WHILE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_compoundExpression.nextTree());

                adaptor.addChild(root_1, stream_compoundExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whileStatement"


    public static class conditionalStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalStatement"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:154:1: conditionalStatement : ( IF compoundExpression THEN compoundExpression ( elseStatement )? FI ) -> ^( IF compoundExpression compoundExpression ( elseStatement )? ) ;
    public final GrammarParser.conditionalStatement_return conditionalStatement() throws RecognitionException {
        GrammarParser.conditionalStatement_return retval = new GrammarParser.conditionalStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF36=null;
        Token THEN38=null;
        Token FI41=null;
        GrammarParser.compoundExpression_return compoundExpression37 =null;

        GrammarParser.compoundExpression_return compoundExpression39 =null;

        GrammarParser.elseStatement_return elseStatement40 =null;


        Object IF36_tree=null;
        Object THEN38_tree=null;
        Object FI41_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_FI=new RewriteRuleTokenStream(adaptor,"token FI");
        RewriteRuleSubtreeStream stream_compoundExpression=new RewriteRuleSubtreeStream(adaptor,"rule compoundExpression");
        RewriteRuleSubtreeStream stream_elseStatement=new RewriteRuleSubtreeStream(adaptor,"rule elseStatement");
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:155:2: ( ( IF compoundExpression THEN compoundExpression ( elseStatement )? FI ) -> ^( IF compoundExpression compoundExpression ( elseStatement )? ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:155:4: ( IF compoundExpression THEN compoundExpression ( elseStatement )? FI )
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:155:4: ( IF compoundExpression THEN compoundExpression ( elseStatement )? FI )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:155:5: IF compoundExpression THEN compoundExpression ( elseStatement )? FI
            {
            IF36=(Token)match(input,IF,FOLLOW_IF_in_conditionalStatement1534); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF36);


            pushFollow(FOLLOW_compoundExpression_in_conditionalStatement1536);
            compoundExpression37=compoundExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compoundExpression.add(compoundExpression37.getTree());

            THEN38=(Token)match(input,THEN,FOLLOW_THEN_in_conditionalStatement1538); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THEN.add(THEN38);


            pushFollow(FOLLOW_compoundExpression_in_conditionalStatement1540);
            compoundExpression39=compoundExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compoundExpression.add(compoundExpression39.getTree());

            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:155:51: ( elseStatement )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ELSE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:155:51: elseStatement
                    {
                    pushFollow(FOLLOW_elseStatement_in_conditionalStatement1542);
                    elseStatement40=elseStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseStatement.add(elseStatement40.getTree());

                    }
                    break;

            }


            FI41=(Token)match(input,FI,FOLLOW_FI_in_conditionalStatement1545); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FI.add(FI41);


            }


            // AST REWRITE
            // elements: elseStatement, compoundExpression, compoundExpression, IF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 156:4: -> ^( IF compoundExpression compoundExpression ( elseStatement )? )
            {
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:156:7: ^( IF compoundExpression compoundExpression ( elseStatement )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IF.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_compoundExpression.nextTree());

                adaptor.addChild(root_1, stream_compoundExpression.nextTree());

                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:156:50: ( elseStatement )?
                if ( stream_elseStatement.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseStatement.nextTree());

                }
                stream_elseStatement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionalStatement"


    public static class elseStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseStatement"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:159:1: elseStatement : ( ELSE compoundExpression ) -> ^( ELSE compoundExpression ) ;
    public final GrammarParser.elseStatement_return elseStatement() throws RecognitionException {
        GrammarParser.elseStatement_return retval = new GrammarParser.elseStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELSE42=null;
        GrammarParser.compoundExpression_return compoundExpression43 =null;


        Object ELSE42_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_compoundExpression=new RewriteRuleSubtreeStream(adaptor,"rule compoundExpression");
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:160:2: ( ( ELSE compoundExpression ) -> ^( ELSE compoundExpression ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:160:4: ( ELSE compoundExpression )
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:160:4: ( ELSE compoundExpression )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:160:5: ELSE compoundExpression
            {
            ELSE42=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseStatement1575); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(ELSE42);


            pushFollow(FOLLOW_compoundExpression_in_elseStatement1577);
            compoundExpression43=compoundExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compoundExpression.add(compoundExpression43.getTree());

            }


            // AST REWRITE
            // elements: compoundExpression, ELSE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 161:4: -> ^( ELSE compoundExpression )
            {
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:161:7: ^( ELSE compoundExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ELSE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_compoundExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elseStatement"


    public static class arithmeticExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithmeticExpression"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:165:1: arithmeticExpression : ( andExpression ( OR ^ andExpression )* ) ;
    public final GrammarParser.arithmeticExpression_return arithmeticExpression() throws RecognitionException {
        GrammarParser.arithmeticExpression_return retval = new GrammarParser.arithmeticExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OR45=null;
        GrammarParser.andExpression_return andExpression44 =null;

        GrammarParser.andExpression_return andExpression46 =null;


        Object OR45_tree=null;

        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:166:2: ( ( andExpression ( OR ^ andExpression )* ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:166:4: ( andExpression ( OR ^ andExpression )* )
            {
            root_0 = (Object)adaptor.nil();


            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:166:4: ( andExpression ( OR ^ andExpression )* )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:166:5: andExpression ( OR ^ andExpression )*
            {
            pushFollow(FOLLOW_andExpression_in_arithmeticExpression1604);
            andExpression44=andExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression44.getTree());

            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:166:19: ( OR ^ andExpression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==OR) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:166:20: OR ^ andExpression
            	    {
            	    OR45=(Token)match(input,OR,FOLLOW_OR_in_arithmeticExpression1607); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR45_tree = 
            	    (Object)adaptor.create(OR45)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(OR45_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_andExpression_in_arithmeticExpression1610);
            	    andExpression46=andExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression46.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arithmeticExpression"


    public static class andExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "andExpression"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:169:1: andExpression : booleanExpression ( AND ^ booleanExpression )* ;
    public final GrammarParser.andExpression_return andExpression() throws RecognitionException {
        GrammarParser.andExpression_return retval = new GrammarParser.andExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND48=null;
        GrammarParser.booleanExpression_return booleanExpression47 =null;

        GrammarParser.booleanExpression_return booleanExpression49 =null;


        Object AND48_tree=null;

        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:170:2: ( booleanExpression ( AND ^ booleanExpression )* )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:170:4: booleanExpression ( AND ^ booleanExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_booleanExpression_in_andExpression1628);
            booleanExpression47=booleanExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpression47.getTree());

            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:170:22: ( AND ^ booleanExpression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==AND) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:170:23: AND ^ booleanExpression
            	    {
            	    AND48=(Token)match(input,AND,FOLLOW_AND_in_andExpression1631); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND48_tree = 
            	    (Object)adaptor.create(AND48)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AND48_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_booleanExpression_in_andExpression1634);
            	    booleanExpression49=booleanExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpression49.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "andExpression"


    public static class booleanExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanExpression"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:173:1: booleanExpression : notExpression ( ( EQUAL ^| NOTEQUAL ^| SMALLER ^| GREATER ^| SMALLEREQ ^| GREATEREQ ^) notExpression )* ;
    public final GrammarParser.booleanExpression_return booleanExpression() throws RecognitionException {
        GrammarParser.booleanExpression_return retval = new GrammarParser.booleanExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUAL51=null;
        Token NOTEQUAL52=null;
        Token SMALLER53=null;
        Token GREATER54=null;
        Token SMALLEREQ55=null;
        Token GREATEREQ56=null;
        GrammarParser.notExpression_return notExpression50 =null;

        GrammarParser.notExpression_return notExpression57 =null;


        Object EQUAL51_tree=null;
        Object NOTEQUAL52_tree=null;
        Object SMALLER53_tree=null;
        Object GREATER54_tree=null;
        Object SMALLEREQ55_tree=null;
        Object GREATEREQ56_tree=null;

        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:174:2: ( notExpression ( ( EQUAL ^| NOTEQUAL ^| SMALLER ^| GREATER ^| SMALLEREQ ^| GREATEREQ ^) notExpression )* )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:174:5: notExpression ( ( EQUAL ^| NOTEQUAL ^| SMALLER ^| GREATER ^| SMALLEREQ ^| GREATEREQ ^) notExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_notExpression_in_booleanExpression1649);
            notExpression50=notExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, notExpression50.getTree());

            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:174:19: ( ( EQUAL ^| NOTEQUAL ^| SMALLER ^| GREATER ^| SMALLEREQ ^| GREATEREQ ^) notExpression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==EQUAL||(LA9_0 >= GREATER && LA9_0 <= GREATEREQ)||LA9_0==NOTEQUAL||(LA9_0 >= SMALLER && LA9_0 <= SMALLEREQ)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:174:20: ( EQUAL ^| NOTEQUAL ^| SMALLER ^| GREATER ^| SMALLEREQ ^| GREATEREQ ^) notExpression
            	    {
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:174:20: ( EQUAL ^| NOTEQUAL ^| SMALLER ^| GREATER ^| SMALLEREQ ^| GREATEREQ ^)
            	    int alt8=6;
            	    switch ( input.LA(1) ) {
            	    case EQUAL:
            	        {
            	        alt8=1;
            	        }
            	        break;
            	    case NOTEQUAL:
            	        {
            	        alt8=2;
            	        }
            	        break;
            	    case SMALLER:
            	        {
            	        alt8=3;
            	        }
            	        break;
            	    case GREATER:
            	        {
            	        alt8=4;
            	        }
            	        break;
            	    case SMALLEREQ:
            	        {
            	        alt8=5;
            	        }
            	        break;
            	    case GREATEREQ:
            	        {
            	        alt8=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt8) {
            	        case 1 :
            	            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:174:21: EQUAL ^
            	            {
            	            EQUAL51=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_booleanExpression1653); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQUAL51_tree = 
            	            (Object)adaptor.create(EQUAL51)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(EQUAL51_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:174:30: NOTEQUAL ^
            	            {
            	            NOTEQUAL52=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_booleanExpression1658); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            NOTEQUAL52_tree = 
            	            (Object)adaptor.create(NOTEQUAL52)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(NOTEQUAL52_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:174:42: SMALLER ^
            	            {
            	            SMALLER53=(Token)match(input,SMALLER,FOLLOW_SMALLER_in_booleanExpression1663); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SMALLER53_tree = 
            	            (Object)adaptor.create(SMALLER53)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SMALLER53_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:174:53: GREATER ^
            	            {
            	            GREATER54=(Token)match(input,GREATER,FOLLOW_GREATER_in_booleanExpression1668); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GREATER54_tree = 
            	            (Object)adaptor.create(GREATER54)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GREATER54_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:174:64: SMALLEREQ ^
            	            {
            	            SMALLEREQ55=(Token)match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_booleanExpression1673); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SMALLEREQ55_tree = 
            	            (Object)adaptor.create(SMALLEREQ55)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SMALLEREQ55_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:174:77: GREATEREQ ^
            	            {
            	            GREATEREQ56=(Token)match(input,GREATEREQ,FOLLOW_GREATEREQ_in_booleanExpression1678); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GREATEREQ56_tree = 
            	            (Object)adaptor.create(GREATEREQ56)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GREATEREQ56_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_notExpression_in_booleanExpression1682);
            	    notExpression57=notExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, notExpression57.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "booleanExpression"


    public static class notExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notExpression"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:177:1: notExpression : ( ( NOT )? additionExpression ) -> ^( EXPRESSION ( NOT )? additionExpression ) ;
    public final GrammarParser.notExpression_return notExpression() throws RecognitionException {
        GrammarParser.notExpression_return retval = new GrammarParser.notExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT58=null;
        GrammarParser.additionExpression_return additionExpression59 =null;


        Object NOT58_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_additionExpression=new RewriteRuleSubtreeStream(adaptor,"rule additionExpression");
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:178:2: ( ( ( NOT )? additionExpression ) -> ^( EXPRESSION ( NOT )? additionExpression ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:178:4: ( ( NOT )? additionExpression )
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:178:4: ( ( NOT )? additionExpression )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:178:5: ( NOT )? additionExpression
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:178:5: ( NOT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==NOT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:178:5: NOT
                    {
                    NOT58=(Token)match(input,NOT,FOLLOW_NOT_in_notExpression1696); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT58);


                    }
                    break;

            }


            pushFollow(FOLLOW_additionExpression_in_notExpression1699);
            additionExpression59=additionExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_additionExpression.add(additionExpression59.getTree());

            }


            // AST REWRITE
            // elements: NOT, additionExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 179:4: -> ^( EXPRESSION ( NOT )? additionExpression )
            {
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:179:7: ^( EXPRESSION ( NOT )? additionExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EXPRESSION, "EXPRESSION")
                , root_1);

                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:179:20: ( NOT )?
                if ( stream_NOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_NOT.nextNode()
                    );

                }
                stream_NOT.reset();

                adaptor.addChild(root_1, stream_additionExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notExpression"


    public static class additionExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additionExpression"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:182:1: additionExpression : multiplyExpression ( ( PLUS ^| MINUS ^) multiplyExpression )* ;
    public final GrammarParser.additionExpression_return additionExpression() throws RecognitionException {
        GrammarParser.additionExpression_return retval = new GrammarParser.additionExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS61=null;
        Token MINUS62=null;
        GrammarParser.multiplyExpression_return multiplyExpression60 =null;

        GrammarParser.multiplyExpression_return multiplyExpression63 =null;


        Object PLUS61_tree=null;
        Object MINUS62_tree=null;

        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:183:6: ( multiplyExpression ( ( PLUS ^| MINUS ^) multiplyExpression )* )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:183:11: multiplyExpression ( ( PLUS ^| MINUS ^) multiplyExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multiplyExpression_in_additionExpression1733);
            multiplyExpression60=multiplyExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplyExpression60.getTree());

            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:183:30: ( ( PLUS ^| MINUS ^) multiplyExpression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==MINUS||LA12_0==PLUS) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:183:31: ( PLUS ^| MINUS ^) multiplyExpression
            	    {
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:183:31: ( PLUS ^| MINUS ^)
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==PLUS) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==MINUS) ) {
            	        alt11=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:183:32: PLUS ^
            	            {
            	            PLUS61=(Token)match(input,PLUS,FOLLOW_PLUS_in_additionExpression1737); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS61_tree = 
            	            (Object)adaptor.create(PLUS61)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS61_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:183:40: MINUS ^
            	            {
            	            MINUS62=(Token)match(input,MINUS,FOLLOW_MINUS_in_additionExpression1742); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS62_tree = 
            	            (Object)adaptor.create(MINUS62)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(MINUS62_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multiplyExpression_in_additionExpression1746);
            	    multiplyExpression63=multiplyExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplyExpression63.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "additionExpression"


    public static class multiplyExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplyExpression"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:186:1: multiplyExpression : operand ( ( MULTI ^| DIVIDE ^) operand )* ;
    public final GrammarParser.multiplyExpression_return multiplyExpression() throws RecognitionException {
        GrammarParser.multiplyExpression_return retval = new GrammarParser.multiplyExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MULTI65=null;
        Token DIVIDE66=null;
        GrammarParser.operand_return operand64 =null;

        GrammarParser.operand_return operand67 =null;


        Object MULTI65_tree=null;
        Object DIVIDE66_tree=null;

        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:187:2: ( operand ( ( MULTI ^| DIVIDE ^) operand )* )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:187:4: operand ( ( MULTI ^| DIVIDE ^) operand )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_operand_in_multiplyExpression1767);
            operand64=operand();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operand64.getTree());

            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:187:12: ( ( MULTI ^| DIVIDE ^) operand )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==DIVIDE||LA14_0==MULTI) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:187:13: ( MULTI ^| DIVIDE ^) operand
            	    {
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:187:13: ( MULTI ^| DIVIDE ^)
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==MULTI) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==DIVIDE) ) {
            	        alt13=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:187:14: MULTI ^
            	            {
            	            MULTI65=(Token)match(input,MULTI,FOLLOW_MULTI_in_multiplyExpression1771); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MULTI65_tree = 
            	            (Object)adaptor.create(MULTI65)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(MULTI65_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:187:23: DIVIDE ^
            	            {
            	            DIVIDE66=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplyExpression1776); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DIVIDE66_tree = 
            	            (Object)adaptor.create(DIVIDE66)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(DIVIDE66_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_operand_in_multiplyExpression1780);
            	    operand67=operand();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, operand67.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplyExpression"


    public static class operand_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operand"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:190:1: operand : ( ( IDENTIFIER LPAREN )=> callableUse -> ^( ROUTINECALL callableUse ) | CHARTRUE | CHARFALSE | IDENTIFIER | CHARACTER | NUMBER | closedCompoundExpression -> ^( CLOSEDCOMPOUND closedCompoundExpression ) | ( LPAREN arithmeticExpression RPAREN ) -> ^( SUBEXPRESSION arithmeticExpression ) );
    public final GrammarParser.operand_return operand() throws RecognitionException {
        GrammarParser.operand_return retval = new GrammarParser.operand_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHARTRUE69=null;
        Token CHARFALSE70=null;
        Token IDENTIFIER71=null;
        Token CHARACTER72=null;
        Token NUMBER73=null;
        Token LPAREN75=null;
        Token RPAREN77=null;
        GrammarParser.callableUse_return callableUse68 =null;

        GrammarParser.closedCompoundExpression_return closedCompoundExpression74 =null;

        GrammarParser.arithmeticExpression_return arithmeticExpression76 =null;


        Object CHARTRUE69_tree=null;
        Object CHARFALSE70_tree=null;
        Object IDENTIFIER71_tree=null;
        Object CHARACTER72_tree=null;
        Object NUMBER73_tree=null;
        Object LPAREN75_tree=null;
        Object RPAREN77_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_arithmeticExpression=new RewriteRuleSubtreeStream(adaptor,"rule arithmeticExpression");
        RewriteRuleSubtreeStream stream_closedCompoundExpression=new RewriteRuleSubtreeStream(adaptor,"rule closedCompoundExpression");
        RewriteRuleSubtreeStream stream_callableUse=new RewriteRuleSubtreeStream(adaptor,"rule callableUse");
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:191:2: ( ( IDENTIFIER LPAREN )=> callableUse -> ^( ROUTINECALL callableUse ) | CHARTRUE | CHARFALSE | IDENTIFIER | CHARACTER | NUMBER | closedCompoundExpression -> ^( CLOSEDCOMPOUND closedCompoundExpression ) | ( LPAREN arithmeticExpression RPAREN ) -> ^( SUBEXPRESSION arithmeticExpression ) )
            int alt15=8;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA15_1 = input.LA(2);

                if ( (synpred4_Grammar()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
                }
                break;
            case CHARTRUE:
                {
                alt15=2;
                }
                break;
            case CHARFALSE:
                {
                alt15=3;
                }
                break;
            case CHARACTER:
                {
                alt15=5;
                }
                break;
            case NUMBER:
                {
                alt15=6;
                }
                break;
            case LCURLY:
                {
                alt15=7;
                }
                break;
            case LPAREN:
                {
                alt15=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:191:4: ( IDENTIFIER LPAREN )=> callableUse
                    {
                    pushFollow(FOLLOW_callableUse_in_operand1805);
                    callableUse68=callableUse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callableUse.add(callableUse68.getTree());

                    // AST REWRITE
                    // elements: callableUse
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 192:4: -> ^( ROUTINECALL callableUse )
                    {
                        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:192:7: ^( ROUTINECALL callableUse )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ROUTINECALL, "ROUTINECALL")
                        , root_1);

                        adaptor.addChild(root_1, stream_callableUse.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:193:4: CHARTRUE
                    {
                    root_0 = (Object)adaptor.nil();


                    CHARTRUE69=(Token)match(input,CHARTRUE,FOLLOW_CHARTRUE_in_operand1821); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHARTRUE69_tree = 
                    (Object)adaptor.create(CHARTRUE69)
                    ;
                    adaptor.addChild(root_0, CHARTRUE69_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:194:4: CHARFALSE
                    {
                    root_0 = (Object)adaptor.nil();


                    CHARFALSE70=(Token)match(input,CHARFALSE,FOLLOW_CHARFALSE_in_operand1826); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHARFALSE70_tree = 
                    (Object)adaptor.create(CHARFALSE70)
                    ;
                    adaptor.addChild(root_0, CHARFALSE70_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:195:4: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER71=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1831); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER71_tree = 
                    (Object)adaptor.create(IDENTIFIER71)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER71_tree);
                    }

                    }
                    break;
                case 5 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:196:4: CHARACTER
                    {
                    root_0 = (Object)adaptor.nil();


                    CHARACTER72=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_operand1836); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHARACTER72_tree = 
                    (Object)adaptor.create(CHARACTER72)
                    ;
                    adaptor.addChild(root_0, CHARACTER72_tree);
                    }

                    }
                    break;
                case 6 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:197:7: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();


                    NUMBER73=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1844); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER73_tree = 
                    (Object)adaptor.create(NUMBER73)
                    ;
                    adaptor.addChild(root_0, NUMBER73_tree);
                    }

                    }
                    break;
                case 7 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:198:4: closedCompoundExpression
                    {
                    pushFollow(FOLLOW_closedCompoundExpression_in_operand1849);
                    closedCompoundExpression74=closedCompoundExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_closedCompoundExpression.add(closedCompoundExpression74.getTree());

                    // AST REWRITE
                    // elements: closedCompoundExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:4: -> ^( CLOSEDCOMPOUND closedCompoundExpression )
                    {
                        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:199:7: ^( CLOSEDCOMPOUND closedCompoundExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CLOSEDCOMPOUND, "CLOSEDCOMPOUND")
                        , root_1);

                        adaptor.addChild(root_1, stream_closedCompoundExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:200:7: ( LPAREN arithmeticExpression RPAREN )
                    {
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:200:7: ( LPAREN arithmeticExpression RPAREN )
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:200:8: LPAREN arithmeticExpression RPAREN
                    {
                    LPAREN75=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1869); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN75);


                    pushFollow(FOLLOW_arithmeticExpression_in_operand1871);
                    arithmeticExpression76=arithmeticExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arithmeticExpression.add(arithmeticExpression76.getTree());

                    RPAREN77=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1873); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN77);


                    }


                    // AST REWRITE
                    // elements: arithmeticExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 201:4: -> ^( SUBEXPRESSION arithmeticExpression )
                    {
                        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:201:7: ^( SUBEXPRESSION arithmeticExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SUBEXPRESSION, "SUBEXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_arithmeticExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operand"


    public static class callableUse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "callableUse"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:204:1: callableUse : ( IDENTIFIER LPAREN argUse RPAREN ) -> ^( IDENTIFIER argUse ) ;
    public final GrammarParser.callableUse_return callableUse() throws RecognitionException {
        GrammarParser.callableUse_return retval = new GrammarParser.callableUse_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER78=null;
        Token LPAREN79=null;
        Token RPAREN81=null;
        GrammarParser.argUse_return argUse80 =null;


        Object IDENTIFIER78_tree=null;
        Object LPAREN79_tree=null;
        Object RPAREN81_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_argUse=new RewriteRuleSubtreeStream(adaptor,"rule argUse");
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:205:2: ( ( IDENTIFIER LPAREN argUse RPAREN ) -> ^( IDENTIFIER argUse ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:205:4: ( IDENTIFIER LPAREN argUse RPAREN )
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:205:4: ( IDENTIFIER LPAREN argUse RPAREN )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:205:5: IDENTIFIER LPAREN argUse RPAREN
            {
            IDENTIFIER78=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_callableUse1898); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER78);


            LPAREN79=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_callableUse1900); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN79);


            pushFollow(FOLLOW_argUse_in_callableUse1902);
            argUse80=argUse();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argUse.add(argUse80.getTree());

            RPAREN81=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_callableUse1904); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN81);


            }


            // AST REWRITE
            // elements: argUse, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 206:4: -> ^( IDENTIFIER argUse )
            {
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:206:7: ^( IDENTIFIER argUse )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_argUse.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "callableUse"


    public static class argUse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argUse"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:209:1: argUse : ( compoundExpression )? ( COMMA compoundExpression )* -> ^( ARGUMENTUSE ( ARG compoundExpression )* ) ;
    public final GrammarParser.argUse_return argUse() throws RecognitionException {
        GrammarParser.argUse_return retval = new GrammarParser.argUse_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA83=null;
        GrammarParser.compoundExpression_return compoundExpression82 =null;

        GrammarParser.compoundExpression_return compoundExpression84 =null;


        Object COMMA83_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_compoundExpression=new RewriteRuleSubtreeStream(adaptor,"rule compoundExpression");
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:210:2: ( ( compoundExpression )? ( COMMA compoundExpression )* -> ^( ARGUMENTUSE ( ARG compoundExpression )* ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:210:4: ( compoundExpression )? ( COMMA compoundExpression )*
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:210:4: ( compoundExpression )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==BOOLEAN||(LA16_0 >= CHAR && LA16_0 <= CHARACTER)||LA16_0==CHARFALSE||LA16_0==CHARTRUE||(LA16_0 >= IDENTIFIER && LA16_0 <= LCURLY)||LA16_0==LPAREN||LA16_0==NOT||LA16_0==NUMBER||LA16_0==PRINT||LA16_0==READ||(LA16_0 >= VOID && LA16_0 <= WHILE)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:210:4: compoundExpression
                    {
                    pushFollow(FOLLOW_compoundExpression_in_argUse1929);
                    compoundExpression82=compoundExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_compoundExpression.add(compoundExpression82.getTree());

                    }
                    break;

            }


            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:210:24: ( COMMA compoundExpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:210:25: COMMA compoundExpression
            	    {
            	    COMMA83=(Token)match(input,COMMA,FOLLOW_COMMA_in_argUse1933); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA83);


            	    pushFollow(FOLLOW_compoundExpression_in_argUse1935);
            	    compoundExpression84=compoundExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_compoundExpression.add(compoundExpression84.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // AST REWRITE
            // elements: compoundExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 211:4: -> ^( ARGUMENTUSE ( ARG compoundExpression )* )
            {
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:211:7: ^( ARGUMENTUSE ( ARG compoundExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARGUMENTUSE, "ARGUMENTUSE")
                , root_1);

                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:211:21: ( ARG compoundExpression )*
                while ( stream_compoundExpression.hasNext() ) {
                    adaptor.addChild(root_1, 
                    (Object)adaptor.create(ARG, "ARG")
                    );

                    adaptor.addChild(root_1, stream_compoundExpression.nextTree());

                }
                stream_compoundExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argUse"


    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:214:1: declaration : ( returnType ( AMPERSAND )? IDENTIFIER ( ( COMMA ( AMPERSAND )? IDENTIFIER )=> ( COMMA ( AMPERSAND )? IDENTIFIER ) )* ) -> ^( returnType ( ( AMPERSAND )? IDENTIFIER )+ ) ;
    public final GrammarParser.declaration_return declaration() throws RecognitionException {
        GrammarParser.declaration_return retval = new GrammarParser.declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AMPERSAND86=null;
        Token IDENTIFIER87=null;
        Token COMMA88=null;
        Token AMPERSAND89=null;
        Token IDENTIFIER90=null;
        GrammarParser.returnType_return returnType85 =null;


        Object AMPERSAND86_tree=null;
        Object IDENTIFIER87_tree=null;
        Object COMMA88_tree=null;
        Object AMPERSAND89_tree=null;
        Object IDENTIFIER90_tree=null;
        RewriteRuleTokenStream stream_AMPERSAND=new RewriteRuleTokenStream(adaptor,"token AMPERSAND");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_returnType=new RewriteRuleSubtreeStream(adaptor,"rule returnType");
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:215:2: ( ( returnType ( AMPERSAND )? IDENTIFIER ( ( COMMA ( AMPERSAND )? IDENTIFIER )=> ( COMMA ( AMPERSAND )? IDENTIFIER ) )* ) -> ^( returnType ( ( AMPERSAND )? IDENTIFIER )+ ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:215:4: ( returnType ( AMPERSAND )? IDENTIFIER ( ( COMMA ( AMPERSAND )? IDENTIFIER )=> ( COMMA ( AMPERSAND )? IDENTIFIER ) )* )
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:215:4: ( returnType ( AMPERSAND )? IDENTIFIER ( ( COMMA ( AMPERSAND )? IDENTIFIER )=> ( COMMA ( AMPERSAND )? IDENTIFIER ) )* )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:215:5: returnType ( AMPERSAND )? IDENTIFIER ( ( COMMA ( AMPERSAND )? IDENTIFIER )=> ( COMMA ( AMPERSAND )? IDENTIFIER ) )*
            {
            pushFollow(FOLLOW_returnType_in_declaration1966);
            returnType85=returnType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_returnType.add(returnType85.getTree());

            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:215:16: ( AMPERSAND )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==AMPERSAND) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:215:16: AMPERSAND
                    {
                    AMPERSAND86=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_declaration1968); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMPERSAND.add(AMPERSAND86);


                    }
                    break;

            }


            IDENTIFIER87=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1971); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER87);


            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:215:38: ( ( COMMA ( AMPERSAND )? IDENTIFIER )=> ( COMMA ( AMPERSAND )? IDENTIFIER ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    int LA20_9 = input.LA(2);

                    if ( (synpred5_Grammar()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:215:39: ( COMMA ( AMPERSAND )? IDENTIFIER )=> ( COMMA ( AMPERSAND )? IDENTIFIER )
            	    {
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:215:72: ( COMMA ( AMPERSAND )? IDENTIFIER )
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:215:73: COMMA ( AMPERSAND )? IDENTIFIER
            	    {
            	    COMMA88=(Token)match(input,COMMA,FOLLOW_COMMA_in_declaration1986); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA88);


            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:215:79: ( AMPERSAND )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==AMPERSAND) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:215:79: AMPERSAND
            	            {
            	            AMPERSAND89=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_declaration1988); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_AMPERSAND.add(AMPERSAND89);


            	            }
            	            break;

            	    }


            	    IDENTIFIER90=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1991); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER90);


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            // AST REWRITE
            // elements: AMPERSAND, IDENTIFIER, returnType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 216:4: -> ^( returnType ( ( AMPERSAND )? IDENTIFIER )+ )
            {
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:216:7: ^( returnType ( ( AMPERSAND )? IDENTIFIER )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_returnType.nextNode(), root_1);

                if ( !(stream_IDENTIFIER.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENTIFIER.hasNext() ) {
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:216:21: ( AMPERSAND )?
                    if ( stream_AMPERSAND.hasNext() ) {
                        adaptor.addChild(root_1, 
                        stream_AMPERSAND.nextNode()
                        );

                    }
                    stream_AMPERSAND.reset();

                    adaptor.addChild(root_1, 
                    stream_IDENTIFIER.nextNode()
                    );

                }
                stream_IDENTIFIER.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class returnType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "returnType"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:219:1: returnType : ( INTEGER | BOOLEAN | CHAR );
    public final GrammarParser.returnType_return returnType() throws RecognitionException {
        GrammarParser.returnType_return retval = new GrammarParser.returnType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set91=null;

        Object set91_tree=null;

        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:220:2: ( INTEGER | BOOLEAN | CHAR )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:
            {
            root_0 = (Object)adaptor.nil();


            set91=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==CHAR||input.LA(1)==INTEGER ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set91)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "returnType"


    public static class assignStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignStatement"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:225:1: assignStatement : IDENTIFIER ASSIGN expression ;
    public final GrammarParser.assignStatement_return assignStatement() throws RecognitionException {
        GrammarParser.assignStatement_return retval = new GrammarParser.assignStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER92=null;
        Token ASSIGN93=null;
        GrammarParser.expression_return expression94 =null;


        Object IDENTIFIER92_tree=null;
        Object ASSIGN93_tree=null;

        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:226:2: ( IDENTIFIER ASSIGN expression )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:226:4: IDENTIFIER ASSIGN expression
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER92=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignStatement2046); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER92_tree = 
            (Object)adaptor.create(IDENTIFIER92)
            ;
            adaptor.addChild(root_0, IDENTIFIER92_tree);
            }

            ASSIGN93=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignStatement2048); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN93_tree = 
            (Object)adaptor.create(ASSIGN93)
            ;
            adaptor.addChild(root_0, ASSIGN93_tree);
            }

            pushFollow(FOLLOW_expression_in_assignStatement2050);
            expression94=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression94.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignStatement"


    public static class readStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "readStatement"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:229:1: readStatement : ( READ LPAREN varList RPAREN ) -> ^( READ varList ) ;
    public final GrammarParser.readStatement_return readStatement() throws RecognitionException {
        GrammarParser.readStatement_return retval = new GrammarParser.readStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token READ95=null;
        Token LPAREN96=null;
        Token RPAREN98=null;
        GrammarParser.varList_return varList97 =null;


        Object READ95_tree=null;
        Object LPAREN96_tree=null;
        Object RPAREN98_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_varList=new RewriteRuleSubtreeStream(adaptor,"rule varList");
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:230:2: ( ( READ LPAREN varList RPAREN ) -> ^( READ varList ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:230:4: ( READ LPAREN varList RPAREN )
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:230:4: ( READ LPAREN varList RPAREN )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:230:5: READ LPAREN varList RPAREN
            {
            READ95=(Token)match(input,READ,FOLLOW_READ_in_readStatement2062); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_READ.add(READ95);


            LPAREN96=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_readStatement2064); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN96);


            pushFollow(FOLLOW_varList_in_readStatement2066);
            varList97=varList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varList.add(varList97.getTree());

            RPAREN98=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_readStatement2068); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN98);


            }


            // AST REWRITE
            // elements: READ, varList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 231:4: -> ^( READ varList )
            {
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:231:7: ^( READ varList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_READ.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_varList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "readStatement"


    public static class printStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "printStatement"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:234:1: printStatement : ( PRINT LPAREN exprList RPAREN ) -> ^( PRINT exprList ) ;
    public final GrammarParser.printStatement_return printStatement() throws RecognitionException {
        GrammarParser.printStatement_return retval = new GrammarParser.printStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRINT99=null;
        Token LPAREN100=null;
        Token RPAREN102=null;
        GrammarParser.exprList_return exprList101 =null;


        Object PRINT99_tree=null;
        Object LPAREN100_tree=null;
        Object RPAREN102_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:235:2: ( ( PRINT LPAREN exprList RPAREN ) -> ^( PRINT exprList ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:235:4: ( PRINT LPAREN exprList RPAREN )
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:235:4: ( PRINT LPAREN exprList RPAREN )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:235:5: PRINT LPAREN exprList RPAREN
            {
            PRINT99=(Token)match(input,PRINT,FOLLOW_PRINT_in_printStatement2092); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PRINT.add(PRINT99);


            LPAREN100=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_printStatement2094); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN100);


            pushFollow(FOLLOW_exprList_in_printStatement2096);
            exprList101=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprList.add(exprList101.getTree());

            RPAREN102=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_printStatement2098); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN102);


            }


            // AST REWRITE
            // elements: exprList, PRINT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 236:4: -> ^( PRINT exprList )
            {
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:236:7: ^( PRINT exprList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_PRINT.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_exprList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "printStatement"


    public static class exprList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprList"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:239:1: exprList : ( expression ( COMMA expression )* ) -> ( expression )+ ;
    public final GrammarParser.exprList_return exprList() throws RecognitionException {
        GrammarParser.exprList_return retval = new GrammarParser.exprList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA104=null;
        GrammarParser.expression_return expression103 =null;

        GrammarParser.expression_return expression105 =null;


        Object COMMA104_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:240:2: ( ( expression ( COMMA expression )* ) -> ( expression )+ )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:240:4: ( expression ( COMMA expression )* )
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:240:4: ( expression ( COMMA expression )* )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:240:5: expression ( COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_exprList2123);
            expression103=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression103.getTree());

            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:240:16: ( COMMA expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:240:17: COMMA expression
            	    {
            	    COMMA104=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2126); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA104);


            	    pushFollow(FOLLOW_expression_in_exprList2128);
            	    expression105=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression105.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 241:4: -> ( expression )+
            {
                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_0, stream_expression.nextTree());

                }
                stream_expression.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exprList"


    public static class varList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varList"
    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:244:1: varList : ( IDENTIFIER ( COMMA IDENTIFIER )* ) -> ( IDENTIFIER )+ ;
    public final GrammarParser.varList_return varList() throws RecognitionException {
        GrammarParser.varList_return retval = new GrammarParser.varList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER106=null;
        Token COMMA107=null;
        Token IDENTIFIER108=null;

        Object IDENTIFIER106_tree=null;
        Object COMMA107_tree=null;
        Object IDENTIFIER108_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:245:2: ( ( IDENTIFIER ( COMMA IDENTIFIER )* ) -> ( IDENTIFIER )+ )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:245:4: ( IDENTIFIER ( COMMA IDENTIFIER )* )
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:245:4: ( IDENTIFIER ( COMMA IDENTIFIER )* )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:245:5: IDENTIFIER ( COMMA IDENTIFIER )*
            {
            IDENTIFIER106=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varList2152); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER106);


            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:245:16: ( COMMA IDENTIFIER )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:245:17: COMMA IDENTIFIER
            	    {
            	    COMMA107=(Token)match(input,COMMA,FOLLOW_COMMA_in_varList2155); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA107);


            	    IDENTIFIER108=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varList2157); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER108);


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            // AST REWRITE
            // elements: IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 246:4: -> ( IDENTIFIER )+
            {
                if ( !(stream_IDENTIFIER.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_0, 
                    stream_IDENTIFIER.nextNode()
                    );

                }
                stream_IDENTIFIER.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varList"

    // $ANTLR start synpred1_Grammar
    public final void synpred1_Grammar_fragment() throws RecognitionException {
        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:112:4: ( IDENTIFIER ASSIGN )
        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:112:5: IDENTIFIER ASSIGN
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred1_Grammar1223); if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred1_Grammar1225); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Grammar

    // $ANTLR start synpred2_Grammar
    public final void synpred2_Grammar_fragment() throws RecognitionException {
        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:114:4: ( returnType IDENTIFIER LPAREN )
        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:114:5: returnType IDENTIFIER LPAREN
        {
        pushFollow(FOLLOW_returnType_in_synpred2_Grammar1247);
        returnType();

        state._fsp--;
        if (state.failed) return ;

        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred2_Grammar1249); if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred2_Grammar1251); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Grammar

    // $ANTLR start synpred3_Grammar
    public final void synpred3_Grammar_fragment() throws RecognitionException {
        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:116:4: ( VOID IDENTIFIER LPAREN )
        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:116:5: VOID IDENTIFIER LPAREN
        {
        match(input,VOID,FOLLOW_VOID_in_synpred3_Grammar1273); if (state.failed) return ;

        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred3_Grammar1275); if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred3_Grammar1277); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Grammar

    // $ANTLR start synpred4_Grammar
    public final void synpred4_Grammar_fragment() throws RecognitionException {
        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:191:4: ( IDENTIFIER LPAREN )
        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:191:5: IDENTIFIER LPAREN
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred4_Grammar1798); if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred4_Grammar1800); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Grammar

    // $ANTLR start synpred5_Grammar
    public final void synpred5_Grammar_fragment() throws RecognitionException {
        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:215:39: ( COMMA ( AMPERSAND )? IDENTIFIER )
        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:215:40: COMMA ( AMPERSAND )? IDENTIFIER
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred5_Grammar1975); if (state.failed) return ;

        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:215:46: ( AMPERSAND )?
        int alt23=2;
        int LA23_0 = input.LA(1);

        if ( (LA23_0==AMPERSAND) ) {
            alt23=1;
        }
        switch (alt23) {
            case 1 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:215:46: AMPERSAND
                {
                match(input,AMPERSAND,FOLLOW_AMPERSAND_in_synpred5_Grammar1977); if (state.failed) return ;

                }
                break;

        }


        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred5_Grammar1980); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Grammar

    // Delegated rules

    public final boolean synpred2_Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_programBody_in_program1110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundExpression_in_programBody1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_closedCompoundExpression1161 = new BitSet(new long[]{0x042293C00004B400L,0x0000000000000180L});
    public static final BitSet FOLLOW_compoundExpression_in_closedCompoundExpression1163 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_closedCompoundExpression1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_compoundExpression1190 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_compoundExpression1193 = new BitSet(new long[]{0x042293C00004B400L,0x0000000000000180L});
    public static final BitSet FOLLOW_expression_in_compoundExpression1195 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_assignStatement_in_expression1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_expression1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_expression1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithmeticExpression_in_expression1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_expression1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_readStatement_in_expression1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printStatement_in_expression1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalStatement_in_expression1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_expression1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_procedureDeclaration1400 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_callableDeclaration_in_procedureDeclaration1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnType_in_functionDeclaration1414 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_callableDeclaration_in_functionDeclaration1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_callableDeclaration1429 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPAREN_in_callableDeclaration1431 = new BitSet(new long[]{0x2000010000201400L});
    public static final BitSet FOLLOW_argDeclaration_in_callableDeclaration1433 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_callableDeclaration1435 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_closedCompoundExpression_in_callableDeclaration1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_argDeclaration1467 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_COMMA_in_argDeclaration1471 = new BitSet(new long[]{0x0000010000001400L});
    public static final BitSet FOLLOW_declaration_in_argDeclaration1473 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1499 = new BitSet(new long[]{0x042293C00004B400L,0x0000000000000180L});
    public static final BitSet FOLLOW_compoundExpression_in_whileStatement1501 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DO_in_whileStatement1504 = new BitSet(new long[]{0x042293C00004B400L,0x0000000000000180L});
    public static final BitSet FOLLOW_compoundExpression_in_whileStatement1506 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_OD_in_whileStatement1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_conditionalStatement1534 = new BitSet(new long[]{0x042293C00004B400L,0x0000000000000180L});
    public static final BitSet FOLLOW_compoundExpression_in_conditionalStatement1536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_THEN_in_conditionalStatement1538 = new BitSet(new long[]{0x042293C00004B400L,0x0000000000000180L});
    public static final BitSet FOLLOW_compoundExpression_in_conditionalStatement1540 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_elseStatement_in_conditionalStatement1542 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FI_in_conditionalStatement1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseStatement1575 = new BitSet(new long[]{0x042293C00004B400L,0x0000000000000180L});
    public static final BitSet FOLLOW_compoundExpression_in_elseStatement1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_arithmeticExpression1604 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_OR_in_arithmeticExpression1607 = new BitSet(new long[]{0x000292400004A000L});
    public static final BitSet FOLLOW_andExpression_in_arithmeticExpression1610 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_booleanExpression_in_andExpression1628 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_andExpression1631 = new BitSet(new long[]{0x000292400004A000L});
    public static final BitSet FOLLOW_booleanExpression_in_andExpression1634 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_notExpression_in_booleanExpression1649 = new BitSet(new long[]{0x0001003080000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_EQUAL_in_booleanExpression1653 = new BitSet(new long[]{0x000292400004A000L});
    public static final BitSet FOLLOW_NOTEQUAL_in_booleanExpression1658 = new BitSet(new long[]{0x000292400004A000L});
    public static final BitSet FOLLOW_SMALLER_in_booleanExpression1663 = new BitSet(new long[]{0x000292400004A000L});
    public static final BitSet FOLLOW_GREATER_in_booleanExpression1668 = new BitSet(new long[]{0x000292400004A000L});
    public static final BitSet FOLLOW_SMALLEREQ_in_booleanExpression1673 = new BitSet(new long[]{0x000292400004A000L});
    public static final BitSet FOLLOW_GREATEREQ_in_booleanExpression1678 = new BitSet(new long[]{0x000292400004A000L});
    public static final BitSet FOLLOW_notExpression_in_booleanExpression1682 = new BitSet(new long[]{0x0001003080000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_NOT_in_notExpression1696 = new BitSet(new long[]{0x000212400004A000L});
    public static final BitSet FOLLOW_additionExpression_in_notExpression1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplyExpression_in_additionExpression1733 = new BitSet(new long[]{0x0010200000000002L});
    public static final BitSet FOLLOW_PLUS_in_additionExpression1737 = new BitSet(new long[]{0x000212400004A000L});
    public static final BitSet FOLLOW_MINUS_in_additionExpression1742 = new BitSet(new long[]{0x000212400004A000L});
    public static final BitSet FOLLOW_multiplyExpression_in_additionExpression1746 = new BitSet(new long[]{0x0010200000000002L});
    public static final BitSet FOLLOW_operand_in_multiplyExpression1767 = new BitSet(new long[]{0x0000400010000002L});
    public static final BitSet FOLLOW_MULTI_in_multiplyExpression1771 = new BitSet(new long[]{0x000212400004A000L});
    public static final BitSet FOLLOW_DIVIDE_in_multiplyExpression1776 = new BitSet(new long[]{0x000212400004A000L});
    public static final BitSet FOLLOW_operand_in_multiplyExpression1780 = new BitSet(new long[]{0x0000400010000002L});
    public static final BitSet FOLLOW_callableUse_in_operand1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARTRUE_in_operand1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARFALSE_in_operand1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_operand1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_in_operand1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_operand1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closedCompoundExpression_in_operand1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_operand1869 = new BitSet(new long[]{0x000292400004A000L});
    public static final BitSet FOLLOW_arithmeticExpression_in_operand1871 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_operand1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_callableUse1898 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPAREN_in_callableUse1900 = new BitSet(new long[]{0x242293C00024B400L,0x0000000000000180L});
    public static final BitSet FOLLOW_argUse_in_callableUse1902 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_callableUse1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundExpression_in_argUse1929 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_COMMA_in_argUse1933 = new BitSet(new long[]{0x042293C00004B400L,0x0000000000000180L});
    public static final BitSet FOLLOW_compoundExpression_in_argUse1935 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_returnType_in_declaration1966 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_AMPERSAND_in_declaration1968 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_declaration1971 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_COMMA_in_declaration1986 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_AMPERSAND_in_declaration1988 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_declaration1991 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_assignStatement2046 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ASSIGN_in_assignStatement2048 = new BitSet(new long[]{0x042293C00004B400L,0x0000000000000180L});
    public static final BitSet FOLLOW_expression_in_assignStatement2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_readStatement2062 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPAREN_in_readStatement2064 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_varList_in_readStatement2066 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_readStatement2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_printStatement2092 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPAREN_in_printStatement2094 = new BitSet(new long[]{0x042293C00004B400L,0x0000000000000180L});
    public static final BitSet FOLLOW_exprList_in_printStatement2096 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_printStatement2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_exprList2123 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2126 = new BitSet(new long[]{0x042293C00004B400L,0x0000000000000180L});
    public static final BitSet FOLLOW_expression_in_exprList2128 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varList2152 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_COMMA_in_varList2155 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varList2157 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred1_Grammar1223 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred1_Grammar1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnType_in_synpred2_Grammar1247 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred2_Grammar1249 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred2_Grammar1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_synpred3_Grammar1273 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred3_Grammar1275 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred3_Grammar1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred4_Grammar1798 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred4_Grammar1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred5_Grammar1975 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_AMPERSAND_in_synpred5_Grammar1977 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred5_Grammar1980 = new BitSet(new long[]{0x0000000000000002L});

}