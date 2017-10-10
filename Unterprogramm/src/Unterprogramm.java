import javax.swing.*;
public class Unterprogramm {

	public static double f (double x,int n){
		
	return	Math.pow(x, n);
	        
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text;
		int n;
		double L,R;
		
		text=JOptionPane.showInputDialog("Geben sie n ein");
		n=Integer.parseInt(text);
		text=JOptionPane.showInputDialog("Geben sie L ein");
		L=Double.parseDouble(text);
		text=JOptionPane.showInputDialog("Geben sie R ein");
		R=Double.parseDouble(text);
		
		System.out.println("Der Mittelwert von "+L +" hoch "+n+" und von " +R+ " hoch "+n+" lautet");
		System.out.println((f(L,n)+f(R,n))/2);
	
	}

}
