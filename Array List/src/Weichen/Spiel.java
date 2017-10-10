package Weichen;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class Spiel extends JPanel implements Runnable{
	
	boolean weiter=true;
	int key;
	int xh,yh;
	int BM=0;
	int xs=-5,ys=-5;
	
	Cursor unsichtbar = Toolkit.getDefaultToolkit().createCustomCursor(Toolkit.getDefaultToolkit().getImage(""), new Point(0,0), "invisible");
	
	ArrayList<Hindernisse> h= new ArrayList<Hindernisse>();	  

		public Spiel(){
			
			setCursor(unsichtbar);
			
			for(int i=0;i<2000;i++){
				
				xh=(int)(Math.random()*7000)-7000;
				yh=(int)(Math.random()*700);
				
				h.add(new Hindernisse(xh,yh));
			}

	
			this.addMouseMotionListener(new Mouseklick());
	    	setFocusable(true);
	    	startanimation();
	}
	

	public class Mouseklick extends MouseAdapter{
		public void mouseMoved(MouseEvent e){

			xs=e.getX();
			ys=e.getY();
			
		}
	}
	
	
	public void startanimation(){
		Thread Grafik = new Thread(this);
		Grafik.start();
	}
	
	
	
	public void run(){
		while(weiter){
			try{
					
				for(int e=0;e<h.size();e++){					
					if(h.get(e).getx()<xs+5 && h.get(e).getx()>xs && h.get(e).gety()<ys+5 && h.get(e).gety()>ys){BM=1;}
				}
				
				
				Thread.sleep(10);}
			catch (InterruptedException f){};
				repaint();}
			}
			
			public void paint (Graphics g){
				
				if(BM==0){
				g.setColor(Color.white);
				g.fillRect(0, 0, 700, 700);
				g.setColor(Color.black);
				
				for(int w=0;w<h.size();w++){
					
					h.get(w).hindernissmalen(g);
					
				}
				
				g.setColor(Color.blue);
				g.fillRect(xs, ys, 5, 5);}
				
				
			}

}
