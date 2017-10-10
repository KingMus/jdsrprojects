package n_mal_n;

import javax.swing.*;

public class Quadrat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0;
		
		do{
			JOptionPane.showInputDialog("Geben sie n ( die Größe ) ein !");
			
		}
		while(!(n>2 && n<10));
	}

}
