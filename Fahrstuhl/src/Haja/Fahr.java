package Haja;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Fahr extends JPanel implements Runnable{
	
	boolean weiter=true,fahrenrunter=false,fahrenhoch=false;
	int key;
	int ky=270,grenze=275;
	private String zustand="Lift im EG";
	private String eingabe="EG";
	
	Image Fahrstuhl,Haus;
	
	
		public Fahr(){
			
			ImageIcon bild1 = new ImageIcon(getClass().getResource("icon_aufzug.gif"));
			Fahrstuhl = bild1.getImage();	
			
			ImageIcon bild2 = new ImageIcon(getClass().getResource("Stockwerke.png"));
			Haus = bild2.getImage();	

			this.addMouseListener(new Mouseklick());
	    	setFocusable(true);
	    	startanimation();
	}
	


		public class Mouseklick extends MouseAdapter{
			public void mouseClicked(MouseEvent e){
				
	            if(e.getX()>45 && e.getY()>155 && e.getX()<75 && e.getY()<175){
	            	eingabe="UG";
	            	zustandWechseln(eingabe);
				}
	            if(e.getX()>45 && e.getY()>275 && e.getX()<75 && e.getY()<295){
	            	eingabe="EG";
	            	zustandWechseln(eingabe);
				}
	            if(e.getX()>45 && e.getY()>395 && e.getX()<75 && e.getY()<415){
	            	eingabe="OG";
	            	zustandWechseln(eingabe);
				}
			}
		}

	public void startanimation(){
		Thread Grafik = new Thread(this);
		Grafik.start();
	}
	
	
	
	public void run(){
		while(weiter){
			try{

				
				if(fahrenhoch = true && grenze<ky){
					ky--;
				}
				if(fahrenrunter = true && grenze>ky){
					ky++;
				}
	
				
				Thread.sleep(10);}
			catch (InterruptedException f){};
				repaint();}
			}
	
			
			public void paint (Graphics g){
				
				g.drawImage(Haus,0,0,418,495, this);
				g.drawImage(Fahrstuhl,190,ky,33,32, this);
				
				g.setColor(Color.black);
				g.drawRect(155,120,100,341);
				
				g.drawRect(45,155,30,20);
				g.drawString("OG", 50, 170);
				
				g.drawRect(45,275,30,20);
				g.drawString("EG", 50, 290);
				
				g.drawRect(45,395,30,20);
				g.drawString("UG", 50, 410);
				
				g.setColor(Color.LIGHT_GRAY);
				g.drawString("Besserer Aufzug als Fabians", 130, 475);
				
			}
			
			
			public void zustandWechseln(String eingabe){
				if( zustand.equals("Lift im UG")){
					if(eingabe.equals("EG")){hochfahren(1);
					zustand="Lift im EG";
					}
					if(eingabe.equals("OG")){hochfahren(2);
					zustand="Lift im OG";
					}
				}
				
				else if( zustand.equals("Lift im EG")){
					if(eingabe.equals("OG")){hochfahren(1);
					zustand="Lift im OG";
					}
					if(eingabe.equals("UG")){runterfahren(1);
					zustand="Lift im UG";
					}
				}
				
				else if( zustand.equals("Lift im OG")){
					if(eingabe.equals("EG")){runterfahren(1);
					zustand="Lift im EG";
					}
					if(eingabe.equals("UG")){runterfahren(2);
					zustand="Lift im UG";
					}
				}
			}
			
			public void hochfahren(int x){
				
				fahrenhoch=true;
				grenze=grenze+(x*120);
				
				System.out.println("Der Fahrstuhl fährt um "+x+" Stockwerk(e) nach oben");
				
			}
			
			public void runterfahren(int x){
				
				fahrenrunter=true;
				grenze=grenze-(x*120);
				
				System.out.println("Der Fahrstuhl fährt um "+x+" Stockwerk(e) nach unten");
			}
}