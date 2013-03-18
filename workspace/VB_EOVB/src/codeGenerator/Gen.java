/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codeGenerator;

import java.util.ArrayList;
import myTree.*;
import codeStack.*;
import heapManager.*;
import java.util.HashMap;
import register.*;

/**
 *
 * @author Jeroen
 */
public class Gen {

		//De labels voor de while en if statements
		private static int labels = -1;
		//Aantal globale declaraties
		private static int globals = 0;
		//De stack waar de TAM instructies opgezet worden
		private static CodeStack codeStack = new CodeStack();
		//De identification table om de variabele en functie declaraties in op te slaan
		private static HashMap<String, MyTree> idTable = new HashMap<String, MyTree>();
		//De HeapManager
		private static HeapManager heapManager = new HeapManager();
		//Backup van het aantal gemaakte declaraties in een scope
		private static int declarations;
		//Backup van het aantal gemaakte declaraties in een scope
		private static int iftemp;
		//Backup van het aantal gemaakte declaraties in een scope
		private static int ifdecl;
		//Backup van het aantal gemaakte declaraties in een scope
		private static int elsedecl;
		//Backup van het aantal gemaakte declaraties in een scope
		private static int whiletemp;
		//Backup van het aantal gedeclareerde functies
		private static int proc;
		//Houdt bij of er na een readstatement wat op de stack gezet moet worden
		private static int i;
		//Geeft aan of we nu in een methode zitten
		private static boolean inMethod = false;
		//Geeft aan in welke methode we zitten
		private static String methodName = null;
		//Geeft aan - als we in een methode zitten - wat de positie van het argument is
		private static int argPos = -1;
		
		public static void genPrint() {
				i = 0;
		}

		public static void genArgDec(MyTree id, MyTree t, MyTree amp) {

				id.setInMethod(true);

				//kijk of de identifier een reference parameter is
				id.setReference(amp != null);

				//zet het adres van het argument (negatief)
				id.setAddr((t.getArgumentsSize() - (id.getArgumentPos())) * -1);

				//zet het argument in de idtable
				idTable.put(id.getText(), id);
		}

		public static void genFuncDec() {
				//bepaal het aantal declaraties
				declarations = globals;

				//open een scope in de heapmanager
				heapManager.openScope();

				//backup het aantal declaraties
				proc = declarations;

				setInMethod(true);

		}

		public static void genFuncDecEnd(MyTree id, int amount) {

				// zet het aantal declaraties terug
				declarations = proc;

				//close de scope in de heapmanager
				heapManager.closeScope(codeStack);

				//Return: vervang de argumenten door het resultaat
				codeStack.emit("RETURN(" + amount + ") " + id.getArgumentsSize(), "replace arguments by result");

				//Plaats het label van het einde van de functie
				codeStack.emit(id.getText() + "end:", "end function " + id.getText() + "()");

				setInMethod(false);

		}
		
		public static void afterProgram() {

				//Close de scope, deze wordt in eerste instantie geopend in de HeapManager
				heapManager.closeScope(codeStack);

				//Pop het aantal globale declaraties
				codeStack.emit("POP(0) " + (globals), "Pop all declarations");

				//Halt
				codeStack.emit("HALT", "End of program");

				//Dump alle TAM instructies op de standaard output
				codeStack.dump();
		}

		public static void genFuncId(MyTree id) {
				//zet de MyTree in de idtable
				idTable.put(id.getText(), id);


				//Jump naar het einde van de functie
				codeStack.emit("JUMP " + id.getText() + "end[CB]", "jump to end function");

				//Plaats het label van de functie
				codeStack.emit(id.getText() + ":", "function " + id.getText() + "()");
		}

		public static void genPrintExpr(MyTree pr) {
				if (pr.getArgument(i).getIdType().equals("boolean")) { // print het juiste type op het scherm
						codeStack.emit("CALL putint", "putint");
				} else if (pr.getArgument(i).getIdType().equals("int")) {
						codeStack.emit("CALL putint", "putint");
				} else if (pr.getArgument(i).getIdType().equals("char")) {
						codeStack.emit("CALL put", "print char");
				}
				//plaats end of line
				codeStack.emit("CALL puteol", "put end of line");
				i++;
		}

		public static void genReloadReadVar(MyTree id) {
				MyTree tree = getIdTable().get(id.getText());
				codeStack.emit("LOAD(1) " + (tree.getAddr() + Register.getVarRegister(tree.isInMethod())), "reload read var");

		}
		
		public static void genReadVar(MyTree id) {

				// haal de declaratie op
				MyTree t = getIdTable().get(id.getText());

				//Haal het type op
				String te = t.getIdType();

				//Load het adres waar het resultaat op gezet moet worden
				codeStack.emit("LOADA " + (t.getAddr() + Register.getVarRegister(t.isInMethod())), "load addr of " + id.getText());
				if (te.equals("int") || te.equals("boolean")) { // roep de juiste primitieve routine aan
						codeStack.emit("CALL getint", "read " + te + " from std.in");
				} else if (te.equals("char")) {
						codeStack.emit("CALL get", "read " + te + " from std.in");
				}
		}

		public static void genVarDec(MyTree id) {

				//Zet de declaratie in de idtable
				idTable.put(id.getText(), id);

				//Zet het adres van de variabele
				id.setAddr(globals);

				//Maak ruimte op de stack
				codeStack.emit("PUSH 1", id.getText() + " @ " + (id.getAddr() + Register.getVarRegister(id.isInMethod())));

				globals++;


		}

		public static void genAssign(MyTree id) {

				//haal de declaration op
				MyTree tree = idTable.get(id.getText());

				if (tree.isReference()) {

						codeStack.emit("LOAD(1) " + (tree.getAddr() + Register.getVarRegister(tree.isInMethod())), "load addr");

						//Assign de waarde van de expressie aan de variabele
						codeStack.emit("STOREI(1)", "assign to addr");
				} else {

						//Assign de waarde van de expressie aan de variabele
						codeStack.emit("STORE(1) " + (tree.getAddr() + Register.getVarRegister(tree.isInMethod())), "assign to " + tree.getText());

						//codeStack.emit("LOAD(1) " + (tree.getAddr() + Register.getVarRegister(level, tree.getLevel())), "reload for multiple assign");

				}
		}

		public static void genFuncCall(MyTree id) {

				//Haal de functie declaratie op
				MyTree t = idTable.get(id.getText());

				//Roep de methode aan
				codeStack.emit("CALL(" + Register.removeB(Register.getCallRegister(t.isInMethod())) + ") " + id.getText() + "[CB]", "CALL to function " + id.getText() + "()");

		}

		public static HashMap<String, MyTree> getIdTable() {
				return idTable;
		}

		public static void genTrue() {
				codeStack.emit("LOADL 1", "LOAD true");

				if(!isInMethod()) {
						//globals++;
				}
		}

		public static void genFalse() {
				codeStack.emit("LOADL 0", "LOAD false");

				if(!isInMethod()) {
						//globals++;
				}
		}

		public static void genNumber(MyTree n) {
				codeStack.emit("LOADL " + n.getText(), "LOAD number: " + n.getText());

				if(!isInMethod()) {
						//globals++;
				}
		}

		public static void genAfterElse() {

				// Close de scope in de heapmanager
				heapManager.closeScope(codeStack);

				//Pop het locaal aantal gemaakte declaraties
				codeStack.emit("POP(0) " + (declarations - elsedecl), "pop local");

				//zet het aantal declaraties terug
				declarations = elsedecl;

		}

		public static void genElse() {
				//open een scope in de heap manager
				heapManager.openScope();

				//Bepaal het locaal aantal declaraties
				declarations = globals;

				//Backup het aantal declaraties
				elsedecl = declarations;

		}

		public static void genAfterIfElse() {
				//Plaats een label die het einde van het if/else statement aangeeft
				codeStack.emit(+iftemp + "end:", "endif");
		}

		public static void genAfterIf() {

				//Close de scope in de heap manager
				heapManager.closeScope(codeStack);

				//Pop het aantal locaal gemaakte declaraties
				codeStack.emit("POP(0) " + (declarations - ifdecl), "pop local");

				//Zet het aantal declaraties terug
				declarations = ifdecl;

				//Jump naar het einde van het if/else statement
				codeStack.emit("JUMP " + iftemp + "end[CB]", "jump to endif");

				//Plaats het begin van het else statement
				codeStack.emit(iftemp + "else:", "elselabel" + iftemp);

		}

		public static void genIfCond() {
				//nieuwe label
				labels++;

				//labels
				iftemp = labels;

				//jump als de expressie false gaf
				codeStack.emit("JUMPIF(0) " + iftemp + "else[CB]", "jump if false to " + iftemp + "else[CB]");

				//Backup het aantal declaraties
				ifdecl = declarations;
		}

		public static void genIf() {
				//open een scope in de heapmanager
				heapManager.openScope();

				//Bepaal het lokaal aantal declaraties
				declarations = globals;

		}

		public static void genNot(MyTree not) {
				if (not != null) { //TAM instructies om een boolean te inverteren
						codeStack.emit("LOADL 1", "Load 1 to invert bool");
						codeStack.emit("CALL add", "Add 1 to boolean expr");
						codeStack.emit("LOADL 2", "Load 2 to invert bool");
						codeStack.emit("CALL mod", "invert bool");
				}

		}

		public static void genAnd() {
				codeStack.emit("CALL and", "and");

		}

		public static void genOr() {
				codeStack.emit("CALL or", "or");

		}

		public static void genEqual() {

				codeStack.emit("LOADL 1", "extra bool");
				codeStack.emit("CALL eq", "equals");
		}

		public static void genNotEqual() {
				codeStack.emit("LOADL 1", "extra bool");
				codeStack.emit("CALL ne", "notequals");

		}

		public static void genGreater() {

				codeStack.emit("CALL gt", "greater than");

		}

		public static void genSmaller() {

				codeStack.emit("CALL lt", "less than");

		}

		public static void genGreaterEq() {

				codeStack.emit("CALL ge", "greater or equal");

		}

		public static void genSmallerEq() {
				codeStack.emit("CALL le", "less or equal");


		}

		public static void genPlus() {

				codeStack.emit("CALL add", "add");

		}

		public static void genMinus() {

				codeStack.emit("CALL sub", "sub");

		}

		public static void genMulti() {

				codeStack.emit("CALL mult", "mult");

		}

		public static void genDivide() {
				codeStack.emit("CALL div", "div");


		}

		public static void genWhileEnd() {

				//close de scope in de heapmanager
				heapManager.closeScope(codeStack);

				//pop het locaal aantal gemaakte declaraties
				codeStack.emit("POP(0) " + (globals - declarations), "pop local");

				//Zet het aantal declaraties terug
				globals = declarations;

				//Jump naar het begin van de while lus, voor de expressie
				codeStack.emit("JUMP " + whiletemp + "w[CB]", "jump to while begin");

				//Plaats een label die het einde van de while lus aangeeft
				codeStack.emit(whiletemp + "wend:", "whileend");


		}

		public static void genWhileCond() {

				//Jump naar het einde als de expressie false geeft
				codeStack.emit("JUMPIF(0) " + whiletemp + "wend[CB]", "while expression");

		}

		public static void genWhile() {
				//bepaal het aantal declaraties
				declarations = globals;

				//open een scope in de heapmanager
				heapManager.openScope();

				//verhoog het labels
				labels++;

				//aantal labels
				whiletemp = labels;

				//Begin van de while lus
				codeStack.emit(whiletemp + "w:", "whilebegin");


		}

		public static void genChar(MyTree id) {

				int t = id.getText().codePointAt(1);
				//laadt de unicode representatie van een karakter
				codeStack.emit("LOADL " + t, "LOAD " + id.getText().charAt(1));

				if(!isInMethod()) {
						//globals++;
				}

		}

		public static void genVarUse(MyTree id) {
				//Haal de declaratie op
				MyTree t = idTable.get(id.getText());

				boolean isReference = false;

				if(methodName != null && argPos != -1) {
						isReference = Gen.getIdTable().get(methodName).getArgument(argPos).isReference();
				}
				if (isReference) {

						//Laadt het adres van de variabele
						codeStack.emit("LOADA " + (t.getAddr() + Register.getVarRegister(t.isInMethod())), "LOAD address " + id.getText());

				} else {

						//Laadt de waarde van de variabele
						codeStack.emit("LOAD(1) " + (t.getAddr() + Register.getVarRegister(t.isInMethod())), "LOAD " + id.getText());

				}
				if(!isInMethod()) {
						//globals++;
				}
		}

		/**
		 * @return the inMethod
		 */
		public static boolean isInMethod() {
				return inMethod;
		}

		/**
		 * @param aInMethod the inMethod to set
		 */
		public static void setInMethod(boolean aInMethod) {
				inMethod = aInMethod;
		}

		/**
		 * @return the methodName
		 */
		public static String getMethodName() {
				return methodName;
		}

		/**
		 * @param aMethodName the methodName to set
		 */
		public static void setMethodName(String aMethodName) {
				methodName = aMethodName;
		}

		/**
		 * @return the argPos
		 */
		public static int getArgPos() {
				return argPos;
		}

		/**
		 * @param aArgPos the argPos to set
		 */
		public static void setArgPos(int aArgPos) {
				argPos = aArgPos;
		}
}



