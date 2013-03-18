package src.register;

import src.myTree.MyTree;

public final class Register {
	
	//String representaties van registers
	public final static String SB = "[SB]";
	public final static String LB = "[LB]";
	public final static String L1 = "[L1]";
	public final static String L2 = "[L2]";
	public final static String L3 = "[L3]";
	public final static String L4 = "[L4]";
	public final static String L5 = "[L5]";
	public final static String L6 = "[L6]";
	
	/**
	 * Verwijderd de "[" en de "]" aan het begin en eind van de registerwaarde reg
	 * @param reg het register
	 * @return String: het register zonder "[" en "]"
	 */
	public final static String removeB(String reg) {
		return reg.charAt(1)+""+reg.charAt(2);
	}
	
	/**
	 * Geeft het register wanneer bij een functie aanroep de bijbehorende static link gegeven moet worden
	 * @param isInMethod bool die aangeeft of het in een method zit
	 * @return String: het register
	 */
	public final static String getCallRegister(boolean isInMethod) {
			if(isInMethod) {
					return LB;
			}else {
					return SB;
			}
	}
	
	/**
	 * Geeft het register waarin de variabele staat.
	 * Deze methode werkt nog niet geheel correct, deze methode geeft niet altijd de correcte waarde terug.
	 * Zie het verslag voor meer details
	 * @param level het level waarin deze aangeroepen wordt
	 * @param decLevel het level waarin de variabele gedeclareerd is
	 * @return String: het register
	 */
	public final static String getVarRegister(boolean isInMethod) {
			if(isInMethod) {
					return LB;
			}else {
					return SB;
			}
	}
}
