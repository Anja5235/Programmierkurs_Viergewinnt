package Heimaufgabe_Blatt9_Programmierprojekt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


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

/**@class FramePlayer (Programmieraufgabe 11(e.))
*/
public class FramePlayer extends Player implements ActionListener {
    VierGewinntFrame newFrame;
	public FramePlayer(Color newColor, Bord BoardObjekt, VierGewinntFrame newFrame) {
		super(newColor, BoardObjekt);
	}
	public void doTurn() throws IOException {
	}
	
	ActionListener listener =  new ActionListener() {
		
	  public void actionPerformed(ActionEvent e) {
	     Object object = ae.getSource();
	     if(object == neuItem)
				{
	             for(int i = 0; i<7; i++)
	             {
				  button[i].removeActionListener(game);
				  button[i].addActionListener(game);
				 }
	             for(int i = 0; i<42; i++)
	             {
	             field[i].setIcon(null);
	             }
				 }
	      neuItem.addActionListener(listener);
	      setSize(347,409);
	      }
	     };

		@Override
		public void doTurn(Player Player1, Player Player2, Bord BordObjekt) throws IOException {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}
}
