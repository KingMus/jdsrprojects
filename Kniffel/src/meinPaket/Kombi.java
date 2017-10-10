package meinPaket;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Kombi {
	
	private boolean[] B=new boolean[16];
	private int[] P={0,0,0,0,0,0,0,0,0,0,30,40,25,50,0};
	wasgehtmalen wgm=new wasgehtmalen();
		
	public void prüfen(int[] feld1,int[] feld2,Spieler s,int x){
		
		int nr1=0,nr2=0,nr3=0,nr4=0,nr5=0,nr6=0;
		
		for(int i=0;i<16;i++)B[i]=false;
		
		for(int i=0;i<5;i++){
			
			/**Sechs Zähler zählen, wie oft die ihnen zugeordnete Zahl in den Feldern vorkommt.
			 * Sie werden jedesmal wenn eine Ziffer gefunden wurde erhöht
			 */
			
			if(feld1[i]==1 || feld2[i]==1) nr1++;
			if(feld1[i]==2 || feld2[i]==2) nr2++;
			if(feld1[i]==3 || feld2[i]==3) nr3++;
			if(feld1[i]==4 || feld2[i]==4) nr4++;
			if(feld1[i]==5 || feld2[i]==5) nr5++;
			if(feld1[i]==6 || feld2[i]==6) nr6++;
			
		}
		
		/**Der Überprüfungsteil
		 * 
		 * Sämtliche Würfelkombinationen werden hier mit Hilfe der Zähler gezählt.
		 * Ist eine Bedingung erfüllt, so wird eine Boolean-Variable erhöht
		 */
		
		
		//Der erste Part, reine Augenzahlen zählen
		if(nr1!=0 && s.getGesetzt(1)==false) B[0]=true;
		if(nr2!=0 && s.getGesetzt(2)==false) B[1]=true;
		if(nr3!=0 && s.getGesetzt(3)==false) B[2]=true;
		if(nr4!=0 && s.getGesetzt(4)==false) B[3]=true;
		if(nr5!=0 && s.getGesetzt(5)==false) B[4]=true;
		if(nr6!=0 && s.getGesetzt(6)==false) B[5]=true;
		
		//Paar, zwei Gleiche
		if((nr1>=2 || nr2>=2 || nr3>=2 || nr4>=2 || nr5>=2 || nr6>=2) && s.getGesetzt(7)==false) B[6]=true;
		
		//Zwei Paar, zweimal zwei Gleiche
		if((nr1>=2 && (nr2>=2 || nr3>=2 || nr4>=2 || nr5>=2 || nr6>=2)) && s.getGesetzt(8)==false)  B[7]=true;
		if((nr2>=2 && (nr3>=2 || nr4>=2 || nr5>=2 || nr6>=2)) && s.getGesetzt(8)==false) 			B[7]=true;
		if((nr3>=2 && (nr4>=2 || nr5>=2 || nr6>=2)) && s.getGesetzt(8)==false)						B[7]=true;
		if((nr4>=2 && (nr5>=2 || nr6>=2)) && s.getGesetzt(8)==false)		  					    B[7]=true;
		if((nr5>=2 && nr6>=2) && s.getGesetzt(8)==false)											B[7]=true;
		
		//Drilling, drei Gleiche
		if((nr1>=3 || nr2>=3 || nr3>=3 || nr4>=3 || nr5>=3 || nr6>=3) && s.getGesetzt(9)==false) B[8]=true;
		
		//Vierling, vier Gleiche
		if((nr1>=4 || nr2>=4 || nr3>=4 || nr4>=4 || nr5>=4 || nr6>=4) && s.getGesetzt(10)==false) B[9]=true;
		
		//Kleine Straße, vier Aufeinanderfolgende
		if(nr1>=1 && nr2>=1 && nr3>=1 && nr4>=1 && s.getGesetzt(11)==false) B[10]=true;
		if(nr2>=1 && nr3>=1 && nr4>=1 && nr5>=1 && s.getGesetzt(11)==false) B[10]=true;
		if(nr3>=1 && nr4>=1 && nr5>=1 && nr6>=1 && s.getGesetzt(11)==false) B[10]=true;
		
		//Große Straße, fünf Aufeinanderfolgende
		if((nr1>=1 || nr6>=1) && nr2>=1 && nr3>=1 && nr4>=1 && nr5>=1 && s.getGesetzt(12)==false) B[11]=true;
		
		//Full House, zwei und drei Gleiche
		if((nr1==2 || nr2==2 || nr3==2 || nr4==2 || nr5==2 || nr6==2) && (nr1==3 || nr2==3 || nr3==3 || nr4==3 || nr5==3 || nr6==3) && s.getGesetzt(13)==false) B[12]=true;
		
		//Kniffel, alle fünf gleich
		if((nr1==5 || nr2==5 || nr3==5 || nr4==5 || nr5==5 || nr6==5) && s.getGesetzt(14)==false) B[13]=true;
		
		//Chance
		if((nr1!=0 || nr2!=0 || nr3!=0 || nr4!=0 || nr5!=0 || nr6!=0) && s.getGesetzt(15)==false)B[14]=true;
		
		berechnen(nr1,nr2,nr3,nr4,nr5,nr6); //Rufe "berechnen()" auf
		
		if(x==0 && B[0]==false && B[1]==false && B[2]==false && B[3]==false && B[4]==false && B[5]==false && B[6]==false && 
				B[7]==false && B[8]==false && B[9]==false && B[10]==false && B[11]==false && B[12]==false && B[13]==false && B[14]==false){
			B[15]=true;
		}
	}
	
	public void wasgeht(Graphics g,int spieler,Spieler s){		
		wgm.malen(g,spieler,s,B,P);
	}
	
	
	public void berechnen(int nr1,int nr2,int nr3,int nr4,int nr5,int nr6){
		
		/**Eine vorläufige Berechnung der Punktzahl
		 * Die Methode berechnet die Werte und gibt sie an "prüfen()" zurück,
		 * damit diese sie in "wasgeht()" zeichnen kann. Dient dem besseren Vergleich nach einem Wurf
		 */
		
		P[0]=0;P[1]=0;P[2]=0;P[3]=0;P[4]=0;P[5]=0;
		P[6]=0;P[7]=0;P[8]=0;P[9]=0;P[14]=0;
		
		P[0]=1*nr1;
		P[1]=2*nr2;
		P[2]=3*nr3;
		P[3]=4*nr4;
		P[4]=5*nr5;
		P[5]=6*nr6;
		
		P[6]=(1*nr1)+(2*nr2)+(3*nr3)+(4*nr4)+(5*nr5)+(6*nr6);
		P[7]=(1*nr1)+(2*nr2)+(3*nr3)+(4*nr4)+(5*nr5)+(6*nr6);
		P[8]=(1*nr1)+(2*nr2)+(3*nr3)+(4*nr4)+(5*nr5)+(6*nr6);
		P[9]=(1*nr1)+(2*nr2)+(3*nr3)+(4*nr4)+(5*nr5)+(6*nr6);
		P[14]=(1*nr1)+(2*nr2)+(3*nr3)+(4*nr4)+(5*nr5)+(6*nr6);
		
	}
	
public boolean getBedingung(int nummer){		
		nummer=nummer-1;
		return B[nummer];
	}
	
public int getPunkte(int nummer){		
		nummer=nummer-1;
		return P[nummer];
	}
	
	
	
}
