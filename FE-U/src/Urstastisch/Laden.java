package Urstastisch;

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

	private static int[] itemfeld= new int[9];
	private static int hpmax,hp,ap,vp,level,levelmap;

	private static String pfad=System.getProperty("user.dir").replace('\\', '/');

	public static void aktualisiereDaten(int s) {

		System.out.println(pfad);
		Path p;
        List<String> daten = null;
        
        p=Paths.get(pfad+"/conf/einstellungen");
        
        if(s==1)p=Paths.get(pfad+"/conf/einstellungen");
        if(s==2)p=Paths.get(pfad+"/conf/slot1");
        if(s==3)p=Paths.get(pfad+"/conf/slot2");
        
		try {
			daten=Files.readAllLines(p, Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
        itemfeld[0]=Integer.parseInt(daten.get(0));//Geld
        itemfeld[1]=Integer.parseInt(daten.get(2));//Heiltränke
        itemfeld[2]=Integer.parseInt(daten.get(4));//Attackenpulver
        itemfeld[3]=Integer.parseInt(daten.get(6));//Defensivschutz
        itemfeld[4]=Integer.parseInt(daten.get(8));//EXP-Maximizer
        itemfeld[5]=Integer.parseInt(daten.get(10));//U-Heiltränke
        itemfeld[6]=Integer.parseInt(daten.get(12));//U-Attackenpulver
        itemfeld[7]=Integer.parseInt(daten.get(14));//U-Defensivschutz
        itemfeld[8]=Integer.parseInt(daten.get(16));//Levler
       
        hpmax=Integer.parseInt(daten.get(18));
        hp=Integer.parseInt(daten.get(20));
        ap=Integer.parseInt(daten.get(22));
        vp=Integer.parseInt(daten.get(24));
        level=Integer.parseInt(daten.get(26));
        
        levelmap=Integer.parseInt(daten.get(29));

	}

	public static int[] getitemfeld(){return itemfeld;}
	public static int gethpmax(){return hpmax;}
	public static int gethp(){return hp;}
	public static int getap(){return ap;}
	public static int getvp(){return vp;}
	public static int getlevel(){return level;}
	public static int getlevelm(){return levelmap;}
	

	public static void setWerte(int[] itemfeld,int hpmax,int hp,int ap,int vp,int level,int levelmap,int s){
		
		PrintWriter fw=null;
		
		try {
			
			 if(s==1)fw=new PrintWriter(new FileWriter(pfad+"/conf/einstellungen"));
		        if(s==2)fw=new PrintWriter(new FileWriter(pfad+"/conf/slot1"));
		        if(s==3)fw=new PrintWriter(new FileWriter(pfad+"/conf/slot2"));
			
			fw.println(itemfeld[0]);
			fw.println("//Geld");
			fw.println(itemfeld[1]);
			fw.println("//Heiltränke");
			fw.println(itemfeld[2]);
			fw.println("//Attackenpulver");
			fw.println(itemfeld[3]);
			fw.println("//Defensivschutz");
			fw.println(itemfeld[4]);
			fw.println("//EXP-Maximizer");
			fw.println(itemfeld[5]);
			fw.println("//U-Heiltränke");
			fw.println(itemfeld[6]);
			fw.println("//U-Attackenpulver");
			fw.println(itemfeld[7]);
			fw.println("//U-Defensivschutz");
			fw.println(itemfeld[8]);
			fw.println("//Levler");
			fw.println(hpmax);
			fw.println("//HP max");
			fw.println(hp);
			fw.println("//HP");
			fw.println(ap);
			fw.println("//AP");
			fw.println(vp);
			fw.println("//VP");
			fw.println(level);
			fw.println("//Level");
			fw.println();
			fw.println(levelmap);
			fw.println("//Level-Map");

			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(fw!=null) fw.close();
		}
	}
	
/*	
	public static JEditorPane createEditorPane(String name){
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