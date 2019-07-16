package Heimaufgabe_Blatt9_Programmierprojekt;
import java.io.IOException;
import Heimaufgabe_Blatt9_Programmierprojekt.Bord;
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
/**Vier gewinnt - Spielablauf
 * Vorname:  Anna
 * Nachname: Kolosova
 * 476038
 * E-Mail: anna.kolosova@tu-clausthal.de
 * @author Beatrix
 * @author Anna
 *
 */
/**Aufgabe 10(b.)
 * Eine abstrakte Klasse Player nimmt Nutzereingaben ein und setzt die um
 *@class Player
 *@param color
 */
public abstract class Player {
	public Color color;
	int columnIndex;
	Bord Bord1;
	public Player (Color newColor, Bord BoardObjekt) { //Konstruktor von der Klasse Player mit Farbe und Bord-Objekt als Parametern
		this.color = newColor;
		this.Bord1 = BoardObjekt;
	}
	
/**Aufgabe 10(b.)
 * In der Methode doDrop wird ein farblich passender Spielstein Token aus dem Brett genommen und in die Spalte gelegt
 * @method doDrop 
 * @param ColumnIndex
 */
	protected void doDrop(int ColumnIndex, Bord Bord1) throws ColumnFullException, IllegalMoveException {
		if(Bord1.canDrop(columnIndex) == true) {
			for(int i=0; i< Bord1.myCell.length; i++) {
				if(Bord1.myCell[i][columnIndex].getMyToken() == null) {
					Bord1.myCell[i][columnIndex].setMyToken(new Token(color));
					}
			}
		}
		else {
			throw new ColumnFullException("Spalte voll!");
		}
		if (Winner.RED != null || Winner.YELLOW != null || Winner.TIE !=null) { //Nach dem Sieg ist kein weiterer Spielzug möglich
			throw new IllegalMoveException("Kein weiterer Spielzug ist möglich"); //*Aufgabe 9(f.) Nach einem Sieg dürfen keine Steine mehr eingeworfen werden */
		}
	}
				
/** Aufgabe 10(b.)
 * Methode doTurn() - abstrakte Methode fragt den Spieler nach seiner gewünschten Aktion, und diese Aktion wird dann ausgeführt
 * @method doTurn();
 * @throws IOException 
 */	
	public abstract void doTurn(Player Player1, Player Player2, Bord BordObjekt) throws IOException;

public void doTurn(Player Player1, Player Player2) throws IOException {
	// TODO Auto-generated method stub
	
}
	
}

