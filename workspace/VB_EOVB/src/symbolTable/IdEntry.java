package symbolTable;

import myTree.*;

/**
 * Deze klasse houdt informatie bij van een gedeclareerde IDENTIFIER
 * @author Jeroen
 *
 */
public class IdEntry {
	
	/**
	 * Het scope level waarop de identifier gedeclareerd is
	 * @invariant level == getLevel() && level >= -1
	 */
    private int level = -1;
    
    /**
     * De MyTree die bij de identifier hoort
     * @invariant tree == getTree()
     */
	private MyTree tree = null;
	
	/**
	 * Boolean die bijhoudt of een variabele geinitialiseerd is.
	 * @invariant init == getInit()
	 */
    private boolean init = false;
	
    /**
     * Geeft het scope level waarop de identifier gedeclareerd is
     * @return int: level van de identifier
     * @ensure result == level
     */
    public int getLevel() { 
		return level;         
	}
	
    /**
     * Zet het scope level van de identifier
     * @require level >= 0
     * @ensure this.level == level
     * @param level int: level van de identifier
     */
    public void setLevel(int level) { 
		this.level = level;   
	}   
	
    /**
     * Geeft de MyTree waarbij deze identifier hoort
     * @ensure result == tree
     * @return MyTree: de MyTree van de identifier
     */
	public MyTree getTree() {
		return tree;
	}
	
	/**
	 * Zet de MyTree waarbij deze identifier hoort
	 * @param t de MyTree van deze Identifier
	 * @require t != null
	 * @ensure tree == t
	 */
	public void setTree(MyTree t) {
		tree = t;
	}
	
	/**
	 * Geeft een boolean terug als de variabele geinitialiseerd is
	 * @ensure result == init == (true als de variabele wel geinitialiseerd is || false als
	 * de variabele niet geinitialiseerd is.)
	 * @return boolean: init 
	 */
	public boolean getInit() {
		return init;
	}
	
	/**
	 * Zet init op true als de variabele wel geinitialiseerd is
	 * @ensure init = true
	 */
	public void setInit() {
		init = true;
	}
	
}
