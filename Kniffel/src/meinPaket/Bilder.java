package meinPaket;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Bilder {

	private static String pfad=System.getProperty("user.dir").replace('\\', '/');
	
	 Image Block,Tabelle,Pokertisch,Holztisch,Samtstoff,Button,W�rfel1,W�rfel2,W�rfel3,W�rfel4,W�rfel5,W�rfel6,pl,pr,Button_starten,Button_beenden;
	 // Images werden erstellt
	
	public Bilder(){
		
		/*Bilder werden definiert:*/
    	
    	ImageIcon Ringbuch = new ImageIcon(pfad+"/Bilder/Block.png");
		Block = Ringbuch.getImage();
		ImageIcon Tabelle_bild = new ImageIcon(pfad+"/Bilder/Tabelle.PNG");
		Tabelle = Tabelle_bild.getImage();	
		ImageIcon filz = new ImageIcon(pfad+"/Bilder/Pokergr�n.jpg");
		Pokertisch = filz.getImage();	
		ImageIcon holz = new ImageIcon(pfad+"/Bilder/Ahornholz.jpg");
		Holztisch = holz.getImage();
		ImageIcon samt = new ImageIcon(pfad+"/Bilder/Roter_Samt.jpg");
		Samtstoff = samt.getImage();
		ImageIcon Knopf = new ImageIcon(pfad+"/Bilder/red_button.png");
		Button = Knopf.getImage();
		ImageIcon Knopf2 = new ImageIcon(pfad+"/Bilder/Button_1.png");
		Button_starten = Knopf2.getImage();
		ImageIcon Knopf3 = new ImageIcon(pfad+"/Bilder/Button_2.png");
		Button_beenden = Knopf3.getImage();
		
		ImageIcon W1 = new ImageIcon(pfad+"/W�rfelseiten/W�rfel_1.png");
		W�rfel1 = W1.getImage();
		ImageIcon W2 = new ImageIcon(pfad+"/W�rfelseiten/W�rfel_2.png");
		W�rfel2 = W2.getImage();	
		ImageIcon W3 = new ImageIcon(pfad+"/W�rfelseiten/W�rfel_3.png");
		W�rfel3 = W3.getImage();	
		ImageIcon W4 = new ImageIcon(pfad+"/W�rfelseiten/W�rfel_4.png");
		W�rfel4 = W4.getImage();
		ImageIcon W5 = new ImageIcon(pfad+"/W�rfelseiten/W�rfel_5.png");
		W�rfel5 = W5.getImage();
		ImageIcon W6 = new ImageIcon(pfad+"/W�rfelseiten/W�rfel_6.png");
		W�rfel6 = W6.getImage();
		
		ImageIcon Pfeillinks = new ImageIcon(pfad+"/Bilder/Pfeil_links.png");
		pl = Pfeillinks.getImage();
		ImageIcon Pfeilrechts = new ImageIcon(pfad+"/Bilder/Pfeil_rechts.png");
		pr = Pfeilrechts.getImage();
		
		/*-------------------------------------------------------------------------------------*/
		
		
	}
	
	
	
}
