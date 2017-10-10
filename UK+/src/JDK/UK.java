package JDK;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class UK extends JPanel implements Runnable{
	
	boolean weiter=true;
	int key;
	int zähler;
	int izähler=0;
	boolean geschoss=false;
	boolean geschosszielerreicht=true;
	int x=-20,y=-20;
	int xg=20,yg=-20;
	int xschuss,yschuss;
	int xschussg,yschussg;
	
	 private MyActionListener a1=new MyActionListener();
	 
		
	  

		public UK() throws IOException{
	
			this.addMouseMotionListener(new Mouseklick());
			this.addMouseListener(new Mouseklick());
	    	addKeyListener(new Al());
	    	setFocusable(true);
	    	startanimation();
	    	
	    	
	  /*  	BufferedWriter out = new BufferedWriter(new FileWriter("Wieoft.txt"));
			
			String s = String.valueOf(zähler);
			  
			  out.write(s);
			  out.close();
	    	
			  
			  BufferedReader in = new BufferedReader(new FileReader("Wieoft.txt"));
			    
			   String zeile1 = in.readLine();
		  //   String [] werte=zeile1.split(";");
			   
			      in.close();
			      
			     int zähler2=Integer.parseInt(zeile1);
			     
			     zähler=zähler2;*/


	}
	

	public class Mouseklick extends MouseAdapter{
		public void mouseMoved(MouseEvent e){

			x=e.getX()-10;
			y=e.getY()-10;

			
		}
		public void mouseClicked(MouseEvent e){
			
			if(geschosszielerreicht==true){
			xschuss=50;
			yschuss=y+8;
			zähler++;
			geschosszielerreicht=false;}

			geschoss=true;
			
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
	        
	        
	    }
	}
	
	public void startanimation(){
		Thread Grafik = new Thread(this);
		Grafik.start();
	}
	
	
	
	public void run(){
		while(weiter){
			try{
				
				xschuss++;
				izähler++;
				
				if(izähler>10){
					
				if(yg<620){	
				yg++;}else{
					yg=-30;
				}
				
				
				
				
				
				izähler=0;
				}
				
				if(xschuss>1200){
					geschosszielerreicht=true;
				}
				
				Thread.sleep(1);}
			catch (InterruptedException f){};
				repaint();}
			}
			
			public void paint (Graphics g){
				
				g.setColor(Color.black);
				
				g.fillRect(0,0,1200,600);
				
				g.setColor(Color.white);
				
				g.drawString("Du hast so oft geschossen:"+zähler,100,565);
				
				g.drawRect(20,-10,30,700);
				g.fillRect(15,y,40,20);
				g.fillRect(15,y+8,50,4);
				
				
				g.drawRect(1140,-10,30,700);
				g.setColor(Color.green);
				g.fillRect(1135,yg,40,20);
				g.fillRect(1125,yg+8,50,4);
				
				if(geschoss==true){
					g.setColor(Color.red);
					g.fillOval(xschuss,yschuss,10,5);
				}

				
				
				
			}

}
