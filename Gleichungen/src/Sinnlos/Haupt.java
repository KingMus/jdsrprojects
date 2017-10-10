package Sinnlos;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Haupt extends JPanel implements Runnable{
	
	boolean weiter=true;
	int key;
	
	 private MyActionListener a1=new MyActionListener();
		
	  

		public Haupt(){
	
			this.addMouseListener(new Mouseklick());
	    	addKeyListener(new Al());
	    	setFocusable(true);
	    	startanimation();
	}
	

	public class Mouseklick extends MouseAdapter{
		public void mouseClicked(MouseEvent e){

			
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
	
	
				
				Thread.sleep(100);}
			catch (InterruptedException f){};
				repaint();}
			}
			
			public void paint (Graphics g){
				
				
			}

}

