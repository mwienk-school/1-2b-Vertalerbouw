package src.heapManager;

import java.util.Stack;
import java.util.Vector;
import src.codeStack.*;

/**
 * Deze klasse houdt de variabelen in de Heap bij en binnen welke scope deze gedeclareerd zijn. 
 * De werking van deze klasse lijkt op de werking van een SymbolTable
 * @author Jeroen
 *
 */
public class HeapManager {

	/**
	 * Stack die op elke index een Vector met HeapEntry's bij houdt.
	 * De index komt overeen met het level waarop een variabele gedeclareerd is.
	 */
	private Stack<Vector<HeapEntry>> stack;
		
	/**
	 * Het aantal gebruikte adressen op de heap
	 */
	private int heapSize;
	
	/**
	 * Construeert een nieuwe HeapManager
	 * Opent direct een nieuwe scope omdat er variabelen direct in de heap gezet kunnen worden.
	 * @ensure stack.size() == 1 && heapSize == 0
	 *
	 */
	public HeapManager() {
		stack = new Stack<Vector<HeapEntry>>();
		heapSize = 0;
		openScope();
	}
	
	/**
	 * Voegt een nieuwe heapvariabele toe met woord grootte s
	 * @param s de woord grootte van de nieuwe variabele.
	 * @return int: het begin adres van de nieuwe variabele
	 * @ensure heapSize = heapSize + s
	 */
	public int enter(int s) {
		int oldSize = heapSize;
		HeapEntry e = new HeapEntry(heapSize,s);
		stack.peek().add(e);
		heapSize = heapSize + s;
		return oldSize;
	}
	
	/**
	 * Zoekt aan de hand van het adres de woordgrootte van een variabele op
	 * @param a het begin adres van de variabele.
	 * @return int: de woordgrootte van de variabele.
	 */
	public int getSize(int a) {
		int result = -1;
		for(Vector<HeapEntry> m : stack) {
    		for(HeapEntry e : m) {
    			 if(e.getAddr() == a) {
    				 result = e.getSize();
    				 break;
    			 }
    		}
    	}
    	return result;
	}
	
	/**
	 * Opent een nieuwe scope, de heapvariabelen die vanaf nu worden gedeclareerd komen in een nieuwe
	 * vector.
	 * @ensure old.stack.size() + 1 == new.stack.size()
	 *
	 */
	public void openScope() {
        stack.push(new Vector<HeapEntry>());
	}
	
	/**
	 * Sluit de scope heap variabelen worden vanaf nu op een lagere scope gedeclareerd.
	 * Omdat de primitieve dispose routine niet geimplementeerd is in de TAM.Interpreter worden
	 * de bijbehorende instructies niet op de CodeStack gezet.
	 * Heap variabelen worden dus nooit verwijderd van de heap.
	 * @param codes: CodeStack waarop instructies gezet worden.
	 * @param register: String die bijhoudt waar ze op de codestack gezet worden.
	 * @require codes != null
	 * @ensure old.stack.size -1 == new.stack.size()
	 */
	public void closeScope(CodeStack codes) {
		for(HeapEntry e : stack.peek()) {
			//codes.emit("LOADL "+e.getSize(),"Load heap var size");		
			//codes.emit("LOADA "+e.getAddr()+"[HT]","Load heap var addr");	
			//codes.emit("CALL dispose","dispose heap var");			
		}
		stack.pop();
	}
}