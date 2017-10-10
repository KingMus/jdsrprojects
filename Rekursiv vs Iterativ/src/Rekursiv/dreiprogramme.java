package Rekursiv;
import javax.swing.*;

public class dreiprogramme {

	public static void main(String[] args) {

		String s;
		int fakzahl,ggt1zahl,ggt2zahl,fibzahl;
		
		s=JOptionPane.showInputDialog("Gib deine Zahl für fak() ein !");
		fakzahl=Integer.parseInt(s);
		s=JOptionPane.showInputDialog("Gib deine erste Zahl für ggt() ein !");
		ggt1zahl=Integer.parseInt(s);
		s=JOptionPane.showInputDialog("Gib deine zweite Zahl für ggt() ein !");
		ggt2zahl=Integer.parseInt(s);
		s=JOptionPane.showInputDialog("Gib deine Zahl für fib() ein !");
		fibzahl=Integer.parseInt(s);
		
		System.out.println("Für das Programm fak() mit der Zahl "+fakzahl+" kommt folgendes heraus: "+fak(fakzahl));
		System.out.println("Für das Programm ggt() mit den Zahlen "+ggt1zahl+" und "+ggt2zahl+"  kommt folgendes heraus: "+ggt(ggt1zahl,ggt2zahl));
		System.out.println("Für das Programm fib() mit der Zahl "+fibzahl+" kommt folgendes heraus: "+fib(fibzahl));
	}
	
	public static int fak(int n){
		if(n==1) return 1;
		else return n*fak(n-1);
	}
	
	public static int ggt(int a,int b){
		if(b==0) return a;
		else return ggt(b,a%b);
	}
	
	public static int fib(int n){
		if(n<3) return 1;
		else return fib(n-2)+fib(n-1);
	}

}
