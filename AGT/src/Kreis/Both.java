package Kreis;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Both extends JPanel implements Runnable{

	String names1="",names2="",namedercharakterauswahl="";
	boolean weiter=true,pause=false,eigenschaft1vonP1=false,eigenschaft1vonP2=false;
	int level=1;
	int leben=5;
	boolean prüfer=true;
	int BM=1000;
	int key;
	int bewegung=0;  
	int bewegung2=0;
	int xs=30;
	int ys=280;
	int xss2=1140;
	int yss2=280;
	int spielervariable=1;
	int egg=0;
	boolean geschprüfer1=false,geschprüfer2=false;
	int spielervonspieler1=0,spielervonspieler2=0;
	int xlaser1, ylaser1, xlaser2, ylaser2;
	int zaehler11=0, zaehler12=0;
	boolean mehrspieler=true;
	boolean auslöser1vonP1=false,auslöser1vonP2=false;
	int xg=(int)(1200*Math.random()),yg=(int)(700*Math.random());
	int xb=(int)(1200*Math.random()),yb=(int)(700*Math.random());
	int xr=(int)(1200*Math.random()),yr=(int)(700*Math.random());
	int xs1=(int)(1200*Math.random()),ys1=(int)(700*Math.random());
	int xs2=(int)(1200*Math.random()),ys2=(int)(700*Math.random());
	int xs3=(int)(1200*Math.random()),ys3=(int)(700*Math.random());
	int xs4=(int)(1200*Math.random()),ys4=(int)(700*Math.random());
	int xs5=(int)(1200*Math.random()),ys5=(int)(700*Math.random());
	int xs6=(int)(1200*Math.random()),ys6=(int)(700*Math.random());
	int xs7=(int)(1200*Math.random()),ys7=(int)(700*Math.random());
	int xs8=(int)(1200*Math.random()),ys8=(int)(700*Math.random());
	int xs9=(int)(1200*Math.random()),ys9=(int)(700*Math.random());
	int xs10=(int)(1200*Math.random()),ys10=(int)(700*Math.random());
	int xs11=(int)(1200*Math.random()),ys11=(int)(700*Math.random());
	int xs12=(int)(1200*Math.random()),ys12=(int)(700*Math.random());
	int g1x=200,g2x=400,g3x=600,g4x=800,g5x=1000;
	int g1y=0,g2y=0,g3y=0,g4y=0,g5y=0;
	
	int xsonder=(int)(1200*Math.random()),ysonder=(int)(700*Math.random());
	int xsonder2=(int)(1200*Math.random()),ysonder2=(int)(700*Math.random());
	boolean hardcore=false;
	
	int punkte=0;
	int punkte2=0;
	int dauer=10;


	
	Image punkte10,punkte20,punkte50,hintergrund1,hintergrund2,
	hintergrund3,hintergrund4,hintergrund5,hintergrund6,laseritem,geschitem,
	spieler1,spieler2,spieler3,spieler4,spieler5,EggMario,EggMond,EggLink,
	Egghaarelang,Eggschlagen,EggMM,EggSamus,EggGanondorf;
	
	
	 private MyActionListener a1=new MyActionListener();
	
	  

	public Both(){
		
			ImageIcon bild1 = new ImageIcon(getClass().getResource("Geld10.png"));
				punkte10 = bild1.getImage();	
	 	    ImageIcon bild2 = new ImageIcon(getClass().getResource("Geld20.png"));
	 	    	punkte20 = bild2.getImage();	
	 	    ImageIcon bild3 = new ImageIcon(getClass().getResource("Geld50.png"));
	 	    	punkte50 = bild3.getImage();	
	 	    ImageIcon bild4 = new ImageIcon(getClass().getResource("Spieler1.png"));
	 	    	spieler1 = bild4.getImage();	
	 	    ImageIcon bild5 = new ImageIcon(getClass().getResource("Spieler2.png"));
	 	    	spieler2 = bild5.getImage();	
 			ImageIcon bild6 = new ImageIcon(getClass().getResource("Spieler3.png"));
 				spieler3 = bild6.getImage();	
	 		ImageIcon bild7 = new ImageIcon(getClass().getResource("Spieler4.png"));
	 			spieler4 = bild7.getImage();	
	 	 	ImageIcon bild8 = new ImageIcon(getClass().getResource("Spieler5.png"));
	 	 		spieler5 = bild8.getImage();	
	    	ImageIcon bild9 = new ImageIcon(getClass().getResource("Laser-Item.png"));
	    		laseritem = bild9.getImage();
	    		ImageIcon item2 = new ImageIcon(getClass().getResource("Geschwindigkeitsitem.png"));
	    		geschitem = item2.getImage();
	 	    ImageIcon bild10 = new ImageIcon(getClass().getResource("Hintergrund Both.png"));
	 	    	hintergrund1 = bild10.getImage();
	 	    ImageIcon bild11 = new ImageIcon(getClass().getResource("Hintergrund1.png"));
	 	    	hintergrund2 = bild11.getImage();
	 	    ImageIcon bild12 = new ImageIcon(getClass().getResource("Hintergrund2.png"));
	 	    	hintergrund3 = bild12.getImage();
	 	    ImageIcon bild13 = new ImageIcon(getClass().getResource("Hintergrund3.png"));
	 	    	hintergrund4 = bild13.getImage();
	 	    ImageIcon bild14 = new ImageIcon(getClass().getResource("Hintergrund4.png"));
	 	    	hintergrund5 = bild14.getImage();
	 	    ImageIcon bild15 = new ImageIcon(getClass().getResource("Hintergrund5.png"));
	 	    	hintergrund6 = bild15.getImage();
	 	    ImageIcon Egg1 = new ImageIcon(getClass().getResource("Pilze.jpg"));
	 	    	EggMario = Egg1.getImage();
	 	    ImageIcon Egg2 = new ImageIcon(getClass().getResource("Mond.jpg"));
	 	    	EggMond = Egg2.getImage();
	 	    ImageIcon Egg3 = new ImageIcon(getClass().getResource("Triforce_OoT.png"));
	 	    	EggLink = Egg3.getImage();
 	    	ImageIcon Egg4 = new ImageIcon(getClass().getResource("schläger.png"));
	 	    	Eggschlagen = Egg4.getImage();
	 	    ImageIcon Egg5 = new ImageIcon(getClass().getResource("langehaare.png"));
	 	    	Egghaarelang = Egg5.getImage();
 	    	ImageIcon Egg6 = new ImageIcon(getClass().getResource("MegaMan.jpg"));
	 	    	EggMM = Egg6.getImage();
 	    	ImageIcon Egg7 = new ImageIcon(getClass().getResource("WindWaker.jpg"));
	 	    	EggGanondorf = Egg7.getImage();
	 	    ImageIcon Egg8 = new ImageIcon(getClass().getResource("Super Metroid Samus.gif"));
	 	    	EggSamus = Egg8.getImage();
	 	  
	 	    	java.net.URL musik1 = getClass().getResource("Dr.Wily.mid");
	 	    	AudioClip sound = Applet.newAudioClip(musik1);

		    sound.loop();
		
	    	this.addMouseListener(new Mouseklick());
	    	addKeyListener(new Al());
	    	setFocusable(true);
	    	startanimation();
	}
	

	public class Mouseklick extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
		
		if (BM==1){
			if(e.getX()<390 && e.getX()>300 && e.getY()>280 && e.getY()<370){
				
				if(spielervariable==2){
					spielervonspieler2=1;
					BM=0;
				}
				
				if(spielervariable==1){
					spielervonspieler1=1;
					spielervariable=2;
				}
			}
			
			if(e.getX()<510 && e.getX()>420 && e.getY()>280 && e.getY()<370){
				
				if(spielervariable==2){
					spielervonspieler2=2;
					BM=0;
				}
				
				if(spielervariable==1){
					spielervonspieler1=2;
					spielervariable=2;
				}
			}
			
			if(e.getX()<630 && e.getX()>540 && e.getY()>280 && e.getY()<370){
				
				if(spielervariable==2){
					spielervonspieler2=3;
					BM=0;
				}
				
				if(spielervariable==1){
					spielervonspieler1=3;
					spielervariable=2;
				}
			}
			
			if(e.getX()<750 && e.getX()>660 && e.getY()>280 && e.getY()<370){
				
				if(spielervariable==2){
					spielervonspieler2=4;
					BM=0;
				}
				
				if(spielervariable==1){
					spielervonspieler1=4;
					spielervariable=2;
				}
			}
			
			if(e.getX()<870 && e.getX()>780 && e.getY()>280 && e.getY()<370){
				
				if(spielervariable==2){
					spielervonspieler2=5;
					BM=0;
				}
				
				if(spielervariable==1){
					spielervonspieler1=5;
					spielervariable=2;
				}
			}	
		}
		
					if(BM==2){
						
				if(e.getX()<750 && e.getX()>450 && e.getY()>500 && e.getY()<650){
					BM=1;
					egg=0;
				}
				
					if(e.getX()<280 && e.getX()>250 && e.getY()>150 && e.getY()<180){
						names2=names2+"A";
						if(names2.equals("ZELDA")==true){
							egg=1;
						}
						}
					if(e.getX()<330 && e.getX()>300 && e.getY()>150 && e.getY()<180){
						names2=names2+"B";
						}
					if(e.getX()<380 && e.getX()>350 && e.getY()>150 && e.getY()<180){
						names2=names2+"C";
						}
					if(e.getX()<430 && e.getX()>400 && e.getY()>150 && e.getY()<180){
						names2=names2+"D";
						if(names2.equals("MOND")==true){
							egg=2;
						}
						}
					if(e.getX()<480 && e.getX()>450 && e.getY()>150 && e.getY()<180){
						names2=names2+"E";
						}
					if(e.getX()<280 && e.getX()>250 && e.getY()>200 && e.getY()<230){
						names2=names2+"F";
						if(names2.equals("LEIF")==true){
							egg=4;
						}
						if(names2.equals("GANONDORF")==true){
							egg=8;
						}
						}
					if(e.getX()<330 && e.getX()>300 && e.getY()>200 && e.getY()<230){
						names2=names2+"G";
						}
					if(e.getX()<380 && e.getX()>350 && e.getY()>200 && e.getY()<230){
						names2=names2+"H";
						}
					if(e.getX()<430 && e.getX()>400 && e.getY()>200 && e.getY()<230){
						names2=names2+"I";
						}
					if(e.getX()<480 && e.getX()>450 && e.getY()>200 && e.getY()<230){
						names2=names2+"J";
						}
					if(e.getX()<255 && e.getX()>225 && e.getY()>250 && e.getY()<280){
						names2=names2+"K";
						if(names2.equals("LINK")==true){
							egg=1;
						}
						}
					if(e.getX()<305 && e.getX()>275 && e.getY()>250 && e.getY()<280){
						names2=names2+"L";
						}
					if(e.getX()<355 && e.getX()>325 && e.getY()>250 && e.getY()<280){
						names2=names2+"M";
						}
					if(e.getX()<405 && e.getX()>375 && e.getY()>250 && e.getY()<280){
						names2=names2+"N";
						if(names2.equals("FABIAN")==true){
							egg=5;
						}
						if(names2.equals("SAMUSARAN")==true){
							egg=6;
						}
						if(names2.equals("MEGAMAN")==true){
							egg=7;
						}
						}
					if(e.getX()<455 && e.getX()>425 && e.getY()>250 && e.getY()<280){
						names2=names2+"O";
						if(names2.equals("MARIO")==true){
							egg=3;
						}
						}
					if(e.getX()<505 && e.getX()>475 && e.getY()>250 && e.getY()<280){
						names2=names2+"P";
						}
					if(e.getX()<280 && e.getX()>250 && e.getY()>300 && e.getY()<330){
						names2=names2+"Q";
						}
					if(e.getX()<330 && e.getX()>300 && e.getY()>300 && e.getY()<330){
						names2=names2+"R";
						}
					if(e.getX()<380 && e.getX()>350 && e.getY()>300 && e.getY()<330){
						names2=names2+"S";
						}
					if(e.getX()<430 && e.getX()>400 && e.getY()>300 && e.getY()<330){
						names2=names2+"T";
						}
					if(e.getX()<480 && e.getX()>450 && e.getY()>300 && e.getY()<330){
						names2=names2+"U";
						}
					if(e.getX()<280 && e.getX()>250 && e.getY()>350 && e.getY()<380){
						names2=names2+"V";
						}
					if(e.getX()<330 && e.getX()>300 && e.getY()>350 && e.getY()<380){
						names2=names2+"W";
						}
					if(e.getX()<380 && e.getX()>350 && e.getY()>350 && e.getY()<380){
						names2=names2+"X";
						}
					if(e.getX()<430 && e.getX()>400 && e.getY()>350 && e.getY()<380){
						names2=names2+"Y";
						}
					if(e.getX()<480 && e.getX()>450 && e.getY()>350 && e.getY()<380){
						names2=names2+"Z";
						}
					if(e.getX()<480 && e.getX()>300 && e.getY()>400 && e.getY()<430){
						names2=names2+"  ";
						}
				
		}
		if(BM==3){
			if(e.getX()<750 && e.getX()>450 && e.getY()>500 && e.getY()<650){
			BM=2;
			egg=0;
			}
			
			if(e.getX()<280 && e.getX()>250 && e.getY()>150 && e.getY()<180){
				names1=names1+"A";
				if(names1.equals("ZELDA")==true){
					egg=1;
				}
				}
			if(e.getX()<330 && e.getX()>300 && e.getY()>150 && e.getY()<180){
				names1=names1+"B";
				}
			if(e.getX()<380 && e.getX()>350 && e.getY()>150 && e.getY()<180){
				names1=names1+"C";
				}
			if(e.getX()<430 && e.getX()>400 && e.getY()>150 && e.getY()<180){
				names1=names1+"D";
				if(names1.equals("MOND")==true){
					egg=2;
				}
				}
			if(e.getX()<480 && e.getX()>450 && e.getY()>150 && e.getY()<180){
				names1=names1+"E";
				}
			if(e.getX()<280 && e.getX()>250 && e.getY()>200 && e.getY()<230){
				names1=names1+"F";
				if(names1.equals("LEIF")==true){
					egg=4;
				}
				if(names1.equals("GANONDORF")==true){
					egg=8;
				}
				}
			if(e.getX()<330 && e.getX()>300 && e.getY()>200 && e.getY()<230){
				names1=names1+"G";
				}
			if(e.getX()<380 && e.getX()>350 && e.getY()>200 && e.getY()<230){
				names1=names1+"H";
				}
			if(e.getX()<430 && e.getX()>400 && e.getY()>200 && e.getY()<230){
				names1=names1+"I";
				}
			if(e.getX()<480 && e.getX()>450 && e.getY()>200 && e.getY()<230){
				names1=names1+"J";
				}
			if(e.getX()<255 && e.getX()>225 && e.getY()>250 && e.getY()<280){
				names1=names1+"K";
				if(names1.equals("LINK")==true){
					egg=1;
				}
				}
			if(e.getX()<305 && e.getX()>275 && e.getY()>250 && e.getY()<280){
				names1=names1+"L";
				}
			if(e.getX()<355 && e.getX()>325 && e.getY()>250 && e.getY()<280){
				names1=names1+"M";
				}
			if(e.getX()<405 && e.getX()>375 && e.getY()>250 && e.getY()<280){
				names1=names1+"N";
				if(names1.equals("FABIAN")==true){
					egg=5;
				}
				if(names1.equals("SAMUSARAN")==true){
					egg=6;
				}
				if(names1.equals("MEGAMAN")==true){
					egg=7;
				}
				}
			if(e.getX()<455 && e.getX()>425 && e.getY()>250 && e.getY()<280){
				names1=names1+"O";
				if(names1.equals("MARIO")==true){
					egg=3;
				}
				}
			if(e.getX()<505 && e.getX()>475 && e.getY()>250 && e.getY()<280){
				names1=names1+"P";
				}
			if(e.getX()<280 && e.getX()>250 && e.getY()>300 && e.getY()<330){
				names1=names1+"Q";
				}
			if(e.getX()<330 && e.getX()>300 && e.getY()>300 && e.getY()<330){
				names1=names1+"R";
				}
			if(e.getX()<380 && e.getX()>350 && e.getY()>300 && e.getY()<330){
				names1=names1+"S";
				}
			if(e.getX()<430 && e.getX()>400 && e.getY()>300 && e.getY()<330){
				names1=names1+"T";
				}
			if(e.getX()<480 && e.getX()>450 && e.getY()>300 && e.getY()<330){
				names1=names1+"U";
				}
			if(e.getX()<280 && e.getX()>250 && e.getY()>350 && e.getY()<380){
				names1=names1+"V";
				}
			if(e.getX()<330 && e.getX()>300 && e.getY()>350 && e.getY()<380){
				names1=names1+"W";
				}
			if(e.getX()<380 && e.getX()>350 && e.getY()>350 && e.getY()<380){
				names1=names1+"X";
				}
			if(e.getX()<430 && e.getX()>400 && e.getY()>350 && e.getY()<380){
				names1=names1+"Y";
				}
			if(e.getX()<480 && e.getX()>450 && e.getY()>350 && e.getY()<380){
				names1=names1+"Z";
				}
			if(e.getX()<480 && e.getX()>300 && e.getY()>400 && e.getY()<430){
				names1=names1+"  ";
				}
			
			
		}
			if(BM==999){
				if(e.getX()<20 && e.getX()>0 && e.getY()>0 && e.getY()<20){
					mehrspieler=false;
				}
				
			if(e.getX()<1150 && e.getX()>850 && e.getY()>500 && e.getY()<650){
				BM=1000;
			}
		}
			
		if(BM==1000){
			
			if(e.getX()<750 && e.getX()>450 && e.getY()>500 && e.getY()<650){
				BM=999;
			}
			if(e.getX()<750 && e.getX()>450 && e.getY()>300 && e.getY()<450){
				if(mehrspieler==true){
				BM=3;}
				if(mehrspieler==false){
					BM=0;}
			}
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
	        
	        if(key==KeyEvent.VK_D){
	        	bewegung=1;
	        }
	        if(key==KeyEvent.VK_A){
	        	bewegung=2;
	        }
	        if(key==KeyEvent.VK_S){
	        	bewegung=3;
	        }
	        if(key==KeyEvent.VK_W){
	        	bewegung=4;
	        }
	        
	        if(mehrspieler==true){
	        if(key==KeyEvent.VK_RIGHT){
	        	bewegung2=1;
	        }
	        if(key==KeyEvent.VK_LEFT){
	        	bewegung2=2;
	        }
	        if(key==KeyEvent.VK_DOWN){
	        	bewegung2=3;
	        }
	        if(key==KeyEvent.VK_UP){
	        	bewegung2=4;
	        }
	        
	        
	        if(key==KeyEvent.VK_P){
	        	pause=true;
	        }
	        if(key==KeyEvent.VK_F){
	        	pause=false;
	        }
	        
	        }
	        
	        
	        if(key==KeyEvent.VK_Q){
	        	System.exit(0);
	        }
	        
	        if(mehrspieler==true){
	        	
	        
	        if(key==KeyEvent.VK_H){
	        	hardcore=true;
	        }}
	        
	        
	        
	        if(key==KeyEvent.VK_N){
	        	if(mehrspieler==false){
	        		BM=1000;
	        		bewegung=0;
	        		xs=30;
	    			ys=280;
	    			level=1;
	    			leben=5;
	        	}
	        	
	        	if(mehrspieler==true){
	        	bewegung=0;
	        	bewegung2=0;
	        	xs=30;
    			ys=280;
    			xss2=1140;
    			yss2=280;
    			punkte=0;
    			punkte2=0;
    			eigenschaft1vonP1=false;
    			eigenschaft1vonP2=false;
    			
    			xg=(int)(1200*Math.random());
    			yg=(int)(700*Math.random());
    			xb=(int)(1200*Math.random());
    			yb=(int)(700*Math.random());
    			xr=(int)(1200*Math.random());
    			yr=(int)(700*Math.random());
    			xs1=(int)(1200*Math.random());
    			ys1=(int)(700*Math.random());
    			xs2=(int)(1200*Math.random());
    			ys2=(int)(700*Math.random());
    			xs3=(int)(1200*Math.random());
    			ys3=(int)(700*Math.random());
    			if(hardcore==true){
    				xs4=(int)(1200*Math.random());
        			ys4=(int)(700*Math.random());
        			xs5=(int)(1200*Math.random());
        			ys5=(int)(700*Math.random());
        			xs6=(int)(1200*Math.random());
        			ys6=(int)(700*Math.random());
        			xs7=(int)(1200*Math.random());
        			ys7=(int)(700*Math.random());
        			xs8=(int)(1200*Math.random());
        			ys8=(int)(700*Math.random());
        			xs9=(int)(1200*Math.random());
        			ys9=(int)(700*Math.random());
        			xs10=(int)(1200*Math.random());
        			ys10=(int)(700*Math.random());
        			xs11=(int)(1200*Math.random());
        			ys11=(int)(700*Math.random());
        			xs12=(int)(1200*Math.random());
        			ys12=(int)(700*Math.random());
    			}
    			xsonder=(int)(1200*Math.random());
    			ysonder=(int)(700*Math.random());
    			xsonder2=(int)(1200*Math.random());
    			ysonder2=(int)(700*Math.random());
    			while(xg<20 || (xg+16)>1180 || yg<60 || (yg+28)>680){
    				xg=(int)(1200*Math.random());
        			yg=(int)(700*Math.random());
				}
    			while(xb<20 || (xb+16)>1180 || yb<60 || (yb+28)>680){
    				xb=(int)(1200*Math.random());
        			yb=(int)(700*Math.random());
				}
    			while(xr<20 || (xr+16)>1180 || yr<60 || (yr+28)>680){
    				xr=(int)(1200*Math.random());
        			yr=(int)(700*Math.random());
				}
    			while(xs1<20 || (xs1+27)>1180 || ys1<60 || (ys1+54)>680){
    				xs1=(int)(1200*Math.random());
        			ys1=(int)(700*Math.random());
				}
    			while(xs2<20 || (xs2+27)>1180 || ys2<60 || (ys2+54)>680){
    				xs2=(int)(1200*Math.random());
        			ys2=(int)(700*Math.random());
				}
    			while(xs3<20 || (xs3+27)>1180 || ys3<60 || (ys3+54)>680){
    				xs3=(int)(1200*Math.random());
        			ys3=(int)(700*Math.random());
				}
    			while(xsonder<20 || (xsonder+16)>1180 || ysonder<60 || (ysonder+28)>680){
    				xsonder=(int)(1200*Math.random());
        			ysonder=(int)(700*Math.random());
				}
    			while(xsonder2<20 || (xsonder2+16)>1180 || ysonder2<60 || (ysonder2+28)>680){
    				xsonder2=(int)(1200*Math.random());
        			ysonder2=(int)(700*Math.random());
				}
    			
	        }
	        	
	        	
	        	
	        }
	        
	        if(key==KeyEvent.VK_1){
	        	dauer=20;
	        }
	        if(key==KeyEvent.VK_2){
	        	dauer=10;
	        }
	        if(key==KeyEvent.VK_3){
	        	dauer=5;
	        }
	        if(key==KeyEvent.VK_4){
	        	dauer=1;
	        }
	        
	        if(mehrspieler==true){
	        	
	        if(key==KeyEvent.VK_SPACE){
	        	if(eigenschaft1vonP1==true){
	        	
	        		xlaser1=xs;
	        		ylaser1=ys;
	        		auslöser1vonP1=true;
	        		
	        		if(bewegung==1){
	        			zaehler11=1;
	        		}
	        		if(bewegung==2){
	        			zaehler11=2;
	        		}
	        		if(bewegung==3){
	        			zaehler11=3;
	        		}
	        		if(bewegung==4){
	        			zaehler11=4;
	        		}
	        		eigenschaft1vonP1=false;
	        	}
	        } 
	        if(key==KeyEvent.VK_L){
	        	if(eigenschaft1vonP2==true){
		        	
	        		xlaser2=xss2;
	        		ylaser2=yss2;
	        		auslöser1vonP2=true;
	        		
	        		if(bewegung2==1){
	        			zaehler12=1;
	        		}
	        		if(bewegung2==2){
	        			zaehler12=2;
	        		}
	        		if(bewegung2==3){
	        			zaehler12=3;
	        		}
	        		if(bewegung2==4){
	        			zaehler12=4;
	        		}
	        		eigenschaft1vonP2=false;
	        	}
	        }
	        
	    }
	    }

	}
	public void startanimation(){
		Thread Grafik = new Thread(this);
		Grafik.start();
	}
	
	
	
	public void run(){
		while(weiter){
			try{
				if(mehrspieler==false){
					
					if(level==3 && prüfer==true){
						g1x=200;
						g2x=400;
						g3x=600;
						g4x=800;
						g5x=1000;
						g1y=0;
						g2y=0;
						g3y=0;
						g4y=0;
						g5y=0;
						
						prüfer=false;
					}
					if(level==4 && prüfer==true){
						g1x=200;
						g2x=400;
						g3x=600;
						g4x=800;
						g5x=1000;
						g1y=100;
						g2y=200;
						g3y=300;
						g4y=400;
						g5y=500;
						
						prüfer=false;
					}
					
					
					
				if(xs<20 || (xs+30)>1180 || ys<20 || (ys+30)>680){
					bewegung=0;
					if(level==1){
						xs=30;
						ys=280;}
					if(level==2){
						xs=30;
						ys=50;}
					if(level==3){
						xs=30;
						ys=280;}
					if(level==4){
						xs=30;
						ys=280;}
	    			leben--;}
				
				if(level==1){
					
				if(xs<520 && (xs+30)>500 && ys<500 && (ys+30)>100){
					bewegung=0;
					xs=30;
	    			ys=280;
	    			leben--;}
				
				if(xs<1016 && (xs+30)>1000 && ys<356 && (ys+30)>340){
					bewegung=0;
					xs=30;
	    			ys=50;
	    			level=2;}
				}
				
				if(level==2){
					
					if(xs<220 && (xs+30)>200 && ys<620 && (ys+30)>0){
						bewegung=0;
						xs=30;
		    			ys=50;
		    			leben--;}
					if(xs<520 && (xs+30)>500 && ys<800 && (ys+30)>100){
						bewegung=0;
						xs=30;
		    			ys=50;
		    			leben--;}
					if(xs<820 && (xs+30)>800 && ys<620 && (ys+30)>0){
						bewegung=0;
						xs=30;
		    			ys=50;
		    			leben--;}
					
					if(xs<1116 && (xs+30)>1000 && ys<116 && (ys+30)>100){
						bewegung=0;
						xs=30;
		    			ys=280;
		    			level=3;}
					}
				
					if(level==3){
						
						if(g1y<720){
							g1y=g1y+4;
						}else{
							g1y=-50;
						}
						if(g2y<720){
							g2y=g2y+4;
						}else{
							g2y=-50;
						}
						if(g3y<720){
							g3y=g3y+4;
						}else{
							g3y=-50;
						}
						if(g4y<720){
							g4y=g4y+4;
						}else{
							g4y=-50;
						}
						if(g5y<720){
							g5y=g5y+4;
						}else{
							g5y=-50;
						}
					
					if(xs<(g1x+20) && (xs+30)>g1x && ys<(g1y+20) && (ys+30)>g1y){
						bewegung=0;
						xs=30;
		    			ys=50;
		    			leben--;}
					if(xs<(g2x+20) && (xs+30)>g2x && ys<(g2y+20) && (ys+30)>g2y){
						bewegung=0;
						xs=30;
		    			ys=50;
		    			leben--;}
					if(xs<(g3x+20) && (xs+30)>g3x && ys<(g3y+20) && (ys+30)>g3y){
						bewegung=0;
						xs=30;
		    			ys=50;
		    			leben--;}
					if(xs<(g4x+20) && (xs+30)>g4x && ys<(g4y+20) && (ys+30)>g4y){
						bewegung=0;
						xs=30;
		    			ys=50;
		    			leben--;}
					if(xs<(g5x+20) && (xs+30)>g5x && ys<(g5y+20) && (ys+30)>g5y){
						bewegung=0;
						xs=30;
		    			ys=50;
		    			leben--;}
					
					
					if(xs<1116 && (xs+30)>1000 && ys<116 && (ys+30)>100){
						bewegung=0;
						xs=30;
		    			ys=280;
		    			level=4;
		    			prüfer=true;}
					}
					
					if(level==4){
						
						if(g1y>-20){
							g1y=g1y-4;
						}else{
							g1y=750;
						}
						if(g2y>-20){
							g2y=g2y-4;
						}else{
							g2y=750;
						}
						if(g3y>-20){
							g3y=g3y-4;
						}else{
							g3y=750;
						}
						if(g4y>-20){
							g4y=g4y-4;
						}else{
							g4y=750;
						}
						if(g5y>-20){
							g5y=g5y-4;
						}else{
							g5y=750;
						}
					}
				
				
				if(leben==0){
					BM=1000;
	        		bewegung=0;
	        		xs=30;
	    			ys=280;
	    			level=1;
	    			leben=5;
				}
				
				}
				
				
				if(mehrspieler==true){
				
				if(xs<20 || (xs+30)>1180 || ys<20 || (ys+30)>680){
					bewegung=0;
					xs=30;
	    			ys=280;
	    			punkte=punkte-100;
	    			eigenschaft1vonP1=false;
	    			geschprüfer1=false;
				}
				if( ( (xs+30) > xs1 && xs < (xs1+27) ) && ( (ys+30) > ys1 && ys < (ys1+54) ) ){
					bewegung=0;
					xs=30;
	    			ys=280;
	    			punkte=punkte-100;
	    			eigenschaft1vonP1=false;
	    			geschprüfer1=false;
				}
				if(((xs+30)>xs2 && xs<(xs2+27)) && ((ys+30)>ys2 && ys<(ys2+54)) ){
					bewegung=0;
					xs=30;
	    			ys=280;
	    			punkte=punkte-100;
	    			eigenschaft1vonP1=false;
	    			geschprüfer1=false;
				}
				if(((xs+30)>xs3 && xs<(xs3+27)) && ((ys+30)>ys3 && ys<(ys3+54)) ){
					bewegung=0;
					xs=30;
	    			ys=280;
	    			punkte=punkte-100;
	    			eigenschaft1vonP1=false;
	    			geschprüfer1=false;
				}
				if(hardcore==true){
				if( ( (xs+30) > xs4 && xs < (xs4+27) ) && ( (ys+30) > ys4 && ys < (ys4+54) ) ){
					bewegung=0;
					xs=30;
	    			ys=280;
	    			punkte=punkte-100;
	    			eigenschaft1vonP1=false;
	    			geschprüfer1=false;
				}
				if(((xs+30)>xs5 && xs<(xs5+27)) && ((ys+30)>ys5 && ys<(ys5+54)) ){
					bewegung=0;
					xs=30;
	    			ys=280;
	    			punkte=punkte-100;
	    			eigenschaft1vonP1=false;
	    			geschprüfer1=false;
				}
				if(((xs+30)>xs6 && xs<(xs6+27)) && ((ys+30)>ys6 && ys<(ys6+54)) ){
					bewegung=0;
					xs=30;
	    			ys=280;
	    			punkte=punkte-100;
	    			eigenschaft1vonP1=false;
	    			geschprüfer1=false;
				}
				if( ( (xs+30) > xs7 && xs < (xs7+27) ) && ( (ys+30) > ys7 && ys < (ys7+54) ) ){
					bewegung=0;
					xs=30;
	    			ys=280;
	    			punkte=punkte-100;
	    			eigenschaft1vonP1=false;
	    			geschprüfer1=false;
				}
				if(((xs+30)>xs8 && xs<(xs8+27)) && ((ys+30)>ys8 && ys<(ys8+54)) ){
					bewegung=0;
					xs=30;
	    			ys=280;
	    			punkte=punkte-100;
	    			eigenschaft1vonP1=false;
	    			geschprüfer1=false;
				}
				if(((xs+30)>xs9 && xs<(xs9+27)) && ((ys+30)>ys9 && ys<(ys9+54)) ){
					bewegung=0;
					xs=30;
	    			ys=280;
	    			punkte=punkte-100;
	    			eigenschaft1vonP1=false;
	    			geschprüfer1=false;
				}
				if( ( (xs+30) > xs10 && xs < (xs10+27) ) && ( (ys+30) > ys10 && ys < (ys10+54) ) ){
					bewegung=0;
					xs=30;
	    			ys=280;
	    			punkte=punkte-100;
	    			eigenschaft1vonP1=false;
	    			geschprüfer1=false;
				}
				if(((xs+30)>xs11 && xs<(xs11+27)) && ((ys+30)>ys11 && ys<(ys11+54)) ){
					bewegung=0;
					xs=30;
	    			ys=280;
	    			punkte=punkte-100;
	    			eigenschaft1vonP1=false;
	    			geschprüfer1=false;
				}
				if(((xs+30)>xs12 && xs<(xs12+27)) && ((ys+30)>ys12 && ys<(ys12+54)) ){
					bewegung=0;
					xs=30;
	    			ys=280;
	    			punkte=punkte-100;
	    			eigenschaft1vonP1=false;
	    			geschprüfer1=false;
				}}
				
				if(((xs+30)>xg && xs<(xg+16)) && ((ys+30)>yg && ys<(yg+28)) ){
				punkte=punkte+10;
				geschprüfer1=false;
				xg=(int)(1200*Math.random());
				yg=(int)(700*Math.random());
				while(xg<20 || (xg+16)>1180 || yg<60 || (yg+28)>680){
    				xg=(int)(1200*Math.random());
        			yg=(int)(700*Math.random());
				}
				}
				if(((xs+30)>xb && xs<(xb+16)) && ((ys+30)>yb && ys<(yb+28)) ){
				punkte=punkte+20;
				geschprüfer1=false;
				xb=(int)(1200*Math.random());
				yb=(int)(700*Math.random());
				while(xb<20 || (xb+16)>1180 || yb<60 || (yb+28)>680){
    				xb=(int)(1200*Math.random());
        			yb=(int)(700*Math.random());
				}
				}
				if(((xs+30)>xr && xs<(xr+16)) && ((ys+30)>yr && ys<(yr+28)) ){
				punkte=punkte+50;
				geschprüfer1=false;
				xr=(int)(1200*Math.random());
				yr=(int)(700*Math.random());
				while(xr<20 || (xr+16)>1180 || yr<60 || (yr+28)>680){
    				xr=(int)(1200*Math.random());
        			yr=(int)(700*Math.random());
				}
				}
				if(((xs+30)>xsonder && xs<(xsonder+16)) && ((ys+30)>ysonder && ys<(ysonder+16)) ){
					eigenschaft1vonP1=true;
					geschprüfer1=false;
					xsonder=(int)(1200*Math.random());
					ysonder=(int)(700*Math.random());
					while(xsonder<20 || (xsonder+16)>1180 || ysonder<60 || (ysonder+28)>680){
	    				xsonder=(int)(1200*Math.random());
	        			ysonder=(int)(700*Math.random());
					}
					}
				if(((xs+30)>xsonder2 && xs<(xsonder2+16)) && ((ys+30)>ysonder2 && ys<(ysonder2+16)) ){
					geschprüfer1=true;
					xsonder2=(int)(1200*Math.random());
					ysonder2=(int)(700*Math.random());
					while(xsonder2<20 || (xsonder2+16)>1180 || ysonder2<60 || (ysonder2+28)>680){
	    				xsonder2=(int)(1200*Math.random());
	        			ysonder2=(int)(700*Math.random());
					}
					}
				if(auslöser1vonP1==true){
				if( ( (xs+30) > xlaser2 && xs < (xlaser2+10) ) && ( (ys+30) > ylaser2 && ys < (ylaser2+10) ) ){
					bewegung=0;
					xs=30;
	    			ys=280;
	    			punkte=punkte-250;
	    			geschprüfer1=false;
	    			eigenschaft1vonP1=false;}
				}
				
				
				
				
				if(xss2<20 || (xss2+30)>1180 || yss2<20 || (yss2+30)>680){
					bewegung2=0;
					xss2=1140;
	    			yss2=280;
	    			punkte2=punkte2-100;
	    			eigenschaft1vonP2=false;
	    			geschprüfer2=false;
				}
				if( ( (xss2+30) > xs1 && xss2 < (xs1+27) ) && ( (yss2+30) > ys1 && yss2 < (ys1+54) ) ){
					bewegung2=0;
					xss2=1140;
	    			yss2=280;
	    			punkte2=punkte2-100;
	    			eigenschaft1vonP2=false;
	    			geschprüfer2=false;
				}
				if(((xss2+30)>xs2 && xss2<(xs2+27)) && ((yss2+30)>ys2 && yss2<(ys2+54)) ){
					bewegung2=0;
					xss2=1140;
	    			yss2=280;
	    			punkte2=punkte2-100;
	    			eigenschaft1vonP2=false;
	    			geschprüfer2=false;
				}
				if(((xss2+30)>xs3 && xss2<(xs3+27)) && ((yss2+30)>ys3 && yss2<(ys3+54)) ){
					bewegung2=0;
					xss2=1140;
	    			yss2=280;
	    			punkte2=punkte2-100;
	    			eigenschaft1vonP2=false;
	    			geschprüfer2=false;
				}
				if(hardcore==true){
				if( ( (xss2+30) > xs4 && xss2 < (xs4+27) ) && ( (yss2+30) > ys4 && yss2 < (ys4+54) ) ){
					bewegung2=0;
					xss2=1140;
	    			yss2=280;
	    			punkte2=punkte2-100;
	    			eigenschaft1vonP2=false;
	    			geschprüfer2=false;
				}
				if(((xss2+30)>xs5 && xss2<(xs5+27)) && ((yss2+30)>ys5 && yss2<(ys5+54)) ){
					bewegung2=0;
					xss2=1140;
	    			yss2=280;
	    			punkte2=punkte2-100;
	    			eigenschaft1vonP2=false;
	    			geschprüfer2=false;
				}
				if(((xss2+30)>xs6 && xss2<(xs6+27)) && ((yss2+30)>ys6 && yss2<(ys6+54)) ){
					bewegung2=0;
					xss2=1140;
	    			yss2=280;
	    			punkte2=punkte2-100;
	    			eigenschaft1vonP2=false;
	    			geschprüfer2=false;
				}
				if( ( (xss2+30) > xs7 && xss2 < (xs7+27) ) && ( (yss2+30) > ys7 && yss2 < (ys7+54) ) ){
					bewegung2=0;
					xss2=1140;
	    			yss2=280;
	    			punkte2=punkte2-100;
	    			eigenschaft1vonP2=false;
	    			geschprüfer2=false;
				}
				if(((xss2+30)>xs8 && xss2<(xs8+27)) && ((yss2+30)>ys8 && yss2<(ys8+54)) ){
					bewegung2=0;
					xss2=1140;
	    			yss2=280;
	    			punkte2=punkte2-100;
	    			eigenschaft1vonP2=false;
	    			geschprüfer2=false;
				}
				if(((xss2+30)>xs9 && xss2<(xs9+27)) && ((yss2+30)>ys9 && yss2<(ys9+54)) ){
					bewegung2=0;
					xss2=1140;
	    			yss2=280;
	    			punkte2=punkte2-100;
	    			eigenschaft1vonP2=false;
	    			geschprüfer2=false;
				}
				if( ( (xss2+30) > xs10 && xss2 < (xs10+27) ) && ( (yss2+30) > ys10 && yss2 < (ys10+54) ) ){
					bewegung2=0;
					xss2=1140;
	    			yss2=280;
	    			punkte2=punkte2-100;
	    			eigenschaft1vonP2=false;
	    			geschprüfer2=false;
				}
				if(((xss2+30)>xs11 && xss2<(xs11+27)) && ((yss2+30)>ys11 && yss2<(ys11+54)) ){
					bewegung2=0;
					xss2=1140;
	    			yss2=280;
	    			punkte2=punkte2-100;
	    			eigenschaft1vonP2=false;
	    			geschprüfer2=false;
				}
				if(((xss2+30)>xs12 && xss2<(xs12+27)) && ((yss2+30)>ys12 && yss2<(ys12+54)) ){
					bewegung2=0;
					xss2=1140;
	    			yss2=280;
	    			punkte2=punkte2-100;
	    			eigenschaft1vonP2=false;
	    			geschprüfer2=false;
				}
				}
				
				if(((xss2+30)>xg && xss2<(xg+16)) && ((yss2+30)>yg && yss2<(yg+28)) ){
				punkte2=punkte2+10;
				geschprüfer2=false;
				xg=(int)(1200*Math.random());
				yg=(int)(700*Math.random());
				while(xg<20 || (xg+16)>1180 || yg<60 || (yg+28)>680){
    				xg=(int)(1200*Math.random());
        			yg=(int)(700*Math.random());
				}
				}
				if(((xss2+30)>xb && xss2<(xb+16)) && ((yss2+30)>yb && yss2<(yb+28)) ){
				punkte2=punkte2+20;
				geschprüfer2=false;
				xb=(int)(1200*Math.random());
				yb=(int)(700*Math.random());
				while(xb<20 || (xb+16)>1180 || yb<60 || (yb+28)>680){
    				xb=(int)(1200*Math.random());
        			yb=(int)(700*Math.random());
				}
				}
				if(((xss2+30)>xr && xss2<(xr+16)) && ((yss2+30)>yr && yss2<(yr+28)) ){
				punkte2=punkte2+50;
				geschprüfer2=false;
				xr=(int)(1200*Math.random());
				yr=(int)(700*Math.random());
				while(xr<20 || (xr+16)>1180 || yr<60 || (yr+28)>680){
    				xr=(int)(1200*Math.random());
        			yr=(int)(700*Math.random());
				}
				}
				if(((xss2+30)>xsonder && xss2<(xsonder+16)) && ((yss2+30)>ysonder && yss2<(ysonder+16)) ){
					eigenschaft1vonP2=true;
					geschprüfer2=false;
					xsonder=(int)(1200*Math.random());
					ysonder=(int)(700*Math.random());
					while(xsonder<20 || (xsonder+16)>1180 || ysonder<60 || (ysonder+28)>680){
	    				xsonder=(int)(1200*Math.random());
	        			ysonder=(int)(700*Math.random());
					}
					}
				if(((xss2+30)>xsonder2 && xss2<(xsonder2+16)) && ((yss2+30)>ysonder2 && yss2<(ysonder2+16)) ){
					geschprüfer2=true;
					xsonder2=(int)(1200*Math.random());
					ysonder2=(int)(700*Math.random());
					while(xsonder2<20 || (xsonder2+16)>1180 || ysonder2<60 || (ysonder2+28)>680){
	    				xsonder2=(int)(1200*Math.random());
	        			ysonder2=(int)(700*Math.random());
					}
					}
				if(auslöser1vonP2==true){
					if( ( (xss2+30) > xlaser1 && xss2 < (xlaser1+10) ) && ( (yss2+30) > ylaser1 && yss2 < (ylaser1+10) ) ){
						bewegung2=0;
						xss2=1140;
		    			yss2=280;
		    			punkte2=punkte2-250;
		    			eigenschaft1vonP2=false;}
					}
				}
				
				
				
		Thread.sleep(dauer);}
	catch (InterruptedException f){};
		repaint();}
	}
	
	public void paint (Graphics g){
		
		
		
		if(BM==0){
		
			if(mehrspieler==false){
				
				
				if(level==1){
					g.drawImage(hintergrund5, 0, 0, 1200, 700, this);
					
				g.fillRect(500,100,20,500);
				g.drawImage(laseritem, 1000, 340, 16, 16, this);}
				
				if(level==2){
					g.drawImage(hintergrund5, 0, 0, 1200, 700, this);
					
					g.fillRect(200,0,20,620);
					g.fillRect(500,100,20,700);
					g.fillRect(800,0,20,620);
					g.drawImage(laseritem, 1100, 100, 16, 16, this);}
				
				if(level==3){
					g.drawImage(hintergrund5, 0, 0, 1200, 700, this);
					
					g.fillRect(g1x,g1y,20,20);
					g.fillRect(g2x,g2y,20,20);
					g.fillRect(g3x,g3y,20,20);
					g.fillRect(g4x,g4y,20,20);
					g.fillRect(g5x,g5y,20,20);
					g.drawImage(laseritem, 1100, 100, 16, 16, this);}
				
				if(level==4){
					g.drawImage(hintergrund6, 0, 0, 1200, 700, this);
					
					g.fillRect(g1x,g1y,30,30);
					g.fillRect(g1x+70,g1y,30,30);
					g.fillRect(g2x,g2y,30,30);
					g.fillRect(g2x+70,g2y,30,30);
					g.fillRect(g3x,g3y,30,30);
					g.fillRect(g3x+70,g3y,30,30);
					g.fillRect(g4x,g4y,30,30);
					g.fillRect(g4x+70,g4y,30,30);
					g.fillRect(g5x,g5y,30,30);
					g.fillRect(g5x+70,g5y,30,30);
					g.drawImage(laseritem, 1000, 340, 16, 16, this);}
			
			
			g.setColor(Color.black);
			g.fillRect(0, 0, 1200, 20);
			g.fillRect(0, 675, 1200, 20);
			g.fillRect(0, 0, 20, 700);
			g.fillRect(1180, 0, 20, 700);
			
			
			Font arial = new Font("Arial",Font.BOLD,20);
			g.setFont(arial);
			g.drawString("Level: "+level,30,645);
			g.drawString("Leben: "+leben,30,670);
			
			if(bewegung==1){
				xs++;
			}
			if(bewegung==2){
				xs--;
			}
			if(bewegung==3){
				ys++;
			}
			if(bewegung==4){
				ys--;
			}		
			
			g.drawImage(spieler1, xs, ys, 30, 30, this);
			
			
		}
			
			
			
			
			if(mehrspieler==true){
			g.drawImage(hintergrund5, 0, 0, 1200, 700, this);
		g.setColor(Color.black);
		g.fillRect(0, 0, 1200, 20);
		g.fillRect(0, 675, 1200, 20);
		g.fillRect(0, 0, 20, 700);
		g.fillRect(1180, 0, 20, 700);
		
		
		
		if(pause==false){
		
		g.fillRect(xs1,ys1,27,54);
		g.fillRect(xs2,ys2,27,54);
		g.fillRect(xs3,ys3,27,54);
		if(hardcore==true){
		g.fillRect(xs4,ys4,27,54);
		g.fillRect(xs5,ys5,27,54);
		g.fillRect(xs6,ys6,27,54);
		g.fillRect(xs7,ys7,27,54);
		g.fillRect(xs8,ys8,27,54);
		g.fillRect(xs9,ys9,27,54);
		g.fillRect(xs10,ys10,27,54);
		g.fillRect(xs11,ys11,27,54);
		g.fillRect(xs12,ys12,27,54);}

		
		g.drawImage(punkte10, xg, yg, 16, 28, this);
		g.drawImage(punkte20, xb, yb, 16, 28, this);
		g.drawImage(punkte50, xr, yr, 16, 28, this);
		
		
		g.drawImage(laseritem, xsonder, ysonder, 16, 16, this);
		g.drawImage(geschitem, xsonder2, ysonder2, 16, 16, this);
		
		
		g.setColor(Color.white);
		Font arial3 = new Font("Arial",Font.BOLD,20);
		g.setFont(arial3);
		g.drawString("Punkte: "+punkte,30,670);
		g.setColor(Color.black);
		g.drawString("Punkte: "+punkte2,1030,670);
		
		
		g.setColor(Color.black);
		Font arial2 = new Font("Arial",Font.PLAIN,12);
		g.setFont(arial2);
		g.drawString(""+names1,xs,ys-5);
		g.drawString(""+names2,xss2,yss2-5);
		
		if(bewegung==1){
			if(geschprüfer1==false){
			xs++;}else{xs=xs+2;}
		}
		if(bewegung==2){
			if(geschprüfer1==false){
				xs--;}else{xs=xs-2;}
		}
		if(bewegung==3){
			if(geschprüfer1==false){
				ys++;}else{ys=ys+2;}
		}
		if(bewegung==4){
			if(geschprüfer1==false){
				ys--;}else{ys=ys-2;}
		}		
		if(eigenschaft1vonP1==true){
			g.setColor(Color.red);
			g.drawOval(xs-3, ys-3, 36, 36);
		}
		
		switch(spielervonspieler1){
		case 1:g.drawImage(spieler1, xs, ys, 30, 30, this);
		break;
		case 2:g.drawImage(spieler2, xs, ys, 30, 30, this);
		break;
		case 3:g.drawImage(spieler3, xs, ys, 30, 30, this);
		break;
		case 4:g.drawImage(spieler4, xs, ys, 30, 30, this);
		break;
		case 5:g.drawImage(spieler5, xs, ys, 30, 30, this);
		break;
		}

		if(auslöser1vonP1==true){
			g.setColor(Color.green);
			if(zaehler11==1){
				xlaser1++;
				xlaser1++;
			}
			if(zaehler11==2){
				xlaser1--;xlaser1--;
			}
			if(zaehler11==3){
				ylaser1++;ylaser1++;
			}
			if(zaehler11==4){
				ylaser1--;ylaser1--;
			}		
			
			
			
			g.fillRect(xlaser1, ylaser1, 10, 10);
			if(xlaser1>1200 || ylaser1 >700){
				auslöser1vonP1=false;
			}
		}
		
		
		
		
		if(bewegung2==1){
			if(geschprüfer2==false){
				xss2++;}else{xss2=xss2+2;}
		}
		if(bewegung2==2){
			if(geschprüfer2==false){
				xss2--;}else{xss2=xss2-2;}
		}
		if(bewegung2==3){
			if(geschprüfer2==false){
				yss2++;}else{yss2=yss2+2;}
		}
		if(bewegung2==4){
			if(geschprüfer2==false){
				yss2--;}else{yss2=yss2+-2;}
		}
		if(eigenschaft1vonP2==true){
			g.setColor(Color.red);
			g.drawOval(xss2-3, yss2-3, 36, 36);
		}
		
		switch(spielervonspieler2){
		case 1:g.drawImage(spieler1, xss2, yss2, 30, 30, this);
		break;
		case 2:g.drawImage(spieler2, xss2, yss2, 30, 30, this);
		break;
		case 3:g.drawImage(spieler3, xss2, yss2, 30, 30, this);
		break;
		case 4:g.drawImage(spieler4, xss2, yss2, 30, 30, this);
		break;
		case 5:g.drawImage(spieler5, xss2, yss2, 30, 30, this);
		break;
		}
		
		
		if(auslöser1vonP2==true){
			g.setColor(Color.green);
			
			if(zaehler12==1){
				xlaser2++;
				xlaser2++;
			}
			if(zaehler12==2){
				xlaser2--;xlaser2--;
			}
			if(zaehler12==3){
				ylaser2++;ylaser2++;
			}
			if(zaehler12==4){
				ylaser2--;ylaser2--;
			}		
			
			
			
			g.fillRect(xlaser2, ylaser2, 10, 10);
			
			if(xlaser2>1200 || ylaser2 >700){
				auslöser1vonP2=false;
			}
		}
		
		
		}
		
		
		
		
		else{
			g.setColor(Color.black);
			Font arial2 = new Font("Arial",Font.BOLD,20);
			g.setFont(arial2);
			g.drawString("Pause",30,100);
			g.drawString("'F' zum fortsetzen", 30, 130);
			
		}
		}
		
		if(punkte > 1000 || punkte2 > 1000){
			g.setColor(Color.black);
			Font arial2 = new Font("Arial",Font.BOLD,20);
			g.setFont(arial2);
				if(punkte>1000){
					g.drawString("Der Gewinner mit "+punkte+" Punkten ist:",30,100);
					g.drawString(names1, 30, 130);}
				if(punkte2>1000){
					g.drawString("Der Gewinner mit "+punkte2+" Punkten ist:",30,100);
					g.drawString(names2, 30, 130);}
			
		}
		
		}
	
		if(mehrspieler==true){
		if(BM==1){
			if(spielervariable==1){namedercharakterauswahl=names1;}
			if(spielervariable==2){namedercharakterauswahl=names2;}
			g.drawImage(hintergrund2, 0, 0, 1200, 720, this);
			Font arial = new Font("Arial",Font.BOLD,50);
			g.setFont(arial);
			g.setColor(Color.black);
			g.drawString("Charakterauswahl:  "+namedercharakterauswahl, 250, 200);
			g.drawImage(spieler1, 300, 280, 90, 90, this);
			g.drawImage(spieler2, 420, 280, 90, 90, this);
			g.drawImage(spieler3, 540, 280, 90, 90, this);
			g.drawImage(spieler4, 660, 280, 90, 90, this);
			g.drawImage(spieler5, 780, 280, 90, 90, this);
		}
		
		if(BM==3){
			g.drawImage(hintergrund1, 0, 0, 1200, 720, this);
			Font arial = new Font("Arial",Font.BOLD,50);
			g.setFont(arial);
			g.setColor(Color.white);
			g.drawString("Gib deinen Namen ein, Spieler 1", 250, 100);
			g.drawString("Weiter", 520, 590);
			g.drawString(""+names1, 600,250);
			g.drawRect(450,500,300,150);
			
			g.drawRect(250,150,30,30);
			g.drawRect(300,150,30,30);
			g.drawRect(350,150,30,30);
			g.drawRect(400,150,30,30);
			g.drawRect(450,150,30,30);
			Font arial2 = new Font("Arial",Font.PLAIN,12);
			g.setFont(arial2);
			g.drawString("A               B              C             D              E",260,170);

			g.drawRect(250,200,30,30);
			g.drawRect(300,200,30,30);
			g.drawRect(350,200,30,30);
			g.drawRect(400,200,30,30);
			g.drawRect(450,200,30,30);
			g.drawString("F               G              H             I                J",260,220);
			
			g.drawRect(225,250,30,30);
			g.drawRect(275,250,30,30);
			g.drawRect(325,250,30,30);
			g.drawRect(375,250,30,30);
			g.drawRect(425,250,30,30);
			g.drawRect(475,250,30,30);
			g.drawString("K               L              M             N              O              P",235,270);
			
			g.drawRect(250,300,30,30);
			g.drawRect(300,300,30,30);
			g.drawRect(350,300,30,30);
			g.drawRect(400,300,30,30);
			g.drawRect(450,300,30,30);
			g.drawString("Q               R              S             T              U",260,320);

			g.drawRect(250,350,30,30);
			g.drawRect(300,350,30,30);
			g.drawRect(350,350,30,30);
			g.drawRect(400,350,30,30);
			g.drawRect(450,350,30,30);
			g.drawString("V               W              X             Y              Z",260,370);
			
			g.drawRect(300,400,130,30);
			
			if(egg==1){
				g.drawImage(EggLink, 800, 350, 320, 240, this);
			}
			if(egg==2){
				g.drawImage(EggMond, 800, 350, 310, 170, this);
			}
			if(egg==3){
				g.drawImage(EggMario, 800, 350, 259, 194, this);
			}
			if(egg==4){
				g.drawImage(Egghaarelang, 800, 250, 300, 400, this);
			}
			if(egg==5){
				g.drawImage(Eggschlagen, 800, 250, 300, 400, this);
			}
			if(egg==6){
				g.drawImage(EggSamus, 850, 350, 176, 259, this);
			}
			if(egg==7){
				g.drawImage(EggMM, 800, 350, 350, 262, this);
			}
			if(egg==8){
				g.drawImage(EggGanondorf, 800, 350, 300, 225, this);
			}


		}
		if(BM==2){
			g.drawImage(hintergrund1, 0, 0, 1200, 720, this);
			Font arial = new Font("Arial",Font.BOLD,50);
			g.setFont(arial);
			g.setColor(Color.white);
			g.drawString("Gib deinen Namen ein, Spieler 2", 250, 100);
			g.drawString("Weiter", 520, 590);
			g.drawString(""+names2, 600,250);
			g.drawRect(450,500,300,150);
			
			
			g.drawRect(250,150,30,30);
			g.drawRect(300,150,30,30);
			g.drawRect(350,150,30,30);
			g.drawRect(400,150,30,30);
			g.drawRect(450,150,30,30);
			Font arial2 = new Font("Arial",Font.PLAIN,12);
			g.setFont(arial2);
			g.drawString("A               B              C             D              E",260,170);

			g.drawRect(250,200,30,30);
			g.drawRect(300,200,30,30);
			g.drawRect(350,200,30,30);
			g.drawRect(400,200,30,30);
			g.drawRect(450,200,30,30);
			g.drawString("F               G              H             I                J",260,220);
			
			g.drawRect(225,250,30,30);
			g.drawRect(275,250,30,30);
			g.drawRect(325,250,30,30);
			g.drawRect(375,250,30,30);
			g.drawRect(425,250,30,30);
			g.drawRect(475,250,30,30);
			g.drawString("K               L              M             N              O              P",235,270);
			
			g.drawRect(250,300,30,30);
			g.drawRect(300,300,30,30);
			g.drawRect(350,300,30,30);
			g.drawRect(400,300,30,30);
			g.drawRect(450,300,30,30);
			g.drawString("Q               R              S             T              U",260,320);

			g.drawRect(250,350,30,30);
			g.drawRect(300,350,30,30);
			g.drawRect(350,350,30,30);
			g.drawRect(400,350,30,30);
			g.drawRect(450,350,30,30);
			g.drawString("V               W              X             Y              Z",260,370);
			
			g.drawRect(300,400,130,30);
			
			if(egg==1){
				g.drawImage(EggLink, 800, 350, 320, 240, this);
			}
			if(egg==2){
				g.drawImage(EggMond, 800, 350, 310, 170, this);
			}
			if(egg==3){
				g.drawImage(EggMario, 800, 350, 259, 194, this);
			}
			if(egg==4){
				g.drawImage(Egghaarelang, 800, 250, 300, 400, this);
			}
			if(egg==5){
				g.drawImage(Eggschlagen, 800, 250, 300, 400, this);
			}
			if(egg==6){
				g.drawImage(EggSamus, 850, 350, 176, 259, this);
			}
			if(egg==7){
				g.drawImage(EggMM, 800, 350, 350, 262, this);
			}
			if(egg==8){
				g.drawImage(EggGanondorf, 800, 350, 300, 225, this);
			}
			

		}
		
		}
		
		if(BM==1000){
			g.drawImage(hintergrund3, 0, 0, 1200, 720, this);
			Font arial = new Font("Arial",Font.BOLD,50);
			g.setFont(arial);
			g.setColor(Color.black);
			g.drawString("Against the Other", 410, 200);
			
			g.drawString("Start", 540, 390);
			g.drawRect(450,500,300,150);
			g.drawString("Steuerung", 480, 590);
			g.drawRect(450,300,300,150);
			
			if(mehrspieler==false){
			Font arial2 = new Font("Arial",Font.PLAIN,12);
			g.setFont(arial2);
			g.drawString("Einzelspieler-Modus",540,420);}
		
		}
		
		if(BM==999){
			g.drawImage(hintergrund4, 0, 0, 1200, 720, this);
			
			if(mehrspieler==true){
			
			Font arial2 = new Font("Arial",Font.BOLD,20);
			g.setFont(arial2);
			
			g.drawString("- Bewegen mit W,A,S,D", 100, 150);
			g.drawString("- Laser mit SPACE", 100, 180);
			g.drawString("- Bewegen mit Pfeiltasten", 500, 150);
			g.drawString("- Laser mit L", 500, 180);
			g.drawString("- N zum Neustarten", 100, 350);
			g.drawString("- P zum Pausieren", 100, 380);
			g.drawString("- F zum fortfahren", 100, 410);
			g.drawString("- H aktiviert den Hardmode", 100, 440);
			g.drawString("- 1,2,3,4 zum ändern der Geschwindigkeit", 100, 470);
			g.drawString("- Q beendet das Spiel", 100, 500);
			g.drawString("PS: Es gibt da ein Geheimnis...", 100, 580);
			g.drawString("KING MUS COOPERATION", 10, 680);
			
			Font arial = new Font("Arial",Font.BOLD,50);
			g.setFont(arial);
			g.setColor(Color.black);
			g.drawRect(850,500,300,150);
			
			g.drawString("Spieler 1", 100, 100);
			g.drawString("Spieler 2", 500, 100);
			g.drawString("Allgemein", 100, 300);
			g.drawString("Zurück", 920, 590);
			
		
		}
			else{
			Font arial = new Font("Arial",Font.BOLD,50);
			g.setFont(arial);
			g.setColor(Color.black);
			g.drawString("Du hast das Geheimnis gefunden !!!", 100, 300);
			g.drawString("Zurück", 920, 590);
				g.drawRect(850,500,300,150);}
			
		}

}
	
	
	
	
	
}
	

