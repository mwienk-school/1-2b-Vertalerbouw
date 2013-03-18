package src.codeStack;

/**
 * Deze klasse houdt instructies bij.
 * @author Jeroen
 *
 */
public class CodeStack {

		/**
		 * Dit is een lijst met Strings, de index van de lijst komt overeen met het level
		 */
		private String stack;

		/**
		 * Construeert een nieuwe CodeStack
		 * @ensure stack.size() == 0
		 *
		 */
		public CodeStack() {
				stack = "";
		}

		/**
		 * Voegt de instructie toe
		 * @param s de Instructie
		 * @param c het commentaar
		 */
		public void emit(String s, String c) {

				//Voeg de instructie toe aan de string
				stack += String.format("%-30s; %-40s\n", s, c);
		}

		/**
		 * Print voor elke string in de instructie lijst zijn waarde
		 *
		 */
		public void dump() {
				System.out.println(stack);
		}
}
