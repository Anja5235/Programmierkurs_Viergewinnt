package Heimaufgabe_Blatt9_Programmierprojekt;
import Heimaufgabe_Blatt9_Programmierprojekt.Bord;
import Heimaufgabe_Blatt9_Programmierprojekt.Color;
import Heimaufgabe_Blatt9_Programmierprojekt.ColumnFullException; 

/** beatrix.flach@tu-clausthal.de  
 * Vorname: Beatrix  
 * Nachname: Flach
 * 
 * anna.kolosova@tu-clausthal.de
 * Vorname: Anna
 * Nachname: Kolosova
 */


/**
 * @version Programmieraufgabe 3 Spielablauf
 * @author Bea und Anna
 */

/** Erst das neue Bord erstellen, dann mit try-catch block die Werte eintragen. */
/*
public class Main {

	public static void main(String[] args) throws IllegalMoveException {
		Bord myBord = new Bord();
		try {
		myBord.dropToken(Bord.getToken(Color.YELLOW), Color.YELLOW, 2);
		myBord.dropToken(Bord.getToken(Color.YELLOW), Color.YELLOW, 3);
		myBord.dropToken(Bord.getToken(Color.YELLOW), Color.YELLOW, 4);
		myBord.dropToken(Bord.getToken(Color.YELLOW), Color.YELLOW, 5);
		myBord.dropToken(Bord.getToken(Color.RED), Color.RED, 6);
		myBord.dropToken(Bord.getToken(Color.RED), Color.RED, 2);
		myBord.dropToken(Bord.getToken(Color.YELLOW), Color.YELLOW, 4);
		myBord.dropToken(Bord.getToken(Color.RED), Color.RED, 4);
		myBord.dropToken(Bord.getToken(Color.RED), Color.RED, 5);
		myBord.dropToken(Bord.getToken(Color.RED), Color.RED, 6);
		myBord.dropToken(Bord.getToken(Color.RED), Color.RED, 6);
		myBord.dropToken(Bord.getToken(Color.YELLOW), Color.YELLOW, 6);
		System.out.println(myBord.toString());
		System.out.println("Der Gewinner ist:");
		System.out.println(myBord.testVictory());
		}
		catch(ColumnFullException e) {
		}
		//2.Bsp
		Bord myBord2 = new Bord();
		try {
			myBord2.dropToken(Bord.getToken(Color.YELLOW), Color.YELLOW, 0);
			myBord2.dropToken(Bord.getToken(Color.RED), Color.RED, 1);
			myBord2.dropToken(Bord.getToken(Color.YELLOW), Color.YELLOW, 2);
			myBord2.dropToken(Bord.getToken(Color.RED), Color.RED, 2);
			myBord2.dropToken(Bord.getToken(Color.RED),Color.RED,3);
			myBord2.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,4);
			myBord2.dropToken(Bord.getToken(Color.RED), Color.RED,4);
			myBord2.dropToken(Bord.getToken(Color.RED),Color.RED,4);
			myBord2.dropToken(Bord.getToken(Color.RED),Color.RED,4);
			myBord2.dropToken(Bord.getToken(Color.RED),Color.RED,4);
			myBord2.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,5);
			myBord2.dropToken(Bord.getToken(Color.RED),Color.RED,5);
			myBord2.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,6);
			myBord2.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,6);
			myBord2.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,6);
			System.out.print("\n");
		    System.out.println(myBord2.toString());
		    System.out.println("Der Gewinner ist:");
		    System.out.println(myBord2.testVictory());
		}
		catch(ColumnFullException e) {
		}
		//3.Bsp
		
		Bord myBord3 = new Bord();
		
		try {
			myBord3.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,3);
			myBord3.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,3);
			myBord3.dropToken(Bord.getToken(Color.RED),Color.RED,3);
			myBord3.dropToken(Bord.getToken(Color.RED),Color.RED,3);
			myBord3.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,4);
			myBord3.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,4);
			myBord3.dropToken(Bord.getToken(Color.RED),Color.RED,4);
			myBord3.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,5);
			myBord3.dropToken(Bord.getToken(Color.RED),Color.RED,5);
			myBord3.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,5);
			myBord3.dropToken(Bord.getToken(Color.RED),Color.RED,6);	
			myBord3.dropToken(Bord.getToken(Color.RED),Color.RED,6);
			myBord3.dropToken(Bord.getToken(Color.RED),Color.RED,6);
			myBord3.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,6);
			System.out.print("\n");
		    System.out.println(myBord3.toString());
		    System.out.println("Der Gewinner ist:");
		    System.out.println(myBord3.testVictory());	
		}
		catch(ColumnFullException e) {
	}
	 // 4.Bsp (Programmieraufgabe 2 Gleichstand 9(h.) Erweiterung der main-Methode mit Ausgabe eines Spielfeldes
	
	Bord myBord4 = new Bord();
	
	try {
		for (int i = 0; i<3;i++) {
			myBord4.dropToken(Bord.getToken(Color.RED),Color.RED,i);
		}
		myBord4.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,3);
		for (int i = 4; i<7;i++) {
			myBord4.dropToken(Bord.getToken(Color.RED),Color.RED,i);
		}
		for (int i = 0; i<3;i++) {
			myBord4.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,i);
		}
		myBord4.dropToken(Bord.getToken(Color.RED),Color.RED,3);
		for (int i = 4; i<7;i++) {
			myBord4.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,i);
		}
		for (int i = 0; i<3;i++) {
			myBord4.dropToken(Bord.getToken(Color.RED),Color.RED,i);
		}
		
		myBord.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,3);
		for (int i = 4; i<7;i++) {
			myBord4.dropToken(Bord.getToken(Color.RED), Color.RED,i);
		}		
		for (int i = 0; i<3;i++) {
			myBord4.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,i);
		}
		myBord.dropToken(Bord.getToken(Color.RED),Color.RED,3);	
		for (int i = 4; i<7;i++) {
			myBord4.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,i);
		}
		for (int i = 0; i<3;i++) {
			myBord4.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,i);
		}
		myBord.dropToken(Bord.getToken(Color.RED),Color.RED,3);
		for (int i = 4; i<7;i++) {
			myBord4.dropToken(Bord.getToken(Color.YELLOW),Color.YELLOW,i);
		}	
	System.out.print("\n");
	System.out.println(myBord4.toString());
	System.out.println("Der Gewinner ist:");
	System.out.println(myBord4.testVictory());
	System.out.println(myBord4.isTie());
	}
	catch(ColumnFullException e) {
}
	
}
}
*/