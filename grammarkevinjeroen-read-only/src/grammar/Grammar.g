// Dit bestand bevat de lexer en de parser deze grammatica maakt gebruik van syntactic predicates om de scanner lokaal op ll(x) te zetten met x > 1
// Ook maakt deze grammatica gebruik van rewrite rules om de AST de decoraten
// Commit test
grammar Grammar;

options {
    k=1;                                // LL(1) - do not use LL(*)
    language=Java;                      // target language is Java (= default)
    output=AST;                         // build an AST
}

tokens {
	// not include in ast
    	COLON       	=   	':'     	;
    	SEMICOLON   	=   	';'     	;
	LPAREN      	=   	'('     	;
    	RPAREN      	=   	')'     	;
    	COMMA		=	','		;
    	LCURLY		=	'{'		;
    	RCURLY		=	'}'		;

	// operators
    	ASSIGN   	=   	'='    		;
    	PLUS        	=   	'+'     	;
    	MINUS       	=   	'-'     	;
    	DIVIDE		=	'/'		;
    	MULTI		=	'*'		;
    	SMALLER		=	'<'		;
    	GREATER		=	'>'		;
    	SMALLEREQ	=	'<='		;
    	GREATEREQ	=	'>='		;
   	EQUAL		=	'=='		;
    	NOTEQUAL	=	'!='		;
    	AND		=	'&&'		;
    	OR		=	'||'		;
    	NOT		=	'!'		;
    	QUOTE		= 	'"'		; 
    	SINGLEQUOTE	=	'\''		;

	// keywords: can be ast root nodes
    	INTEGER     	=   	'int'   	;
    	STRING		=   	'string'	;
    	BOOLEAN 	=	'boolean'	;
  	DO		=	'do'		;
  	OD		=	'od'		;
    	IF		=	'if'		;
    	FI		=	'fi'		;
    	THEN		=	'then'		;
    	CHARAND		=	'and'		;
    	CHAROR		=	'or'		;
    	CHARNOT		=	'not'		;
    	CHARTRUE	=	'true'		;
   	CHARFALSE	=	'false'		;
   	VOID		=	'void'		;
   	RETURN		=	'return'	;
   	CHAR		=	'char'		;
   	AMPERSAND	=	'&'		;
   	ELSE		= 	'else'		;
   	WHILE		=	'while'		;
   	
   	// ast root nodes
   	PROGRAM		=	'program'	;
   	EXPRESSIONS	=	'expressions'	; 
    	COMPOUND	=	'compound'	;
    	CLOSEDCOMPOUND	= 	'closedCompound';
    	PRINT		=	'print'		;
    	READ		=	'read'		;
    	ARITHMETIC	=	'arithmetic'	;
    	DECLARATION	=	'declaration'	;
    	EXPRESSION	=	'expression'	;
    	SUBEXPRESSION	= 	'subexpression' ;
    	CONDITIONAL	=	'conditional'	;
    	FUNCTIONDECLARATION =	'functiondeclaration'; 
    	DECLARGUMENTS	=	'declarguments'	;
    	PROCEDUREDECLARATION =  'proceduredeclaration';
    	ARGUMENTUSE	= 	'argumentuse'	;
    	CALLABLE	= 	'callable'	;
    	ROUTINECALL	=	'routinecall'	;
    	ARG		= 	'arg'		;
}

@header {
	package src.grammar;
}

@lexer::header {
	package src.grammar;
}

// Parser rules
program 
	:	programBody EOF
			-> ^(PROGRAM programBody)
	;
	
programBody
	:	(compoundExpression)
			-> ^(COMPOUND compoundExpression)
	;
	
closedCompoundExpression
	:	(LCURLY compoundExpression RCURLY)
			-> ^(COMPOUND compoundExpression)
	;
	
compoundExpression
	:	(expression (SEMICOLON expression)*)
			-> ^(EXPRESSIONS expression+)
	;
	
expression
	:	(IDENTIFIER ASSIGN) => assignStatement
			-> ^(ASSIGN assignStatement)
	|	(returnType IDENTIFIER LPAREN) => functionDeclaration
			-> ^(FUNCTIONDECLARATION functionDeclaration)
	|	(VOID IDENTIFIER LPAREN) => procedureDeclaration
			-> ^(PROCEDUREDECLARATION procedureDeclaration)	
	| 	arithmeticExpression
			-> ^(ARITHMETIC arithmeticExpression)
	|	declaration
			-> ^(DECLARATION declaration)
	|	readStatement
			-> ^(READ readStatement)
	|	printStatement
			-> ^(PRINT printStatement)
	|	conditionalStatement
			-> ^(CONDITIONAL conditionalStatement)
	|	whileStatement
			-> ^(WHILE whileStatement);

procedureDeclaration
	:	VOID callableDeclaration
	;
	
functionDeclaration
	:	returnType callableDeclaration
	;
	
callableDeclaration
	:	(IDENTIFIER LPAREN argDeclaration RPAREN closedCompoundExpression)
			-> ^(CALLABLE IDENTIFIER argDeclaration closedCompoundExpression)
	;
		
argDeclaration
	:	(declaration? (COMMA declaration)*)
			->	^(DECLARGUMENTS declaration*)
	;

whileStatement
	:	WHILE compoundExpression  DO compoundExpression OD
			-> ^(WHILE compoundExpression compoundExpression)
	;
	
conditionalStatement
	:	(IF compoundExpression THEN compoundExpression elseStatement? FI)
			-> ^(IF compoundExpression compoundExpression elseStatement?)
	;
	
elseStatement
	:	(ELSE compoundExpression)
			-> ^(ELSE compoundExpression)
	;
	
	
arithmeticExpression
	:	(andExpression (OR^ andExpression)*)		
	;	
	
andExpression
	:	booleanExpression (AND^ booleanExpression)*
	;
	
booleanExpression
	: 	notExpression ((EQUAL^ | NOTEQUAL^ | SMALLER^ | GREATER^ | SMALLEREQ^ | GREATEREQ^) notExpression)*
	;

notExpression
	:	(NOT? additionExpression)
			-> ^(EXPRESSION NOT? additionExpression)
	;	

additionExpression
    	:   	multiplyExpression ((PLUS^ | MINUS^) multiplyExpression)*
    	;
    
multiplyExpression
	:	operand ((MULTI^ | DIVIDE^) operand )*
	;
		
operand	
	:	(IDENTIFIER LPAREN) => callableUse
			-> ^(ROUTINECALL callableUse)
	|	CHARTRUE
	|	CHARFALSE
	|	IDENTIFIER
	|	CHARACTER
	|   	NUMBER
	|	closedCompoundExpression
			-> ^(CLOSEDCOMPOUND closedCompoundExpression)
	|   	(LPAREN arithmeticExpression RPAREN)
			-> ^(SUBEXPRESSION arithmeticExpression)
	;
	
callableUse
	:	(IDENTIFIER LPAREN argUse RPAREN)
			->	^(IDENTIFIER argUse)
	;
		
argUse
	:	compoundExpression? (COMMA compoundExpression)*
			-> ^(ARGUMENTUSE (ARG compoundExpression)*)
	;	

declaration
	:	(returnType AMPERSAND? IDENTIFIER ((COMMA AMPERSAND? IDENTIFIER) => (COMMA AMPERSAND? IDENTIFIER))*)
			-> ^(returnType (AMPERSAND? IDENTIFIER)+)
	;
	
returnType
	:	INTEGER
	|	BOOLEAN
	|	CHAR
	;
	
assignStatement
	:	IDENTIFIER ASSIGN expression
	;

readStatement
	:	(READ LPAREN varList RPAREN)
			-> ^(READ varList)
	;

printStatement
	:	(PRINT LPAREN exprList RPAREN)
			-> ^(PRINT exprList)
	;
	
exprList
	:	(expression (COMMA expression)*)
			-> expression+
	;
	
varList
	:	(IDENTIFIER (COMMA IDENTIFIER)*)
			-> IDENTIFIER+
	;
	


/*
// Parser rules
program 
	:	(programBody)+ EOF
			-> ^(PROGRAM (programBody)+)
	;

programBody
	:	statement
	|	declaration
	;

multiVarDeclaration
	:	(returnType IDENTIFIER (COMMA IDENTIFIER)* assignment?)
			-> ^(MVARDEC returnType (IDENTIFIER)+ assignment?)
	;
	
assignment	
	:	(ASSIGN expression)
			-> ^(ASSIGN expression)
	;

declaration
	:	(returnType IDENTIFIER LPAREN) => (funcDeclaration) 
			->	^(FUNCDEC funcDeclaration)
	|	(VOID IDENTIFIER LPAREN) => (procDeclaration)
			->	^(PROCDEC procDeclaration)
	|	(returnType IDENTIFIER) => ( multiVarDeclaration SEMICOLON)
			->	^(VARDEC multiVarDeclaration)
	;

statement 	
	:	(IDENTIFIER LPAREN) => (functionCall SEMICOLON)
			->	^(FUNCCALL functionCall)
	|	(IDENTIFIER) => (IDENTIFIER assignment SEMICOLON)
			->	^(VARASSIGNMENT IDENTIFIER assignment)
	|	ifStatement
	|	whileStatement
	|	printStatement
	|	readStatement
	;
	
readStatement
	:	(READ LPAREN IDENTIFIER RPAREN SEMICOLON)
			-> ^(READ IDENTIFIER)
	;
	
printStatement
	:	(PRINT LPAREN expression RPAREN SEMICOLON)
			-> ^(PRINT expression)
	;

whileStatement
	:	(WHILE LPAREN expression RPAREN LCURLY programBody+ RCURLY)
			-> ^(WHILE expression programBody+)
	;
	
ifStatement
	:	(IF LPAREN expression RPAREN LCURLY programBody+ RCURLY elseStatement?)
			-> ^(IF expression programBody+ elseStatement?)
	;

elseStatement
	:	(ELSE LCURLY programBody+ RCURLY)
			-> ^(ELSE programBody+)
	;	
	
	
	
funcDeclaration 
	:	(returnType IDENTIFIER LPAREN declParameterSequence RPAREN LCURLY programBody* RETURN expression SEMICOLON RCURLY)
			-> ^(returnType IDENTIFIER declParameterSequence programBody* RETURN expression)
	;
	
procDeclaration
	:	(VOID IDENTIFIER LPAREN declParameterSequence RPAREN LCURLY programBody+ RCURLY)
			-> ^(IDENTIFIER declParameterSequence programBody+)
	;
	
declParameterSequence
	:	((argDeclaration)? (COMMA argDeclaration)*)
			-> ^(DECPARSEQ (argDeclaration)*)
	;
	
argDeclaration
	:	returnType AMPERSAND? IDENTIFIER
	;

callParameterSequence
	:	(callArguments multiParameter*)
			-> ^(CALLPARSEQ callArguments multiParameter*)
	;

multiParameter
	: 	(COMMA callArguments)	
			-> ^(callArguments)
	;
	
callArguments
	:	(IDENTIFIER LPAREN) => (functionCall)
			-> ^(FUNCCALL functionCall)
	|	CHARTRUE
	|	CHARFALSE
	|	IDENTIFIER
	|	CHARACTER
	|	TEXT
	|   	NUMBER
	|   	(LPAREN expression RPAREN)
			-> ^(EXPRESSION2 expression)
	;


operand
	:	(IDENTIFIER LPAREN) => (functionCall)
			-> ^(FUNCCALL functionCall)
	|	compoundExpression
	|	CHARTRUE
	|	CHARFALSE
	|	IDENTIFIER
	|	CHARACTER
	|	TEXT
	|   	NUMBER
	|   	(LPAREN expression RPAREN)
			-> ^(EXPRESSION2 expression)
	;


functionCall
	: 	(IDENTIFIER LPAREN callParameterSequence? RPAREN)
			->	^(IDENTIFIER callParameterSequence?)
	;	

returnType
 	:	INTEGER
	|	BOOLEAN
	|	CHAR
	;*/

// Lexer rules


TEXT 
	:	QUOTE (~('"'|'\n'|'\r'))* QUOTE
   	;

CHARACTER
	:	SINGLEQUOTE ~'\'' SINGLEQUOTE
	;

IDENTIFIER
    	:   	LETTER (LETTER | DIGIT)*
    	;
    	
NUMBER
    	:   	MINUS? DIGIT+
    	;

COMMENT
    	:   	('//' .* '\n'
    	|	'/*' .* '*/')
            	{ $channel=HIDDEN; }
    	;

WS
    	:   	(' ' | '\t' | '\f' | '\r' | '\n')+
            	{ $channel=HIDDEN; }
    	; 
	
fragment DIGIT  :   ('0'..'9') ;
fragment LOWER  :   ('a'..'z') ;
fragment UPPER  :   ('A'..'Z') ;
fragment LETTER :   LOWER | UPPER ;

// EOF

