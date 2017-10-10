package Urstastisch;
import java.applet.Applet;


import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Kampfbild extends JPanel{
	
	private static String pfad=System.getProperty("user.dir").replace('\\', '/');
	
	
	int attackenevent=0;
	int analyseevent=0;
	int siegevent=0;
	int niederlagenevent=0;
	
	int stufe=0;
	int kritik;

	private Monster Gegner;
	private Spieler Hero;
	
	boolean itembildschirm;
	int itembildschirmfragen=0;
	int kampfstatus=0;
	
	int schaden;
	int a1schaden;
	int a2schaden;
	
	int münzmulti;
	int expmulti;
	
	int AnfangsAngriff=0;
	int AnfangsVerteidigung=0;
	int MaxLeben=0;
	
	int anzahlheil=0,anzahlattacke=0,anzahldef=0;
	int anzahluheil=0,anzahluattacke=0,anzahludef=0;
	int münzen=0;
	int neuemünzen=(int)(50*Math.random());
	
	int key;	
	
	Bilder b=new Bilder();
	
		
	
		public Kampfbild(int gegnerauswahlsvariable, int a,int x,int y,Spieler h){
			
			stufe=a;
			münzmulti=x;
			expmulti=y;
			
			neuemünzen=(int)(50*Math.random()+(15*münzmulti));
			
			Hero=h;
			
			münzen=Hero.getitem(0);
			anzahlheil=Hero.getitem(1);
			anzahlattacke=Hero.getitem(2);
			anzahldef=Hero.getitem(3);
			anzahluheil=Hero.getitem(5);
			anzahluattacke=Hero.getitem(6);
			anzahludef=Hero.getitem(7);
			
			MaxLeben=Hero.getMHP();
			AnfangsAngriff=Hero.getAP();
			AnfangsVerteidigung=Hero.getVP();
			
			
			
			Gegner= new Monster();
			
			switch(gegnerauswahlsvariable){
			case 1:Gegner.setzeEigenschaften(b.m1 ,"Schleim",20,20, 8, 2, 2,"Ein kleiner schwarzer Schleim.","Er sieht nicht besonders gefährlich aus !","","",70,60,15,70);
				break;
			case 2:Gegner.setzeEigenschaften(b.m2,"Mumie",40,40, 15, 5, 2,"Eine Mumie aus der fernen Wüste.","Sie ist zu einigem fähig.","","",60,68,20,60);
				break;
			case 3:Gegner.setzeEigenschaften(b.m3,"Drache (Boss)",100,100, 12, 4, 3,"Der sagenumwobene Drache.","Unterschätze niemals seine Macht.","Wenn du ihn besiegen willst","musst du sehr stark sein !!",80,80,10,60);
				break;
			case 4:Gegner.setzeEigenschaften(b.m4,"U-Schleim",140,140, 11, 6, 4,"Sie nennen sich Ultraschleim","Verbesserte Gattung der Klasse 'Schleim'","- Starker Angriff","- Schwache Defensive",70,60,15,70);
				break;
			case 5:Gegner.setzeEigenschaften(b.m5,"Geist (Boss)",500,500, 20, 80, 6,"Hart, aber mit der richtigen","Taktik leicht zu besiegen.","- Bossgegner Nr.2","- Schockiert seine Gegner",60,60,20,70);
				break;
			case 6:Gegner.setzeEigenschaften(b.m6,"Fabian (Boss)",1300,1300, 25, 90, 9,"Dein Erzfeind steht vor dir.","Unglaublich böse...","","",86,73,15,60);
				break;
			case 7:Gegner.setzeEigenschaften(b.m7,"Kobold",900,900, 30, 300, 10,"Ziemlich klein.","Achtung vor der Faust...","","",31,40,35,75);
				break;
			case 8:Gegner.setzeEigenschaften(b.m8,"Skorpion",2000,2000, 200, 80, 2,"Sieh ihn dir an :","Dieser schöne große Stachel...","Diese Stärke...","",66,66,20,60);
				break;
			case 9:Gegner.setzeEigenschaften(b.m9,"Okto (Boss)",5000,5000, 20, 450, 24,"Stärker noch als der Rest.","Ein großer Alptraum wird ein","Monstrum aus Fleisch und Blut...","",64,64,20,70);
				break;
			case 10:Gegner.setzeEigenschaften(b.m10,"Magier",7000,7000, 100, 11, 6,"Verzaubert dich gegen deinen Willen...","","","",70,74,15,60);
				break;
			case 11:Gegner.setzeEigenschaften(b.m11,"Fabian (Boss)",9999,9999, 27, 1000, 30,"Er ist zurückgekehrt","Stärker als je zuvor...","","",204,85,20,60);
				break;
			case 12:Gegner.setzeEigenschaften(b.m12,"H-Schleim",260,260, 5, 17, 12,"Hyper-Schleime.","Noch mehr Schleim als sonst...","","",70,60,15,70);
				break;
			case 13:Gegner.setzeEigenschaften(b.m13,"Igel",100,100, 28, 5180, 40,"Vorsicht Stacheln...","","","",70,60,15,70);
				break;
			case 14:Gegner.setzeEigenschaften(b.m14,"Todesbaum",9000,9000, 35, 450, 41,"...  ...","...  ...","...  ...","...  ...",70,70,15,60);
				break;
			case 15:Gegner.setzeEigenschaften(b.m15,"Stier (Boss)",1000,1000, 16, 10400, 101,"o__o","...  ...","...  ...","...  ...",60,63,15,70);
				break;
			}
			
			this.addMouseListener(new Mouseklick());
	    	addKeyListener(new Al());
	    	setFocusable(true);
	}
	

	public class Mouseklick extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			
			if(e.getX()>155 && e.getY()>128 && e.getX()<300 && e.getY()<158 && itembildschirm==true){
				
				if(anzahlheil>0){
					Hero.heiltrank(anzahlheil);
				anzahlheil--;
				repaint();}
				
			}
			
			if(e.getX()>155 && e.getY()>158 && e.getX()<300 && e.getY()<188 && itembildschirm==true){
				if(anzahldef>0){
					Hero.defensivschutz(anzahldef);
				anzahldef--;
				repaint();}
			}
			
			if(e.getX()>155 && e.getY()>188 && e.getX()<300 && e.getY()<218 && itembildschirm==true){
				if(anzahlattacke>0){
					Hero.attackenpulver(anzahlattacke);
				anzahlattacke--;
				repaint();}
			}
			
            if(e.getX()>300 && e.getY()>128 && e.getX()<445 && e.getY()<158 && itembildschirm==true){
				
				if(anzahluheil>0){
					Hero.uheiltrank(anzahluheil);
				anzahluheil--;
				repaint();}
				
			}
			
			if(e.getX()>300 && e.getY()>158 && e.getX()<445 && e.getY()<188 && itembildschirm==true){
				if(anzahludef>0){
					Hero.udefensivschutz(anzahludef);
					AnfangsVerteidigung=AnfangsVerteidigung+15;
				anzahludef--;
				repaint();}
			}
			
			if(e.getX()>300 && e.getY()>188 && e.getX()<445 && e.getY()<218 && itembildschirm==true){
				if(anzahluattacke>0){
					Hero.uattackenpulver(anzahluattacke);
					AnfangsAngriff=AnfangsAngriff+15;
				anzahluattacke--;
				repaint();}
			}
					
			if(e.getX()>155 && e.getY()>178 && e.getX()<300 && e.getY()<208 && itembildschirm==false){
				
				if (attackenevent==0)attackenevent++;
				repaint();				
			}
			
			if(e.getX()>300 && e.getY()>208 && e.getX()<445 && e.getY()<238 && itembildschirm==false && attackenevent==0){
				System.exit(0);
			}
			
			if(e.getX()>300 && e.getY()>178 && e.getX()<445 && e.getY()<208 && itembildschirm==false && attackenevent==0){
				itembildschirm=true;
				repaint();
			}
			
			if(e.getX()>155 && e.getY()>208 && e.getX()<300 && e.getY()<238 && itembildschirm==false && attackenevent==0){
				if (analyseevent==0)analyseevent++;
				repaint();
			}
			
			
			if(e.getX()>300 && e.getY()>208 && e.getX()<445 && e.getY()<238 && itembildschirm==true){
				itembildschirm=false;
				repaint();
			}
			
			if(e.getX()>145 && e.getY()>5 && e.getX()<295 && e.getY()<35 && itembildschirm==true && münzen>=25){
				anzahlheil++;
				münzen=münzen-25;
				repaint();
			}
			
			if(e.getX()>145 && e.getY()>45 && e.getX()<295 && e.getY()<75 && itembildschirm==true && münzen>=60){
				anzahldef++;
				münzen=münzen-60;
				repaint();
			}
			
			if(e.getX()>145 && e.getY()>85 && e.getX()<295 && e.getY()<105 && itembildschirm==true && münzen>=70){
				anzahlattacke++;
				münzen=münzen-70;
				repaint();
			}
			if(e.getX()>305 && e.getY()>5 && e.getX()<455 && e.getY()<35 && itembildschirm==true && münzen>=2000){
				anzahluheil++;
				münzen=münzen-2000;
				repaint();
			}
			
			if(e.getX()>305 && e.getY()>45 && e.getX()<455 && e.getY()<75 && itembildschirm==true && münzen>=5000){
				anzahludef++;
				münzen=münzen-5000;
				repaint();
			}
			
			if(e.getX()>305 && e.getY()>85 && e.getX()<455 && e.getY()<105 && itembildschirm==true && münzen>=6000){
				anzahluattacke++;
				münzen=münzen-6000;
				repaint();
			}
			
			if(e.getX()>458 && e.getY()>234 && e.getX()<471 && e.getY()<249 && itembildschirm==true && itembildschirmfragen==1){

				itembildschirmfragen=2;
				repaint();
				
			}
					
			
			if(e.getX()>458 && e.getY()>234 && e.getX()<471 && e.getY()<249 && itembildschirm==true && itembildschirmfragen==0){

				itembildschirmfragen=1;
				repaint();
				
			}
			
			if(itembildschirmfragen==2){

				itembildschirmfragen=0;
				repaint();
				
			}
			
			
			
		}
	}

	public class Al extends KeyAdapter {
		 
	    public Al(){
	     
	}
	    public void keyPressed(KeyEvent e){
	        
	        key = e.getKeyCode();
	        
	        if(key==KeyEvent.VK_ENTER){
	        	
				if(siegevent==1){
					siegevent++;
				}
	        	
	        	
	        	if(attackenevent>=1 && itembildschirm==false)attackenevent++;
	        	
	        	if(attackenevent==2){
	        		
	        		kritik=(int)(10*Math.random());
	        		
					schaden=Hero.Sattacke(kritik);
					a1schaden=Gegner.getroffen(schaden);}
					
					if (attackenevent==4){
					
					schaden=Gegner.attacke();
					a2schaden=Hero.Sgetroffen(schaden);}
					
					if(a1schaden==123456789){ //Wenn KP des Gegners kleiner null
						
						a1schaden=0;
						attackenevent=0;
						siegevent++;
						repaint();
					}
					
					if(a2schaden==123456789){ //Wenn KP des Spielers kleiner null
						
						a2schaden=0;
						attackenevent=0;
						niederlagenevent=1;
						repaint();
						
						
					}
					
					
					repaint();
					
					if(analyseevent>=1){
						analyseevent++;
					}
					
					if(siegevent==2){
						kampfstatus=1;
						repaint();
					}			
	        	
	        }
	        
	        if(key==KeyEvent.VK_M){
	        	münzen=münzen+100;
	        	repaint();
	        }
	        
	        
	    }
	}
			
			public void paint (Graphics g){
				
				switch(stufe){
				case 1:g.drawImage(b.hinterg1,0,0,600,290, this);
				break;
				case 2:g.drawImage(b.hinterg2,0,0,600,290, this);
				break;
				case 3:g.drawImage(b.hinterg3,0,0,600,290, this);
				break;
				case 4:g.drawImage(b.hinterg4,0,0,600,290, this);
				break;
				case 5:g.drawImage(b.hinterg5,0,0,600,290, this);
				break;
				case 6:g.drawImage(b.hinterg6,0,0,600,290, this);
				break;
				case 7:g.drawImage(b.hinterg7,0,0,600,290, this);
				break;
				case 8:g.drawImage(b.hinterg8,0,0,600,290, this);
				break;
				case 9:g.drawImage(b.hinterg9,0,0,600,290, this);
				break;
				case 10:g.drawImage(b.hinterg10,0,0,600,290, this);
				break;
				case 11:g.drawImage(b.hinterg11,0,0,600,290, this);
				break;
				case 12:g.drawImage(b.hinterg12,0,0,600,290, this);
				break;
				}
				g.setColor(Color.black);
				
				Gegner.malen(g,b.feldn,b.feldd);
				Hero.Smalen(g,b.feldn,b.feldd);
			
				g.drawImage(b.feldf,150,173,300,70, null);
				
				g.setColor(Color.white);
				g.drawRect(155, 178, 145, 30);
				g.drawRect(300, 178, 145, 30);
				g.drawRect(155, 208, 145, 30);
				g.drawRect(300, 208, 145, 30);
				g.drawString("Angriff", 205, 197);
				g.drawString("Items", 355, 197);
				g.drawString("Gegneranalyse", 185, 228);
				g.drawString("Flucht", 355, 228);
				
				if(attackenevent>=1){
					g.drawImage(b.feldf,150,8,300,70, null);
				}

				Gegner.attackentext(g, attackenevent, a1schaden, kritik);
				Hero.Sattackentext(g, attackenevent, a2schaden);
				
				if(attackenevent>=4){
					attackenevent=0;
				}
				
				if(analyseevent==1){
					g.drawImage(b.feldf,150,8,300,70, null);
					Gegner.zeigeAnalysetext(g); 
					}
				if(analyseevent==2){
					analyseevent=0;
				}
				
				if(niederlagenevent==1){
					g.drawImage(b.feldf,150,8,300,70, null);
					Hero.niederlagentext(g);
					
					anzahlheil=2;
					anzahlattacke=0;    //Sämtliche Items werden reduziert
					anzahldef=0;
					anzahluheil=0;
					anzahluattacke=0;    //Sämtliche Items werden reduziert
					anzahludef=0;
					
					münzen=münzen-(münzen*3/10); //30 % Münzen gehen verloren
					attackenevent=0;
					analyseevent=0;
					siegevent=0;
					niederlagenevent=0;
					
					Hero.setitem(0,münzen);
					Hero.setitem(1,anzahlheil);
					Hero.setitem(2,anzahlattacke);
					Hero.setitem(3,anzahldef);
					Hero.setitem(5,anzahluheil);
					Hero.setitem(6,anzahluattacke);
					Hero.setitem(7,anzahludef);
					
					Hero.setAP(AnfangsAngriff);
					Hero.setVP(AnfangsVerteidigung);
					Hero.setHP(MaxLeben);
					
					kampfstatus=2;
					
					
				}

				if(siegevent>=1){
					g.drawImage(b.feldf,150,8,300,70, null);
					
					if(siegevent==1){
					anzahlheil++;
					münzen=münzen+neuemünzen;
					if(Hero.aufleveln(g,1,expmulti)==true){
						AnfangsAngriff=AnfangsAngriff+Hero.getErhöhung(2);
						AnfangsVerteidigung=AnfangsVerteidigung+Hero.getErhöhung(3);
					}else{}
					}
					
					Gegner.niederlagentext(g);
					
					Hero.setitem(0,münzen);
					Hero.setitem(1,anzahlheil);
					Hero.setitem(2,anzahlattacke);
					Hero.setitem(3,anzahldef);
					Hero.setitem(5,anzahluheil);
					Hero.setitem(6,anzahluattacke);
					Hero.setitem(7,anzahludef);
					
					Hero.setAP(AnfangsAngriff);
					Hero.setVP(AnfangsVerteidigung);
					
				}
				
				if(itembildschirm==true){
					
					g.setColor(Color.white);
					g.fillRect(142, 2, 317, 117);
					
					g.setColor(Color.black);
					g.fillRect(150, 123, 301, 130);
					g.fillRect(455, 231, 20, 22);
						
					g.drawRect(145, 5, 150, 30);
					g.drawRect(145, 45, 150, 30);
					g.drawRect(145, 85, 150, 30);
					g.drawRect(305, 5, 150, 30);
					g.drawRect(305, 45, 150, 30);
					g.drawRect(305, 85, 150, 30);
					g.drawString("Heiltrank (25W)", 180, 24);
					g.drawString("Defensivschutz (60W)", 165, 64);
					g.drawString("Attackenpulver (70W)", 168, 104);
					g.drawString("U-Heiltrank (2KW)", 330, 24);
					g.drawString("U-Defensivschutz (5KW)", 313, 64);
					g.drawString("U-Attackenpulver (6KW)", 315, 104);
					
					g.setColor(Color.white);
					
					g.drawRect(458, 234, 13, 15);
					
					g.drawRect(155, 128, 145, 30);
					g.drawRect(300, 128, 145, 30);
					g.drawRect(155, 158, 145, 30);
					g.drawRect(300, 158, 145, 30);
					
					g.drawRect(155, 188, 145, 30);
					g.drawRect(300, 188, 145, 30);
					g.drawRect(155, 218, 145, 30);
					g.drawRect(300, 218, 145, 30);
					g.drawString("Heiltrank ("+anzahlheil+")", 200, 147);
					g.drawString("Defensivschutz ("+anzahldef+")", 185, 177);
					g.drawString("Attackenpulver ("+anzahlattacke+")", 185, 208);
					g.drawString("U-Heiltrank ("+anzahluheil+")", 340, 147);
					g.drawString("U-Defensivschutz ("+anzahludef+")", 320, 177);
					g.drawString("U-Attackenpulver ("+anzahluattacke+")", 320, 208);
					g.drawString(münzen+" Wojtaler", 195, 238);
					g.drawString("Zurück", 355, 238);
					g.drawString("?", 462, 246);
					
					if(itembildschirmfragen==1){
						
						g.setColor(Color.black);
						g.fillRect(150, 123, 301, 130);
						
						g.setColor(Color.white);
						g.drawRect(155, 128, 290, 120);
						
						g.drawString("- Normaler Heiltrank: +10 HP", 185, 150);
						g.drawString("- Temporärer Defensivschutz: +1 VP", 185, 167);
						g.drawString("- Temporäres Attackenpulver: +1 AP", 185, 184);
						g.drawString("- Ultra-Heiltrank: +100 HP", 185, 201);
						g.drawString("- Ultra-Defensivschutz: +15 VP", 185, 218);
						g.drawString("- Ultra-Attackenpulver: +15 AP", 185, 235);
						
					}
					
				}
				
				if(kampfstatus==1){
					
					Hero.setSieg(1);
					
					g.setColor(Color.black);
					g.fillRect(130, 5, 335, 250);
					g.setColor(Color.gray);
					g.fillRect(135, 10, 325, 240);
					g.setColor(Color.black);
					g.fillRect(140, 15, 315, 230);
					
					g.setColor(Color.white);
					
					Font arial2 = new Font("Consolas",Font.BOLD,20);
					g.setFont(arial2);
					
					g.drawString("Kampf gewonnen...", 200, 50);
					
					Font arial4 = new Font("Consolas",Font.PLAIN,12);
					g.setFont(arial4);
					
					g.drawString("- 1 Heiltrank gefunden", 170, 110);
					g.drawString("- "+neuemünzen+" Wojtaler verdient: "+Hero.getitem(0)+" Wojtaler", 170, 140);
					g.drawString("Erfahrungslevel steigt:", 185, 199);
					
					
					g.drawRect(179, 207, 202, 12);
					g.drawString(Hero.getEXP()+" EXP",391,217);
					g.drawString("L"+Hero.getLevel(),150,217);
					
					g.setColor(Color.green);
					g.fillRect(181, 209,(Hero.getEXP()), 8);
					g.setColor(Color.white);
					
					Font arial3 = new Font("Arial",Font.PLAIN,12);
					g.setFont(arial3);
				}
				
				if(kampfstatus==2){
					
					Hero.setSieg(2);
					
					g.setColor(Color.black);
					g.fillRect(130, 5, 335, 250);
					g.setColor(Color.gray);
					g.fillRect(135, 10, 325, 240);
					g.setColor(Color.black);
					g.fillRect(140, 15, 315, 230);
					
					g.setColor(Color.white);
					
					Font arial2 = new Font("Consolas",Font.BOLD,20);
					g.setFont(arial2);
					
					g.drawString("Kampf verloren...", 200, 50);
					
					Font arial4 = new Font("Consolas",Font.PLAIN,12);
					g.setFont(arial4);
					
					g.drawString("Du verlierst 30% deiner Wojtaler...", 160, 110);
					g.drawString("Alles bis auf zwei Heiltränke geht", 160, 140);
					g.drawString("dir verloren...", 160, 157);

					
					Font arial3 = new Font("Arial",Font.PLAIN,12);
					g.setFont(arial3);
				}
				
				
			}
		

}
