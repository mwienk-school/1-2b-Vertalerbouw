package heapManager;

/**
 * Deze klasse houdt voor elke variabele in de heap de grootte en het adres bij.
 * Hoewel elke nieuwe variabele op 0[HT] wordt gezet, kan het adres gezien worden 
 * als een unieke waarde voor een variabele.
 * @author Jeroen
 */
public class HeapEntry {

	/**
	 * Het adres van de heap variabele
	 * @invariant: addr == getAddr() && addr >=0;
	 */
	private int addr;
	
	/**
	 * De grootte (in woorden) van de heap variabele
	 * @invariant: size == getSize();
	 */
	private int size;
	
	/**
	 * Construeert een HeapEntry
	 * @param a het adres
	 * @param s de grootte
	 * @ensure addr == a && size = s
	 */
	public HeapEntry(int a, int s) {
		addr = a;
		size = s;
	}	
	
	/**
	 * Geeft de grootte
	 * @ensure result == size
	 * @return de grootte
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * Geeft het adres
	 * @ensure result == addr;
	 * @return het adres
	 */
	public int getAddr() {
		return addr;
	}
	
}