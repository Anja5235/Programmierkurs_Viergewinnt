package Heimaufgabe_Blatt9_Programmierprojekt;
/** beatrix.flach@tu-clausthal.de  
 * Vorname: Beatrix  
 * Nachname: Flach
 * 
 * anna.kolosova@tu-clausthal.de
 * Vorname: Anna
 * Nachname: Kolosova
 */

import java.io.IOException;

/**Vier gewinnt - Aufgabe 10 - Spielablauf
 * 01.07.2019
 * @author Anna
 * @author Beatrix
 * @version 3 (Spielablauf)
 * Abstract class Game (Programmieraufgabe 10(d.))
 * Class Game führt den eigentlichen Spielablauf durch
 */
public abstract class Game  {
    Bord Bord1;
    ConsolePlayer Player1 = new ConsolePlayer(Color.RED,Bord1);
    ConsolePlayer Player2 = new ConsolePlayer (Color.YELLOW, Bord1);
    ConsolePlayer aktuellerPlayer; //Möglichkeit zu speichern welcher der beiden Spielern gerade dran ist
	public Game(Bord Board) {
		this.Bord1 = Board;
}
	/** Aufgabe 10(d.)
 * Methode doGame
 * Die abstrakte Methode doGame definiert den eigentlichen Spielablauf - durch Unterklassen
 * @method doGame
 * @param Player1
 * @param Player2
 * @throws IOException 
 */
	public abstract void doGame (Player Player1, Player Player2); 
	
/**Aufgabe 10(d.)
 * Methode swapPlayer
 * Die Methode wechselt den aktuellen Spieler
 * @method swapPlayer
 */
	protected void swapPlayer () {
		if (aktuellerPlayer == Player1) {
			aktuellerPlayer = Player2;
		}
		else {
			aktuellerPlayer = Player1;
		}
}
	

	
}
