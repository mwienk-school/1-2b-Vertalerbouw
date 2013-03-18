package errorReporter;

import java.util.*;
import grammar.*;

/**
 * Deze klasse houdt in een vector alle niet kritieke exceptions bij.
 * Niet kritiek wil zeggen dat de Checker niet stopt bij exception die in
 * deze klasse gezet worden.
 * @author Jeroen
 *
 */
public class ErrorReporter {
	
	/**
	 * Vector met GrammarExceptions
	 */
	private Vector<GrammarException> exceptionVector;

	/**
	 * Maakt een ErrorReporter
	 * @ensure exceptionVector.size() == 0
	 */
	public ErrorReporter(){
		exceptionVector = new Vector<GrammarException>();
	}

	/**
	 * Voegt een GrammarException toe
	 * @require e != null
	 * @param e de GrammarException
	 */
	public void addException(GrammarException e){
		exceptionVector.add(e);
	}

	/**
	 * Print op elke regel een niet kritieke exception
	 */
	public void printExceptions(){
		for(GrammarException e : exceptionVector){
			System.err.println(e);
		}
	}
	
	/**
	 * Geeft het aantalexceptions
	 * @ensure result == exceptionVector.size()
	 * @return de grootte van exceptionVector
	 */
	public int countExceptions() {
		return exceptionVector.size();
	}
}
