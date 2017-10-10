package Laser;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Spielfeld extends JPanel implements Runnable{
	
	boolean weiter=true;
	int key;
	
	int xs=200,ys=200;
	int g1=31,g2=31;
	int dauer=15;
	int neustart;
	
	int[] x=new int[22];
	int[] y=new int[22];
	
	int bildschirmmodus=0;
	int variablenänderer=1;
	int[] zaehler={0,0,0,0,0,0};
	int[] entgegennehmenfeld=new int[9];
	int level=1,altlevel=1,levelprüfer=1;
	int punkte=0;
	int[] gewählt={0,1,0,0,1,0};
	int zufall=(int)(5*Math.random());

	
	Mauslauscher Mausi=new Mauslauscher();
	Fenster_malen malenF=new Fenster_malen();
	Bilder b=new Bilder();
	LvL Level1=new LvL();
	

		
	  

		public Spielfeld(){
			

			java.net.URL musik = getClass().getResource("StormandFireV.wav");
		 	AudioClip sound = Applet.newAudioClip(musik);	
			sound.loop();
	
			this.addMouseListener(new Mouseklick());
	    	addKeyListener(new Al());
	    	setFocusable(true);
	}
	

	public class Mouseklick extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			
			if(bildschirmmodus==1){
				xs=(e.getX()-(g1/2));
				ys=(e.getY()-(g2/2));
				punkte=punkte-20;}
			
			
			
	        	if(bildschirmmodus==2 && (e.getX()>350 && e.getX()<450) && e.getY()>430 && e.getY()<480){
	        		
	        		xs=(int)(500*Math.random());
					ys=(int)(500*Math.random());
					punkte=0;
	        		bildschirmmodus=1;
	        		level=altlevel;
	        		variablenänderer=1;
	        		levelprüfer=altlevel;
				
	        		for(int i=0;i<5;i++)zaehler[i]=0;	        	
	        		neustart++;
	        
	        	}
	        	
	        	if(bildschirmmodus==90 && e.getX()>200 && e.getX()<250 && e.getY()>210 && e.getY()<260){	        		
        			bildschirmmodus=1;
        			level=1;altlevel=level;levelprüfer=level;
    				startanimation();
	        	}
	        	if(bildschirmmodus==90 && e.getX()>270 && e.getX()<320 && e.getY()>210 && e.getY()<260){	        		
        			bildschirmmodus=1;
        			level=2;altlevel=level;levelprüfer=level;
        			startanimation();
	        	}
	        	if(bildschirmmodus==90 && e.getX()>160 && e.getX()<210 && e.getY()>280 && e.getY()<330){	        		
        			bildschirmmodus=1;
        			level=3;altlevel=level;levelprüfer=level;
        			startanimation();
	        	}
	        	if(bildschirmmodus==90 && e.getX()>230 && e.getX()<280 && e.getY()>280 && e.getY()<330){	        		
        			bildschirmmodus=1;
        			level=4;altlevel=level;levelprüfer=level;
        			startanimation();
	        	}
	        	if(bildschirmmodus==90 && e.getX()>305 && e.getX()<355 && e.getY()>280 && e.getY()<330){	        		
        			bildschirmmodus=1;
        			level=6;altlevel=level;levelprüfer=level;
        			startanimation();
	        	}
	        	
	        	
	        	if(bildschirmmodus==4 && e.getX()>50 && e.getX()<140 && e.getY()>105 && e.getY()<155){
					g1=20;
					g2=20;
					gewählt[0]=1;gewählt[1]=0;gewählt[2]=0;
	        	}
	        	if(bildschirmmodus==4 && e.getX()>205 && e.getX()<295 && e.getY()>105 && e.getY()<155){
					g1=31;
					g2=31;
					gewählt[0]=0;gewählt[1]=1;gewählt[2]=0;
	        	}
	        	if(bildschirmmodus==4 && e.getX()>360 && e.getX()<450 && e.getY()>105 && e.getY()<155){
					g1=40;
					g2=40;
					gewählt[0]=0;gewählt[1]=0;gewählt[2]=1;
	        	}
	        	if(bildschirmmodus==4 && e.getX()>50 && e.getX()<140 && e.getY()>215 && e.getY()<265){
	        		dauer=25;
	        		gewählt[3]=1;gewählt[4]=0;gewählt[5]=0;
	        	}
	        	if(bildschirmmodus==4 && e.getX()>205 && e.getX()<295 && e.getY()>215 && e.getY()<265){
	        		dauer=15;
	        		gewählt[3]=0;gewählt[4]=1;gewählt[5]=0;
	        	}
	        	if(bildschirmmodus==4 && e.getX()>360 && e.getX()<450 && e.getY()>215 && e.getY()<265){
	        		dauer=6;
	        		gewählt[3]=0;gewählt[4]=0;gewählt[5]=1;
	        	}
	        	if(bildschirmmodus==4 && e.getX()>335 && e.getX()<425 && e.getY()>335 && e.getY()<385){
	        		int z=(int)(Math.random()*5)+1;
	        		if(z==1){
	        			g1=31;g2=31;dauer=15;
	        			gewählt[0]=0;gewählt[1]=1;gewählt[2]=0;gewählt[3]=0;gewählt[4]=1;gewählt[5]=0;
	        			}
	        		if(z==2){
		        		g1=20;g2=20;dauer=6;
		        		gewählt[0]=1;gewählt[1]=0;gewählt[2]=0;gewählt[3]=0;gewählt[4]=0;gewählt[5]=1;
		        		}
	        		if(z==3){
		        		g1=40;g2=40;dauer=15;
		        		gewählt[0]=0;gewählt[1]=0;gewählt[2]=1;gewählt[3]=0;gewählt[4]=1;gewählt[5]=0;
		        		}
	        		if(z==4){
		        		g1=31;g2=31;dauer=6;
		        		gewählt[0]=0;gewählt[1]=1;gewählt[2]=0;gewählt[3]=0;gewählt[4]=0;gewählt[5]=1;
		        		}
	        		if(z==5){
		        		g1=20;g2=20;dauer=25;
		        		gewählt[0]=1;gewählt[1]=0;gewählt[2]=0;gewählt[3]=1;gewählt[4]=0;gewählt[5]=0;
		        		}
	        	}
			

				bildschirmmodus=Mausi.Mausklicken(e,bildschirmmodus);
				repaint();
	        	
		}
	}
	
	
	public class Al extends KeyAdapter {
		 
	    public Al(){
	     
	}
	    public void keyPressed(KeyEvent e){
	        
	        key = e.getKeyCode();
	    }
	}
	
	public void startanimation(){
		Thread Grafik = new Thread(this);
		Grafik.start();
	}
	
	
	
	public void run(){
		while(weiter){
			try{
						
					entgegennehmenfeld=Level1.konfiguriere(level, zaehler, punkte, variablenänderer, bildschirmmodus);
					rückgabefeld_verwerten(entgegennehmenfeld);
					x=Level1.holdirdiexwerte();
					y=Level1.holdirdieywerte();
				
						//----------------------------------------------------------------------------------  Level 1 - Anfang - Kollision
						if(level==1){

						
						
					if(zaehler[0]==0){
						if((x[1]>xs && x[1]<xs+g1 ) && (y[1]>ys && y[1]<ys+g1))bildschirmmodus=2;
						if((x[2]>xs && x[2]<xs+g1 ) && (y[2]>ys && y[2]<ys+g1))bildschirmmodus=2;
						if((x[3]>xs && x[3]<xs+g1 ) && (y[3]>ys && y[3]<ys+g1))bildschirmmodus=2;
						}
					if(zaehler[0]==1){
						if((x[4]>xs && x[4]<xs+g1 ) && (y[4]>ys && y[4]<ys+g1))bildschirmmodus=2;
						if((x[5]>xs && x[5]<xs+g1 ) && (y[5]>ys && y[5]<ys+g1))bildschirmmodus=2;
						if((x[6]>xs && x[6]<xs+g1 ) && (y[6]>ys && y[6]<ys+g1))bildschirmmodus=2;
						}
					if(zaehler[0]==2){
						if((x[7]>xs && x[7]<xs+g1) || (y[7]>ys && y[7]<ys+g1))bildschirmmodus=2;
						}
					if(zaehler[0]==3){
						if((x[8]>xs && x[8]<xs+g1) || (y[8]>ys && y[8]<ys+g1))bildschirmmodus=2;
						if((x[9]>xs && x[9]<xs+g1) || (y[9]>ys && y[9]<ys+g1))bildschirmmodus=2;
						}
						
					
						}
						//----------------------------------------------------------------------------------  Level 1 - Ende - Kollision
						
						
						
						//----------------------------------------------------------------------------------  Level 2 - Anfang - Kollision
						if(level==2){
							
							if(zaehler[1]==0){
								if((x[1]>xs && x[1]<xs+g1) || (y[1]>ys && y[1]<ys+g1))bildschirmmodus=2;
								if((x[2]>xs && x[2]<xs+g1) || (y[2]>ys && y[2]<ys+g1))bildschirmmodus=2;
								}
							if(zaehler[1]==1){
								if((x[3]>xs && x[3]<xs+g1) || (y[3]>ys && y[3]<ys+g1))bildschirmmodus=2;
								if((x[4]>xs && x[4]<xs+g1 ) || (y[4]>ys && y[4]<ys+g1))bildschirmmodus=2;
								if((x[5]>xs && x[5]<xs+g1 ) || (y[5]>ys && y[5]<ys+g1))bildschirmmodus=2;
								}
							if(zaehler[1]==2){
								if((x[6]>xs && x[6]<xs+g1 ) || (y[6]>ys && y[6]<ys+g1))bildschirmmodus=2;
								if((x[7]>xs && x[7]<xs+g1) || (y[7]>ys && y[7]<ys+g1))bildschirmmodus=2;
								if((x[8]>xs && x[8]<xs+g1) || (y[8]>ys && y[8]<ys+g1))bildschirmmodus=2;
								if((x[9]>xs && x[9]<xs+g1) || (y[9]>ys && y[9]<ys+g1))bildschirmmodus=2;
								}
							if(zaehler[1]==3){
								if((x[10]>xs && x[10]<xs+g1 ) || (y[10]>ys && y[10]<ys+g1))bildschirmmodus=2;
								if((x[11]>xs && x[11]<xs+g1) || (y[11]>ys && y[11]<ys+g1))bildschirmmodus=2;
								if((x[12]>xs && x[12]<xs+g1) || (y[12]>ys && y[12]<ys+g1))bildschirmmodus=2;
								if((x[13]>xs && x[13]<xs+g1) || (y[13]>ys && y[13]<ys+g1))bildschirmmodus=2;
								}
							}
						//----------------------------------------------------------------------------------  Level 2 - Ende - Kollision
						
						
						
						//----------------------------------------------------------------------------------  Level 3 - Anfang - Kollision
						if(level==3){
						
							
							if(zaehler[2]==0){
								if((x[1]>xs && x[1]<xs+g1) || (y[1]>ys && y[1]<ys+g1))bildschirmmodus=2;
								if((x[2]>xs && x[2]<xs+g1) || (y[2]>ys && y[2]<ys+g1))bildschirmmodus=2;
								if((x[3]>xs && x[3]<xs+g1) || (y[3]>ys && y[3]<ys+g1))bildschirmmodus=2;
								if((x[4]>xs && x[4]<xs+g1 ) || (y[4]>ys && y[4]<ys+g1))bildschirmmodus=2;
								if((x[5]>xs && x[5]<xs+g1 ) || (y[5]>ys && y[5]<ys+g1))bildschirmmodus=2;
								if((x[6]>xs && x[6]<xs+g1 ) || (y[6]>ys && y[6]<ys+g1))bildschirmmodus=2;
								if((x[7]>xs && x[7]<xs+g1) || (y[7]>ys && y[7]<ys+g1))bildschirmmodus=2;
								if((x[8]>xs && x[8]<xs+g1) || (y[8]>ys && y[8]<ys+g1))bildschirmmodus=2;
								}
							
							if(zaehler[2]==1){
								if((x[9]>xs && x[9]<xs+g1) || (y[9]>ys && y[9]<ys+g1))bildschirmmodus=2;
								if((x[10]>xs && x[10]<xs+g1 ) || (y[10]>ys && y[10]<ys+g1))bildschirmmodus=2;
								if((x[11]>xs && x[11]<xs+g1) || (y[11]>ys && y[11]<ys+g1))bildschirmmodus=2;
								if((x[12]>xs && x[12]<xs+g1) || (y[12]>ys && y[12]<ys+g1))bildschirmmodus=2;}
							
							
						}
						//----------------------------------------------------------------------------------  Level 3 - Ende - Kollision
						
						
						
						
						//----------------------------------------------------------------------------------  Level 4 - Anfang - Kollision
			
					
						if(level==4){
							
							if(zaehler[3]==0){
								if((x[1]>xs && x[1]<xs+g1) || (y[1]>ys && y[1]<ys+g1))bildschirmmodus=2;
								if((x[2]>xs && x[2]<xs+g1) || (y[2]>ys && y[2]<ys+g1))bildschirmmodus=2;
								if((x[3]>xs && x[3]<xs+g1) || (y[3]>ys && y[3]<ys+g1))bildschirmmodus=2;
								if((x[4]>xs && x[4]<xs+g1 ) || (y[4]>ys && y[4]<ys+g1))bildschirmmodus=2;
								}
							
							if(zaehler[3]==1){
								if((x[5]>xs && x[5]<xs+g1 ) || (y[5]>ys && y[5]<ys+g1))bildschirmmodus=2;
								if((x[6]>xs && x[6]<xs+g1 ) || (y[6]>ys && y[6]<ys+g1))bildschirmmodus=2;
								if((x[7]>xs && x[7]<xs+g1) || (y[7]>ys && y[7]<ys+g1))bildschirmmodus=2;
								if((x[8]>xs && x[8]<xs+g1) || (y[8]>ys && y[8]<ys+g1))bildschirmmodus=2;
								if((x[9]>xs && x[9]<xs+g1) || (y[9]>ys && y[9]<ys+g1))bildschirmmodus=2;
								}
							
							if(zaehler[3]==2){
								if((x[10]>xs && x[10]<xs+g1) || (y[10]>ys && y[10]<ys+g1))bildschirmmodus=2;
								if((x[11]>xs && x[11]<xs+g1) || (y[11]>ys && y[11]<ys+g1))bildschirmmodus=2;
								if((x[12]>xs && x[12]<xs+g1) || (y[12]>ys && y[12]<ys+g1))bildschirmmodus=2;
								if((x[13]>xs && x[13]<xs+g1) || (y[13]>ys && y[13]<ys+g1))bildschirmmodus=2;
								if((x[14]>xs && x[14]<xs+g1) || (y[14]>ys && y[14]<ys+g1))bildschirmmodus=2;
								if((x[15]>xs && x[15]<xs+g1) || (y[15]>ys && y[15]<ys+g1))bildschirmmodus=2;
								}
						}


						//----------------------------------------------------------------------------------  Level 4 - Ende - Kollision
						
						
						//----------------------------------------------------------------------------------  Level 5 - Anfang - Kollision
						if(level==5){
							
						
						
						
						if(zaehler[4]==0){
							if((x[1]>xs && x[1]<xs+g1 ) && (y[1]>ys && y[1]<ys+g1))bildschirmmodus=2;
							if((x[2]>xs && x[2]<xs+g1 ) && (y[2]>ys && y[2]<ys+g1))bildschirmmodus=2;
							if((x[3]>xs && x[3]<xs+g1 ) && (y[3]>ys && y[3]<ys+g1))bildschirmmodus=2;
							if((x[4]>xs && x[4]<xs+g1 ) && (y[4]>ys && y[4]<ys+g1))bildschirmmodus=2;
							if((x[5]>xs && x[5]<xs+g1 ) && (y[5]>ys && y[5]<ys+g1))bildschirmmodus=2;
							if((x[6]>xs && x[6]<xs+g1 ) && (y[6]>ys && y[6]<ys+g1))bildschirmmodus=2;
							if((x[7]>xs && x[7]<xs+g1 ) && (y[7]>ys && y[7]<ys+g1))bildschirmmodus=2;
							if((x[8]>xs && x[8]<xs+g1 ) && (y[8]>ys && y[8]<ys+g1))bildschirmmodus=2;
							if((x[9]>xs && x[9]<xs+g1 ) && (y[9]>ys && y[9]<ys+g1))bildschirmmodus=2;
							if((x[10]>xs && x[10]<xs+g1 ) && (y[10]>ys && y[10]<ys+g1))bildschirmmodus=2;
							if((x[11]>xs && x[11]<xs+g1 ) && (y[11]>ys && y[11]<ys+g1))bildschirmmodus=2;
							if((x[12]>xs && x[12]<xs+g1 ) && (y[12]>ys && y[12]<ys+g1))bildschirmmodus=2;
							}
												
						if(zaehler[4]==1){
							if((x[13]>xs && x[13]<xs+g1) || (y[13]>ys && y[13]<ys+g1))bildschirmmodus=2;
							if((x[14]>xs && x[14]<xs+g1) || (y[14]>ys && y[14]<ys+g1))bildschirmmodus=2;
							if((x[15]>xs && x[15]<xs+g1) || (y[15]>ys && y[15]<ys+g1))bildschirmmodus=2;
							if((x[16]>xs && x[16]<xs+g1) || (y[16]>ys && y[16]<ys+g1))bildschirmmodus=2;
							if((x[17]>xs && x[17]<xs+g1) || (y[17]>ys && y[17]<ys+g1))bildschirmmodus=2;
							if((x[18]>xs && x[18]<xs+g1) || (y[18]>ys && y[18]<ys+g1))bildschirmmodus=2;
							if((x[20]>xs && x[20]<xs+g1) || (y[20]>ys && y[20]<ys+g1))bildschirmmodus=2;
							if((x[21]>xs && x[21]<xs+g1) || (y[21]>ys && y[21]<ys+g1))bildschirmmodus=2;
							}
						
						}
						//----------------------------------------------------------------------------------  Level 5 - Ende - Kollision
						
						//----------------------------------------------------------------------------------  Level 6 - Anfang - Kollision
						if(level==6){

						
						
					if(zaehler[5]==0){
						if((x[1]>xs && x[1]<xs+g1 ) || (y[1]>ys && y[1]<ys+g1))bildschirmmodus=2;
						if((x[2]>xs && x[2]<xs+g1 ) || (y[2]>ys && y[2]<ys+g1))bildschirmmodus=2;
						if((x[3]>xs && x[3]<xs+g1 ) || (y[3]>ys && y[3]<ys+g1))bildschirmmodus=2;
						if((x[4]>xs && x[4]<xs+g1 ) || (y[4]>ys && y[4]<ys+g1))bildschirmmodus=2;
						if((x[5]>xs && x[5]<xs+g1 ) || (y[5]>ys && y[5]<ys+g1))bildschirmmodus=2;
						if((x[6]>xs && x[6]<xs+g1 ) || (y[6]>ys && y[6]<ys+g1))bildschirmmodus=2;
						if((x[7]>xs && x[7]<xs+g1 ) || (y[7]>ys && y[7]<ys+g1))bildschirmmodus=2;
						if((x[8]>xs && x[8]<xs+g1 ) || (y[8]>ys && y[8]<ys+g1))bildschirmmodus=2;
						}
					if(zaehler[5]==1){
						if((x[1]>xs && x[1]<xs+g1 ) || (y[1]>ys && y[1]<ys+g1))bildschirmmodus=2;
						if((x[2]>xs && x[2]<xs+g1 ) || (y[2]>ys && y[2]<ys+g1))bildschirmmodus=2;
						if((x[3]>xs && x[3]<xs+g1 ) || (y[3]>ys && y[3]<ys+g1))bildschirmmodus=2;
						if((x[4]>xs && x[4]<xs+g1 ) || (y[4]>ys && y[4]<ys+g1))bildschirmmodus=2;
						}
					
						}
						//----------------------------------------------------------------------------------  Level 6 - Ende - Kollision
						
						Thread.sleep(dauer);
					
				}
			catch (InterruptedException f){};
				repaint();
				}
			}
	
			public void paint (Graphics g){
				super.paint(g);
				
				
				if(bildschirmmodus==0)g.drawImage(b.hauptmenü,0,0,500,506,this);

				if(bildschirmmodus==1){
					
					if(neustart==0){levelprüfer=level;}
					else{levelprüfer=altlevel;}
				
				if(variablenänderer==1){
						
				switch (levelprüfer) {
			    	case 1:			
			    		x=Level1.setzeVAR(1,0);
			    		y=Level1.setzeVAR(1,1);						
			    		break;		    		
			    	case 2: 
			    		x=Level1.setzeVAR(2,0);
						y=Level1.setzeVAR(2,1);								
						break;						
			    	case 3: 					
						x=Level1.setzeVAR(3,0);
						y=Level1.setzeVAR(3,1);
						break;
			    	case 4:					
			    		x=Level1.setzeVAR(4,0);
			    		y=Level1.setzeVAR(4,1);
			    		break;			    		
			    	case 5: 					
			    		x=Level1.setzeVAR(5,0);
			    		y=Level1.setzeVAR(5,1);			
			    		break;
			    	case 6: 					
			    		x=Level1.setzeVAR(6,0);
			    		y=Level1.setzeVAR(6,1);			
			    		break;}
				
	    		levelprüfer=10;
	    		variablenänderer=0;		
				
				}
				
				
				
				switch (zufall) {
				case 1:  	g.drawImage(b.Sterneskal, 0, 0,500,500, this);
				break;
				case 2:  	g.drawImage(b.Sterneskal2, 0, 0,500,500, this);
				break;
				case 3:  	g.drawImage(b.Sterneskal3, 0, 0,500,500, this);
				break;
				case 4: 	g.drawImage(b.Sterneskal4, 0, 0,500,500, this);
				break;
				case 0: 	g.drawImage(b.Sterneskal5, 0, 0,500,500, this);
				break;}
				
				g.setColor(Color.white);
				Font arial = new Font("Arial",Font.BOLD,20);
				g.setFont(arial);
				g.drawString("Level: "+level,50,490);
				g.drawString("Punkte: "+punkte,150,490);
				
				g.drawImage(b.Yodaskal, xs,ys,g1,g2,this);

				
				//----------------------------------------------------------------------------------  Level 1 - Anfang
				if(level==1){

				g.setColor(Color.red);
				
				if(zaehler[0]==0){
					
					zeichneLaser(g,x[1],y[1],0,1);
					zeichneLaser(g,x[2],y[2],0,1);
					zeichneLaser(g,x[3],y[3],0,1);
}
				
				if(zaehler[0]==1){
					
					zeichneLaser(g,x[4],y[4],0,1);
					zeichneLaser(g,x[5],y[5],0,1);
					zeichneLaser(g,x[6],y[6],0,1);
}
				
				if(zaehler[0]==2){
					
					zeichneLaser(g,x[7],y[7],1,1);
}
				if(zaehler[0]==3){
					
					zeichneLaser(g,x[8],y[8],1,1);
					zeichneLaser(g,x[9],y[9],1,1);

				}
				}
				//----------------------------------------------------------------------------------  Level 1 - Ende
				
				
				
				//----------------------------------------------------------------------------------  Level 2 - Anfang
				if(level==2){

				g.setColor(Color.green);
					
				if(zaehler[1]==0){
					
					zeichneLaser(g,x[1],y[1],1,2);
					zeichneLaser(g,x[2],y[2],1,2);
					
					}
				if(zaehler[1]==1){
					
					zeichneLaser(g,x[3],y[3],1,2);
					zeichneLaser(g,x[4],y[4],1,2);
					zeichneLaser(g,x[5],y[5],1,2);
					
					}
				if(zaehler[1]==2){
					
					zeichneLaser(g,x[6],y[6],1,2);
					zeichneLaser(g,x[7],y[7],1,2);
					zeichneLaser(g,x[8],y[8],1,2);
					zeichneLaser(g,x[9],y[9],1,2);
					}
				if(zaehler[1]==3){
					
					zeichneLaser(g,x[10],y[10],1,2);
					zeichneLaser(g,x[11],y[11],1,2);
					zeichneLaser(g,x[12],y[12],1,2);
					zeichneLaser(g,x[13],y[13],1,2);
					}
				}
				//----------------------------------------------------------------------------------  Level 2 - Ende
				
				//----------------------------------------------------------------------------------  Level 3 - Anfang
				if(level==3){

					g.setColor(Color.orange);
					
					if(zaehler[2]==0){
						
						zeichneLaser(g,x[1],y[1],1,3);
						zeichneLaser(g,x[2],y[2],1,3);
						zeichneLaser(g,x[3],y[3],1,3);
						zeichneLaser(g,x[4],y[4],1,3);
						zeichneLaser(g,x[5],y[5],1,3);
						zeichneLaser(g,x[6],y[6],1,3);
						zeichneLaser(g,x[7],y[7],1,3);

					}
					
					if(zaehler[2]==1){
						zeichneLaser(g,x[8],y[8],1,3);
						zeichneLaser(g,x[9],y[9],1,3);
						zeichneLaser(g,x[10],y[10],1,3);
						zeichneLaser(g,x[11],y[11],1,3);}
					
				}
				//----------------------------------------------------------------------------------  Level 3 - Ende
				
				//----------------------------------------------------------------------------------  Level 4 - Anfang
					if(level==4){

						g.setColor(Color.cyan);
						if(zaehler[3]==0){
							zeichneLaser(g,x[1],y[1],1,4);
							zeichneLaser(g,x[2],y[2],1,4);
							zeichneLaser(g,x[3],y[3],1,4);
							zeichneLaser(g,x[4],y[4],1,4);}
						
						if(zaehler[3]==1){							
							zeichneLaser(g,x[5],y[5],1,4);
							zeichneLaser(g,x[6],y[6],1,4);
							zeichneLaser(g,x[7],y[7],1,4);
							zeichneLaser(g,x[8],y[8],1,4);
							zeichneLaser(g,x[9],y[9],1,4);}
						
						if(zaehler[3]==2){							
							zeichneLaser(g,x[10],y[10],1,4);
							zeichneLaser(g,x[11],y[11],1,4);
							zeichneLaser(g,x[12],y[12],1,4);
							zeichneLaser(g,x[13],y[13],1,4);
							zeichneLaser(g,x[14],y[14],1,4);
							zeichneLaser(g,x[15],y[15],1,4);}
					}

				//----------------------------------------------------------------------------------  Level 4 - Ende
					
					//----------------------------------------------------------------------------------  Level 5 - Anfang
					
					if(level==5){
						g.setColor(Color.white);
						
						if(zaehler[4]==0){
							zeichneLaser(g,x[1],y[1],0,5);
							zeichneLaser(g,x[2],y[2],0,5);
							zeichneLaser(g,x[3],y[3],0,5);
							zeichneLaser(g,x[4],y[4],0,5);
							zeichneLaser(g,x[5],y[5],0,5);
							zeichneLaser(g,x[6],y[6],0,5);
							zeichneLaser(g,x[7],y[7],0,5);
							zeichneLaser(g,x[8],y[8],0,5);
							zeichneLaser(g,x[9],y[9],0,5);
							zeichneLaser(g,x[10],y[10],0,5);
							zeichneLaser(g,x[11],y[11],0,5);
							zeichneLaser(g,x[12],y[12],0,5);}
						
						if(zaehler[4]==1){							
							zeichneLaser(g,x[13],y[13],1,5);
							zeichneLaser(g,x[14],y[14],1,5);
							zeichneLaser(g,x[15],y[15],1,5);
							zeichneLaser(g,x[16],y[16],1,5);
							zeichneLaser(g,x[17],y[17],1,5);
							zeichneLaser(g,x[18],y[18],1,5);
							zeichneLaser(g,x[20],y[20],1,5);
							zeichneLaser(g,x[21],y[21],1,5);}
					}
				
					//----------------------------------------------------------------------------------  Level 5 - Ende
					
//----------------------------------------------------------------------------------  Level 5 - Anfang
					
					if(level==6){
						g.setColor(Color.magenta);
						
						if(zaehler[5]==0){
							zeichneLaser(g,x[1],y[1],1,6);
							zeichneLaser(g,x[2],y[2],1,6);
							zeichneLaser(g,x[3],y[3],1,6);
							zeichneLaser(g,x[4],y[4],1,6);
							zeichneLaser(g,x[5],y[5],1,6);
							zeichneLaser(g,x[6],y[6],1,6);
							zeichneLaser(g,x[7],y[7],1,6);
							zeichneLaser(g,x[8],y[8],1,6);}
						if(zaehler[5]==1){
							zeichneLaser(g,x[1],y[1],1,6);
							zeichneLaser(g,x[2],y[2],1,6);
							zeichneLaser(g,x[3],y[3],1,6);
							zeichneLaser(g,x[4],y[4],1,6);}
					}
				
					//----------------------------------------------------------------------------------  Level 6 - Ende
			}

				
				malenF.malen(g,bildschirmmodus,zufall,altlevel,level,punkte,gewählt);

			}
			
			public void zeichneLaser(Graphics g,int x,int y,int Modus,int Laserzahl){
				
				if(Modus==1){
					g.drawLine(x-1000, y+5, x+1000, y+5);
					g.drawLine(x+5, y-1000, x+5, y+1000);}
				
				if(Laserzahl==1)
					g.drawImage(b.Laserskal, x,y,10,10,this);
				if(Laserzahl==2)
					g.drawImage(b.Laserskal2, x,y,10,10,this);
				if(Laserzahl==3)
					g.drawImage(b.Laserskal3, x,y,10,10,this);
				if(Laserzahl==4)
					g.drawImage(b.Laserskal4, x,y,10,10,this);
				if(Laserzahl==5)
					g.drawImage(b.Laserskal5, x,y,10,10,this);
				if(Laserzahl==6)
					g.drawImage(b.Laserskal6, x,y,10,10,this);
				
			}
			
			public void rückgabefeld_verwerten(int[] feld){
				for(int i=0;i<5;i++)zaehler[i]=feld[i];
				
				punkte=feld[5];
				variablenänderer=feld[6];
				bildschirmmodus=feld[7];
				level=feld[8];
			}

}

