package Urstastisch;
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
	private int SEXP=0;
	private Image Sbild;
	private int SortX;
	private int SortY;
	private int Sgroeßex;
	private int Sgroeßey;
	private int Slevel;
	private int[] items;  // 0=Geld - 1=Heilung - 2=Attacke - 3=Defensive - 4=EXP-Maximizer - 5,6,7,8=U-Tränke
	private int sieg=0;
	private int erkp,erap,ervp;



public void setzeSEigenschaften(Image bilds,String s,int x,int a, int y, int z, int xy, int ox,int oy,int gx, int gy,int[] i){
	
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
	items=i;
	
	
}

public boolean aufleveln(Graphics g, int höhe,int expmulti){
	
	SEXP=SEXP+(int)(30*Math.random()+(10*expmulti));
	
	if(SEXP>=200){
		SEXP=SEXP-200;
		
		erkp=(int)(10*Math.random()+5);
		erap=(int)(5*Math.random()+1);
		ervp=(int)(5*Math.random()+1);		
		
	Slevel=Slevel+höhe;
	SMKP=SMKP+(erkp*höhe);
	SKP=SKP+(erkp*höhe);
	SAP=SAP+(erap*höhe);
	SVP=SVP+(ervp*höhe);
	
	g.drawRect(150, 8, 300, 70);
	g.drawString("-Enter-", 400, 70);
	g.drawString(höhe+" Level aufgestiegen !", 165, 40);
	g.drawString("Max. KP +"+erkp*höhe+" !", 165, 55);
	g.drawString("VP +"+ervp*höhe+" !     AP +"+erap*höhe+" !", 165, 70);
	
	return true;
	}else{return false;}
	
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
		SVP=SVP+1;
	}
	
}
public void attackenpulver(int attanzahl){
	
	if(attanzahl>0){
		SAP=SAP+1;
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
		SVP=SVP+15;
	}
	
}
public void uattackenpulver(int uattanzahl){
	
	if(uattanzahl>0){
		SAP=SAP+15;
	}
}


public void addiereItem(int i){
	
	switch(i){
	case 1:SKP=SKP+10;
	if(SKP>SMKP)SKP=SMKP;
		break;
	case 2:
		break;
	case 3:
		break;
	case 4: SEXP=SEXP+50;
		break;
	case 5: SKP=SKP+100;
	if(SKP>SMKP)SKP=SMKP;
	break;
	case 6: SAP=SAP+15;
	break;
	case 7: SVP=SVP+15;
	break;
	case 8: Slevel++;
	break;
	}
}

public void setitem(int i,int x){
	
	items[i]=x;

}
public int getitem(int i){
	
	return items[i];
}
public void erhöheodererniedrigeitem(int i,int x,int z){
	
	if(z==1)
		items[i]=items[i]+x;
	
	if(z==2)
		items[i]=items[i]-x;

}



public int getEXP(){
	
	return SEXP;
}
public void setEXP(int i){
	
	SEXP=i;

}


public int getAP(){
	
	return SAP;
}
public void setAP(int i){
	
	SAP=i;

}

public int getErhöhung(int s){
	
	if(s==1)return erkp;
	if(s==2)return erap;
	if(s==3)return ervp;
	
	return 0;
	
}


public int getMHP(){
	
	return SMKP;
}
public int getHP(){
	
	return SKP;
}

public void setHP(int i){
	
	SKP=i;

}




public int getVP(){
	
	return SVP;
}
public void setVP(int i){
	
	SVP=i;

}


public int getSieg(){
	
	return sieg;
}
public void setSieg(int i){
	
	if(i==0)sieg=0;
	if(i==1)sieg=1;
	if(i==2)sieg=2;
}




public int getLevel(){
	
	return Slevel;
}

public void statusAusgabe(Graphics g){
	
	g.drawImage(Sbild,100,100,Sgroeßex,Sgroeßey, null);
	
	Font arial4 = new Font("Consolas",Font.PLAIN,12);
	g.setFont(arial4);
	
	g.setColor(Color.black);
	g.drawString(""+Sname, 100, 70);
	
	g.drawString("KP: "+SKP+"/"+SMKP, 100, 240);
	g.drawString("AP: "+SAP, 100, 255);
	g.drawString("VP: "+SVP, 100, 270);
	g.drawString("EXP: "+SEXP, 100, 285);
	g.drawString("Level: "+Slevel, 100, 300);
	
	
}

public void itemAusgabe(Graphics g,int x){
	
	
	g.setColor(Color.black);
	
	Font arial6 = new Font("Consolas",Font.PLAIN,12);
	g.setFont(arial6);
	
	g.drawString(items[0]+" Wojtaler", 195, 370);
	
	g.setColor(Color.black);
	
	Font arial4 = new Font("Consolas",Font.BOLD,22);
	g.setFont(arial4);

	g.drawString(""+items[1], 120, 117);
	g.drawString(""+items[2], 205, 117);
	g.drawString(""+items[3], 290, 117);
	g.drawString(""+items[4], 373, 117);
	g.drawString(""+items[5], 120, 195);
	g.drawString(""+items[6], 205, 195);
	g.drawString(""+items[7], 290, 195);
	g.drawString(""+items[8], 373, 195);

	
	switch(x){
	case 0:g.drawString("Bitte Item auswählen...", 100, 310);
		break;
	case 1:
		
		Font arial5 = new Font("Consolas",Font.BOLD,14);
		g.setFont(arial5);
		
		g.drawString("Heiltrank", 60, 283);
		
		Font arial96 = new Font("Consolas",Font.PLAIN,12);
		g.setFont(arial96);
		
		g.drawString("Heilt bei Benutzung 10 KP", 65, 300);
		g.drawString("Monster lassen fast immer einen fallen", 65, 315);
		g.drawString("Hat schon so manchem das Leben gerettet", 65, 330);
		
		g.drawString("Benutzen", 368, 284);
		g.drawString(SKP+"/"+SMKP+" KP", 370, 297);
		
		g.drawString("Kaufen", 375, 322);
		g.drawString("25W", 383, 335);
		
		g.setColor(Color.gray);
		g.fillRect(350, 260, 5, 90);
		
		g.drawRect(360, 270, 70, 33);
		g.drawRect(360, 308, 70, 32);
		
		break;
	case 2:

		Font arial51 = new Font("Consolas",Font.BOLD,14);
		g.setFont(arial51);
		
		g.drawString("Attackenpulver", 60, 283);
		
		Font arial61 = new Font("Consolas",Font.PLAIN,12);
		g.setFont(arial61);
		
		g.drawString("Erhöht deine AP um 1", 65, 300);
		g.drawString("Bringt mehr Dampf unter deine Attacke", 65, 315);
		g.drawString("Wirkt nur für die Dauer eines Kampfes", 65, 330);
		
		g.setColor(Color.gray);
		g.drawString("Nur im", 371, 284);
		g.drawString("Kampf", 378, 297);
		g.setColor(Color.black);
		
		g.drawString("Kaufen", 375, 322);
		g.drawString("50W", 383, 335);
		
		g.setColor(Color.gray);
		g.fillRect(350, 260, 5, 90);
		
		g.drawRect(360, 270, 70, 33);
		g.drawRect(360, 308, 70, 32);
		
		
		break;
	case 3:

		Font arial511 = new Font("Consolas",Font.BOLD,14);
		g.setFont(arial511);
		
		g.drawString("Defensivschutz", 60, 283);
		
		Font arial611 = new Font("Consolas",Font.PLAIN,12);
		g.setFont(arial611);
		
		g.drawString("Erhöht deine VP um 1", 65, 300);
		g.drawString("Du kannst viel mehr einstecken", 65, 315);
		g.drawString("Die Wirkung verfliegt nach einem Kampf", 65, 330);
		
		g.setColor(Color.gray);
		g.drawString("Nur im", 371, 284);
		g.drawString("Kampf", 378, 297);
		g.setColor(Color.black);
		
		g.drawString("Kaufen", 375, 322);
		g.drawString("60W", 383, 335);
		
		g.setColor(Color.gray);
		g.fillRect(350, 260, 5, 90);
		
		g.drawRect(360, 270, 70, 33);
		g.drawRect(360, 308, 70, 32);
		
		
		
		
		break;
	case 4:

		Font arial5111 = new Font("Consolas",Font.BOLD,14);
		g.setFont(arial5111);
		
		g.drawString("EXP-Maximizer", 60, 283);
		
		Font arial6111 = new Font("Consolas",Font.PLAIN,12);
		g.setFont(arial6111);
		
		g.drawString("Erhöht deine Erfahrung um 50", 65, 300);
		g.drawString("Sammle Erfahrung ohne was dafür zu tun", 65, 315);
		g.drawString("Schnellerer Levelaufstieg", 65, 330);
		
		g.drawString("Benutzen", 368, 284);
		g.drawString(SEXP+" EXP", 380, 297);
		
		g.drawString("Kaufen", 375, 322);
		g.drawString("500W", 380, 335);
		
		g.setColor(Color.gray);
		g.fillRect(350, 260, 5, 90);
		
		g.drawRect(360, 270, 70, 33);
		g.drawRect(360, 308, 70, 32);
		
		
		break;
	case 5:

		Font arial7 = new Font("Consolas",Font.BOLD,14);
		g.setFont(arial7);
		
		g.drawString("Ultra-Heiltrank", 60, 283);
		
		Font arial8 = new Font("Consolas",Font.PLAIN,12);
		g.setFont(arial8);
		
		g.drawString("Füllt ganze 100 Leben auf", 65, 300);
		g.drawString("Ohne Geld schwer zu bekommen", 65, 315);
		g.drawString("Heilt schneller als die Polizei erlaubt", 65, 330);
		
		g.drawString("Benutzen", 368, 284);
		g.drawString(SKP+"/"+SMKP+" KP", 370, 297);
		
		g.drawString("Kaufen", 375, 322);
		g.drawString("2KW", 383, 335);
		
		g.setColor(Color.gray);
		g.fillRect(350, 260, 5, 90);
		
		g.drawRect(360, 270, 70, 33);
		g.drawRect(360, 308, 70, 32);
		
		
		break;
	case 6:
		
		
		Font arial519 = new Font("Consolas",Font.BOLD,14);
	g.setFont(arial519);
	
	g.drawString("Ultra-Attackenpulver", 60, 283);
	
	Font arial619 = new Font("Consolas",Font.PLAIN,12);
	g.setFont(arial619);
	
	g.drawString("Angriffspunkte steigen um 15", 65, 300);
	g.drawString("Nicht temporär, sondern ewig", 65, 315);
	g.drawString("Deine Gegner sollen dich fürchten", 65, 330);
	
	g.drawString("Benutzen", 368, 284);
	g.drawString(SAP+" AP", 380, 297);
	
	g.drawString("Kaufen", 375, 322);
	g.drawString("5KW", 383, 335);
	
	g.setColor(Color.gray);
	g.fillRect(350, 260, 5, 90);
	
	g.drawRect(360, 270, 70, 33);
	g.drawRect(360, 308, 70, 32);
	
	
		break;
	case 7:

		
		Font arial5114 = new Font("Consolas",Font.BOLD,14);
		g.setFont(arial5114);
		
		g.drawString("Ultra-Defensivschutz", 60, 283);
		
		Font arial6114 = new Font("Consolas",Font.PLAIN,12);
		g.setFont(arial6114);
		
		g.drawString("Deine Verteidigung wächst 15 Punkte", 65, 300);
		g.drawString("Härter als Diamant, stabiler als Stahl", 65, 315);
		g.drawString("Verstärkt dich dein Leben lang", 65, 330);
		
		g.drawString("Benutzen", 368, 284);
		g.drawString(SVP+" VP", 380, 297);
		
		g.drawString("Kaufen", 375, 322);
		g.drawString("6KW", 383, 335);
		
		g.setColor(Color.gray);
		g.fillRect(350, 260, 5, 90);
		
		g.drawRect(360, 270, 70, 33);
		g.drawRect(360, 308, 70, 32);
		
		
		break;
	case 8:

		Font arial5115 = new Font("Consolas",Font.BOLD,14);
		g.setFont(arial5115);
		
		g.drawString("Level-Dünger", 60, 283);
		
		Font arial61115 = new Font("Consolas",Font.PLAIN,12);
		g.setFont(arial61115);
		
		g.drawString("Steige um ein Level auf", 65, 300);
		g.drawString("Erlebe einen Levelaufstieg ohne EXP", 65, 315);
		g.drawString("Werde superschnell stärker", 65, 330);
		
		g.drawString("Benutzen", 368, 284);
		g.drawString("Level"+Slevel, 380, 297);
		
		g.drawString("Kaufen", 375, 322);
		g.drawString("10KW", 380, 335);
		
		g.setColor(Color.gray);
		g.fillRect(350, 260, 5, 90);
		
		g.drawRect(360, 270, 70, 33);
		g.drawRect(360, 308, 70, 32);
		
		
		break;
	}
	
	
}
	
}
