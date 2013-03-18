package src.myTree;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.*;
import java.util.ArrayList;

/**
 * Deze klasse breidt CommonTree uit om extra informatie op te kunnen slaan in de AST
 * @author Jeroen
 *
 */
public class MyTree extends CommonTree {
	
	/**
	 * Het type van de node.
	 * @invariant value == (boolean | char | int) && type == getIdType()
	 */
	private String type;
	
	/**
	 * Het adres van de node
	 * @invariant addr == getAddr()
	 */
	private int addr;
	
	
	/**
	 * Het level van deze MyTree
	 * @invariant level == getLevel()
	 */
	private int level;
	
	/**
	 * Wanneer de node een argument is, heeft deze een bepaalde positie.
	 * @invariant argumentPos >= 0 && argumentPos == getArgumentPos()
	 */
	private int argumentPos;	
	
	/**
	 * Wanneer de node een functie is, heeft deze bepaalde argumenten.
	 */
	private ArrayList<MyTree> arguments;
	
	/**
	 * Wanneer een functie op level 0 is gedeclareerd moet de static link altijd verwijzen naar SB
	 * @invariant callRegister == getCallRegister()
	 * 
	 */
	private String callRegister;

	/**
	 * Geeft aan of deze myTree een reference is naar een parameter
	 */
	private boolean reference;

	private boolean inMethod;
	
	/**
	 * Construeert een nieuwe MyTree 
	 * @ensure type =="" && addr == 0 && arguments.size() == 0 && register = "" &&
	 * argumentPos == 0
	 * @param t het Token
	 */
	public MyTree(Token t) {
		super(t);
		callRegister = null;
		type = "";
		addr = 0;
		arguments = new ArrayList<MyTree>();
		inMethod = false;
		argumentPos = 0;
		reference = false;
	}
	
	/**
	 * Wanneer deze MyTree een argument is wordt hiermee de positie ervan teruggegeven
	 * @ensure result == argumentPos
	 * @return int: de positie
	 */
    public int getArgumentPos() { 
		return argumentPos;		
	}
	
    /**
     * Wanneer deze MyTree een argument is kun je hiermee de positie instellen
     * @ensure argumentPos == i
     * @require i >= 0
     * @param i: de positie
     */
    public void setArgumentPos(int i) { 
		this.argumentPos = i;	
	}
	
    /**
     * Geeft het type van de Node
     * @ensure result == type
     * @return String: het type van deze node
     */
	public String getIdType() {
		return type;
	}
	
	/**
	 * Zet het type van de node
	 * @ensure this.type == type
	 * @require type != null
	 * @param type: String type 
	 */
	public void setIdType(String type) {
		this.type = type;
	}
	
	/**
	 * Geeft het adres van deze node
	 * @ensure result == addr
	 * @return int: het adres
	 */
	public int getAddr() {
		return addr;
	}		
  
	/**
	 * Zet het adres van deze MyTree
	 * @param i int het adres
	 * @ensure addr == i
	 */
	public void setAddr(int i) {
		addr = i;
	}
	
	/**
	 * Wanneer deze node een functie is geeft deze methode het aantal argumenten
	 * @ensure result >= 0 && result == arguments.size()
	 * @return int: het aantal argumenten
	 */
	public int getArgumentsSize() {
		return arguments.size();
	}

	/**
	 * Voegt een MyTree toe als argument, wanneer deze MyTree een functie is
	 * @ensure old.arguments.size() +1 == new.arguments.size()
	 * @require name != null
	 * @param name MyTree: de node van het argument
	 */
	public void addArgument(MyTree name) {
		arguments.add(name);
	}
	
	/**
	 * Geeft de MyTree van het argument op positie i
	 * @ensure result == null als het argument niet bestaat anders de MyTree
	 * @require i >= 0
	 * @param i int: de positie
	 * @return MyTree: de MyTree van het argument
	 */
	public MyTree getArgument(int i) {
		if(i >= arguments.size()) {
			return null;
		}else {
			return arguments.get(i);
		}
	}
	
	/**
	 * Geeft SB als deze MyTree een functie is en op level 0 is gedeclareerd
	 * @return String: het register
	 * @ensure result == callRegister
	 */
	public String getCallRegister() {
		return callRegister;
	}
	
	/**
	 * Wanneer deze MyTree een functie is en op level 0 gedeclareerd is, wordt callRegister op SB gezet
	 * @param r String het register
	 */
	public void setCallRegister(String r) {
		callRegister = r;
	}

	/**
	 * Veranderd de waarde van reference
	 * @param is true als de parameter een reference parameter is
	 */
	public void setReference(boolean is) {
			reference = is;
	}

	/**
	 * Geeft aan of deze parameter een reference parameter is
	 * @return true als de parameter een reference parameter is
	 */
	public boolean isReference() {
			return reference;
	}

		/**
		 * @return the inMethod
		 */
		public boolean isInMethod() {
				return inMethod;
		}

		/**
		 * @param inMethod the inMethod to set
		 */
		public void setInMethod(boolean inMethod) {
				this.inMethod = inMethod;
		}
}
