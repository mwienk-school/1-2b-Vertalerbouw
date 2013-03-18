package src.symbolTable;
import java.util.*;

/**
 * 
 * @author ?? gewijzigd door Jeroen && Kevin
 *
 * @param <Entry>
 */
public class SymbolTable<Entry extends IdEntry> {

	/**
	 * Het huidige scope level
	 * @invariant currentLevel >= -1 && currentLevel == currentLevel()
	 */
	private int currentLevel;
	
	/**
	 * De stack waarbij op elke index een HashMap zit die IdEntry's bijhoudt.
	 */
	private Stack<HashMap<String, Entry>> stack;
	
    /** 
     * Constructor. 
     * @ensure  this.currentLevel() == 0 && stack.size() == 1
     */
    public SymbolTable() { 
        currentLevel = -1;
        stack = new Stack<HashMap<String, Entry>>();
        openScope();
    }

    /** 
     * Opens a new scope. 
     * @ensure  this.currentLevel() == old.currentLevel()+1 &&
     * old.stack.size() +1 == new.stack.size()
     */
    public void openScope()  {
        currentLevel++;
        stack.push(new HashMap<String, Entry>());
    }

    /** 
     * Closes the current scope. All identifiers in 
     * the current scope will be removed from the SymbolTable.
     * @require old.currentLevel() > -1
     * @ensure  this.currentLevel() == old.currentLevel()-1 &&
     * old.stack.size() +1 == new.stack.size()
     */
    public void closeScope() {
    	currentLevel--;
    	stack.pop();
    }

    /** Returns the current scope level. */
    public int currentLevel() {
        return currentLevel;
    }    

    /** 
     * Enters an id together with an entry into this SymbolTable using the 
     * current scope level. The entry's level is set to currentLevel().
     * @require String != null && String != "" && entry != null
     * @ensure  this.retrieve(id).getLevel() == currentLevel() &&
     * old.stack.peek().size()
     * @throws  SymbolTableException when id is already declared on any level.
     */
    public void enter(String id, Entry entry) throws SymbolTableException {
    	Entry e = retrieve(id);
    	if(e == null) {
    		stack.peek().put(id, entry);	
    	}else {
    		throw new SymbolTableException("Identifier: "+id+" already declared on level "+entry.getLevel());
    	}
    	
    }

    
    /** 
     * Get the Entry corresponding with id whose level is the highest.
     * In other words, the method returns the Entry that is defined last.
     * @return  Entry of this id on the highest level
     *          null if this SymbolTable does not contain id 
     */
    public Entry retrieve(String id) {
    	Entry result = null;
    	for(HashMap<String, Entry> m : stack) {
    		for(Map.Entry<String, Entry> e : m.entrySet()) {
    			 if(e.getKey().equals(id)) {
    				 result = e.getValue();
    				 break;
    			 }
    		}
    	}
    	return result;
    }    
}
