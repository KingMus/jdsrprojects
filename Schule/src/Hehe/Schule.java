package Hehe;
import javax.swing.*;
public class Schule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int as, am, aw;
		
		as= ea("Gib die Anzahl der Schueler ein", 5);
		am= ea("Gib die Anzahl der Jungs ein", 5);
		aw= ea("Gib die Anzahl der Maedchen ein", 5);
		
		if ( aw+am!=as)
			System.out.println("Das kann nicht sein !");
		else
		System.out.println("Es sind " + as + " Schüler( "+am+" Junge(n) und "+aw+" Mädchen ).");
	}

	public static int ea(String s, int stopp){
		
		s=JOptionPane.showInputDialog(s);
		 return Integer.parseInt(s);
		
		
	}
}
