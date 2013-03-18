tree grammar GrammarChecker;

options{
	tokenVocab=Grammar;
	output=int;
	ASTLabelType=MyTree; //gebruik MyTree nodes
	}

@header{
	//package
	package src.grammar;
	import src.checker.Checker;
	import src.myTree.MyTree;
}


@rulecatch {
	catch(RecognitionException e){
		throw e;
	}
}

program returns[int count]
	:	^(PROGRAM programBody) { count = Checker.afterProgram(); }
	;
	
programBody
	:	^(COMPOUND compoundExpression)
	;	

closedCompoundExpression returns [String type=""]
	:	^(COMPOUND { Checker.getSymbolTable().openScope(); } t=compoundExpression){type=t; Checker.getSymbolTable().closeScope();}
	;
	
compoundExpression returns [String type=""]
	:	^(EXPRESSIONS {String temp = "void"; } (t=expression{temp=t;})+) { type=temp; }
	;

expression returns [String type=""]
	:	^(ASSIGN t=assignStatement{type=t;})
	| 	^(ARITHMETIC t=arithmeticExpression{type=t;})
	|	^(DECLARATION t=declaration{type=t;})
	|	^(READ t=readStatement{type=t;})
	|	^(PRINT t=printStatement{type=t;})
	|	^(CLOSEDCOMPOUND t=closedCompoundExpression{type=t;})
	|	^(CONDITIONAL t=conditionalStatement{ type = t; })
	|	^(WHILE t=whileStatement{ type=t; })
	|	^(FUNCTIONDECLARATION t=functionDeclaration{ type = t; })
	|	^(PROCEDUREDECLARATION t=procedureDeclaration{ type = t; })		
		
	;
	
procedureDeclaration returns [String type="void"]
	:	VOID callableDeclaration["void"]
	;
	
functionDeclaration returns [String type=""]
	:	t=returnType{type=t;} callableDeclaration[t]
	;
	
callableDeclaration[String returnt] returns [String type=""]
	:	^(CALLABLE id=IDENTIFIER{Checker.checkCallableDec($id, returnt); Checker.getSymbolTable().openScope(); } argsDeclaration[$id.getText()] {
		
			// Zet de positie van de argumenten weer op 0
			Checker.setArgumentPos(0);
		} t=closedCompoundExpression{Checker.checkReturnType(t, returnt, $id); type=t; Checker.getSymbolTable().closeScope(); })
	;
		
argsDeclaration[String name]
	:	^(DECLARGUMENTS argDec[name]*)
	;
	
argDec[String name]
	:	^(t=returnType (AMPERSAND? id=IDENTIFIER { Checker.checkArgDec($id, t, name); })+)
	;
	
whileStatement returns [String type="void"]
	:	^(w=WHILE {Checker.getSymbolTable().openScope(); } t=compoundExpression { Checker.getSymbolTable().openScope(); } compoundExpression { Checker.getSymbolTable().closeScope(); Checker.getSymbolTable().closeScope(); } {
			Checker.checkWhileCondition(t, $w);
		})
	;
		
conditionalStatement returns [String type = ""]
	:	^(r=IF {Checker.getSymbolTable().openScope(); } 
		tcond=compoundExpression {Checker.getSymbolTable().openScope(); } 
		tif=compoundExpression { Checker.getSymbolTable().closeScope(); } 
		telse=elseStatement?) { Checker.getSymbolTable().closeScope(); type=Checker.checkIfCondition(tcond, tif, telse, $r); }
	;
	
elseStatement returns [String type = ""]
	:	^(ELSE {Checker.getSymbolTable().openScope(); } 
		t=compoundExpression{Checker.getSymbolTable().closeScope(); type = t;})
	;
	
arithmeticExpression returns [String type=""] //vergelijk de types en return het type van de expressie
	:	^(EXPRESSION not=NOT? type1=arithmeticExpression){
			Checker.checkNotExpression(not == null ? null : $not, type1);
			type=type1;
		}
	|	^(and2=AND type1=arithmeticExpression type2=arithmeticExpression){
			Checker.checkAndExpression(type1, type2, $and2);
			type="boolean";
		}
	|	^(or2=OR type1=arithmeticExpression type2=arithmeticExpression){
			Checker.checkOrExpression(type1, type2, $or2);			
			type="boolean";
		}
	|	^(equal=EQUAL type1=arithmeticExpression type2=arithmeticExpression){
			Checker.checkEqualExpression(type1, type2, $equal);
			type="boolean";
		}
	|	^(notequal=NOTEQUAL type1=arithmeticExpression type2=arithmeticExpression){
			Checker.checkNotEqualExpression(type1, type2, $notequal);
			type="boolean";
		}
		
	|	^(greater=GREATER type1=arithmeticExpression type2=arithmeticExpression){
			Checker.checkGreaterExpression(type1, type2, $greater);
			type="boolean";
		}
	|	^(smaller=SMALLER type1=arithmeticExpression type2=arithmeticExpression){
			Checker.checkSmallerExpression(type1, type2, $smaller);
			type="boolean";
		}
	|	^(greatereq=GREATEREQ type1=arithmeticExpression type2=arithmeticExpression){
			Checker.checkGreaterEqExpression(type1, type2, $greatereq);
			type="boolean";
		}
	|	^(smallereq=SMALLEREQ type1=arithmeticExpression type2=arithmeticExpression){
			Checker.checkSmallerEqExpression(type1, type2, $smallereq);
			type="boolean";
		}
	|	^(plus=PLUS type1=arithmeticExpression type2=arithmeticExpression){
			Checker.checkPlusExpression(type1, type2, $plus);
			type=type1;
		}
	|	^(minus=MINUS type1=arithmeticExpression type2=arithmeticExpression){
			Checker.checkMinusExpression(type1, type2, $minus);
			type=type1;
		}
	|	^(multi=MULTI type1=arithmeticExpression type2=arithmeticExpression)	{
			Checker.checkMultiExpression(type1, type2, $multi);
			type=type1;
		}
	|	^(divide=DIVIDE type1=arithmeticExpression type2=arithmeticExpression){
			Checker.checkDivideExpression(type1, type2, $divide);
			type=type1;
		}
	|	type1=operand{type=type1;}
	;
	
operand returns [String type=""] // return het type
	:	NUMBER{type="int";}
	|	CHARTRUE{type="boolean";}
	|	CHARACTER{type="char";}
	|	CHARFALSE{type="boolean";}
	|	^(SUBEXPRESSION t=arithmeticExpression){type=t;}
	|	id=IDENTIFIER{ type = Checker.checkVarUse($id); }
	|	^(ROUTINECALL t=callableUse){type=t;}
	|	^(CLOSEDCOMPOUND t=closedCompoundExpression){type=t;}
	;
		
callableUse returns [String type=""]
	:	^(id=IDENTIFIER { Checker.checkFuncUse($id);} 
		(hasArguments=argUse[Checker.getSymbolTable().retrieve($id.getText()).getTree()])) {
			Checker.checkArguments($id, hasArguments);
			type=Checker.getSymbolTable().retrieve($id.getText()).getTree().getIdType();
		}
	;
		
argUse[MyTree routine] returns [boolean hasArguments = false]
	:	^(ARGUMENTUSE (id=ARG t=compoundExpression{
			hasArguments = true;
			Checker.checkArgExpression($id, routine, t);		
		})*)
	;
	
assignStatement returns [String type=""]
	:	id=IDENTIFIER assign=ASSIGN t=expression { Checker.checkAssignment(id, t, $assign); type=t;} 
	;
	
declaration returns [String type="void"]
	:	^(t=returnType (AMPERSAND? id=IDENTIFIER { Checker.checkVarDeclaration($id, t); })+)
	;
	
returnType returns [String type=""] // return het type
	:	t=INTEGER {
			type = $t.getText(); 
		}
	|	t=BOOLEAN {
			type = $t.getText(); 
		}
	|	t=CHAR {
			type = $t.getText();
		}
	;	
	
readStatement returns [String type=""]
	:	^(r=READ {Checker.checkRead(); } (id=IDENTIFIER { Checker.checkReadVarList($id); })+{ type=Checker.getT(); })
	;
	
printStatement returns [String type=""]
	:	^(p=PRINT {Checker.checkPrint(); } (texpr=expression { Checker.checkPrintExpr(texpr, $p); })+{ type=Checker.getT(); })
	;