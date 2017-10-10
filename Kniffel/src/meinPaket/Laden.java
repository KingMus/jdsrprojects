package meinPaket;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Laden{

	private static int[] punktefeld= new int[18];
	private static boolean[] gesetztesfeld= new boolean[15];

	private static String pfad=System.getProperty("user.dir").replace('\\', '/');

	public static void aktualisiereDaten(int s) {

		System.out.println(pfad);
		System.out.println(s);
		
        List<String> daten = null;
        
        Path p=Paths.get(pfad+"/conf/Standard");
        
        if(s==1)p=Paths.get(pfad+"/conf/speicher1");
        if(s==2)p=Paths.get(pfad+"/conf/Speicher2");
        
		try {
			daten=Files.readAllLines(p, Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
        punktefeld[0]=Integer.parseInt(daten.get(1));
        punktefeld[1]=Integer.parseInt(daten.get(3));
        punktefeld[2]=Integer.parseInt(daten.get(5));
        punktefeld[3]=Integer.parseInt(daten.get(7));
        punktefeld[4]=Integer.parseInt(daten.get(9));
        punktefeld[5]=Integer.parseInt(daten.get(11));
        punktefeld[6]=Integer.parseInt(daten.get(13));
        punktefeld[7]=Integer.parseInt(daten.get(15));
        punktefeld[8]=Integer.parseInt(daten.get(17));
        punktefeld[9]=Integer.parseInt(daten.get(19));
        punktefeld[10]=Integer.parseInt(daten.get(21));
        punktefeld[11]=Integer.parseInt(daten.get(23));
        punktefeld[12]=Integer.parseInt(daten.get(25));
        punktefeld[13]=Integer.parseInt(daten.get(27));
        punktefeld[14]=Integer.parseInt(daten.get(29));
        punktefeld[15]=Integer.parseInt(daten.get(31));
        punktefeld[16]=Integer.parseInt(daten.get(33));
        punktefeld[17]=Integer.parseInt(daten.get(35));
        
        gesetztesfeld[0]=Boolean.getBoolean(daten.get(39));
        gesetztesfeld[1]=Boolean.getBoolean(daten.get(41));
        gesetztesfeld[2]=Boolean.getBoolean(daten.get(43));
        gesetztesfeld[3]=Boolean.getBoolean(daten.get(45));
        gesetztesfeld[4]=Boolean.getBoolean(daten.get(47));
        gesetztesfeld[5]=Boolean.getBoolean(daten.get(49));
        gesetztesfeld[6]=Boolean.getBoolean(daten.get(51));
        gesetztesfeld[7]=Boolean.getBoolean(daten.get(53));
        gesetztesfeld[8]=Boolean.getBoolean(daten.get(55));
        gesetztesfeld[9]=Boolean.getBoolean(daten.get(57));
        gesetztesfeld[10]=Boolean.getBoolean(daten.get(59));
        gesetztesfeld[11]=Boolean.getBoolean(daten.get(61));
        gesetztesfeld[12]=Boolean.getBoolean(daten.get(63));
        gesetztesfeld[13]=Boolean.getBoolean(daten.get(65));
        gesetztesfeld[14]=Boolean.getBoolean(daten.get(67));
       

	}

	public static int[] getpunktefeld(){return punktefeld;}
	public static boolean[] getwahrfeld(){return gesetztesfeld;}
	

	/*public static void setWerte(){
		
		PrintWriter fw=null;
		
		try {
			fw=new PrintWriter(new FileWriter(pfad+"/conf/einstellungen"));
			fw.println(KISchlauheit);
			fw.println(nameSpieler1);
			fw.println(nameSpieler2);
			fw.println(spieler1Menschlich);
			fw.println(spieler2Menschlich);
			fw.println(kanten);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(fw!=null) fw.close();
		}
	}*/
}
