package Heimaufgabe_Blatt9_Programmierprojekt;
import Heimaufgabe_Blatt9_Programmierprojekt.ConsolePlayer;
/** beatrix.flach@tu-clausthal.de  
 * Vorname: Beatrix  
 * Nachname: Flach
 * 
 * anna.kolosova@tu-clausthal.de
 * Vorname: Anna
 * Nachname: Kolosova
 */  
/**
 * @author Bea
 * @author Anna
 * Aufgabe 10 (f.)
 */
public class GameMain_Console extends ConsoleGame {
	public GameMain_Console(Bord Board) {
		super(Board);
	}
	
	public static void main(String[] args) {
		Bord newBord = new Bord();
		ConsolePlayer PlayerOne = new ConsolePlayer(Color.RED, newBord);
		ConsolePlayer PlayerTwo = new ConsolePlayer (Color.YELLOW, newBord);
		ConsoleGame CurrentGame = new ConsoleGame(newBord);
		CurrentGame.doGame(PlayerOne,PlayerTwo); 
                                           }
	
}