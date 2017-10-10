package JDK;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;

public class Fenster extends JFrame {
	
	

        public Fenster() throws IOException{
        	JFrame Spiel=new JFrame();
		
		Spiel.setSize(1200,600);
		Spiel.setLocation(10, 10);
		Spiel.setResizable(false);
		Spiel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Spiel.add(new UK());
		Spiel.setVisible(true);
		
		
	}
	

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Fenster f = new Fenster();
		
		
		
		
	}}
	 
