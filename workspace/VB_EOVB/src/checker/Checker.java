/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checker;
//imports

import myTree.*;
import symbolTable.*;
import errorReporter.*;
import grammar.GrammarException;

/**
 *
 * @author Jeroen
 */
public class Checker {

		//De symboltable die gelijk dienst doet als identificationtable
		private static SymbolTable<IdEntry> symbolTable = new SymbolTable<IdEntry>();
		//De errorreporter
		private static ErrorReporter errorReporter = new ErrorReporter();
		// variabele die de positie van een argument in een functie bijhoudt
		private static int argumentPos = 0;
		//Deze string kan gereturned worden om een type aan te geven van een expressie
		private static String t;

		public static int afterProgram() {
				//Na het doorlopen van de ast de GrammarExceptions printen die niet kritiek zijn (op de System.err!)
				errorReporter.printExceptions();
				//return het aantal exceptions
				return errorReporter.countExceptions();
		}

		public static void checkNotExpression(MyTree not, String type1) {
				if (not != null) {
						if (!type1.equals("boolean")) {
								errorReporter.addException(new GrammarException(not, "Expression should be boolean"));
						}
				}
		}

		public static void checkAndExpression(String type1, String type2, MyTree and2) {

				if (!(type1.equals("boolean") && type2.equals("boolean"))) {
						errorReporter.addException(new GrammarException(and2, "Types at both sides of AND-expression should be boolean"));
				}
		}

		public static void checkOrExpression(String type1, String type2, MyTree or2) {
				if (!(type1.equals("boolean") && type2.equals("boolean"))) {
						errorReporter.addException(new GrammarException(or2, "Types at both sides of OR-expression should be boolean"));
				}
		}

		public static void checkEqualExpression(String type1, String type2, MyTree equal) {
				if (!type1.equals(type2) && !type1.equals("string")) {
						errorReporter.addException(new GrammarException(equal, "Types at both sides of EQUAL-expression should match"));
				}
		}

		public static void checkNotEqualExpression(String type1, String type2, MyTree notequal) {
				if (!type1.equals(type2) && !type1.equals("string")) {
						errorReporter.addException(new GrammarException(notequal, "Types at both sides of NOTEQUAL-expression should match"));
				}
		}

		public static void checkGreaterExpression(String type1, String type2, MyTree greater) {
				if (!(type1.equals("int") && type2.equals("int"))) {
						errorReporter.addException(new GrammarException(greater, "Types at both sides of GREATER-expression should be int"));
				}
		}

		public static void checkSmallerExpression(String type1, String type2, MyTree smaller) {
				if (!(type1.equals("int") && type2.equals("int"))) {
						errorReporter.addException(new GrammarException(smaller, "Types at both sides of SMALLER-expression should be int"));
				}
		}

		public static void checkGreaterEqExpression(String type1, String type2, MyTree greatereq) {
				if (!(type1.equals("int") && type2.equals("int"))) {
						errorReporter.addException(new GrammarException(greatereq, "Types at both sides of GREATEREQUAL-expression should be int"));
				}
		}

		public static void checkSmallerEqExpression(String type1, String type2, MyTree smallereq) {
				if (!(type1.equals("int") && type2.equals("int"))) {
						errorReporter.addException(new GrammarException(smallereq, "Types at both sides of SMALLEREQUAL-expression should be int"));
				}
		}

		public static void checkPlusExpression(String type1, String type2, MyTree plus) {
				if (!(type1.equals("int") && type2.equals("int"))) {
						errorReporter.addException(new GrammarException(plus, "Types at both sides of PLUS-expression should be int"));
				}
		}

		public static void checkMinusExpression(String type1, String type2, MyTree minus) {
				if (!(type1.equals("int") && type2.equals("int"))) {
						errorReporter.addException(new GrammarException(minus, "Types at both sides of MINUS-expression should be int"));
				}
		}

		public static void checkMultiExpression(String type1, String type2, MyTree multi) {
				if (!(type1.equals("int") && type2.equals("int"))) {
						errorReporter.addException(new GrammarException(multi, "Types at both sides of MULTIPLY-expression should be in"));
				}
		}

		public static void checkDivideExpression(String type1, String type2, MyTree divide) {
				if (!(type1.equals("int") && type2.equals("int"))) {
						errorReporter.addException(new GrammarException(divide, "Types at both sides of DIVISION-expression should be int"));
				}
		}

		public static String checkVarUse(MyTree id) throws GrammarException {

				//Haal de declaratie op
				IdEntry e = symbolTable.retrieve(id.getText());
				// gooi een exceptie als deze niet bestaat
				if (e == null) {
						throw new GrammarException(id, "is not declared (on this level)");
				} else {
						if (!e.getInit()) { // kijk of de variabele wel geinitialiseerd is
								errorReporter.addException(new GrammarException(id, "might not have been initialized"));
						}
						//return het type
						return e.getTree().getIdType();
				}
		}

		public static void checkFuncUse(MyTree id) throws GrammarException {
				//Haal de functiedeclaratie op
				IdEntry e = symbolTable.retrieve(id.getText());

				//Gooi een exceptie als deze niet gedeclareerd is
				if (e == null) {
						throw new GrammarException(id, "is not declared (on this level)");
				}
		}

		public static SymbolTable getSymbolTable() {
				return symbolTable;
		}

		public static void checkArguments(MyTree id, boolean hasArguments) throws GrammarException {
				if (symbolTable.retrieve(id.getText()).getTree().getArgumentsSize() > 0 && !hasArguments) { // controleer of er wel argumenten zijn opgegeven als de functie deze verwacht
						throw new GrammarException(id, "Function '" + id.getText() + "' needs at least one argument");
				}
				if (hasArguments && argumentPos != symbolTable.retrieve(id.getText()).getTree().getArgumentsSize()) {
						throw new GrammarException(id, "Function '" + id.getText() + "' expects " + symbolTable.retrieve(id.getText()).getTree().getArgumentsSize() + " arguments, " + argumentPos + " arguments given.");
				}


				argumentPos = 0;
		}

		public static void checkArgExpression(MyTree id, MyTree routine, String type) throws GrammarException {
				//Zet de positie van dit argument
				id.setArgumentPos(argumentPos);

				//Haal de declaratie van het argument op
				MyTree arg = routine.getArgument(argumentPos);

				//kijk of het type overeen komt
				if (arg != null) {
						if (!arg.getIdType().equals(type)) {
								errorReporter.addException(new GrammarException(id, "Argument type does not match argument #" + (argumentPos + 1) + "'s type in function's declaration"));
						}
				} else { // anders bestaat dit argument helemaal niet
						throw new GrammarException(id, "Function does not have " + (argumentPos + 1) + " arguments");
				}
				//verhoog de positie
				argumentPos++;
		}

		public static void checkAssignment(MyTree id, String type, MyTree assign) {


				//haal de declaratie op
				symbolTable.retrieve(id.getText()).setInit();
				MyTree tree = symbolTable.retrieve(id.getText()).getTree();
				//Vergelijk het type
				if (!tree.getIdType().equals(type)) {
						String s = "Cannot assign " + type + " to " + tree.getIdType();
						errorReporter.addException(new GrammarException(assign, s));
				}


		}

		public static String getT() {
				return t;
		}

		public static void checkPrintExpr(String texpr, MyTree p) {
				MyTree type = new MyTree(null);
				type.setIdType(texpr);
				p.addArgument(type);
				if (texpr == "void") {
						errorReporter.addException(new GrammarException(p, "Cannot use void type here."));
				} else {
						if (t == null) {
								t = texpr;
						} else {
								t = "void";
						}
				}
		}

		public static void checkPrint() {
				t = null;
		}

		public static void checkReadVarList(MyTree id) throws GrammarException {

				Checker.checkVarUse(id);
				if (getT() == null) {
						t = Checker.getSymbolTable().retrieve(id.getText()).getTree().getIdType();
				} else {
						t = "void";
				}
		}

		public static void checkRead() {
				t = null;
		}

		public static void checkVarDeclaration(MyTree id, String t) {


				//Zet het type in de MyTree
				id.setIdType(t);
				//Maak een nieuwe IdEntry
				IdEntry idEntry = new IdEntry();

				//Hang de MyTree aan de IdEntry
				idEntry.setTree(id);

				//Zet het level waarop deze is gedeclareerd
				idEntry.setLevel(symbolTable.currentLevel());

				try {
						//Zet de IdEntry in de symboltable
						symbolTable.enter(id.getText(), idEntry);


				} catch (SymbolTableException e) { // vang een SymbolTable exception als de variabele al is gedeclareerd
						errorReporter.addException(new GrammarException(id, e.getMessage()));
				}

		}

		public static String checkIfCondition(String tcond, String tif, String telse, MyTree r) {
				//expressie moet een boolean zijn
				if (!tcond.equals("boolean")) {
						errorReporter.addException(new GrammarException(r, "Condition must be of type boolean"));
				}

				String type = "void";

				if (telse != null && tif.equals(telse)) {
						type = tif;
				}

				return type;

		}

		public static void checkWhileCondition(String t, MyTree r) {
				//expressie moet een boolean zijn
				if (!t.equals("boolean")) {
						errorReporter.addException(new GrammarException(r, "Condition must be of type boolean"));
				}

		}

		public static void checkArgDec(MyTree id, String t, String name) {
				try {
						//Maak een nieuwe IdEntry
						IdEntry idEntry = new IdEntry();

						//Zet hem op geinitialiseerd
						idEntry.setInit();

						//Zet het type van de MyTree
						id.setIdType(t);

						//Zet de positie van het argument DEZE STAP IS NODIG VOOR DE CODEGENERATOR
						id.setArgumentPos(argumentPos);

						//Koppel de IdEntry aan de MyTree
						idEntry.setTree(id);

						//Zoek de functie declaratie op en voeg dit argument toe
						symbolTable.retrieve(name).getTree().addArgument(id);

						//Verhoog de positie van het argument
						argumentPos++;

						//Zet het level waarop dit argument gedeclareerd is
						idEntry.setLevel(symbolTable.currentLevel());

						//Zet het argument in de symboltable
						symbolTable.enter(id.getText(), idEntry);

				} catch (SymbolTableException e) { // vang de exceptie als de variabele al gedeclareerd is
						errorReporter.addException(new GrammarException(id, e.getMessage()));
				}
		}

		public static void checkReturnType(String t, String type, MyTree id) {
				//Gooi een exceptie als de return type niet overeenkomt met het type van de functie
				if (!t.equals(type) && !type.equals("void")) {
						errorReporter.addException(new GrammarException(id, "Returntype does not match function's returntype"));
				}
		}

		public static void setArgumentPos(int aArgumentPos) {
				argumentPos = aArgumentPos;
		}

		public static void checkCallableDec(MyTree id, String t) {
				try {
						//Maak een niewe IdEntry aan
						IdEntry idEntry = new IdEntry();

						//Zet het level waarop de functie declareerd is DEZE STAP IS NODIG VOOR DE CODEGENERATOR
						idEntry.setLevel(symbolTable.currentLevel());

						//Zet het type
						id.setIdType(t);

						//Koppel de IdEntry aan de MyTree
						idEntry.setTree(id);

						//Plaats hem in de symboltable
						symbolTable.enter(id.getText(), idEntry);
				} catch (SymbolTableException e) { // vang een exceptie als de functie al gedeclareerd is
						errorReporter.addException(new GrammarException(e.getMessage()));
				}
		}
}
