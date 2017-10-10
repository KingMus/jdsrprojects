package cvs;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Haupt extends JPanel{

	int z�hler;
		
		public Haupt(){
	
			Laden.aktualisiereDaten();
			z�hler=Laden.getz�hler();
			this.addMouseListener(new Mouseklick());
	    	setFocusable(true);
	}
	
	public class Mouseklick extends MouseAdapter{
		public void mouseClicked(MouseEvent e){

			z�hler++;
			Laden.setWerte(z�hler);
			repaint();
			
		}
	}
			
			public void paint (Graphics g){
				
				g.setColor(Color.white);
				g.fillRect(0, 0, 700, 700);
				g.setColor(Color.black);
				g.drawString("So oft: "+z�hler,100,100);
				
			}

}

