package KI;
import java.applet.Applet;


import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;




public class Kampfbild extends JPanel{
	
	
	int attackenevent=0;
	int analyseevent=0;
	int siegevent=0;
	int niederlagenevent=0;
	int stufe=1;
	int kritik;
	int g=3;
	boolean spgew=false;
	int spieler=0;
	boolean schwgew=false;
	private Monster Gegner;
	private Spieler Hero;
	boolean itembildschirm;
	int schaden;
	int a1schaden;
	int a2schaden;
	int anzahlheil=0,anzahlattacke=0,anzahldef=0;
	int anzahluheil=0,anzahluattacke=0,anzahludef=0;
	int münzen=250;
	int key;	
	
	
	Image s1,s2,s3,s4,s5,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,hinterg1,
	hinterg2,hinterg3,hinterg4,hinterg5,hinterg6,hinterg7,hinterg8,hinterg9,hinterg10,hinterg11,hinterg12,feldn,feldd,feldf;
	
	
	
	private MyActionListener a1=new MyActionListener();
		
	  

		public Kampfbild(){
			
			ImageIcon bild1 = new ImageIcon(getClass().getResource("Schleim.gif"));
			m1 = bild1.getImage();	
			ImageIcon bild2 = new ImageIcon(getClass().getResource("Mumie.gif"));
			m2 = bild2.getImage();	
			ImageIcon bild3 = new ImageIcon(getClass().getResource("DracheB.gif"));
			m3 = bild3.getImage();	
			ImageIcon bild4 = new ImageIcon(getClass().getResource("USchleim.gif"));
			m4 = bild4.getImage();	
			ImageIcon bild5 = new ImageIcon(getClass().getResource("ZombieB.gif"));
			m5 = bild5.getImage();	
			ImageIcon bild6 = new ImageIcon(getClass().getResource("Edward.gif"));
			m6 = bild6.getImage();	
			ImageIcon bild7 = new ImageIcon(getClass().getResource("Kobold.gif"));
			m7 = bild7.getImage();	
			ImageIcon bild8 = new ImageIcon(getClass().getResource("Skorpion.gif"));
			m8 = bild8.getImage();	
			ImageIcon bild9 = new ImageIcon(getClass().getResource("OktoB.gif"));
			m9 = bild9.getImage();	
			ImageIcon bild10 = new ImageIcon(getClass().getResource("Magier.gif"));
			m10 = bild10.getImage();	
			ImageIcon bild11 = new ImageIcon(getClass().getResource("Edward2.gif"));
			m11 = bild11.getImage();	
			ImageIcon bild12 = new ImageIcon(getClass().getResource("Schleim3.gif"));
			m12 = bild12.getImage();	
			ImageIcon bild13 = new ImageIcon(getClass().getResource("Igel.gif"));
			m13 = bild13.getImage();	
			ImageIcon bild14 = new ImageIcon(getClass().getResource("Todesbaum.gif"));
			m14 = bild14.getImage();	
			ImageIcon bild15 = new ImageIcon(getClass().getResource("Stier.gif"));
			m15 = bild15.getImage();	
			
			ImageIcon hbild12 = new ImageIcon(getClass().getResource("Wiese.png"));
			hinterg1 = hbild12.getImage();	
			ImageIcon hbild13 = new ImageIcon(getClass().getResource("Wueste.png"));
			hinterg2 = hbild13.getImage();	
			ImageIcon hbild14 = new ImageIcon(getClass().getResource("Festung.png"));
			hinterg3 = hbild14.getImage();	
			ImageIcon hbild15 = new ImageIcon(getClass().getResource("Wald.png"));
			hinterg4 = hbild15.getImage();	
			ImageIcon hbild16 = new ImageIcon(getClass().getResource("Turm.png"));
			hinterg5 = hbild16.getImage();	
			ImageIcon hbild17 = new ImageIcon(getClass().getResource("Wald2.png"));
			hinterg6 = hbild17.getImage();	
			ImageIcon hbild18 = new ImageIcon(getClass().getResource("Wüste2.png"));
			hinterg7 = hbild18.getImage();	
			ImageIcon hbild19 = new ImageIcon(getClass().getResource("Meer.png"));
			hinterg8 = hbild19.getImage();	
			ImageIcon hbild20 = new ImageIcon(getClass().getResource("Höhle.png"));
			hinterg9 = hbild20.getImage();	
			ImageIcon hbild21 = new ImageIcon(getClass().getResource("Spitze.png"));
			hinterg10 = hbild21.getImage();	
			ImageIcon hbild22 = new ImageIcon(getClass().getResource("Baum.png"));
			hinterg11 = hbild22.getImage();	
			ImageIcon hbild23 = new ImageIcon(getClass().getResource("Plateau.png"));
			hinterg12 = hbild23.getImage();	
			
			
			
			ImageIcon bild100 = new ImageIcon(getClass().getResource("TFName.png"));
			feldn = bild100.getImage();	
			ImageIcon bild200 = new ImageIcon(getClass().getResource("TFDaten.png"));
			feldd = bild200.getImage();	
			ImageIcon bild300 = new ImageIcon(getClass().getResource("TFFeld.png"));
			feldf = bild300.getImage();	
			
			ImageIcon bild1000 = new ImageIcon(getClass().getResource("Alphonse.png"));
			s1 = bild1000.getImage();	
			ImageIcon bild2000 = new ImageIcon(getClass().getResource("Leon.png"));
			s2 = bild2000.getImage();	
			ImageIcon bild3000 = new ImageIcon(getClass().getResource("Logan.png"));
			s3 = bild3000.getImage();	
			ImageIcon bild4000 = new ImageIcon(getClass().getResource("Caroline.png"));
			s4 = bild4000.getImage();	
			ImageIcon bild5000 = new ImageIcon(getClass().getResource("Nokia.jpg"));
			s5 = bild5000.getImage();	
			
			
			
			
			
 	    	java.net.URL musik = getClass().getResource("WAV1.wav");
 	    	AudioClip sound = Applet.newAudioClip(musik);

			sound.loop();	
			
			
			
			
			Gegner= new Monster();
			Gegner.setzeEigenschaften(m1 ,"Schleim 1",20,20, 8, 2, 2,"Ein kleiner schwarzer Schleim.","Er sieht nicht besonders gefährlich aus !","","",70,60,15,70);
			
			Hero=new Spieler();
			Hero.setzeSEigenschaften(s1,"Alphonse",40,40, 8, 5, 2,510,50,54,92);
			
			this.addMouseListener(new Mouseklick());
	    	addKeyListener(new Al());
	    	setFocusable(true);
	}
	

	public class Mouseklick extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			
            if(e.getX()>0 && e.getY()>0 && e.getX()<10 && e.getY()<10){
				

				
			}
			
			if(e.getX()>155 && e.getY()>128 && e.getX()<300 && e.getY()<158 && itembildschirm==true  && schwgew==true && spgew==true){
				
				if(anzahlheil>0){
					Hero.heiltrank(anzahlheil);
				anzahlheil--;
				repaint();}
				
			}
			
			if(e.getX()>155 && e.getY()>158 && e.getX()<300 && e.getY()<188 && itembildschirm==true && schwgew==true && spgew==true){
				if(anzahldef>0){
					Hero.defensivschutz(anzahldef);
				anzahldef--;
				repaint();}
			}
			
			if(e.getX()>155 && e.getY()>188 && e.getX()<300 && e.getY()<218 && itembildschirm==true && schwgew==true && spgew==true){
				if(anzahlattacke>0){
					Hero.attackenpulver(anzahlattacke);
				anzahlattacke--;
				repaint();}
			}
			
            if(e.getX()>300 && e.getY()>128 && e.getX()<445 && e.getY()<158 && itembildschirm==true && schwgew==true && spgew==true){
				
				if(anzahluheil>0){
					Hero.uheiltrank(anzahluheil);
				anzahluheil--;
				repaint();}
				
			}
			
			if(e.getX()>300 && e.getY()>158 && e.getX()<445 && e.getY()<188 && itembildschirm==true && schwgew==true && spgew==true){
				if(anzahludef>0){
					Hero.udefensivschutz(anzahludef);
				anzahludef--;
				repaint();}
			}
			
			if(e.getX()>300 && e.getY()>188 && e.getX()<445 && e.getY()<218 && itembildschirm==true && schwgew==true && spgew==true){
				if(anzahluattacke>0){
					Hero.uattackenpulver(anzahluattacke);
				anzahluattacke--;
				repaint();}
			}
			
			
			
			if(e.getX()>155 && e.getY()>178 && e.getX()<300 && e.getY()<208 && itembildschirm==false && schwgew==true && spgew==true){
				
				if (attackenevent==0)attackenevent++;
				repaint();
				
			}
			
			if(e.getX()>300 && e.getY()>208 && e.getX()<445 && e.getY()<238 && itembildschirm==false && attackenevent==0 && schwgew==true && spgew==true){
				System.exit(0);
			}
			
			if(e.getX()>300 && e.getY()>178 && e.getX()<445 && e.getY()<208 && itembildschirm==false && attackenevent==0 && schwgew==true && spgew==true){
				itembildschirm=true;
				repaint();
			}
			
			if(e.getX()>155 && e.getY()>208 && e.getX()<300 && e.getY()<238 && itembildschirm==false && attackenevent==0 && schwgew==true && spgew==true){
				if (analyseevent==0)analyseevent++;
				repaint();
			}
			
			
			if(e.getX()>300 && e.getY()>208 && e.getX()<445 && e.getY()<238 && itembildschirm==true && schwgew==true && spgew==true){
				itembildschirm=false;
				repaint();
			}
			
			if(e.getX()>145 && e.getY()>5 && e.getX()<295 && e.getY()<35 && itembildschirm==true && münzen>=25 && schwgew==true && spgew==true){
				anzahlheil++;
				münzen=münzen-25;
				repaint();
			}
			
			if(e.getX()>145 && e.getY()>45 && e.getX()<295 && e.getY()<75 && itembildschirm==true && münzen>=60 && schwgew==true && spgew==true){
				anzahldef++;
				münzen=münzen-60;
				repaint();
			}
			
			if(e.getX()>145 && e.getY()>85 && e.getX()<295 && e.getY()<105 && itembildschirm==true && münzen>=70 && schwgew==true && spgew==true){
				anzahlattacke++;
				münzen=münzen-70;
				repaint();
			}
			if(e.getX()>305 && e.getY()>5 && e.getX()<455 && e.getY()<35 && itembildschirm==true && münzen>=200 && schwgew==true && spgew==true){
				anzahluheil++;
				münzen=münzen-200;
				repaint();
			}
			
			if(e.getX()>305 && e.getY()>45 && e.getX()<455 && e.getY()<75 && itembildschirm==true && münzen>=500 && schwgew==true && spgew==true){
				anzahludef++;
				münzen=münzen-500;
				repaint();
			}
			
			if(e.getX()>305 && e.getY()>85 && e.getX()<455 && e.getY()<105 && itembildschirm==true && münzen>=600 && schwgew==true  && spgew==true){
				anzahluattacke++;
				münzen=münzen-600;
				repaint();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			if(e.getX()>220 && e.getY()>25 && e.getX()<370 && e.getY()<55 && schwgew==false && spgew==true){
				anzahlheil=8;
				anzahlattacke=5;
				anzahldef=5;
				anzahluheil=1;
				anzahluattacke=1;
				anzahludef=1;
				münzen=500;
				
				//Hero.setzeSEigenschaften("Alphonse",60,60, 10, 7, 3);
				
				schwgew=true;
				repaint();
			}
if(e.getX()>220 && e.getY()>65 && e.getX()<370 && e.getY()<95 && schwgew==false && spgew==true){
	anzahlheil=3;
	anzahlattacke=2;
	anzahldef=2;
	anzahluheil=0;
	anzahluattacke=0;
	anzahludef=0;
	münzen=300;
	
	//Hero.setzeSEigenschaften("Alphonse",50,50, 8, 6, 3);
	
	schwgew=true;
	repaint();
			}
if(e.getX()>220 && e.getY()>105 && e.getX()<370 && e.getY()<135 && schwgew==false && spgew==true){
	anzahlheil=3;
	anzahlattacke=2;
	anzahldef=2;
	anzahluheil=0;
	anzahluattacke=0;
	anzahludef=0;
	münzen=250;
	
	//Hero.setzeSEigenschaften("Alphonse",40,40, 8, 5, 2);
	
	schwgew=true;
	repaint();
}
if(e.getX()>220 && e.getY()>145 && e.getX()<370 && e.getY()<175 && schwgew==false && spgew==true){
	anzahlheil=1;
	anzahlattacke=1;
	anzahldef=1;
	anzahluheil=0;
	anzahluattacke=0;
	anzahludef=0;
	münzen=200;
	
	//Hero.setzeSEigenschaften("Alphonse",40,40, 6, 4, 2);
	
	schwgew=true;
	repaint();
}
if(e.getX()>220 && e.getY()>185 && e.getX()<370 && e.getY()<215 && schwgew==false && spgew==true){
	anzahlheil=1;
	anzahlattacke=0;
	anzahldef=0;
	anzahluheil=0;
	anzahluattacke=0;
	anzahludef=0;
	münzen=100;
	
	//Hero.setzeSEigenschaften("Alphonse",20,20, 5, 2, 2);
	
	schwgew=true;
	repaint();
}





	if(e.getX()>220 && e.getY()>25 && e.getX()<370 && e.getY()<55 && spgew==false){

		Hero.setzeSEigenschaften(s1,"Alphonse",40,40, 8, 5, 2,510,50,54,92);
		spieler=1;
		repaint();
		spgew=true;
	}
	if(e.getX()>220 && e.getY()>65 && e.getX()<370 && e.getY()<95 && spgew==false){

		Hero.setzeSEigenschaften(s2,"Leon",30,30, 15, 1, 2,508,50,58,92);
		spieler=2;
		spgew=true;
		repaint();
	}
	if(e.getX()>220 && e.getY()>105 && e.getX()<370 && e.getY()<135 && spgew==false){

		Hero.setzeSEigenschaften(s3,"Logan",95,95, 6, 1, 2,508,60,64,84);
		spgew=true;
		spieler=3;
		repaint();
	}
	if(e.getX()>220 && e.getY()>145 && e.getX()<370 && e.getY()<175 && spgew==false){

		Hero.setzeSEigenschaften(s4,"Caroline",20,20, 5, 15, 2,515,60,52,80);
		spieler=4;
		spgew=true;
		repaint();
		}
	if(e.getX()>220 && e.getY()>185 && e.getX()<370 && e.getY()<215 && spgew==false){

		Hero.setzeSEigenschaften(s5,"Nokia",5,5, 999, 999, 5,510,60,80,80);
		spieler=5;
		spgew=true;
		repaint();

	}








			
			
		}
	}
	
	public class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			
		}
		}
	
	public class Al extends KeyAdapter {
		 
	    public Al(){
	     
	}
	    public void keyPressed(KeyEvent e){
	        
	        key = e.getKeyCode();
	        
	        if(key==KeyEvent.VK_ENTER){
	        	if(attackenevent>=1 && itembildschirm==false)attackenevent++;
	        	
	        	if(attackenevent==2){
	        		
	        		kritik=(int)(10*Math.random());
					schaden=Hero.Sattacke(kritik);
					a1schaden=Gegner.getroffen(schaden);}
					
					if (attackenevent==4){
					
					schaden=Gegner.attacke();
					a2schaden=Hero.Sgetroffen(schaden);}
					
					if(a1schaden==123456789){
						
						a1schaden=0;
						attackenevent=0;
						siegevent++;
						repaint();
					}
					
					if(a2schaden==123456789){
						
						a2schaden=0;
						attackenevent=0;
						niederlagenevent=1;
						repaint();
						
						
					}
					
					
					repaint();
					
					if(analyseevent>=1){
						analyseevent++;
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
				case 1:g.drawImage(hinterg1,0,0,600,290, this);
				break;
				case 2:g.drawImage(hinterg2,0,0,600,290, this);
				break;
				case 3:g.drawImage(hinterg3,0,0,600,290, this);
				break;
				case 4:g.drawImage(hinterg4,0,0,600,290, this);
				break;
				case 5:g.drawImage(hinterg5,0,0,600,290, this);
				break;
				case 6:g.drawImage(hinterg6,0,0,600,290, this);
				break;
				case 7:g.drawImage(hinterg7,0,0,600,290, this);
				break;
				case 8:g.drawImage(hinterg8,0,0,600,290, this);
				break;
				case 9:g.drawImage(hinterg9,0,0,600,290, this);
				break;
				case 10:g.drawImage(hinterg10,0,0,600,290, this);
				break;
				case 11:g.drawImage(hinterg11,0,0,600,290, this);
				break;
				case 12:g.drawImage(hinterg12,0,0,600,290, this);
				break;
				}
				g.setColor(Color.black);
				
				Gegner.malen(g,feldn,feldd);
				Hero.Smalen(g,feldn,feldd);
			
				g.drawImage(feldf,150,173,300,70, null);
				
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
					g.drawImage(feldf,150,8,300,70, null);
				}

				Gegner.attackentext(g, attackenevent, a1schaden, kritik);
				Hero.Sattackentext(g, attackenevent, a2schaden);
				
				if(attackenevent>=4){
					attackenevent=0;
				}
				
				if(analyseevent==1){
					g.drawImage(feldf,150,8,300,70, null);
					Gegner.zeigeAnalysetext(g); 
					}
				if(analyseevent==2){
					analyseevent=0;
				}
				
				if(niederlagenevent==1){
					g.drawImage(feldf,150,8,300,70, null);
					Hero.niederlagentext(g);
					
					stufe=1;
					anzahlheil=3;
					anzahlattacke=2;
					anzahldef=2;
					münzen=250;
					attackenevent=0;
					analyseevent=0;
					siegevent=0;
					niederlagenevent=0;
					
					Gegner.setzeEigenschaften(m1,"Schleim 1",20,20, 8, 2, 2,"Ein kleiner schwarzer Schleim.","Er sieht nicht besonders gefährlich aus !","","",70,60,15,70);
					
					switch(spieler){
					case 1:Hero.setzeSEigenschaften(s1,"Alphonse",40,40, 8, 5, 2,510,50,54,92);
					break;
					case 2:Hero.setzeSEigenschaften(s2,"Leon",30,30, 15, 1, 2,508,50,58,92);
					break;
					case 3:Hero.setzeSEigenschaften(s3,"Logan",95,95, 6, 1, 2,508,60,64,84);
					break;
					case 4:Hero.setzeSEigenschaften(s4,"Caroline",20,20, 5, 15, 2,515,60,52,80);
					break;
					case 5:Hero.setzeSEigenschaften(s5,"Nokia",5,5, 999, 999, 5,510,60,80,80);
					break;
					}
					
					
				}
				
				
				
				
				if(siegevent==1){
					siegevent++;
					anzahlheil++;
					münzen=münzen+20;
					Gegner.niederlagentext(g,feldf);
					Gegner.setzeEigenschaften(m1,"Schleim 2",25,25, 10, 4, 3,"Ein kleiner schwarzer Schleim.","Er sieht nicht besonders gefährlich aus !","","",70,60,15,70);
				}
				if(siegevent==3){
					stufe=2;
					siegevent++;
					anzahlheil++;
					anzahlattacke++;
					münzen=münzen+40;
				Gegner.niederlagentext(g,feldf);
				Hero.aufleveln(g,1);
				Gegner.setzeEigenschaften(m2,"Mumie 1",40,40, 15, 5, 2,"Eine Mumie aus der fernen Wüste.","Sie ist zu einigem fähig.","","",60,68,20,60);}
				
				if(siegevent==5){
					siegevent++;
					anzahlheil++;
					münzen=münzen+50;
					Gegner.niederlagentext(g,feldf);
					Gegner.setzeEigenschaften(m2,"Mumie 2",60,60, 20, 7, 3,"Eine Mumie aus der fernen Wüste.","Sie ist zu einigem fähig.","","",60,68,20,60);}
				
				if(siegevent==7){
					siegevent++;
					anzahlheil++;
					münzen=münzen+50;
					Gegner.niederlagentext(g,feldf);
					Gegner.setzeEigenschaften(m2,"Mumie 3",80,80, 22, 10, 3,"Eine Mumie aus der fernen Wüste.","Sie ist zu einigem fähig.","","",60,68,20,60);}
				
				if(siegevent==9){
					stufe=3;
					siegevent++;
					anzahlheil++;
					anzahlattacke++;
					münzen=münzen+60;
					Gegner.niederlagentext(g,feldf);
					Hero.aufleveln(g, 1);
					Gegner.setzeEigenschaften(m3,"Drache (Boss)",200,200, 22, 11, 4,"Der sagenumwobene Drache.","Unterschätze niemals seine Macht.","Wenn du ihn besiegen willst","musst du sehr stark sein !!",80,80,10,60);}
				
				if(siegevent==11){
					stufe=4;
					
					siegevent++;
					anzahlheil++;
					anzahlattacke++;
					münzen=münzen+100;
					Gegner.niederlagentext(g,feldf);
					Hero.aufleveln(g, 2);
					Gegner.setzeEigenschaften(m4,"U-Schleim 1",180,180, 30, 15, 4,"Sie nennen sich Ultraschleim","Verbesserte Gattung der Klasse 'Schleim'","- Starker Angriff","- Schwache Defensive",70,60,15,70);}
				
				if(siegevent==13){
					siegevent++;
					anzahlheil++;
					münzen=münzen+120;
					Gegner.niederlagentext(g,feldf);
					Gegner.setzeEigenschaften(m4,"U-Schleim 2",200,200, 32, 17, 5,"Sie nennen sich Ultraschleim","Verbesserte Gattung der Klasse 'Schleim'","- Starker Angriff","- Schwache Defensive",70,60,15,70);}
				
				if(siegevent==15){
					siegevent++;
					anzahlheil++;
					münzen=münzen+150;
					Gegner.niederlagentext(g,feldf);
					Gegner.setzeEigenschaften(m4,"U-Schleim 3",220,220, 34, 19, 5,"Sie nennen sich Ultraschleim","Verbesserte Gattung der Klasse 'Schleim'","- Starker Angriff","- Schwache Defensive",70,60,15,70);}
				
				if(siegevent==17){
					siegevent++;
					anzahlheil++;
					anzahlattacke++;
					münzen=münzen+150;
					Gegner.niederlagentext(g,feldf);
					Hero.aufleveln(g,1);
					Gegner.setzeEigenschaften(m5,"Geist (Boss)",500,500, 20, 80, 6,"Hart, aber mit der richtigen","Taktik leicht zu besiegen.","- Bossgegner Nr.2","- Schockiert seine Gegner",60,60,20,70);}
				
				if(siegevent==19){
					stufe=5;
					
					siegevent++;
					anzahluheil++;
					anzahlattacke++;
					münzen=münzen+480;
					Gegner.niederlagentext(g,feldf);
					Hero.aufleveln(g,2);
					Gegner.setzeEigenschaften(m6,"Fabian (Boss)",1300,1300, 25, 90, 9,"Dein Erzfeind steht vor dir.","Unglaublich böse...","","",86,73,15,60);}
				
				if(siegevent==21){
					stufe=6;
					
					siegevent++;
					anzahlheil++;
					anzahlheil++;
					anzahlheil++;
					münzen=münzen+500;
					Gegner.niederlagentext(g,feldf);
					Hero.aufleveln(g,5);
					Gegner.setzeEigenschaften(m7,"Kobold 1",900,900, 30, 300, 10,"Ziemlich klein.","Achtung vor der Faust...","","",31,40,35,75);}
				
				if(siegevent==23){
					
					siegevent++;
					anzahlheil++;
					anzahlheil++;
					münzen=münzen+500;
					Gegner.niederlagentext(g,feldf);
					Gegner.setzeEigenschaften(m7,"Kobold 2",980,980, 35, 320, 11,"Ziemlich klein.","Achtung vor der Faust...","","",31,40,35,75);}
				
				if(siegevent==25){
					
					siegevent++;
					anzahlheil++;
					anzahlheil++;
					münzen=münzen+500;
					Gegner.niederlagentext(g,feldf);
					Gegner.setzeEigenschaften(m7,"Kobold 3",1000,1000, 35, 350, 11,"Ziemlich klein.","Achtung vor der Faust...","","",31,40,35,75);}
				
				if(siegevent==27){
					stufe=7;
					
					siegevent++;
					anzahlheil++;
					anzahlheil++;
					münzen=münzen+500;
					Gegner.niederlagentext(g,feldf);
					Hero.aufleveln(g,1);
					Gegner.setzeEigenschaften(m8,"Skorpion 1",2000,2000, 200, 80, 2,"Sieh ihn dir an :","Dieser schöne große Stachel...","Diese Stärke...","",66,66,20,60);}
				

				if(siegevent==29){
	
					siegevent++;
					anzahlheil++;
					anzahlheil++;
					münzen=münzen+300;
					Gegner.niederlagentext(g,feldf);
					Gegner.setzeEigenschaften(m8,"Skorpion 2",2200,2200,216, 100, 3,"Sieh ihn dir an :","Dieser schöne große Stachel...","Diese Stärke...","",66,66,20,60);}


				if(siegevent==31){
					siegevent++;
					anzahlheil++;
					anzahlheil++;
					münzen=münzen+300;
					Gegner.niederlagentext(g,feldf);
					Gegner.setzeEigenschaften(m8,"Skorpion 3",2500,2500,115, 100, 4,"Sieh ihn dir an :","Dieser schöne große Stachel...","Diese Stärke...","",66,66,20,60);}

				
				if(siegevent==33){
					stufe=8;
					
					siegevent++;
					anzahlheil++;
					anzahlheil++;
					münzen=münzen+300;
					Gegner.niederlagentext(g,feldf);
					Hero.aufleveln(g,1);
					Gegner.setzeEigenschaften(m9,"Okto (Boss)",5000,5000, 20, 450, 24,"Stärker noch als der Rest.","Ein großer Alptraum wird ein","Monstrum aus Fleisch und Blut...","",64,64,20,70);}
				
				if(siegevent==35){
					stufe=9;
					
					siegevent++;
					anzahlheil++;
					anzahlheil++;
					münzen=münzen+1000;
					Gegner.niederlagentext(g,feldf);
					Hero.aufleveln(g,3);
					Gegner.setzeEigenschaften(m10,"Magier 1",7000,7000, 100, 11, 6,"Verzaubert dich gegen deinen Willen...","","","",70,74,15,60);}
				
				if(siegevent==37){
					siegevent++;
					anzahlheil++;
					anzahlheil++;
					münzen=münzen+500;
					Gegner.niederlagentext(g,feldf);
					Gegner.setzeEigenschaften(m10,"Magier 2",7000,7000, 53, 200, 12,"Verzaubert dich gegen deinen Willen...","","","",70,74,15,60);}
				
				if(siegevent==39){
					stufe=10;
					
					siegevent++;
					anzahluheil++;
					anzahluheil++;
					münzen=münzen+500;
					Gegner.niederlagentext(g,feldf);
					Hero.aufleveln(g,10);
					Gegner.setzeEigenschaften(m11,"Fabian (Boss)",9999,9999, 27, 1000, 30,"Er ist zurückgekehrt","Stärker als je zuvor...","","",204,85,20,60);}
				
				if(siegevent==41){
					stufe=11;
					
					siegevent++;
					anzahluheil++;
					anzahluheil++;
					anzahluattacke++;
					anzahluattacke++;
					anzahludef++;
					anzahludef++;
					münzen=münzen+1800;
					Gegner.niederlagentext(g,feldf);
					Hero.aufleveln(g,6);
					Gegner.setzeEigenschaften(m12,"H-Schleim 1",3000,3000, 49, 3000, 20,"Hyper-Schleime.","Noch mehr Schleim als sonst...","","",70,60,15,70);}
				
				if(siegevent==43){
					siegevent++;
					anzahluheil++;
					münzen=münzen+200;
					Gegner.niederlagentext(g,feldf);
					Gegner.setzeEigenschaften(m12,"H-Schleim 2",3000,3000, 51, 3500, 20,"Hyper-Schleime.","Noch mehr Schleim als sonst...","","",70,60,15,70);}
				
				if(siegevent==45){
					siegevent++;
					anzahluheil++;
					münzen=münzen+200;
					Gegner.niederlagentext(g,feldf);
					Gegner.setzeEigenschaften(m12,"H-Schleim 3",3000,3000, 52, 4000, 21,"Hyper-Schleime.","Noch mehr Schleim als sonst...","","",70,60,15,70);}
				
				if(siegevent==47){
					siegevent++;
					anzahluheil++;
					münzen=münzen+200;
					Gegner.niederlagentext(g,feldf);
					Gegner.setzeEigenschaften(m12,"H-Schleim 4",3700,3700, 53, 4000, 21,"Hyper-Schleime.","Noch mehr Schleim als sonst...","","",70,60,15,70);}
				
				if(siegevent==49){
					siegevent++;
					anzahluheil++;
					münzen=münzen+200;
					Gegner.niederlagentext(g,feldf);
					Gegner.setzeEigenschaften(m12,"H-Schleim 5",3700,3700, 54, 4000, 21,"Hyper-Schleime.","Noch mehr Schleim als sonst...","","",70,60,15,70);}
				
				if(siegevent==51){
					siegevent++;
					anzahluheil++;
					anzahluattacke++;
					münzen=münzen+200;
					Gegner.niederlagentext(g,feldf);
					Hero.aufleveln(g,1);
					Gegner.setzeEigenschaften(m13,"Igel 1",100,100, 28, 5180, 40,"Vorsicht Stacheln...","","","",70,60,15,70);}
				
				if(siegevent==53){
					siegevent++;
					anzahluheil++;
					münzen=münzen+300;
					Gegner.niederlagentext(g,feldf);
					Gegner.setzeEigenschaften(m13,"Igel 2",200,200, 30, 5180, 41,"Vorsicht Stacheln...","","","",70,60,15,70);}
				
				if(siegevent==55){
					siegevent++;
					anzahluheil++;
					münzen=münzen+300;
					Gegner.niederlagentext(g,feldf);
					Gegner.setzeEigenschaften(m13,"Igel 3",300,300, 30, 5180, 41,"Vorsicht Stacheln...","","","",70,60,15,70);}
				
				if(siegevent==57){
					siegevent++;
					anzahluheil++;
					anzahluheil++;
					münzen=münzen+300;
					Gegner.niederlagentext(g,feldf);
					Hero.aufleveln(g,1);
					Gegner.setzeEigenschaften(m14,"Todesbaum",9000,9000, 35, 450, 41,"...  ...","...  ...","...  ...","...  ...",70,70,15,60);}
				
				if(siegevent==59){
					stufe=12;
					
					siegevent++;
					anzahluheil++;
					anzahluheil++;
					anzahluheil++;
					anzahluheil++;
					anzahluheil++;
					anzahluheil++;
					anzahluattacke++;
					anzahluattacke++;
					anzahludef++;
					anzahludef++;
					münzen=münzen+900;
					Gegner.niederlagentext(g,feldf);
					Hero.aufleveln(g,13);
					Gegner.setzeEigenschaften(m15,"Stier (Boss)",1000,1000, 16, 10400, 101,"o__o","...  ...","...  ...","...  ...",60,63,15,70);}
				
				
				
				
				if(schwgew==false){
					g.setColor(Color.black);
					g.fillRect(0, 0, 600, 290);
					
					g.setColor(Color.white);
					
					g.drawRect(220, 25, 150, 30);
					g.drawRect(220, 65, 150, 30);
					g.drawRect(220, 105, 150, 30);
					g.drawRect(220, 145, 150, 30);
					g.drawRect(220, 185, 150, 30);
					
					g.fillRect(380, 25, 150, 30);
					g.fillRect(380, 65, 150, 30);
					g.fillRect(380, 105, 150, 30);
					g.fillRect(380, 145, 150, 30);
					g.fillRect(380, 185, 150, 30);
					
					g.fillRect(60, 25, 150, 30);
					g.fillRect(60, 65, 150, 30);
					g.fillRect(60, 105, 150, 30);
					g.fillRect(60, 145, 150, 30);
					g.fillRect(60, 185, 150, 30);
					
					g.drawString("-- Simpel --", 270, 44);
					g.drawString("-- Leicht --", 270, 84);
					g.drawString("-- Mittel --", 270, 124);
					g.drawString("-- Schwer --", 265, 164);
					g.drawString("-- Gemein --", 265, 204);
					
					g.setColor(Color.black);
					
					g.drawString("Zu einfach ->", 118, 44);
					g.drawString("Für Anfänger ->", 105, 84);
					g.drawString("Der Standard ->", 103, 124);
					g.drawString("Ziemlich schwierig ->", 73, 164);
					g.drawString("Unmachbar ->", 110, 204);
					
					g.drawString("<- Zu einfach", 400, 44);
					g.drawString("<- Für Anfänger", 400, 84);
					g.drawString("<- Der Standard", 400, 124);
					g.drawString("<- Ziemlich schwierig", 400, 164);
					g.drawString("<- Unmachbar", 400, 204);
					
					
					
				}
				
				
				
				
				if(spgew==false){
					g.setColor(Color.black);
					g.fillRect(0, 0, 600, 290);
					
					g.setColor(Color.white);
					
					g.drawRect(220, 25, 150, 30);
					g.drawRect(220, 65, 150, 30);
					g.drawRect(220, 105, 150, 30);
					g.drawRect(220, 145, 150, 30);
					g.drawRect(220, 185, 150, 30);
					
					g.fillRect(380, 25, 150, 30);
					g.fillRect(380, 65, 150, 30);
					g.fillRect(380, 105, 150, 30);
					g.fillRect(380, 145, 150, 30);
					g.fillRect(380, 185, 150, 30);
					
					g.fillRect(60, 25, 150, 30);
					g.fillRect(60, 65, 150, 30);
					g.fillRect(60, 105, 150, 30);
					g.fillRect(60, 145, 150, 30);
					g.fillRect(60, 185, 150, 30);
					
					g.drawString("Alphonse", 270, 44);
					g.drawString("Leon", 280, 84);
					g.drawString("Logan", 275, 124);
					g.drawString("Caroline", 270, 164);
					g.drawString("Special: Nokia", 255, 204);
					
					g.setColor(Color.black);
					
					g.drawString("Durchschnittstyp ->", 85, 44);
					g.drawString("Hoher Angriff ->", 105, 84);
					g.drawString("Viele KP ->", 130, 124);
					g.drawString("Starke Defensive ->", 83, 164);
					g.drawString("Unbeschreiblich ->", 87, 204);
					
					g.drawString("<- Durchschnittstyp", 400, 44);
					g.drawString("<- Hoher Angriff", 400, 84);
					g.drawString("<- Viele KP", 400, 124);
					g.drawString("<- Starke Defensive", 400, 164);
					g.drawString("<- Unbeschreiblich", 400, 204);
					
					
					
					
					
					
				}
				
				
				
				if(itembildschirm==true){
					
					g.setColor(Color.white);
					g.fillRect(142, 2, 317, 117);
					
					g.setColor(Color.black);
					g.fillRect(150, 123, 301, 130);
					
					g.drawRect(145, 5, 150, 30);
					g.drawRect(145, 45, 150, 30);
					g.drawRect(145, 85, 150, 30);
					g.drawRect(305, 5, 150, 30);
					g.drawRect(305, 45, 150, 30);
					g.drawRect(305, 85, 150, 30);
					g.drawString("Heiltrank (25M)", 180, 24);
					g.drawString("Defensivschutz (60M)", 165, 64);
					g.drawString("Attackenpulver (70M)", 168, 104);
					g.drawString("U-Heiltrank (200M)", 330, 24);
					g.drawString("U-Defensivschutz (500M)", 313, 64);
					g.drawString("U-Attackenpulver (600M)", 315, 104);
					
					
					
					g.setColor(Color.white);
					
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
					g.drawString(münzen+" Münzen", 195, 238);
					g.drawString("Zurück", 355, 238);
				}
				
				
			}

}
