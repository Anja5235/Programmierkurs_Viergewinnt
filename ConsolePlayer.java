package Heimaufgabe_Blatt9_Programmierprojekt;
import java.io.*;
/** beatrix.flach@tu-clausthal.de  
 * Vorname: Beatrix  
 * Nachname: Flach
 * 
 * anna.kolosova@tu-clausthal.de
 * Vorname: Anna
 * Nachname: Kolosova
 */  

/**Vier gewinnt - Aufgabe 10 - Spielablauf
 * 01.07.2019
 * @author Anna
 * @author Beatrix
 * @version 3 (Spielablauf)
 * Class ConsolePlayer erbt von Player (Programmieraufgabe 10(c.))
 */
public class ConsolePlayer extends Player {
	
	public ConsolePlayer(Color newColor, Bord BoardObjekt) { //Hier wird Instanz der Klasse Player erzeugt
		super(newColor, BoardObjekt);
	}
	public Color getColor (Player Player1) {
		return Player1.color;
	}
/**Aufgabe 10(c.)
 * Methode doTurn() wird hier implementiert
 * Der Nutzer wird nach seiner Eingabe gefragt. Danach wird entsprechend super.doDrop(input) aufgerufen;
 *@nethod doTurn()
 * @throws IllegalMoveException 
 * @throws ColumnFullException 
 * 
 * 
 */
	@Override
	public void doTurn (Player Player1, Player Player2, Bord Bord1) throws IOException {
	ConsolePlayer PlayerOne = (ConsolePlayer) Player1;
	ConsolePlayer PlayerTwo = (ConsolePlayer) Player2;
	PlayerOne = (ConsolePlayer) Player2;
	PlayerTwo = (ConsolePlayer) Player2;
	ConsolePlayer aktuellerPlayer;
	aktuellerPlayer = PlayerOne;
	BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));	//mit diesem Objekt vom Typ Buff.Reader kann man Konsoleeingaben einlesen
	int input;
	try {
	{
	    do {
		   if (getColor(aktuellerPlayer) == Color.RED) {
	           System.out.print("Spieler X, was ist dein nächster Zug, genauer gesagt, die Spalte?: "); //Der Player wird nach einer Eingabe gefragt
	        }
	       else                                        {
		   System.out.print("Spieler 0, was ist dein nächster Zug, genauer gesagt, die Spalte?: ");
	       input = Integer.parseInt(consoleReader.readLine());
	       super.doDrop(input, Bord1); 
	       }
		   }
		while (Winner.RED != null || Winner.YELLOW != null || Winner.TIE !=null); 
		   }
	}
	catch (NumberFormatException a)
	{
		System.err.println("Ungültiges Format der Eingabe, bitte nochmal");
	} 
	catch (ColumnFullException e) {
	}
	catch (IllegalMoveException e) {
	} 
}


}

