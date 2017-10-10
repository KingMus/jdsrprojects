package Urstastisch;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bilder {

	private static String pfad=System.getProperty("user.dir").replace('\\', '/');
	
	Image s2,s3,s4,s5,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,hinterg1,
	hinterg2,hinterg3,hinterg4,hinterg5,hinterg6,hinterg7,hinterg8,hinterg9,hinterg10,hinterg11,hinterg12,feldn,feldd,feldf;
	
	Image s1,wald,wiese,Wald_Oben_Ende,Wald_Unten_Ende,Haus,Burg,Marke,
	Pfeill,Pfeilr,Pfeilo,Pfeilu,Hauptmenü,Statushintergrund,Inventarslot,Filz,ItemIcon;
	
	public Bilder(){
		
		
		ImageIcon bild26534 = new ImageIcon(pfad+"/Icons/Itemicon.png");
		ItemIcon = bild26534.getImage();	
		
		ImageIcon bild1 = new ImageIcon(pfad+"/Monster/Schleim.gif");
		m1 = bild1.getImage();	
		ImageIcon bild2 = new ImageIcon(pfad+"/Monster/Mumie.gif");
		m2 = bild2.getImage();	
		ImageIcon bild3 = new ImageIcon(pfad+"/Monster/DracheB.gif");
		m3 = bild3.getImage();	
		ImageIcon bild4 = new ImageIcon(pfad+"/Monster/USchleim.gif");
		m4 = bild4.getImage();
		ImageIcon bild5 = new ImageIcon(pfad+"/Monster/ZombieB.gif");
		m5 = bild5.getImage();	
		ImageIcon bild6 = new ImageIcon(pfad+"/Monster/Edward.gif");
		m6 = bild6.getImage();	
		ImageIcon bild7 = new ImageIcon(pfad+"/Monster/Kobold.gif");
		m7 = bild7.getImage();	
		ImageIcon bild8 = new ImageIcon(pfad+"/Monster/Skorpion.gif");
		m8 = bild8.getImage();	
		ImageIcon bild9 = new ImageIcon(pfad+"/Monster/OktoB.gif");
		m9 = bild9.getImage();	
		ImageIcon bild10 = new ImageIcon(pfad+"/Monster/Magier.gif");
		m10 = bild10.getImage();	
		ImageIcon bild11 = new ImageIcon(pfad+"/Monster/Edward2.gif");
		m11 = bild11.getImage();	
		ImageIcon bild12 = new ImageIcon(pfad+"/Monster/Schleim3.gif");
		m12 = bild12.getImage();	
		ImageIcon bild13 = new ImageIcon(pfad+"/Monster/Igel.gif");
		m13 = bild13.getImage();	
		ImageIcon bild14 = new ImageIcon(pfad+"/Monster/Todesbaum.gif");
		m14 = bild14.getImage();	
		ImageIcon bild15 = new ImageIcon(pfad+"/Monster/Stier.gif");
		m15 = bild15.getImage();	
		
		ImageIcon hbild12 = new ImageIcon(pfad+"/Hintergründe/Wiese.png");
		hinterg1 = hbild12.getImage();	
		ImageIcon hbild13 = new ImageIcon(pfad+"/Hintergründe/Wueste.png");
		hinterg2 = hbild13.getImage();	
		ImageIcon hbild14 = new ImageIcon(pfad+"/Hintergründe/Festung.png");
		hinterg3 = hbild14.getImage();	
		ImageIcon hbild15 = new ImageIcon(pfad+"/Hintergründe/Wald.png");
		hinterg4 = hbild15.getImage();	
		ImageIcon hbild16 = new ImageIcon(pfad+"/Hintergründe/Turm.png");
		hinterg5 = hbild16.getImage();	
		ImageIcon hbild17 = new ImageIcon(pfad+"/Hintergründe/Wald2.png");
		hinterg6 = hbild17.getImage();	
		ImageIcon hbild18 = new ImageIcon(pfad+"/Hintergründe/Wüste2.png");
		hinterg7 = hbild18.getImage();	
		ImageIcon hbild19 = new ImageIcon(pfad+"/Hintergründe/Meer.png");
		hinterg8 = hbild19.getImage();	
		ImageIcon hbild20 = new ImageIcon(pfad+"/Hintergründe/Höhle.png");
		hinterg9 = hbild20.getImage();	
		ImageIcon hbild21 = new ImageIcon(pfad+"/Hintergründe/Spitze.png");
		hinterg10 = hbild21.getImage();	
		ImageIcon hbild22 = new ImageIcon(pfad+"/Hintergründe/Baum.png");
		hinterg11 = hbild22.getImage();	
		ImageIcon hbild23 = new ImageIcon(pfad+"/Hintergründe/Plateau.png");
		hinterg12 = hbild23.getImage();	
			
		ImageIcon bild100 = new ImageIcon(pfad+"/Interaktion/TFName.png");
		feldn = bild100.getImage();	
		ImageIcon bild200 = new ImageIcon(pfad+"/Interaktion/TFDaten.png");
		feldd = bild200.getImage();	
		ImageIcon bild300 = new ImageIcon(pfad+"/Interaktion/TFFeld.png");
		feldf = bild300.getImage();	
		
		ImageIcon bild1001 = new ImageIcon(pfad+"/Interaktion/Home.png");
		Hauptmenü = bild1001.getImage();
		ImageIcon bild1002 = new ImageIcon(pfad+"/Interaktion/Status.jpg");
		Statushintergrund = bild1002.getImage();
		
		ImageIcon bild1003 = new ImageIcon(pfad+"/Interaktion/Inventare.png");
		Inventarslot = bild1003.getImage();
		ImageIcon bild1004 = new ImageIcon(pfad+"/Interaktion/Filz.jpg");
		Filz = bild1004.getImage();
		
		ImageIcon bild1000 = new ImageIcon(pfad+"/Charaktere/Alphonse.png");
		s1 = bild1000.getImage();
		
		ImageIcon bild3900 = new ImageIcon(pfad+"/Spielwelt/Spielermarker.png");
		Marke = bild3900.getImage();
		
		ImageIcon bild91 = new ImageIcon(pfad+"/Spielwelt/Wald.jpg");
		wald = bild91.getImage();
		ImageIcon bild92 = new ImageIcon(pfad+"/Spielwelt/Wiese.jpg");
		wiese = bild92.getImage();
		ImageIcon bild93 = new ImageIcon(pfad+"/Spielwelt/Baum_Wiese_Oben.jpg");
		Wald_Oben_Ende = bild93.getImage();
		ImageIcon bild94 = new ImageIcon(pfad+"/Spielwelt/Baum_Wiese_Unten.jpg");
		Wald_Unten_Ende = bild94.getImage();
		ImageIcon bild95 = new ImageIcon(pfad+"/Spielwelt/Haus.png");
		Haus = bild95.getImage();
		ImageIcon bild96 = new ImageIcon(pfad+"/Spielwelt/Burg.png");
		Burg = bild96.getImage();
		
		ImageIcon bild900 = new ImageIcon(pfad+"/Interaktion/Pfeil_oben.png");
		Pfeilo = bild900.getImage();
		ImageIcon bild901 = new ImageIcon(pfad+"/Interaktion/Pfeil_unten.png");
		Pfeilu = bild901.getImage();
		ImageIcon bild902 = new ImageIcon(pfad+"/Interaktion/Pfeil_links.png");
		Pfeill = bild902.getImage();
		ImageIcon bild903 = new ImageIcon(pfad+"/Interaktion/Pfeil_rechts.png");
		Pfeilr = bild903.getImage();
		
	}
	
	
	
}
