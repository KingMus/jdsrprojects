package Laser;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Bilder {

	
	private static String pfad=System.getProperty("user.dir").replace('\\', '/');
	
	Image stufe,hauptmenü,anleitung,optionen,Sterneskal,Sterneskal2,Sterneskal3,Sterneskal4,Sterneskal5,Laserskal,Laserskal2,Laserskal3,Laserskal4,Laserskal5,Laserskal6,Yodaskal,Siegskal,gameoverskal,gameover2skal;
	
	public Bilder(){
	ImageIcon Laser1 = new ImageIcon(pfad+"/Bilder/Laser/Laser.png");
	Laserskal = Laser1.getImage();
	ImageIcon Laser2 = new ImageIcon(pfad+"/Bilder/Laser/Laser2.png");
	Laserskal2 = Laser2.getImage();
	ImageIcon Laser3 = new ImageIcon(pfad+"/Bilder/Laser/Laser3.png");
	Laserskal3 = Laser3.getImage();
	ImageIcon Laser4 = new ImageIcon(pfad+"/Bilder/Laser/Laser4.png");
	Laserskal4 = Laser4.getImage();
	ImageIcon Laser5 = new ImageIcon(pfad+"/Bilder/Laser/Laser5.png");
	Laserskal5 = Laser5.getImage();
	ImageIcon Laser6 = new ImageIcon(pfad+"/Bilder/Laser/Laser6.png");
	Laserskal6 = Laser6.getImage();
	ImageIcon Level1 = new ImageIcon(pfad+"/Bilder/Hintergründe/Level1.png");
	Sterneskal = Level1.getImage();
	ImageIcon Level2 = new ImageIcon(pfad+"/Bilder/Hintergründe/Level2.png");
	Sterneskal2 = Level2.getImage();
	ImageIcon Level3 = new ImageIcon(pfad+"/Bilder/Hintergründe/Level3.png");
	Sterneskal3 = Level3.getImage();
	ImageIcon Level4 = new ImageIcon(pfad+"/Bilder/Hintergründe/Level4.png");
	Sterneskal4 = Level4.getImage();
	ImageIcon Level5 = new ImageIcon(pfad+"/Bilder/Hintergründe/Level5.png");
	Sterneskal5 = Level5.getImage();
	
	ImageIcon yoda = new ImageIcon(pfad+"/Bilder/Sonstige/raumschiff.png");
	Yodaskal = yoda.getImage();
	ImageIcon sieg = new ImageIcon(pfad+"/Bilder/Sonstige/Sieg.png");
	Siegskal = sieg.getImage();
	ImageIcon tod = new ImageIcon(pfad+"/Bilder/Sonstige/gameover.png");
	gameoverskal = tod.getImage();
	ImageIcon tod2 = new ImageIcon(pfad+"/Bilder/Sonstige/Vader.png");
	gameover2skal = tod2.getImage();
	
	ImageIcon home = new ImageIcon(pfad+"/Bilder/Sonstige/Space War.png");
	hauptmenü = home.getImage();
	ImageIcon an = new ImageIcon(pfad+"/Bilder/Sonstige/Logbuch.png");
	anleitung = an.getImage();
	ImageIcon op = new ImageIcon(pfad+"/Bilder/Sonstige/Optionen.png");
	optionen = op.getImage();
	ImageIcon s = new ImageIcon(pfad+"/Bilder/Sonstige/stufenwahl.png");
	stufe = s.getImage();

	
	}
	
}
