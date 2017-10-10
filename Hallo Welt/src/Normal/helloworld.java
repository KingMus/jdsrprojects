package Normal;
import javax.swing.*;

public class helloworld {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hallo Welt");

		System.out.println("Sie sind "+fragen()+" Jahre alt !");
		
	}
	
	public static int fragen(){
		
		int x;
		String s;
		s=JOptionPane.showInputDialog("Wie alt sind sie?");
		x=Integer.parseInt(s);
		
		return x;
	}

}
