package Memos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Memory extends Frame implements Runnable{
	
	int xs=100;  										// Koordinaten der Rahmen
	int ys=100;  										// ändern sich immer plus 60.
	int xz=0;    										// Koordinaten der farbigen
	int yz=0;    										// Quadrate.
    int d=0;  											// Übergangsvariable des Feldes
    int zeichner1=0;  									// Wenn er eins ist, wird ein kleines farbiges Quadrat gezeichnet.
    int p1=0,p2=0,p3=0,p4=0,p5=0,p6=0,p7=0,p8=0;  		// 8 Prüfer um dreifaches Vorkommen zu verhindern.
    double timer=0; 								 	// Timer für Dauer des Programms.  
    int zaehler1=0;  									// Zwei Zähler für FOR-Schleife
    int zaehler2=0;  									// zur Generierung der Rahmen. 
    int zaehler3=0;										// Dient zu Überprüfung der Paare.
    int paarezaehler=0;									// Zählt alle erreichten Paare.
    int zeitstrahllaenge=300;  							// Länge des Quadrates, das den Zeitbalken darstellt. Wird proportional zum Timer kleiner.
    int bildschirmmodus=0;								// Der Menüwechsler.
    int dauer=100;										// Setzt die Spieldauer, frei vom Spieler wählbar.
    int altfeld1=0,altfeld2=0;							// Zwei Variablen die das neue Feld mit dem alten Feld auf gleiche Werte überprüfen.
    boolean weiter=true,positiv=true,pause=true; 		// WEITER dient als Endlosschleife und POSITIV setzt die Grafik.

	private Button b1;
	
	private MyWindowListener w1 = new MyWindowListener();
	private MyActionListener a1 = new MyActionListener();
	
	int[][] Memoryfeld = new int [4][4];
   	int feld1;
   	int feld2;
	
	public Memory(){
		
		super("MEMORY");
		
		this.setLayout(null);
		this.b1=new Button("Spiel starten");
		this.b1.setBounds(150,220,200,100);
		this.add(b1);
		this.setLocation(0,0);
		this.setSize(500,500);
		this.setVisible(true);
		this.addWindowListener(w1);
		this.b1.addActionListener(a1);
		this.addMouseListener(new Mouseklick());
		
		// Erzeuge Menüleiste
		MenuBar menu=new MenuBar();
		setMenuBar(menu);
		
		// Ezeuge ein Menü
		Menu Spiel=new Menu("Spiel");
		menu.add(Spiel);
		Menu Grafik=new Menu("Grafik");
		menu.add(Grafik);
		Menu Zeit=new Menu("Zeit");
		menu.add(Zeit);

		// Erzeuge einen Menü-Eintrag
		
		MenuItem Neustarten=new MenuItem("Neu starten");
		Spiel.add(Neustarten);
		MenuItem Pause=new MenuItem("Pause");
		Pause.addActionListener(a1);
		Spiel.add(Pause);
		MenuItem Stopp=new MenuItem("Schließen");
		Stopp.addActionListener(a1);
		Spiel.add(Stopp);
	
		
		MenuItem Positiv=new MenuItem("Positiv");
		Positiv.addActionListener(a1);
		Grafik.add(Positiv);
		MenuItem Negativ=new MenuItem("Negativ");
		Negativ.addActionListener(a1);
		Grafik.add(Negativ);
		
		
		MenuItem sec1=new MenuItem("Stufe 3");
		sec1.addActionListener(a1);	
		MenuItem sec2=new MenuItem("Stufe 2");
		sec2.addActionListener(a1);
		MenuItem sec3=new MenuItem("Stufe 1");
		sec3.addActionListener(a1);
		Zeit.add(sec3);
		Zeit.add(sec2);
		Zeit.add(sec1);
		
				   		for(feld1=0; feld1 < 4; feld1++){

   			for(feld2=0; feld2 < 4; feld2++){
 
   				do{
   				
   				d=(int)(9*Math.random());
   				if( (d==1) && (p2<2) ){Memoryfeld[feld1][feld2] = d;
   				p2++;}
   				if( (d==2) && (p3<2) ){Memoryfeld[feld1][feld2] = d;
   				p3++;}
   				if( (d==3) && (p4<2) ){Memoryfeld[feld1][feld2] = d;
   				p4++;}
   				if( (d==4) && (p5<2) ){Memoryfeld[feld1][feld2] = d;
   				p5++;}
   				if( (d==5) && (p6<2) ){Memoryfeld[feld1][feld2] = d;
   				p6++;}
   				if( (d==6) && (p7<2) ){Memoryfeld[feld1][feld2] = d;
   				p7++;}
   				if( (d==7) && (p8<2) ){Memoryfeld[feld1][feld2] = d;
   				p8++;}
   				if( (d==8) && (p1<2) ){Memoryfeld[feld1][feld2] = d;
   				p1++;}
   				}while(Memoryfeld[feld1][feld2]==0);
   				System.out.print(feld1+"  "+feld2+" | "+d+" ||| ");

   			}
}
				   		
		
	}

	public static void main(String[] args) {

		
				Memory versuch = new Memory();		
}

	public class Mouseklick extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			if(bildschirmmodus==1){
				
				
				
				/*-----------------------------------------------------------------------------------------
				 * -----------------------------------------------------------------------------------------
				 * -----------------------------------------------------------------------------------------
				 * -----------------------------------------------------------------------------------------
				 * -----------------------------------------------------------------------------------------*/				
				
				
				
			
				if(e.getX()>101 && e.getX()<151 && e.getY()>101 && e.getY()<151){
					feld1=0;
					feld2=0;
					xz=110;
					yz=110;
					zeichner1 = 1;
					zaehler3++;
					repaint();
					
				}
				if(e.getX()>161 && e.getX()<211 && e.getY()>101 && e.getY()<151){
					feld1=0;
					feld2=1;
					xz=170;
					yz=110;
					zeichner1 = 1;
					zaehler3++;
					repaint();
					
				}
				if(e.getX()>221 && e.getX()<271 && e.getY()>101 && e.getY()<151){
					feld1=0;
					feld2=2;
					xz=230;
					yz=110;
					zeichner1 = 1;
					zaehler3++;
					repaint();
					
				}
				if(e.getX()>281 && e.getX()<331 && e.getY()>101 && e.getY()<151){
					feld1=0;
					feld2=3;
					xz=290;
					yz=110;
					zeichner1 = 1;
					zaehler3++;
					repaint();
					
				}
				
				if(e.getX()>101 && e.getX()<151 && e.getY()>161 && e.getY()<211){
					feld1=1;
					feld2=0;
					xz=110;
					yz=170;
					zeichner1 = 1;
					zaehler3++;
					repaint();
					
				}
				if(e.getX()>161 && e.getX()<211 && e.getY()>161 && e.getY()<211){
					feld1=1;
					feld2=1;
					xz=170;
					yz=170;
					zeichner1 = 1;
					zaehler3++;
					repaint();
					
				}
				if(e.getX()>221 && e.getX()<271 && e.getY()>161 && e.getY()<211){
					feld1=1;
					feld2=2;
					xz=230;
					yz=170;
					zeichner1 = 1;
					zaehler3++;
					repaint();
					
				}
				if(e.getX()>281 && e.getX()<331 && e.getY()>161 && e.getY()<211){
					feld1=1;
					feld2=3;
					xz=290;
					yz=170;
					zeichner1 = 1;
					zaehler3++;
					repaint();
					
				}
				
				if(e.getX()>101 && e.getX()<151 && e.getY()>221 && e.getY()<271){
					feld1=2;
					feld2=0;
					xz=110;
					yz=230;
					zeichner1 = 1;
					zaehler3++;
					repaint();
					
				}
				if(e.getX()>161 && e.getX()<211 && e.getY()>221 && e.getY()<271){
					feld1=2;
					feld2=1;
					xz=170;
					yz=230;
					zeichner1 = 1;
					zaehler3++;
					repaint();
					
				}
				if(e.getX()>221 && e.getX()<271 && e.getY()>221 && e.getY()<271){
					feld1=2;
					feld2=2;
					xz=230;
					yz=230;
					zeichner1 = 1;
					zaehler3++;
					repaint();
					
				}
				if(e.getX()>281 && e.getX()<331 && e.getY()>221 && e.getY()<271){
					feld1=2;
					feld2=3;
					xz=290;
					yz=230;
					zeichner1 = 1;
					zaehler3++;
					repaint();
					
				}
				
				
				
				if(e.getX()>101 && e.getX()<151 && e.getY()>281 && e.getY()<331){
					feld1=3;
					feld2=0;
					xz=110;
					yz=290;
					zeichner1 = 1;
					zaehler3++;
					repaint();}
				if(e.getX()>161 && e.getX()<211 && e.getY()>281 && e.getY()<331){
					feld1=3;
					feld2=1;
					xz=170;
					yz=290;
					zeichner1 = 1;
					zaehler3++;
					repaint();}
				if(e.getX()>221 && e.getX()<271 && e.getY()>281 && e.getY()<331){
					feld1=3;
					feld2=2;
					xz=230;
					yz=290;
					zeichner1 = 1;
					zaehler3++;
					repaint();}
				if(e.getX()>281 && e.getX()<331 && e.getY()>281 && e.getY()<331){
					feld1=3;
					feld2=3;
					xz=290;
					yz=290;
					zeichner1 = 1;
					zaehler3++;
					repaint();}
				

				
				
				
/*-----------------------------------------------------------------------------------------
 * -----------------------------------------------------------------------------------------
 * -----------------------------------------------------------------------------------------
 * -----------------------------------------------------------------------------------------
 * -----------------------------------------------------------------------------------------   Bitte später in eigene Datei*/
				
				
				
				
				
			}
			
		}
	}
	public class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if(e.getActionCommand().equals("Pause")){
				pause=false;
			}
			if(e.getActionCommand().equals("Schließen")){
				System.exit(0);
			}
			if(e.getActionCommand().equals("Negativ")){
				positiv=false;
				repaint();
			}
			if(e.getActionCommand().equals("Positiv")){
				positiv=true;
				repaint();
			}		
			if(e.getActionCommand().equals("Stufe 3")){
				if(bildschirmmodus==0){dauer=50;}
			}
			if(e.getActionCommand().equals("Stufe 2")){
				if(bildschirmmodus==0){dauer=100;}
			}
			if(e.getActionCommand().equals("Stufe 1")){
				if(bildschirmmodus==0){dauer=200;}
			}		
			if(e.getSource()==b1)
			{
				bildschirmmodus=1;
				startanimation();
			}


		}
	}
	
	public void startanimation(){
		Thread Grafik = new Thread(this);
		Grafik.start();
	}
	public void run() {
		while (timer<=10 && pause==true){
			timer=timer+0.01;
			zeitstrahllaenge--;
			if(zeitstrahllaenge==0){
				bildschirmmodus=2;
			}

			try{Thread.sleep(dauer);}
			catch (InterruptedException f) {};
			repaint();
		}}

	

	
	public void paint (Graphics g){
			if(positiv==false){g.setColor(Color.black);
		g.fillRect(0, 0, 500, 500);}
			
		if(bildschirmmodus==0){
			
			if(positiv==false){g.setColor(Color.white);}
			g.setColor(Color.blue);
			g.drawString("M E M O R Y", 200, 200);
			
		}
		
		//-----------------------------------------------------------------------
		
		if(bildschirmmodus==1){
			
	this.remove(b1);
		
		zaehler1=0;
		zaehler2=0;
		xs=100;
		ys=100;
		
	while(zaehler1<4){
		while(zaehler2<4){
			if(positiv==true){g.setColor(Color.black);}else{g.setColor(Color.white);}
			g.drawRect(xs,ys,50,50);
			ys=ys+60;
			zaehler2++;
			}	
		ys=100;
		xs=xs+60;
		zaehler1++;
		zaehler2=0;}
 

//-----------------------------------------------------------------------------
		

		 
	 if(zeichner1==1){

		switch(Memoryfeld[feld1][feld2]){
		
        case 1:g.setColor(Color.gray);
		       break;
		case 2:g.setColor(Color.red);
		       break;
		case 3:g.setColor(Color.green);
		       break;
		case 4:g.setColor(Color.yellow);
		       break;
		case 5:g.setColor(Color.blue);
		       break;
		case 6:g.setColor(Color.orange);
		       break;
		case 7:g.setColor(Color.magenta);
		       break;
        case 8:g.setColor(Color.cyan);
		       break;		

		       default:System.out.print("FEHLER  ");}
		    g.fillRect(xz, yz, 30, 30);
		    if(zaehler3==1){
		    	altfeld1=feld1;
		    	altfeld2=feld2;
		    }
		   				if(zaehler3==2){
		   					
		   					if(Memoryfeld[feld1][feld2]==Memoryfeld[altfeld1][altfeld2]){
		   						System.out.println("Du hast ein Paar gefunden");
		   						paarezaehler++;}
		   					else{
		   						System.out.println("Du hast kein Paar gefunden");	}
		   					
		   					zaehler3=0;	}
		
		    }
	 
		
		 //---------------------------------------------------------------------------------------

		 if(positiv==true){g.setColor(Color.black);}else{g.setColor(Color.white);}
		g.drawRect(65, 445, 310, 40);
		g.drawString("TIME",20,465);
		g.setColor(Color.red);
		g.fillRect(70, 450,zeitstrahllaenge, 30);}
		
		if(bildschirmmodus==2){
			if(positiv==false){g.setColor(Color.white);}
			g.drawString("T I M E  O V E R", 200, 200);
			g.drawString("Du hast auf Dauer "+dauer+" so viele Paare gefunden: "+paarezaehler, 100,300);
		}

	
			}
	}

