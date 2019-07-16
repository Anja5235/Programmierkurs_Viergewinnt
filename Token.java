package Heimaufgabe_Blatt9_Programmierprojekt;
import Heimaufgabe_Blatt9_Programmierprojekt.Color;
/* beatrix.flacht@tu-clausthal.de  
 * Vorname: Beatrix  
 * Nachname: Flach
 * 
 * anna.kolosova@tu-clausthal.de
 * Vorname: Anna
 * Nachname: Kolosova
 */ 

/**
 * 
 * @author Bea und Anna
 *  
 */
public class Token extends GameObjekt {
	public Color meColor;
	public Color getMeColor() {
		return meColor;
	}
	public void setMeColor(Color meColor) {
		this.meColor = meColor;
	}
	public Token(Color myColor) {
		this.meColor = myColor;
	}
	
	/** Bei gelb O bei rot X sonst nichts */
	@Override
	public String toString() {
		if(meColor == null) {
			return " ";
		}
		else if(meColor == Color.YELLOW) {
			return "O";
		}
		else if (meColor == Color.RED){
			return "X";
		}
		else {
			return " ";
		}
		
	}
	
	


	

}
