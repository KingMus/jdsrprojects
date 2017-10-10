package Klassen;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Fussball extends JPanel{
	
	boolean weiter=true;
	int key;
	int bm=1;
	private Verein Verein;
	
	 private MyActionListener a1=new MyActionListener();
	 
	 
		
	  

		public Fussball(){
	
			this.addMouseListener(new Mouseklick());
	    	addKeyListener(new Al());
	    	setFocusable(true);
	    	
	    	Verein= new Verein();
	    	Verein.setzeEigenschaften("FC Barcelona",1899,"Spanien",22,26,4,1);
	    	
	    	
	    	
	    	
	    	
	}
	

	public class Mouseklick extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			
			if(e.getX()>10 && e.getX()<60 && e.getY()>10 && e.getY()<60 && bm==1){
				Verein.setzeEigenschaften("FC Barcelona",1899,"Spanien",22,26,4,1);
				bm=2;
				repaint();
			}
			
			if(e.getX()>10 && e.getX()<60 && e.getY()>70 && e.getY()<120 && bm==1){
				Verein.setzeEigenschaften("Real Madrid CF",1902,"Spanien",32,18,9,2);
				bm=2;
				repaint();
			}
			
			if(e.getX()>10 && e.getX()<60 && e.getY()>130 && e.getY()<180 && bm==1){
				Verein.setzeEigenschaften("Manchester United",1878,"England",20,11,3,3);
				bm=2;
				repaint();
			}
			
			if(e.getX()>10 && e.getX()<60 && e.getY()>190 && e.getY()<240 && bm==1){
				Verein.setzeEigenschaften("FC Bayern München",1900,"Deutschland",22,16,5,4);
				bm=2;
				repaint();
			}
			
			if(e.getX()>70 && e.getX()<120 && e.getY()>10 && e.getY()<60 && bm==1){
				Verein.setzeEigenschaften("Chelsea FC",1905,"England",4,7,1,5);
				bm=2;
				repaint();
			}
			
			if(e.getX()>70 && e.getX()<120 && e.getY()>70 && e.getY()<120 && bm==1){
				Verein.setzeEigenschaften("Milan AC",1899,"Italien",18,5,7,6);
				bm=2;
				repaint();
			}
			
			if(e.getX()>70 && e.getX()<120 && e.getY()>130 && e.getY()<180 && bm==1){
				Verein.setzeEigenschaften("Arsenal FC",1886,"England",13,10,0,7);
				bm=2;
				repaint();
			}
			
			if(e.getX()>70 && e.getX()<120 && e.getY()>190 && e.getY()<240 && bm==1){
				Verein.setzeEigenschaften("FC Porto",1893,"Portugal",27,16,2,8);
				bm=2;
				repaint();
			}
			
			if(e.getX()>130 && e.getX()<180 && e.getY()>10 && e.getY()<60 && bm==1){
				Verein.setzeEigenschaften("Inter Mailand",1908,"Italien",18,7,3,9);
				bm=2;
				repaint();
			}
			
			if(e.getX()>130 && e.getX()<180 && e.getY()>70 && e.getY()<120 && bm==1){
				Verein.setzeEigenschaften("Valencia CF",1919,"Spanien",6,0,0,10);
				bm=2;
				repaint();
			}
			
			if(e.getX()>130 && e.getX()<180 && e.getY()>130 && e.getY()<180 && bm==1){
				Verein.setzeEigenschaften("Liverpool FC",1892,"England",18,7,5,11);
				bm=2;
				repaint();
			}
			
			if(e.getX()>130 && e.getX()<180 && e.getY()>190 && e.getY()<240 && bm==1){
				Verein.setzeEigenschaften("Juventus FC",1897,"Italien",29,9,2,12);
				bm=2;
				repaint();
			}
			
			if(e.getX()>190 && e.getX()<240 && e.getY()>10 && e.getY()<60 && bm==1){
				Verein.setzeEigenschaften("SL Benfica",1904,"Portugal",32,27,2,13);
				bm=2;
				repaint();
			}
			
			if(e.getX()>190 && e.getX()<240 && e.getY()>70 && e.getY()<120 && bm==1){
				Verein.setzeEigenschaften("Olympique Lyonnais",1950,"Frankreich",7,5,0,14);
				bm=2;
				repaint();
			}
			
			if(e.getX()>190 && e.getX()<240 && e.getY()>130 && e.getY()<180 && bm==1){
				Verein.setzeEigenschaften("Atletico de Madrid",1903,"Spanien",9,10,1,15);
				bm=2;
				repaint();
			}
			
			if(e.getX()>190 && e.getX()<240 && e.getY()>190 && e.getY()<240 && bm==1){
				Verein.setzeEigenschaften("PSV Eindhoven",1913,"Niederlande",21,9,1,16);
				bm=2;
				repaint();
			}
			
			if(e.getX()>250 && e.getX()<300 && e.getY()>10 && e.getY()<60 && bm==1){
				Verein.setzeEigenschaften("FC Shakhtar Donetsk",1936,"Ukraine",8,9,0,17);
				bm=2;
				repaint();
			}
			
			if(e.getX()>250 && e.getX()<300 && e.getY()>70 && e.getY()<120 && bm==1){
				Verein.setzeEigenschaften("BV Borussia Dortmund",1909,"Deutschland",8,3,1,18);
				bm=2;
				repaint();
			}
			
			if(e.getX()>250 && e.getX()<300 && e.getY()>130 && e.getY()<180 && bm==1){
				Verein.setzeEigenschaften("FC Schalke",1904,"Deutschland",0,4,0,19);
				bm=2;
				repaint();
			}
			
			if(e.getX()>250 && e.getX()<300 && e.getY()>190 && e.getY()<240 && bm==1){
				Verein.setzeEigenschaften("AS Rom",1927,"Italien",3,9,0,20);
				bm=2;
				repaint();
			}
			
			

			
		}
	}
	
	public class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			
		}
		}
	
	public class Al extends KeyAdapter {
		 
	    public Al(){
	     
	}
	    public void keyPressed(KeyEvent e){
	        
	        key = e.getKeyCode();
	        
	        if(key==KeyEvent.VK_SPACE){
	        	bm=1;
	        	repaint();
	        }
	        
	        
	    }
	}


			
			public void paint (Graphics g){
				
			g.setColor(Color.yellow);
			g.fillRect(0, 0, 320, 280);
			
			if(bm==1){
			
			g.setColor(Color.black);
			g.drawRect(10,10,50,50);
			g.drawRect(10,70,50,50);
			g.drawRect(10,130,50,50);
			g.drawRect(10,190,50,50);
			
			g.drawRect(70,10,50,50);
			g.drawRect(70,70,50,50);
			g.drawRect(70,130,50,50);
			g.drawRect(70,190,50,50);
			
			g.drawRect(130,10,50,50);
			g.drawRect(130,70,50,50);
			g.drawRect(130,130,50,50);
			g.drawRect(130,190,50,50);
			
			g.drawRect(190,10,50,50);
			g.drawRect(190,70,50,50);
			g.drawRect(190,130,50,50);
			g.drawRect(190,190,50,50);
			
			g.drawRect(250,10,50,50);
			g.drawRect(250,70,50,50);
			g.drawRect(250,130,50,50);
			g.drawRect(250,190,50,50);
			
			Font arial = new Font("Arial",Font.BOLD,40);
			g.setFont(arial);
			
			g.drawString("1",25,50);
			g.drawString("5",85,50);
			g.drawString("9",145,50);
			g.drawString("13",195,50);
			g.drawString("17",255,50);
			
			g.drawString("2",25,110);
			g.drawString("6",85,110);
			g.drawString("10",135,110);
			g.drawString("14",195,110);
			g.drawString("18",255,110);
			
			g.drawString("3",25,170);
			g.drawString("7",85,170);
			g.drawString("11",135,170);
			g.drawString("15",195,170);
			g.drawString("19",255,170);
			
			g.drawString("4",25,230);
			g.drawString("8",85,230);
			g.drawString("12",135,230);
			g.drawString("16",195,230);
			g.drawString("20",255,230);}
			
			if(bm==2){
				Verein.malen(g);
			}
				
				
			}

}

