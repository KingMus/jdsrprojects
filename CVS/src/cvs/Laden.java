package cvs;
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

	private static int zähler;
	private static String pfad=System.getProperty("user.dir").replace('\\', '/');

	public static void aktualisiereDaten() {

		System.out.println(pfad);
		
        List<String> daten = null;
        
        Path p=Paths.get(pfad+"/conf/Speicher");
        
		try {
			daten=Files.readAllLines(p, Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
        zähler=Integer.parseInt(daten.get(0));
	}

	public static int getzähler(){return zähler;}
	

	public static void setWerte(int zahl){
		
		PrintWriter fw=null;
		
		try {
			fw=new PrintWriter(new FileWriter(pfad+"/conf/Speicher"));
			fw.println(zahl);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(fw!=null) fw.close();
		}
	}
	
	
/*	public static JEditorPane createEditorPane(String name){
		JEditorPane ep = null;
		try {
			ep = new JEditorPane("file:/"+pfad+"/html_dateien/"+name+".jpg");
			ep.setEditable(false);
		} catch (IOException e) {
			System.out.println("Probleme beim Laden von JEditorPane");
		}
		return ep;
	}

	public static Image createImage(String name){
		BufferedImage img=null;
		try {
			img=ImageIO.read(new File(pfad+"/bilder/"+name+".png"));
		} catch (IOException e) {}
		return img;
	}*/
}

