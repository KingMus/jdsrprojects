package Laser;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

public class Fenster_malen {

	Bilder b=new Bilder();
	
	public void malen(Graphics g,int bildschirmmodus,int zufall,int altlevel,int level,int punkte,int[] gewählt){
		
		
		if(bildschirmmodus==2){
			//weiter=false;
			
			if(zufall!=3){
			g.drawImage(b.gameoverskal, 0,0,500,500,null);
			g.setColor(Color.white);
			g.drawRect(350, 430, 100, 50);
			Font arial2 = new Font("Arial",Font.PLAIN,12);
			g.setFont(arial2);
			g.drawString("Neu starten",370,460);
			g.drawString("Ein Spiel von:", 50, 450);
			g.drawString("Du warst einfach zu schlecht...", 150, 300);
			g.drawString("Begonnen auf Level "+altlevel+" !", 150, 340);
			g.drawString("Gestorben auf Level "+level+" !", 150, 360);
			g.drawString(punkte+" Punkte erreicht !", 150, 380);
			Font arial = new Font("Arial",Font.BOLD,20);
			g.setFont(arial);
			g.drawString("KING MUS COOPERATION",50,480);
			Font arial3 = new Font("Arial",Font.BOLD,50);
			g.setFont(arial3);
			g.drawString("Game Over...",100,90);}
			else{
				g.drawImage(b.gameover2skal,0,0,500,500,null);
				g.setColor(Color.white);
				g.drawRect(350, 430, 100, 50);
				Font arial2 = new Font("Arial",Font.PLAIN,12);
				g.setFont(arial2);
				g.drawString("Neu starten",370,460);
				Font arial = new Font("Arial",Font.BOLD,20);
				g.setFont(arial);
				g.drawString("Darth Vader siegt...",100,460);
			}

		}
		
		if(bildschirmmodus==3)g.drawImage(b.anleitung, 0,0,500,506,null);

		
		if(bildschirmmodus==4){
			g.drawImage(b.optionen, 0,0,500,506,null);
			
			g.setColor(Color.cyan);

			if(gewählt[0]==1)g.drawRect(52, 107, 84, 39);
			if(gewählt[1]==1)g.drawRect(212, 107, 84, 39);
			if(gewählt[2]==1)g.drawRect(365, 107, 84, 39);
			if(gewählt[3]==1)g.drawRect(52, 223, 84, 39);
			if(gewählt[4]==1)g.drawRect(212, 223, 84, 39);
			if(gewählt[5]==1)g.drawRect(365, 223, 84, 39);

		}
		
		
		if(bildschirmmodus==10){
			g.setColor(Color.white);
			g.drawImage(b.Siegskal, 0,0,500,500,null);
			Font arial = new Font("Arial",Font.BOLD,20);
			g.setFont(arial);
			g.drawString("Du bist ein wahrer Meister!",100,100);
			Font arial2 = new Font("Arial",Font.PLAIN,12);
			g.setFont(arial2);
			g.drawString("Begonnen auf Level "+altlevel+" !", 50, 340);
			g.drawString(punkte+" Punkte erreicht !", 50, 380);
			
		}
		
		if(bildschirmmodus==90)g.drawImage(b.stufe, 0,0,500,506,null);
		
		
		
	}
	
	
}
