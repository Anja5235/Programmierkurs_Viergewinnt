package Heimaufgabe_Blatt9_Programmierprojekt;
import Heimaufgabe_Blatt9_Programmierprojekt.Token;
import Heimaufgabe_Blatt9_Programmierprojekt.Color;
import java.util.*;

/**Programmierafgabe (Part 2) Gleichstand
 * Programmieraufgabe (Part 3) Spielablauf
 * Programmieraufgabe (Part 4) - MVC-Muster und GUI
 * 05.07.2019
 */

/**beatrix.flach@tu-clausthal.de  
 * Vorname: Beatrix  
 * Nachname: Flach
 * 
 * anna.kolosova@tu-clausthal.de
 * Vorname: Anna
 * Nachname: Kolosova
 * @author Bea und Anna
 */

public class Bord extends GameObjekt{
	
	//Zeile/Spalte
	/** Neue Zelle erstellen*/
	Cell[][] myCell;

	/** Neue EnumMaps für Tokens von beiden Spielern erstellen - Programmieraufgabe 2(a.)*/
    static Map<Color, Token> TokenLagernfürSpieler1 = new EnumMap<Color,Token>(Color.class);
	static Map<Color, Token> TokenLagernfürSpieler2 = new EnumMap<Color,Token>(Color.class); 
	
	/** Wenn man einen Token benutzen kann, (überprüft mit canDrop) soll einer gespielt werden.
	 * @version Programmieraufgabe 2 Gleichstand
	 * @param token
	 * @param columnIndex
	 * @throws ColumnFullException
	 * @throws IllegalMoveException
	 */
	public void dropToken(Token token, Color color, int columnIndex) 
			throws ColumnFullException, IllegalMoveException {
		if(canDrop(columnIndex) == true) {
			for(int i=0; i< myCell.length ; i++) {
				if(myCell[i][columnIndex].getMyToken() == null) {
					myCell[i][columnIndex].setMyToken(new Token(color));
					return;
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
	 /** Das Bord initialisieren. */
	public Bord() {
		myCell = new Cell[6][7];
		for(int i = 0; i< myCell.length; i++) {
			//Länge der Spalte
			for(int k=0; k< myCell[i].length; k++) {
				myCell[i][k] = new Cell();
			}
		} 
		
	}
	/** Prüfen, ob die Zelle frei ist, damit man einen Token spielen kann.*/
	public boolean canDrop(int columnIndex) {
		for(int i=0; i< myCell.length ; i++) {
			if(myCell[i][columnIndex].getMyToken() == null) {
				return true;
			}
		}
		
		return false;
		
	}

	/** Gibt einen String aus */
	@Override
	public String toString() {
		String a = "";
		for(int i = myCell.length-1; i>=0 ; i--) {
			//Länge der Spalte
			for(int k=0; k< myCell[i].length; k++) {
				a = a + myCell[i][k].toString();
			}
			a = a + "\n";
		} 
		return a;
	}
	
	/** Gewinner ermitteln, wenn 4 Steine diagonal, senkrecht, waagerecht sind oder Gleichstand aufgetreten ist(2(e.).*/
	public Winner testVictory() {
		if(isRowVictory(Color.YELLOW)||isColumnVictory(Color.YELLOW) || isDiagonalVictory(Color.YELLOW)) {
			return Winner.YELLOW;
		}
		else if(isRowVictory(Color.RED)||isColumnVictory(Color.RED) || isDiagonalVictory(Color.RED)) {
			return Winner.RED;
		}
		else if(isTie()==true) { /**Programmieraufgabe 2(e.)Der Fall mit Gleichstand wird auch beachtet */
			return Winner.TIE;
		}
		else {
			return Winner.NONE;
		}
	}
	
	/**Die Methode prüft ob der Gleichstand der Tokens im Spiel aufgetreten ist - Programmieraufgabe 2(e.)*/
	boolean isTie () {
	    if ((countTokens(Color.RED)== (countTokens(Color.YELLOW)))) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	    }
		
	/**Methode countTokens zählt Anzahl der von jeder Farbe gesetzten Tokens
	 * @param color
	 */
		public int countTokens(Color color) {
			int numberofTokens=0;
				for (int i=0; i<myCell.length; i++)
				{
					for (int j=0; j<myCell[i].length;j++) 
				{
					if(myCell[i][j] != null)
					{
					numberofTokens++; 
					}
				}
				}
				return numberofTokens;
			}	
	
	/** Es wird Reihenweise pro Spalte durchlaufen. */
	private boolean isRowVictory(Color color) {
		int won = 0;		
		for(int i = 0; i< myCell.length; i++) {
			//Länge der Spalte
			for(int k=0; k< myCell[i].length; k++) {
				if(myCell[i][k].getMyToken() != null) {
					if(myCell[i][k].getMyToken().getMeColor() == color) {
						won = won +1;
						if(won == 4) {
							return true;
						}
					} else {
						won = 0;
					}
				}else {
					won = 0;
				}
					
			}
			won = 0;
		}
		return false;
	}
	
	/** Es wird erst die eine Schräge und danach die andere Schräge geprüft. */
	private boolean isDiagonalVictory(Color color) {
		int won = 0;
		for(int k = -myCell[0].length; k< myCell[0].length; k++) {
			//Länge der Spalte
			for(int i=0; i< myCell.length; i++) {
				if((i+k)>=0 && (i+k)<myCell.length) {
					if(myCell[i][k+i].getMyToken() != null) {
						if(myCell[i][k+i].getMyToken().getMeColor() == color) {
							won = won +1;
							if(won == 4) {
								return true;
							}
						} else {
							won = 0;
						}
					}else {
						won = 0;
					}	
				}else {won=0;}
			}
				won = 0;
		}
		won=0;
		for(int k = myCell[0].length+myCell[0].length; k>=0; k--) {
			//Länge der Spalte
			for(int i=0; i< myCell.length; i++) {
				if((k-i)>=0 && (k-i)<myCell[0].length) {
					if(myCell[i][k-i].getMyToken() != null) {
						if(myCell[i][k-i].getMyToken().getMeColor() == color) {
							won = won +1;
							if(won == 4) {
								return true;
							}
						} else {
							won = 0;
						}
					}else {
						won = 0;
					}	
				}else {won=0;}
			}
				won = 0;
		}
		return false;
	}
	 
	/** Es wird Spaltenweise pro Zeile durchlaufen. */
	private boolean isColumnVictory(Color color) {
		int won = 0;
		for(int k = 0; k< myCell[0].length; k++) {
			//Länge der Spalte
			for(int i=0; i< myCell.length; i++) {
				if(myCell[i][k].getMyToken() != null) {
					if(myCell[i][k].getMyToken().getMeColor() == color) {
						won = won +1;
						if(won == 4) {
							return true;
						}
					} else {
						won = 0;
					}
				}else {
					won = 0;
				}		
			}
				won = 0;
		}
		return false;
	}
	
/**Die Methode getToken entfernt einen Token dieser Farbe aus dem Lager und liefert diesen zurück (Aufgabe 2 c.) 
 * @param color
 */
	 public static Token getToken (Color color) {
		if (color == Color.RED)  {               
			TokenLagernfürSpieler1.remove(color);
		}
		else {
			TokenLagernfürSpieler2.remove(color);
		}
		return (new Token(color));
	 }
	 
/**Die Methode hasToken erhält als Parameter eine Farbe und liefert zurück ob es noch Steine dieser Farbe im Lager gibt 
 * @param color
 * */
	 public Color hasToken (Color color) {
		 boolean Statusvariable1 = true;
		 boolean Statusvariable2 = true;
		 if (color == Color.RED)  {
				if (TokenLagernfürSpieler1.isEmpty()) {
					System.out.println("There are no more RED-Tokens");
					Statusvariable1 = false;
				}
				if (TokenLagernfürSpieler2.isEmpty()) {
					System.out.println("There are no more YELLOW-Tokens");
					Statusvariable2 = false;
				}
			}
		return color;
	 }
/**Die Methode getTokenColor (Aufgabenblatt 11 (b.) wird genutzt um später in der View Spielsteine mit der korrekten Farbe anzuzeigene
 * @method getTokenColor
 * @param row
 * @param column
 * @return
 */
	 public Color getTokenColor (int row, int column) {
		 Color variable = Color.RED;
		 if(myCell[row][column].getMyToken() == null) {
		 return null;
		 }
		 else return variable; 
	 }
}
	 
	 