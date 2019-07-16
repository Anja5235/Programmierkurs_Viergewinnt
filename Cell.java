package Heimaufgabe_Blatt9_Programmierprojekt;

import Heimaufgabe_Blatt9_Programmierprojekt.GameObjekt;
import Heimaufgabe_Blatt9_Programmierprojekt.Token;

/* beatrix.flacht@tu-clausthal.de  
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

/** Die Zelle kann mit einem Token befüllt werden.*/
public class Cell extends GameObjekt {
	
	private Token myToken;
	public Token getMyToken() {
		return myToken;
	}
	public void setMyToken(Token myToken) {
		this.myToken = myToken;
	}

	@Override
	public String toString() {
		if(myToken == null) {
			return "[ ]";
		}
		return "[" + myToken.toString() + "]";
	}
	

}
