package Haja;
import javax.swing.JFrame;

public class Fenster extends JFrame {
	
	

        public Fenster(){
        	JFrame Spiel=new JFrame();
		
		Spiel.setSize(418,525);
		Spiel.setLocation(100, 10);
		Spiel.setResizable(false);
		Spiel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Spiel.add(new Fahr());
		Spiel.setVisible(true);
		
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fenster f = new Fenster();
		
	}}
	 