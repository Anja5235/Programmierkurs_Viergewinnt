package Heimaufgabe_Blatt9_Programmierprojekt;
/** beatrix.flach@tu-clausthal.de  
 * Vorname: Beatrix  
 * Nachname: Flach
 * 
 * anna.kolosova@tu-clausthal.de
 * Vorname: Anna
 * Nachname: Kolosova
 */  
/**
 * @author Bea und Anna
 */

public class ColumnFullException extends Exception {
	
	/** Gibt einen String aus, wenn eine Exception aufgerufen wird. */

	public ColumnFullException(String string) {
		System.out.println(string);
	}

}

