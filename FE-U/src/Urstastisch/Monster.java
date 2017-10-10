package Urstastisch;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Monster {
	
	private String name;
	private int KP;
	private int MKP;
	private int AP;
	private int VP;
	private int level;
	private Image bild;
	public Color Hautfarbe;
	private int größex;
	private int größey;
	private int ortx;
	private int orty;
	private String text1,text2,text3,text4;



public void setzeEigenschaften(Image bild1, String s, int x,int a, int y, int z, int xy, String s2,String s3,String s4,String s5, int groeße1,int groeße2,int ort1,int ort2){
	
	name=s;
	KP=x;
	MKP=a;
	AP=y;
	VP=z;
	level=xy;
	text1=s2;
	text2=s3;
	text3=s4;
	text4=s5;
	bild=bild1;
	größex=groeße1;
	größey=groeße2;
	ortx=ort1;
	orty=ort2;
	
}

public void zeigeAnalysetext(Graphics g){

	g.drawString("-Enter-", 400, 70);
	g.drawString(text1, 165, 25);
	g.drawString(text2, 165, 40);
	g.drawString(text3, 165, 55);
	g.drawString(text4, 165, 70);
}

public int attacke(){
	
	int schaden;
	
	schaden= ( AP*(level/2) );
	
	return schaden;
	
	}

public int getroffen(int schaden){
	
	int absoluterschaden;
	absoluterschaden=schaden-VP;
	
	if(absoluterschaden>0){
	KP= KP-absoluterschaden;
	
	if(KP<=0){
		return 123456789;
	}
	
	return absoluterschaden;}else{
		return 0;
	}
	
	
	
}

public void malen(Graphics g, Image bild1, Image bild2){
	
	g.drawImage(bild1,5,5,90,20, null);
	g.drawImage(bild2,5,173,90,70, null);
	
	g.setColor(Color.white);
	
	g.drawString(name, 10, 20);
	
	g.drawString("KP: "+KP+"/"+MKP, 10, 190);
	g.drawString("AP: "+AP, 10, 205);
	g.drawString("VP: "+VP, 10, 220);
	g.drawString("Level: "+level, 10, 235);

	g.drawImage(bild,ortx,orty,größex,größey, null);
	
}

public void attackentext(Graphics g, int attackenevent, int a1schaden, int kritik){
	
	g.setColor(Color.white);
	
	if(attackenevent>=2){
		
		if(kritik==2 || kritik== 6){
			g.drawString("AUTSCH !!! -"+a1schaden+" KP !!!", 165, 40);
		}else{
		
		g.drawString(name+ " verliert "+a1schaden+" KP !!!", 165, 40);}
		}
	if(attackenevent>=3){
		g.drawString(name+ " greift an !!!", 165, 55);
		}
	
}

public void niederlagentext(Graphics g){
	
	
	g.setColor(Color.white);
	g.drawString("-Enter-", 400, 70);
	g.drawString("Du hast "+name+" besiegt !!!", 165, 25);
}




}