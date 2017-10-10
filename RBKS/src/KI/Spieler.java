package KI;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Spieler {

	private String Sname;
	private int SKP;
	private int SMKP;
	private int SAP;
	private int SVP;
	private Image Sbild;
	private int SortX;
	private int SortY;
	private int Sgroeßex;
	private int Sgroeßey;
	private int Slevel;



public void setzeSEigenschaften(Image bilds,String s,int x,int a, int y, int z, int xy, int ox,int oy,int gx, int gy){
	
	Sname=s;
	SKP=x;
	SMKP=a;
	SAP=y;
	SVP=z;
	Slevel=xy;
	Sbild=bilds;
	Sgroeßex=gx;
	Sgroeßey=gy;
	SortX=ox;
	SortY=oy;
	
	
}

public void aufleveln(Graphics g, int höhe){
	
	Slevel=Slevel+höhe;
	SMKP=SMKP+(10*höhe);
	SKP=SKP+(10*höhe);
	SAP=SAP+(5*höhe);
	SVP=SVP+(4*höhe);
	
	g.drawRect(150, 8, 300, 70);
	g.drawString("-Enter-", 400, 70);
	g.drawString(höhe+" Level aufgestiegen !", 165, 40);
	g.drawString("Max. KP +"+10*höhe+" !", 165, 55);
	g.drawString("VP +"+4*höhe+" !     AP +"+5*höhe+" !", 165, 70);
	
}

public void niederlagentext(Graphics g){
	
	g.drawRect(150, 8, 300, 70);
	g.drawString("-Enter-", 400, 70);
	g.drawString("Du hast verloren...", 165, 40);
	g.drawString("Versuche es erneut !!!", 165, 55);
	
	
}

public int Sattacke(int kritik){
	
	int Sschaden;
	int kritischertreffer;
	
	if(kritik==2 || kritik== 6){
		kritischertreffer=3;
	}else{
		kritischertreffer=1;
	}
	
	Sschaden= ( SAP*(Slevel/2) )*kritischertreffer  ;
	
	return Sschaden;
	
	}

public int Sgetroffen(int schaden){
	
	int absoluterschaden;
	absoluterschaden=schaden-SVP;
	
	if(absoluterschaden>0) {SKP= SKP-absoluterschaden;
	
	if(SKP<=0){
		return 123456789;
	}
	
	return absoluterschaden;}
	else{return 0;}

}

public void Smalen(Graphics g, Image bild1, Image bild2){
	
	g.drawImage(bild1,495,5,90,20, null);
	g.drawImage(bild2,495,173,90,70, null);
	
	g.drawImage(Sbild,SortX,SortY,Sgroeßex,Sgroeßey, null);
	
	g.setColor(Color.white);
	
	g.drawString(Sname, 500, 20);
	
	g.drawString("KP: "+SKP+"/"+SMKP, 500, 190);
	g.drawString("AP: "+SAP, 500, 205);
	g.drawString("VP: "+SVP, 500, 220);
	g.drawString("Level: "+Slevel, 500, 235);

	
}

public void Sattackentext(Graphics g, int attackenevent, int a2schaden){
	
	if(attackenevent>=1){
		
		
		g.setColor(Color.white);
		g.drawString("-Enter-", 400, 70);
		g.drawString(Sname+ " greift an !!!", 165, 25);}
	
	
	if(attackenevent>=4){
		g.drawString(Sname+" verliert "+a2schaden+" KP !!!", 165, 70);
		attackenevent=0;
		}
	
}

public void heiltrank(int heiltrankanzahl){
	
	if(heiltrankanzahl>0){
		SKP=SKP+10;
		if(SKP>SMKP)SKP=SMKP;
		
	}
	
}
public void defensivschutz(int defanzahl){
	
	if(defanzahl>0){
		SVP=SVP+2;
	}
	
}
public void attackenpulver(int attanzahl){
	
	if(attanzahl>0){
		SAP=SAP+3;
	}
	
}

public void uheiltrank(int uheiltrankanzahl){
	
	if(uheiltrankanzahl>0){
		SKP=SKP+100;
		if(SKP>SMKP)SKP=SMKP;
		
	}
	
}
public void udefensivschutz(int udefanzahl){
	
	if(udefanzahl>0){
		SVP=SVP+20;
	}
	
}
public void uattackenpulver(int uattanzahl){
	
	if(uattanzahl>0){
		SAP=SAP+30;
	}
}





	
}
