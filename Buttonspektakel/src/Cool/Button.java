package Cool;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Button extends JPanel{
	
	int key;
	
	 private MyActionListener a1=new MyActionListener();
		
		public Button(){
			
			JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(29,20));
			
			for(int i=0;i<580;i++){
				panel.add(new JButton(String.valueOf(i+1)));
			}
			
	    	addKeyListener(new Al());
	    	setFocusable(true);
	    	
	    	add(panel);
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

}

