// In deze grammatica wordt aan elke rule het level en de locals meegegeven.
// Het level is het scope level waarin de AST zich bevindt (dus bijvoorbeeld het level van de functie in een andere functie)
// locals zijn de variabelen die gedeclareerd worden in een scopelevel
// De methode codePointAt() wordt gebruikt om de unicode waarde op te halen van een karakter
// een mooie uitbreiding van deze treewalker zou zijn, dat de woordgrootte ook in een MyTree wordt opgeslagen

tree grammar GrammarCodeGenerator;

options{
	tokenVocab=Grammar;
	ASTLabelType=MyTree; //De tree's zijn MyTree's
	}

@header{
	//package
	package src.grammar;
	import src.myTree.*;
	import src.codeGenerator.Gen;
}


@rulecatch {
	catch(RecognitionException e){
		throw e;
	}
}

program
	:	^(PROGRAM programBody){Gen.afterProgram();}
	;
	
programBody
	:	^(COMPOUND compoundExpression)
	;	

closedCompoundExpression
	:	^(COMPOUND compoundExpression)
	;
	
compoundExpression
	:	^(EXPRESSIONS (expression)+)
	;

expression
	:	^(ASSIGN assignStatement)
	| 	^(ARITHMETIC arithmeticExpression)
	|	^(DECLARATION t=declaration)
	|	^(READ readStatement)
	|	^(PRINT printStatement)
	|	^(CLOSEDCOMPOUND closedCompoundExpression)
	| 	^(CONDITIONAL conditionalStatement)
	|	^(WHILE whileStatement)
	|	^(FUNCTIONDECLARATION functionDeclaration)
	|	^(PROCEDUREDECLARATION procedureDeclaration)		
		
	;
	
procedureDeclaration
	:	VOID callableDeclaration[0]
	;
	
functionDeclaration
	:	returnType callableDeclaration[1]
	;
	
callableDeclaration[int amount]
	:	^(CALLABLE { Gen.genFuncDec(); } id=IDENTIFIER { Gen.genFuncId($id); } argsDeclaration[$id] closedCompoundExpression { Gen.genFuncDecEnd($id, amount); })
	;
		
argsDeclaration[MyTree t]
	:	^(DECLARGUMENTS argDec[t]*)
	;
	
argDec[MyTree t]
	:	^(returnType (amp=AMPERSAND? id=IDENTIFIER { Gen.genArgDec(id, t, amp == null ? null : $amp); })+)
	;
	
whileStatement
	:	^(WHILE { Gen.genWhile(); } compoundExpression { Gen.genWhileCond(); } compoundExpression) {Gen.genWhileEnd(); }
	;
	
arithmeticExpression //vergelijk de types en return het type van de expressie
	:	^(EXPRESSION not=NOT? arithmeticExpression) { Gen.genNot(not == null ? null : $not); }
	|	^(AND arithmeticExpression arithmeticExpression) { Gen.genAnd(); }
	|	^(OR arithmeticExpression arithmeticExpression) { Gen.genOr(); }
	|	^(EQUAL arithmeticExpression arithmeticExpression) { Gen.genEqual(); }
	|	^(NOTEQUAL arithmeticExpression arithmeticExpression) { Gen.genNotEqual(); }
	|	^(GREATER arithmeticExpression arithmeticExpression) { Gen.genGreater(); }
	|	^(SMALLER arithmeticExpression arithmeticExpression) { Gen.genSmaller(); }
	|	^(GREATEREQ arithmeticExpression arithmeticExpression) { Gen.genGreaterEq(); }
	|	^(SMALLEREQ arithmeticExpression arithmeticExpression) { Gen.genSmallerEq(); }
	|	^(PLUS arithmeticExpression arithmeticExpression) { Gen.genPlus(); }
	|	^(MINUS arithmeticExpression arithmeticExpression) { Gen.genMinus(); }
	|	^(MULTI arithmeticExpression arithmeticExpression) { Gen.genMulti(); }
	|	^(DIVIDE arithmeticExpression arithmeticExpression) {Gen.genDivide(); }
	|	operand
	;
			
conditionalStatement
	:	^(IF { Gen.genIf(); }
		compoundExpression { Gen.genIfCond();}  
		compoundExpression{ Gen.genAfterIf(); } 
		elseStatement? {Gen.genAfterIfElse();})
	;
	
elseStatement
	:	^(ELSE { Gen.genElse(); } 
		compoundExpression { Gen.genAfterElse(); })
	;
	
operand
	:	n=NUMBER { Gen.genNumber($n); }
	|	CHARTRUE { Gen.genTrue(); }
	|	id=CHARACTER { Gen.genChar($id); }
	|	CHARFALSE { Gen.genFalse(); }
	|	^(SUBEXPRESSION arithmeticExpression)
	|	id=IDENTIFIER { Gen.genVarUse($id); }
	|	^(ROUTINECALL callableUse)
	|	^(CLOSEDCOMPOUND closedCompoundExpression)
	;	
			
callableUse
	:	^(id=IDENTIFIER {Gen.setMethodName($id.getText());} (argUse)) { Gen.setArgPos(-1); Gen.genFuncCall($id); Gen.setMethodName(null);}
	;
		
argUse
	:	^(ARGUMENTUSE (id=ARG {Gen.setArgPos($id.getArgumentPos());} compoundExpression)*)
	;
	
assignStatement
	:	id=IDENTIFIER ASSIGN expression { Gen.genAssign($id); }
	;
	
declaration
	:	^(returnType (id=IDENTIFIER { Gen.genVarDec($id); })+)
	;
	
returnType
	:	INTEGER
	|	BOOLEAN
	|	CHAR
	;	
	
readStatement
	:	^(READ { int i = 0; } (id=IDENTIFIER{ Gen.genReadVar($id); i++; })+) {if(i==1){Gen.genReloadReadVar($id);}}
	;
	
printStatement
	:	^(pr=PRINT { Gen.genPrint(); } (expression{ Gen.genPrintExpr($pr); })+) 
	;
	
	