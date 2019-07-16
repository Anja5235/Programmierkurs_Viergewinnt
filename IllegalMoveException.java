package Heimaufgabe_Blatt9_Programmierprojekt;
/**beatrix.flacht@tu-clausthal.de  
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

public class IllegalMoveException extends Exception {
	/** Gibt einen String aus, wenn eine Exception aufgerufen wird. */
	public IllegalMoveException(String string) {
		System.out.println(string);
	}

}
