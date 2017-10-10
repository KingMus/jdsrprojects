package Klassen;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Verein {

	private String Name;
	private int Gründungsjahr;
	private String Land;
	private int Ligasiege;
	private int Pokalsiege;
	private int Chsiege;
	private int Rang;
	
	
	
	public void setzeEigenschaften(String s1, int i1, String s2, int i3, int i4, int i5, int i6){
		Name=s1;
		Gründungsjahr=i1;
		Land=s2;
		Ligasiege=i3;
		Pokalsiege=i4;
		Chsiege=i5;
		Rang=i6;
		
	}
	
	public void malen(Graphics g){
		
		g.setColor(Color.black);
		g.fillRect(3, 30, 200, 10);
		g.drawString(Name,20,20);
		g.drawString("Gegründet: "+Gründungsjahr,10,60);
		g.drawString("Spielt in diesem Land: "+Land,10,90);
		g.drawString("Gewann die Liga "+Ligasiege+" mal",10,120);
		g.drawString("Gewann den Pokal "+Pokalsiege+" mal",10,150);
		g.drawString("Gewann die Championsleague "+Chsiege+" mal",10,180);
		g.drawString("Belegt laut Quelle den "+Rang+" Rang",10,210);
		
		
	}
	
	
	
}
