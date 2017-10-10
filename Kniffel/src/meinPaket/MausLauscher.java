package meinPaket;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MausLauscher {

	public boolean Mausklicken(MouseEvent e,Kombi k,Spieler s,int x){
		
		/**
		 * Die folgende Methode ist dazu da, den Bestätigungsklick zu registrieren.
		 * Ein Klick kann nur registriert werden, wenn die Kombination überhaupt verfügbar ist.
		 * Es wird dann dem Spieler der am Zug ist, zugeordnet. Dadurch das bereits ihm "Prüfen"-Teil ein
		 * erneutes Vorhandensein einer Kombination verhindert wird, ist hier eine Überprüfung, ob die
		 * Punktzahl bereits gesetzt ist, nicht mehr nötig...
		 */
		
		boolean gesetzt=false;
		
		boolean b1=k.getBedingung(1);
		boolean b2=k.getBedingung(2);
		boolean b3=k.getBedingung(3);
		boolean b4=k.getBedingung(4);
		boolean b5=k.getBedingung(5);
		boolean b6=k.getBedingung(6);
		boolean b7=k.getBedingung(7);
		boolean b8=k.getBedingung(8);
		boolean b9=k.getBedingung(9);
		boolean b10=k.getBedingung(10);
		boolean b11=k.getBedingung(11);
		boolean b12=k.getBedingung(12);
		boolean b13=k.getBedingung(13);
		boolean b14=k.getBedingung(14);
		boolean b15=k.getBedingung(15);
		boolean b16=k.getBedingung(16);
		
		
		if(e.getX()>(860+x) && e.getY()>108 && e.getX()<(874+x) && e.getY()<125 && b1==true){
			s.setGesetzt(1,k,0);
			gesetzt=true;
		}
		if(e.getX()>(860+x) && e.getY()>129 && e.getX()<(874+x) && e.getY()<146 && b2==true){
			s.setGesetzt(2,k,0);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>150 && e.getX()<(874+x) && e.getY()<167 && b3==true){
			s.setGesetzt(3,k,0);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>170 && e.getX()<(874+x) && e.getY()<187 && b4==true){
			s.setGesetzt(4,k,0);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>190 && e.getX()<(874+x) && e.getY()<207 && b5==true){
			s.setGesetzt(5,k,0);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>210 && e.getX()<(874+x) && e.getY()<227 && b6==true){
			s.setGesetzt(6,k,0);gesetzt=true;		
		}
		
		
		if(e.getX()>(860+x) && e.getY()>333 && e.getX()<(874+x) && e.getY()<350 && b7==true){
			s.setGesetzt(7,k,0);gesetzt=true;	
		}
		if(e.getX()>(860+x) && e.getY()>353 && e.getX()<(874+x) && e.getY()<370 && b8==true){
			s.setGesetzt(8,k,0);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>374 && e.getX()<(874+x) && e.getY()<391 && b9==true){
			s.setGesetzt(9,k,0);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>394 && e.getX()<(874+x) && e.getY()<411 && b10==true){
			s.setGesetzt(10,k,0);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>415 && e.getX()<(874+x) && e.getY()<432 && b11==true){
			s.setGesetzt(11,k,0);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>435 && e.getX()<(874+x) && e.getY()<452 && b12==true){
			s.setGesetzt(12,k,0);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>455 && e.getX()<(874+x) && e.getY()<472 && b13==true){
			s.setGesetzt(13,k,0);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>476 && e.getX()<(874+x) && e.getY()<493 && b14==true){
			s.setGesetzt(14,k,0);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>496 && e.getX()<(874+x) && e.getY()<513 && b15==true){
			s.setGesetzt(15,k,0);gesetzt=true;		
		}
		
		
		
		if(e.getX()>(860+x) && e.getY()>108 && e.getX()<(874+x) && e.getY()<125 && b16==true){
			s.setGesetzt(1,k,1);
			gesetzt=true;
		}
		if(e.getX()>(860+x) && e.getY()>129 && e.getX()<(874+x) && e.getY()<146 && b16==true){
			s.setGesetzt(2,k,1);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>150 && e.getX()<(874+x) && e.getY()<167 && b16==true){
			s.setGesetzt(3,k,1);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>170 && e.getX()<(874+x) && e.getY()<187 && b16==true){
			s.setGesetzt(4,k,1);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>190 && e.getX()<(874+x) && e.getY()<207 && b16==true){
			s.setGesetzt(5,k,1);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>210 && e.getX()<(874+x) && e.getY()<227 && b16==true){
			s.setGesetzt(6,k,1);gesetzt=true;		
		}
		
		
		if(e.getX()>(860+x) && e.getY()>333 && e.getX()<(874+x) && e.getY()<350 && b16==true){
			s.setGesetzt(7,k,1);gesetzt=true;	
		}
		if(e.getX()>(860+x) && e.getY()>353 && e.getX()<(874+x) && e.getY()<370 && b16==true){
			s.setGesetzt(8,k,1);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>374 && e.getX()<(874+x) && e.getY()<391 && b16==true){
			s.setGesetzt(9,k,1);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>394 && e.getX()<(874+x) && e.getY()<411 && b16==true){
			s.setGesetzt(10,k,1);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>415 && e.getX()<(874+x) && e.getY()<432 && b16==true){
			s.setGesetzt(11,k,1);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>435 && e.getX()<(874+x) && e.getY()<452 && b16==true){
			s.setGesetzt(12,k,1);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>455 && e.getX()<(874+x) && e.getY()<472 && b16==true){
			s.setGesetzt(13,k,1);gesetzt=true;		
		}
		if(e.getX()>(860+x) && e.getY()>476 && e.getX()<(874+x) && e.getY()<493 && b16==true){
			s.setGesetzt(14,k,1);gesetzt=true;		
		}
		
		return gesetzt;
		
	}
	
}

