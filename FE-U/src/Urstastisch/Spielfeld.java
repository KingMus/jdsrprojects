package Urstastisch;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Spielfeld extends JPanel implements Runnable{

	
	boolean weiter=true,haupt=true,statusfenster=false,inventarfenster=false;
	int key,itemnummer=0;
	int xfeld=0,yfeld=22;
	int xspieler=0,yspieler=0;
	int spielerstelle1=0,spielerstelle2=0;
	int zug,zugzahl=4;
	int level=1;
	int spielersieg=0;
	
	private static String pfad=System.getProperty("user.dir").replace('\\', '/');

	JMenuBar menüleiste;
	JMenu Spiel,Spieler,Sammlung,Speicherm,Speichern,Ladens;
	JMenuItem NeuesSpiel,Anleitung,Über,Beenden,Status,Inventar,Skills,Errungenschaften,Monsterfibel,Slot1,Slot2,Slot3,Slot4;
	
	int[] itemfeld;
	
	int[][][]spielfeld;

		
	
	int hpmax,hp,ap,vp,spielerlevel;
	
	private Spieler Hero;
	Bilder b=new Bilder();
	private Map m=new Map();
	
	 private MyActionListener a1=new MyActionListener();
		
	  

		public Spielfeld(){

			
			Laden.aktualisiereDaten(1);
			
			itemfeld=Laden.getitemfeld();
			hpmax=Laden.gethpmax();
			hp=Laden.gethp();
			ap=Laden.getap();
			vp=Laden.getvp();
			spielerlevel=Laden.getlevel();
			
			spielfeld=m.setzefeld(1);
			
			/*java.net.URL musik = getClass().getResource("MID1.mid");
 	    	AudioClip sound = Applet.newAudioClip(musik);

			sound.loop();*/	
					
			Hero=new Spieler();
			Hero.setzeSEigenschaften(b.s1,"Alphonse",hp,hpmax, ap, vp, spielerlevel,510,50,54,92,itemfeld);
			
	
			this.addMouseListener(new Mouseklick());
	    	addKeyListener(new Al());
	    	setFocusable(true);
	    	startanimation();
	    	
	    	
	    	BorderLayout b=new BorderLayout();
	    	setLayout(b);
	    	
	    	
	    	menüleiste= new JMenuBar();
	    	
	    	Spiel=new JMenu("Spiel");
	    	Spieler=new JMenu("Spieler");
	    	Sammlung=new JMenu("Sammlung");
	    	Speicherm=new JMenu("Speichermenü");
	    	Speichern=new JMenu("Speichern");
	    	Ladens=new JMenu("Laden");
	    	
	    	NeuesSpiel=new JMenuItem("Neues Spiel");
	    	NeuesSpiel.addActionListener(a1);
	    	Anleitung=new JMenuItem("Anleitung");
	    	Anleitung.addActionListener(a1);
	    	Über=new JMenuItem("Über");
	    	Über.addActionListener(a1);
	    	Beenden=new JMenuItem("Beenden");
	    	Beenden.addActionListener(a1);
	    	Status=new JMenuItem("Status");
	    	Status.addActionListener(a1);
	    	Inventar=new JMenuItem("Inventar");
	    	Inventar.addActionListener(a1);
	    	Skills=new JMenuItem("Skills");
	    	Skills.addActionListener(a1);
	    	Errungenschaften=new JMenuItem("Errungenschaften");
	    	Errungenschaften.addActionListener(a1);
	    	Monsterfibel=new JMenuItem("Monsterfibel");
	    	Monsterfibel.addActionListener(a1);
	    	Slot1=new JMenuItem("Slot 1 - S");
	    	Slot1.addActionListener(a1);
	    	Slot2=new JMenuItem("Slot 2 - S");
	    	Slot2.addActionListener(a1);
	    	Slot3=new JMenuItem("Slot 1 - L");
	    	Slot3.addActionListener(a1);
	    	Slot4=new JMenuItem("Slot 2 - L");
	    	Slot4.addActionListener(a1);
	    	
	    	
	    	
	    	menüleiste.add(Spiel);
	    	menüleiste.add(Spieler);
	    	menüleiste.add(Sammlung);
	    	menüleiste.add(Speicherm);
	    	
	    	Spiel.add(NeuesSpiel);
	    	Spiel.add(Anleitung);
	    	Spiel.add(Über);
	    	Spiel.add(Beenden);
	    	Spieler.add(Status);
	    	Spieler.add(Inventar);
	    	Spieler.add(Skills);
	    	Sammlung.add(Monsterfibel);
	    	Sammlung.add(Errungenschaften);	 
	    	Speicherm.add(Speichern);
	    	Speicherm.add(Ladens);
	    	Speichern.add(Slot1);
	    	Speichern.add(Slot2);
	    	Ladens.add(Slot3);
	    	Ladens.add(Slot4);
	    	
	    	add(menüleiste, BorderLayout.PAGE_START);
	    	
	}
	

	public class Mouseklick extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			
			statusfenster=false;

			if(e.getX()>250 && e.getY()>215 && e.getX()<450 && e.getY()<255 && haupt==true)	haupt=false;
			if(e.getX()>250 && e.getY()>305 && e.getX()<450 && e.getY()<345 && haupt==true)	System.exit(0);

					
			if(e.getX()>80 && e.getY()>60 && e.getX()<150 && e.getY()<130 && inventarfenster==true){
				itemnummer=1;
			}else if(e.getX()>160 && e.getY()>60 && e.getX()<230 && e.getY()<130 && inventarfenster==true){
				itemnummer=2;
			}else if(e.getX()>240 && e.getY()>60 && e.getX()<310 && e.getY()<130 && inventarfenster==true){
				itemnummer=3;
			}else if(e.getX()>320 && e.getY()>60 && e.getX()<390 && e.getY()<130 && inventarfenster==true){
				itemnummer=4;
			}else if(e.getX()>80 &&  e.getY()>140 && e.getX()<150 && e.getY()<210 && inventarfenster==true){
				itemnummer=5;
			}else if(e.getX()>160 && e.getY()>140 && e.getX()<230 && e.getY()<210 && inventarfenster==true){
				itemnummer=6;
			}else if(e.getX()>240 && e.getY()>140 && e.getX()<310 && e.getY()<210 && inventarfenster==true){
				itemnummer=7;
			}else if(e.getX()>320 && e.getY()>140 && e.getX()<390 && e.getY()<210 && inventarfenster==true){
				itemnummer=8;
			}else if(e.getX()>360 && e.getY()>270 && e.getX()<430 && e.getY()<303 && inventarfenster==true && itemnummer==1 && Hero.getitem(1)>0){
				Hero.erhöheodererniedrigeitem(1, 1,2);
				Hero.addiereItem(itemnummer);
			}else
			if(e.getX()>360 && e.getY()>308 && e.getX()<430 && e.getY()<340 && inventarfenster==true && itemnummer==1 && Hero.getitem(0)>25){
				Hero.erhöheodererniedrigeitem(1, 1,1);Hero.erhöheodererniedrigeitem(0,25,2);
			}else
			
			if(e.getX()>360 && e.getY()>270 && e.getX()<430 && e.getY()<303 && inventarfenster==true && itemnummer==2 && Hero.getitem(2)>0){

			}else
			if(e.getX()>360 && e.getY()>308 && e.getX()<430 && e.getY()<340 && inventarfenster==true && itemnummer==2 && Hero.getitem(0)>50){
				Hero.erhöheodererniedrigeitem(2, 1,1);Hero.erhöheodererniedrigeitem(0,50,2);
			}else
			
			if(e.getX()>360 && e.getY()>270 && e.getX()<430 && e.getY()<303 && inventarfenster==true && itemnummer==3 && Hero.getitem(3)>0){

			}else
			if(e.getX()>360 && e.getY()>308 && e.getX()<430 && e.getY()<340 && inventarfenster==true && itemnummer==3 && Hero.getitem(0)>60){
				Hero.erhöheodererniedrigeitem(3, 1,1);Hero.erhöheodererniedrigeitem(0,60,2);
			}else
			
			if(e.getX()>360 && e.getY()>270 && e.getX()<430 && e.getY()<303 && inventarfenster==true && itemnummer==4 && Hero.getitem(4)>0){
				Hero.erhöheodererniedrigeitem(4, 1,2);Hero.addiereItem(itemnummer);
			}else
			if(e.getX()>360 && e.getY()>308 && e.getX()<430 && e.getY()<340 && inventarfenster==true && itemnummer==4 && Hero.getitem(0)>500){
				Hero.erhöheodererniedrigeitem(4, 1,1);Hero.erhöheodererniedrigeitem(0,500,2);
			}else
			
			if(e.getX()>360 && e.getY()>270 && e.getX()<430 && e.getY()<303 && inventarfenster==true && itemnummer==5 && Hero.getitem(5)>0){
				Hero.erhöheodererniedrigeitem(5, 1,2);Hero.addiereItem(itemnummer);
			}else
			if(e.getX()>360 && e.getY()>308 && e.getX()<430 && e.getY()<340 && inventarfenster==true && itemnummer==5 && Hero.getitem(0)>1000){
				Hero.erhöheodererniedrigeitem(5, 1,1);Hero.erhöheodererniedrigeitem(0,1000,2);
			}else
			
			if(e.getX()>360 && e.getY()>270 && e.getX()<430 && e.getY()<303 && inventarfenster==true && itemnummer==6 && Hero.getitem(6)>0){
				Hero.erhöheodererniedrigeitem(6, 1,2);Hero.addiereItem(itemnummer);
			}else
			if(e.getX()>360 && e.getY()>308 && e.getX()<430 && e.getY()<340 && inventarfenster==true && itemnummer==6 && Hero.getitem(0)>5000){
				Hero.erhöheodererniedrigeitem(6, 1,1);Hero.erhöheodererniedrigeitem(0,5000,2);
			}else
			
			if(e.getX()>360 && e.getY()>270 && e.getX()<430 && e.getY()<303 && inventarfenster==true && itemnummer==7 && Hero.getitem(7)>0){
				Hero.erhöheodererniedrigeitem(7, 1,2);Hero.addiereItem(itemnummer);
			}else
			if(e.getX()>360 && e.getY()>308 && e.getX()<430 && e.getY()<340 && inventarfenster==true && itemnummer==7 && Hero.getitem(0)>6000){
				Hero.erhöheodererniedrigeitem(7, 1,1);Hero.erhöheodererniedrigeitem(0,6000,2);
			}else
			
			if(e.getX()>360 && e.getY()>270 && e.getX()<430 && e.getY()<303 && inventarfenster==true && itemnummer==8 && Hero.getitem(8)>0){
				Hero.erhöheodererniedrigeitem(8, 1,2);Hero.addiereItem(itemnummer);
			}else
			if(e.getX()>360 && e.getY()>308 && e.getX()<430 && e.getY()<340 && inventarfenster==true && itemnummer==8 && Hero.getitem(0)>10000){
				Hero.erhöheodererniedrigeitem(8, 1,1);
				Hero.erhöheodererniedrigeitem(0,10000,2);
			}else{inventarfenster=false;}
			
			
		}
	}
	
	public class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e){

				//Fenster Kampffenster = new Fenster(600,290,"Kampfbild",Hero,1,1,1,1);

			
			if(e.getActionCommand().equals("Neues Spiel")){
				neuesSpiel();
			}
			if(e.getActionCommand().equals("Beenden")){
				System.exit(0);
			}
			if(e.getActionCommand().equals("Status")){
				statusfenster = true;
			}
			if(e.getActionCommand().equals("Inventar")){
				inventarfenster = true;
			}
			
			if(e.getActionCommand().equals("Slot 1 - L")){				
				bekommeStatus(2);				
				spielfeld=m.setzefeld(level);
				Hero.setzeSEigenschaften(b.s1,"Alphonse",hp,hpmax, ap, vp, spielerlevel,510,50,54,92,itemfeld);
			}
			if(e.getActionCommand().equals("Slot 2 - L")){								
				bekommeStatus(3);				
				spielfeld=m.setzefeld(level);
				Hero.setzeSEigenschaften(b.s1,"Alphonse",hp,hpmax, ap, vp, spielerlevel,510,50,54,92,itemfeld);
			}
			if(e.getActionCommand().equals("Slot 1 - S")){								
				aktualisiereStatus();				
				Laden.setWerte(itemfeld,hpmax,hp,ap,vp,spielerlevel,level,2);				
			}
			if(e.getActionCommand().equals("Slot 2 - S")){				
				aktualisiereStatus();	
				Laden.setWerte(itemfeld,hpmax,hp,ap,vp,spielerlevel,level,3);
			}
			
			
		}
		
		}
	
	private void bekommeStatus(int s){
		Laden.aktualisiereDaten(s);
		itemfeld=Laden.getitemfeld();
		hpmax=Laden.gethpmax();
		hp=Laden.gethp();
		ap=Laden.getap();
		vp=Laden.getvp();
		spielerlevel=Laden.getlevel();
		level=Laden.getlevelm();
	}

	private void aktualisiereStatus() {
		
		itemfeld[0]=Hero.getitem(0);
		itemfeld[1]=Hero.getitem(1);
		itemfeld[2]=Hero.getitem(2);
		itemfeld[3]=Hero.getitem(3);
		itemfeld[4]=Hero.getitem(4);
		itemfeld[5]=Hero.getitem(5);
		itemfeld[6]=Hero.getitem(6);
		itemfeld[7]=Hero.getitem(7);
		itemfeld[8]=Hero.getitem(8);
		hpmax=Hero.getMHP();
		hp=Hero.getHP();
		ap=Hero.getAP();
		vp=Hero.getVP();
		spielerlevel=Hero.getLevel();
		
	}
	
	public class Al extends KeyAdapter {
		 
	    public Al(){
	     
	}
	    public void keyPressed(KeyEvent e){
	        
	        key = e.getKeyCode();
	        
	        if(haupt==false && statusfenster==false){
	        if(key==KeyEvent.VK_UP){
	        	spielerstelle1=spielerfinden(spielfeld,1);
	        	spielerstelle2=spielerfinden(spielfeld,2);
	        	
	        	if(spielfeld[1][spielerstelle1-1][spielerstelle2]==0 && (spielfeld[0][spielerstelle1-1][spielerstelle2]==0 || spielfeld[0][spielerstelle1-1][spielerstelle2]==4) && zug==1  && zugzahl>0){
	        		
	        		spielfeld[1][spielerstelle1][spielerstelle2]=0;
	        		spielfeld[1][spielerstelle1-1][spielerstelle2]=1;
	        	
	        		zugzahl--;}
	        	
	        	if(spielfeld[1][spielerstelle1-1][spielerstelle2]>100 && zug==1 && zugzahl>0){
	        		
	        		if(spielfeld[1][spielerstelle1-1][spielerstelle2]==101){
			        	spielfeld[1][spielerstelle1][spielerstelle2]=0;
			        	spielfeld[1][spielerstelle1-1][spielerstelle2]=1;
	        		Fenster Kampffenster = new Fenster(2,Hero,1,1,3,3);}     
	        		
	        		if(spielfeld[1][spielerstelle1-1][spielerstelle2]==104){
			        	spielfeld[1][spielerstelle1][spielerstelle2]=0;
			        	spielfeld[1][spielerstelle1-1][spielerstelle2]=1;
	        		Fenster Kampffenster = new Fenster(2,Hero,4,4,5,4);} 
	        		
	        		if(spielfeld[1][spielerstelle1-1][spielerstelle2]==112){
			        	spielfeld[1][spielerstelle1][spielerstelle2]=0;
			        	spielfeld[1][spielerstelle1-1][spielerstelle2]=1;
	        		Fenster Kampffenster = new Fenster(2,Hero,12,4,15,6);} 
	        		
	        		if(spielfeld[1][spielerstelle1-1][spielerstelle2]==103){
			        	spielfeld[1][spielerstelle1][spielerstelle2]=0;
			        	spielfeld[1][spielerstelle1-1][spielerstelle2]=0;
		        		Fenster Kampffenster = new Fenster(2,Hero,3,6,10,5);
		        		level++;spielfeld=m.setzefeld(level);}
		        	
		        	zugzahl=0;}

	        }
	        if(key==KeyEvent.VK_DOWN){
	        	spielerstelle1=spielerfinden(spielfeld,1);
	        	spielerstelle2=spielerfinden(spielfeld,2);
	        	
	        	if(spielfeld[1][spielerstelle1+1][spielerstelle2]==0 && (spielfeld[0][spielerstelle1+1][spielerstelle2]==0 || spielfeld[0][spielerstelle1+1][spielerstelle2]==4) && zug==1 && zugzahl>0){
	        		spielfeld[1][spielerstelle1][spielerstelle2]=0;
	        		spielfeld[1][spielerstelle1+1][spielerstelle2]=1;
	        	
	        		zugzahl--;}
	        	
	        	if(spielfeld[1][spielerstelle1+1][spielerstelle2]>100 && zug==1 && zugzahl>0){
	        		
	        		if(spielfeld[1][spielerstelle1+1][spielerstelle2]==101){
			        	spielfeld[1][spielerstelle1][spielerstelle2]=0;
			        	spielfeld[1][spielerstelle1+1][spielerstelle2]=1;
		        		Fenster Kampffenster = new Fenster(2,Hero,1,1,3,3);}   
	        		
	        		if(spielfeld[1][spielerstelle1+1][spielerstelle2]==104){
			        	spielfeld[1][spielerstelle1][spielerstelle2]=0;
			        	spielfeld[1][spielerstelle1+1][spielerstelle2]=1;
		        		Fenster Kampffenster = new Fenster(2,Hero,4,4,5,4);}   
	        		
	        		if(spielfeld[1][spielerstelle1+1][spielerstelle2]==112){
			        	spielfeld[1][spielerstelle1][spielerstelle2]=0;
			        	spielfeld[1][spielerstelle1+1][spielerstelle2]=1;
	        		Fenster Kampffenster = new Fenster(2,Hero,12,4,15,6);} 
	        		
	        		if(spielfeld[1][spielerstelle1+1][spielerstelle2]==103){
			        	spielfeld[1][spielerstelle1][spielerstelle2]=0;
			        	spielfeld[1][spielerstelle1+1][spielerstelle2]=0;
		        		Fenster Kampffenster = new Fenster(2,Hero,3,6,10,5);
		        		level++;spielfeld=m.setzefeld(level);}
		        	
		        	zugzahl=0;}
	        	
	        }
	        if(key==KeyEvent.VK_LEFT){
	        	spielerstelle1=spielerfinden(spielfeld,1);
	        	spielerstelle2=spielerfinden(spielfeld,2);
	        	
	        	if(spielfeld[1][spielerstelle1][spielerstelle2-1]==0 && (spielfeld[0][spielerstelle1][spielerstelle2-1]==0 || spielfeld[0][spielerstelle1][spielerstelle2-1]==4) && zug==1  && zugzahl>0){
	        		spielfeld[1][spielerstelle1][spielerstelle2]=0;
	        		spielfeld[1][spielerstelle1][spielerstelle2-1]=1;
	        	
	        		zugzahl--;}
	        	
	        	if(spielfeld[1][spielerstelle1][spielerstelle2-1]>100 && zug==1 && zugzahl>0){
	        		
	        		if(spielfeld[1][spielerstelle1][spielerstelle2-1]==101){
			        	spielfeld[1][spielerstelle1][spielerstelle2]=0;
			        	spielfeld[1][spielerstelle1][spielerstelle2-1]=1;
		        		Fenster Kampffenster = new Fenster(2,Hero,1,1,3,3);}    
	        		
	        		if(spielfeld[1][spielerstelle1][spielerstelle2-1]==104){
			        	spielfeld[1][spielerstelle1][spielerstelle2]=0;
			        	spielfeld[1][spielerstelle1][spielerstelle2-1]=1;
		        		Fenster Kampffenster = new Fenster(2,Hero,4,4,5,4);}    
	        		
	        		if(spielfeld[1][spielerstelle1][spielerstelle2-1]==112){
			        	spielfeld[1][spielerstelle1][spielerstelle2]=0;
			        	spielfeld[1][spielerstelle1][spielerstelle2-1]=1;
	        		Fenster Kampffenster = new Fenster(2,Hero,12,4,15,6);} 
	        		
	        		if(spielfeld[1][spielerstelle1][spielerstelle2-1]==103){
			        	spielfeld[1][spielerstelle1][spielerstelle2]=0;
			        	spielfeld[1][spielerstelle1][spielerstelle2-1]=1;
		        		Fenster Kampffenster = new Fenster(2,Hero,3,6,10,5);
		        		level++;spielfeld=m.setzefeld(level);}
		        	
		        	zugzahl=0;}

	        }
	        if(key==KeyEvent.VK_RIGHT){
	        	spielerstelle1=spielerfinden(spielfeld,1);
	        	spielerstelle2=spielerfinden(spielfeld,2);
	        	
	        	if(spielfeld[1][spielerstelle1][spielerstelle2+1]==0 && (spielfeld[0][spielerstelle1][spielerstelle2+1]==0 || spielfeld[0][spielerstelle1][spielerstelle2+1]==4) && zug==1 && zugzahl>0){
	        		spielfeld[1][spielerstelle1][spielerstelle2]=0;
	        		spielfeld[1][spielerstelle1][spielerstelle2+1]=1;
	        	
	        		zugzahl--;}
	        	
	        	if(spielfeld[1][spielerstelle1][spielerstelle2+1]>100 && zug==1 && zugzahl>0){
	        		
	        		if(spielfeld[1][spielerstelle1][spielerstelle2+1]==101){
			        	spielfeld[1][spielerstelle1][spielerstelle2]=0;
			        	spielfeld[1][spielerstelle1][spielerstelle2+1]=1;
		        		Fenster Kampffenster = new Fenster(2,Hero,1,1,3,3);}   
	        		
	        		if(spielfeld[1][spielerstelle1][spielerstelle2+1]==104){
			        	spielfeld[1][spielerstelle1][spielerstelle2]=0;
			        	spielfeld[1][spielerstelle1][spielerstelle2+1]=1;
		        		Fenster Kampffenster = new Fenster(2,Hero,4,4,5,4);}  
	        		
	        		if(spielfeld[1][spielerstelle1][spielerstelle2+1]==112){
			        	spielfeld[1][spielerstelle1][spielerstelle2]=0;
			        	spielfeld[1][spielerstelle1][spielerstelle2+1]=1;
	        		Fenster Kampffenster = new Fenster(2,Hero,12,4,15,6);} 
	        		
	        		if(spielfeld[1][spielerstelle1][spielerstelle2+1]==103){
			        	spielfeld[1][spielerstelle1][spielerstelle2]=0;
			        	spielfeld[1][spielerstelle1][spielerstelle2+1]=1;
		        		Fenster Kampffenster = new Fenster(2,Hero,3,6,10,5);
		        		level++;spielfeld=m.setzefeld(level);}
		        	
		        	zugzahl=0;}
	        	
	        }
	        
	        if(key==KeyEvent.VK_ENTER){
	        	
	        	if(zug==3){
	        		zug=0;
	        	}
	        	
	        	if(zug==0){
	        		zug=1;
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
		
				if(zugzahl==0){
					zug=2;
					zugzahl=4;
				}
				

				if(zug==2){   
					
					
					
        		zug=3;				}
				
				
				spielersieg=Hero.getSieg();

				if(spielersieg==2)neuesSpiel();
				
				
				Thread.sleep(10);}
			catch (InterruptedException f){};
				repaint();}
			}
			
			public void paint (Graphics g){
				super.paint(g);
				
				if(haupt==false){
					
					if (statusfenster==false){
						
						
				g.setColor(Color.white);
				g.fillRect(0,22,1200,600);
				
				xfeld=0;
				yfeld=22;
				
				for(int i=0;i<12;i++){				
					for(int j=0;j<16;j++){
						
						if(spielfeld[0][i][j]==0){
							g.drawImage(b.wiese,xfeld,yfeld,30,30, this);
						}
						/*if(spielfeld[0][i][j]==1){
							g.setColor(Color.black);
							g.fillRect(xfeld, yfeld, 30, 30);
						}*/
						if(spielfeld[0][i][j]==2){
							g.drawImage(b.wiese,xfeld,yfeld,30,30, this);
							g.drawImage(b.Haus,xfeld+4,yfeld+4,22,22, this);
						}
						if(spielfeld[0][i][j]==3){
							g.drawImage(b.wald,xfeld,yfeld,30,30, this);
						}
						if(spielfeld[0][i][j]==4){
							g.drawImage(b.Wald_Unten_Ende,xfeld,yfeld,30,30, this);
						}
						if(spielfeld[0][i][j]==5){
							g.drawImage(b.Wald_Oben_Ende,xfeld,yfeld,30,30, this);
						}
						if(spielfeld[0][i][j]==6){
							g.drawImage(b.wiese,xfeld,yfeld,30,30, this);
							g.drawImage(b.Burg,xfeld,yfeld,19,24, this);
						}
												
						if(spielfeld[1][i][j]==1){
							g.drawImage(b.Marke,xfeld+5,yfeld+5,20,20, this);	
							xspieler=xfeld;
							yspieler=yfeld;
						}
						if(spielfeld[1][i][j]==101){
							g.drawImage(b.m1,xfeld,yfeld+2,30,25, this);
						}
						if(spielfeld[1][i][j]==103){
							g.drawImage(b.m3,xfeld,yfeld,30,30, this);
						}
						if(spielfeld[1][i][j]==104){
							g.drawImage(b.m4,xfeld,yfeld+2,30,25, this);
						}
						if(spielfeld[1][i][j]==112){
							g.drawImage(b.m12,xfeld,yfeld+2,30,25, this);
						}
						
						
						if(zug==1){
							g.drawImage(b.Pfeilo,xspieler+8,yspieler-20,14,17, this);
							g.drawImage(b.Pfeill,xspieler-20,yspieler+8,14,17, this);
							
							g.drawImage(b.Pfeilu,xspieler+8,yspieler+33,14,17, this);							
							g.drawImage(b.Pfeilr,xspieler+33,yspieler+8,14,17, this);
							
							g.setColor(Color.black);
							g.drawString(""+zugzahl,xspieler+11,yspieler+19);
						}
								
											
						xfeld=xfeld+30;
					}					
					yfeld=yfeld+30;
					xfeld=0;					
				}
				
				
					}
					
					if(statusfenster==true){
						g.drawImage(b.Statushintergrund,-5,-15,490,410, this);
						
						Hero.statusAusgabe(g);
					}
					if(inventarfenster==true){						
						g.drawImage(b.Filz,0,0,490,410, this);
						g.drawImage(b.Inventarslot,80,60,323,149, this);
						
						g.setColor(Color.LIGHT_GRAY);
						g.fillRect(35, 255, 410, 100);
						g.setColor(Color.gray);
						g.fillRect(40, 260, 400, 90);
						g.setColor(Color.LIGHT_GRAY);
						g.fillRect(45, 265, 390, 80);
						
						Hero.itemAusgabe(g,itemnummer);
						
					}
					
					
				}
				
				if (haupt==true){
					g.drawImage(b.Hauptmenü,0,-27,490,410, this);	

				}
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
			public int spielerfinden(int[][][] feld,int x){
				for(int i=0;i<12;i++){				
					for(int j=0;j<16;j++){
						if(feld[1][i][j]==1){
							
							if(x==1){
								return i;
							}else{return j;}
							
						}
					}
				}
				return 0;
			}
			
			
			
			
			public void neuesSpiel(){
				xfeld=0;
				yfeld=23;
				itemfeld=Laden.getitemfeld();
				Hero.setzeSEigenschaften(b.s1,"Alphonse",hp,hpmax, ap, vp, spielerlevel,510,50,54,92,itemfeld);
				Hero.setEXP(0);
				spielfeld=m.setzefeld(1);
				Hero.setSieg(0);
				level=1;
				
				haupt=true;
			}
}

