package Heimaufgabe_Blatt9_Programmierprojekt;
import java.awt.*;
import javax.swing.*;
import java.net.*;
import java.awt.event.*;

/** beatrix.flach@tu-clausthal.de  
 * Vorname: Beatrix  
 * Nachname: Flach
 * 
 * anna.kolosova@tu-clausthal.de
 * Vorname: Anna
 * Nachname: Kolosova
 */  

/**Vier gewinnt - Aufgabe 10 - Spielablauf
 * Vier gewinnt - Aufgabe 11 - MVC-und-GUI
 * 15.07.2019
 * @author Anna
 * @author Beatrix
 * @version 4 (MVC-und-GUI)
 * Class VierGwewinntFrame (Programmieraufgabe 11(d.))
 * Grafische Oberfläche des Spiels
 */

public class VierGewinntFrame extends JFrame implements BordObserver  {
	Bord Bord1;
	ConsoleGame neuGame = new ConsoleGame(Bord1);
	JFrame newJFrame = new JFrame();
	JPanel panel = new JPanel();
	JButton[] button = new JButton[7];
	JLabel[] field = new JLabel[42];
    JLabel display;
    JPanel centerPanel;
    JMenuBar menu = new JMenuBar();
	JMenu option = new JMenu("Play");
	JMenuItem neuItem;
	public Icon a;
    public Icon b;
    
    public VierGewinntFrame () {
	neuItem = new JMenuItem ("Start neu play");
	display = new JLabel("Player X starts");
	option.add(neuItem); 
	menu.add(option); 
	panel.setLayout(new FlowLayout(FlowLayout.LEFT));
	panel.add(menu);
	centerPanel = new JPanel();
    centerPanel.setLayout(new GridLayout(7,7));
	JPanel labelPanel = new JPanel();
	labelPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	labelPanel.add(display);
	for(int i = 0; i<42; i++)
	{
		field[i] = new JLabel();
		field[i].setBorder(BorderFactory.createLineBorder(java.awt.Color.BLUE));
		centerPanel.add(field[i]);
	}
}


public JButton getthisButton (int i)
  {
  return button[i];
  }

public void settheIcon (int i, int color)
{
 if(color == 0)
 field[i].setIcon(a);
 if(color==1)
 field[i].setIcon(b);
}


public void showDisplay(String string)
{
	display.setText(string);
}


	public void update(ObservableBord Bord) {	
	}
	public void setActionCommand () {
		
	}
	public void addButtonListener (ActionListener listener) {
		for (int i = 0; i < 7; i++)
		{
			button[i] = new JButton(a);
			button[i].addActionListener((ActionListener) this.neuGame);
			centerPanel.add(button[i]);
		}
	}
	
	public void deleteButtonListener (ActionListener listener) {
		{
		 for(int i = 0; i<7; i++)
          button[i].removeActionListener((ActionListener) neuGame);
			}
			
	}
	

	
}
