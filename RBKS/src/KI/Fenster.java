package KI;
import javax.swing.JFrame;

public class Fenster extends JFrame {
	
	

	
	
        public Fenster(){
        	JFrame Spiel=new JFrame();
		
		Spiel.setSize(600,290);
		Spiel.setLocation(100, 100);
		Spiel.setResizable(false);
		Spiel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Spiel.add(new Kampfbild());
		Spiel.setVisible(true);
		
        }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fenster f = new Fenster();
	}}
	 