package Terminkalender;

import javax.swing.*;

public class Kalender {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		String[] termine;
		int i, stunde, auswahl, a;
		boolean fertig;
		
		//Zu Beginn des Programms sollen alle Einträge auf den leeren
		//String gesetzt werden
		
		termine=new String[24];
		for (i=0;i<24;i++) termine [i]="";
		
		
		fertig=false;
		
		while(!fertig) {
			
			s=JOptionPane.showInputDialog("Ihre Wahl:1 = Neuer Eintrag, 2 = Termine ausgeben, 3 = Programm beenden !");
			auswahl=Integer.parseInt(s);
			
			switch (auswahl) {
			case 1: s=JOptionPane.showInputDialog("Geben sie die Stunde an !");
			        stunde=Integer.parseInt(s);
			        termine [stunde]="Termin "+ stunde;
			break;
			case 2:  s=JOptionPane.showInputDialog("Von welcher Stunde wollen sie den Termin sehen ?");
			         a=Integer.parseInt(s);
			         System.out.println(termine [a]);
		    break;
			case 3:  fertig=true;
			break;
			default: System.out.println("! System Error !");
			}
		}
			System.out.println("Programm beendet !");
			
		
	}

}
