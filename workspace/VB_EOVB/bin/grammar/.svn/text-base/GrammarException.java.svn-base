package src.grammar;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.*;

/**
 * Deze klasse breidt RecognitionException uit een GrammarException treedt op wanneer er in de checker
 * iets niet goed gaat
 * @author Jeroen
 *
 */
public class GrammarException extends RecognitionException {
	
	/**
	 * Het bericht
	 * @ensure msg = getMessage()
	 */
    private String msg;
    public static final long serialVersionUID = 24162462L; // for Serializable
    
    /**
     * Construeert een GrammarException
     * @ensure this.msg = msg
     * @param msg String: de foutmelding
     */
    public GrammarException(String msg) {
        super();
        this.msg = msg;
    }

    /**
     * @require tree != null
     * @param tree de MyTree
     * @param msg het bericht
     */
    public GrammarException(Tree tree, String msg) {
        super();
        int column = tree.getCharPositionInLine()+1;
        this.msg = "("+tree.getText() + 
                   ") on line:" + tree.getLine() + 
                   " column:" + column + 
                   " " + msg;
    }

    /**
     * Geeft het bericht
     * @return
     */
    public String getMessage() {
        return msg;
    }
}
