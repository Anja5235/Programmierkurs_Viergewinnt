package Heimaufgabe_Blatt9_Programmierprojekt;
import java.util.Observable;
import java.util.Observer;

/** beatrix.flach@tu-clausthal.de  
* Vorname: Beatrix  
* Nachname: Flach
* 
* anna.kolosova@tu-clausthal.de
* Vorname: Anna
* Nachname: Kolosova
* Vier gewinnt - Aufgabe 10 - Spielablauf
* Vier gewinnt - Aufgabe 11 - MVC- und-GUI
* 15.07.2019
* @author Anna
* @author Beatrix
* @version 4
*/

/**@class ObservableBord (Programmieraufgabe 11(c.))
*/
public class ObservableBord extends Bord implements BordObserver {
	public void addObserver(Observable o) {
	   o.addObserver((Observer) this);
	}
	public void removeObserver() {
    }
	public void notifyObserver() {
	}
	public void update(ObservableBord Bord) {
		// TODO Auto-generated method stub	
	}
}