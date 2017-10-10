package Sinnlos;
import javax.swing.JFrame;

public class Fenster extends JFrame {
	
	

        public Fenster(){
        	JFrame Spiel=new JFrame();
		
		Spiel.setSize(500,300);
		Spiel.setLocationRelativeTo(null);
		Spiel.setResizable(false);
		Spiel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Spiel.add(new Haupt());
		Spiel.setVisible(true);
		
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fenster f = new Fenster();
	}}
	 