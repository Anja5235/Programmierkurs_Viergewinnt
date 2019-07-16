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
 *
 * @author Anna
 * @author Beatrix
 *Class ConsoleGame - Aufgabe 10(e.)
 */
public class ConsoleGame extends Game {
	public ConsoleGame(Bord Bord1) {
		super(Bord1);
	}
/**Aufgabe 10(e.)
 * @method doGame
 * @param Player1
 * @param Player2
 * In der Methode werden Spieler gespeichert und ein aktueller Spieler ausgewählt
 * @throws IOException 
 */
    public void doGame (Player Player1, Player Player2) {
    ConsolePlayer PlayerOne = new ConsolePlayer(Color.RED, Bord1);
	ConsolePlayer PlayerTwo = new ConsolePlayer(Color.YELLOW, Bord1);	
	PlayerOne = (ConsolePlayer) Player1;
	PlayerTwo = (ConsolePlayer) Player2;
	aktuellerPlayer = PlayerOne;
	do   {
			try {
				aktuellerPlayer.doTurn(PlayerOne, PlayerTwo, Bord1);
				System.out.println(Bord1.toString());
		        System.out.println("Der Gewinner ist:");
		        System.out.println(Bord1.testVictory());
		        swapPlayer();
			    }
		        catch (IOException e) {
			    e.printStackTrace();
			    }
	       }
	while (Winner.RED != null || Winner.YELLOW != null || Winner.TIE != null) ; 
}	
}