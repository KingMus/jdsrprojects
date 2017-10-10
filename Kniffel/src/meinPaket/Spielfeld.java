package meinPaket;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Spielfeld extends JPanel implements Runnable{
	
	private static String pfad=System.getProperty("user.dir").replace('\\', '/'); // Pfad, hilft zum Laden der Bilder
	
	boolean weiter=true;  // L�sst den Thread laufen
	boolean gew�rfelt=false;  //Wenn gew�rfelt wurde ist der Wert "true"
	boolean istgesetzt=false;
	
	String oberfl�che="Holztisch";  // Variable die durch String den Hintergrund bestimmt
	
	int key;  // Key-Listener
	int wurfz�hler=3; // Pro Zug drei Mal W�rfeln
	int spieler=1; 	//Welcher Spieler ist am Zug
	int sieger=0;  //Wer ist der Gewinner
	int BM=0; //Welcher Bildschirm
	
	int[] x={60,120,180,240,300};
	int[] y={160,220,280,340,400};
	
	int[] w�rfel={0,0,0,0,0};
	int[] w�rfelzur�ck={0,0,0,0,0}; 
	
	/**Die beiden W�rfelfelder. "w�rfel" ist die tats�chliche Augenzahl, "w�rfelzur�ck" ist das feld f�r die zur�ckgelegten Felder.
	 * Werden per Mosue-Listener vertauscht, siehe weiter unten...
	 */

	 
	 JMenuBar men�leiste;
	 JMenu Spiel,Oberfl�che;
	 JMenuItem NeuesSpiel,Beenden,Pokergr�n,Holz,Samt;
	 // Die kompletten Men�leisten-Elemente werden generiert
	 	
	 private MyActionListener a1=new MyActionListener();
	 
	 Kombi Kombinator=new Kombi();
	 MausLauscher Mausi=new MausLauscher();
	 Bilder b=new Bilder();
	 Spieler leif=new Spieler();
	 Spieler fabian=new Spieler();
	 Spieler leer=new Spieler();
		// Die anderen Klassen werden erstellt

		public Spielfeld(){
			
	    	BorderLayout b=new BorderLayout();
	    	setLayout(b);	    	
			
			/* Die Men�leiste und ihre Komponenten werden erstellt */
			
			men�leiste= new JMenuBar();
			add(men�leiste, BorderLayout.PAGE_START); /*Men�leiste wird definiert*/
			
			Spiel=new JMenu("Spiel");
	    	Oberfl�che=new JMenu("Oberfl�chen-Design");  /*Men�zeilen werden erstellt*/
	    	
	    	men�leiste.add(Spiel);
	    	men�leiste.add(Oberfl�che); /*Men�zeilen werden der Leiste hinzugef�gt*/
	    	
	    	NeuesSpiel=new JMenuItem("Neues Spiel");  /*Men�spalten von "Spiel" werden erstellt*/
	    	NeuesSpiel.addActionListener(a1);
	    	Beenden=new JMenuItem("Beenden");
	    	Beenden.addActionListener(a1);
	    	
	    	Spiel.add(NeuesSpiel);
	    	Spiel.add(Beenden);  /*Men�spalten werden hinzugef�gt*/
	    	
	    	Pokergr�n=new JMenuItem("Pokergr�n");  /*Men�spalten von "Oberfl�che" werden erstellt*/
	    	Pokergr�n.addActionListener(a1);
	    	Holz=new JMenuItem("Holztisch");
	    	Holz.addActionListener(a1);
	    	Samt=new JMenuItem("Samt");
	    	Samt.addActionListener(a1);
	    	
	    	Oberfl�che.add(Pokergr�n);
	    	Oberfl�che.add(Holz);
	    	Oberfl�che.add(Samt);   /*Men�spalten werden hinzugef�gt*/
	    	
	    	/*-------------------------------------------------------------------------------------*/
	
			this.addMouseListener(new Mouseklick());
	    	setFocusable(true);
	    	startanimation();
	}
	

	public class Mouseklick extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			
			if(spieler==1)
				istgesetzt=Mausi.Mausklicken(e,Kombinator,leif,0);
			if(spieler==2)
				istgesetzt=Mausi.Mausklicken(e,Kombinator,fabian,30);
			// Jenachdem welcher Spieler am Zug ist, werden andere Parameter gesetzt

			if(e.getX()>180 && e.getY()>500 && e.getX()<330 && e.getY()<635 && wurfz�hler!=0 && gew�rfelt==false){
				gew�rfelt=true;
				wurfz�hler--;
			} //W�rfelvorgang wird erkannt
			
			
			/*Zur�cklegen der W�rfel*/
			
			if(e.getX()>x[0] && e.getY()>y[0] && e.getX()<x[0]+50 && e.getY()<y[0]+50){
				x[0]=60;
				w�rfelzur�ck[0]=w�rfel[0];
				w�rfel[0]=10;
			}
			
			if(e.getX()>x[1] && e.getY()>y[1] && e.getX()<x[1]+50 && e.getY()<y[1]+50){
				x[1]=120;
				w�rfelzur�ck[1]=w�rfel[1];
				w�rfel[1]=10;
			}
			
			if(e.getX()>x[2] && e.getY()>y[2] && e.getX()<x[2]+50 && e.getY()<y[2]+50){
				x[2]=180;
				w�rfelzur�ck[2]=w�rfel[2];
				w�rfel[2]=10;
			}
			
			if(e.getX()>x[3] && e.getY()>y[3] && e.getX()<x[3]+50 && e.getY()<y[3]+50){
				x[3]=240;
				w�rfelzur�ck[3]=w�rfel[3];
				w�rfel[3]=10;
			}
			
			if(e.getX()>x[4] && e.getY()>y[4] && e.getX()<x[4]+50 && e.getY()<y[4]+50){
				x[4]=300;
				w�rfelzur�ck[4]=w�rfel[4];
				w�rfel[4]=10;
			}
			
			/*-----------------------------------------------------------------------------------*/
			
			/*Wiederaufnahme ins Spiel der W�rfel*/
			
			if(e.getX()>x[0] && e.getY()>60 && e.getX()<x[0]+50 && e.getY()<110){
				w�rfel[0]=w�rfelzur�ck[0];
				w�rfelzur�ck[0]=0;
			}
			
			if(e.getX()>x[1] && e.getY()>60 && e.getX()<x[1]+50 && e.getY()<110){
				w�rfel[1]=w�rfelzur�ck[1];
				w�rfelzur�ck[1]=0;
			}
			
			if(e.getX()>x[2] && e.getY()>60 && e.getX()<x[2]+50 && e.getY()<110){
				w�rfel[2]=w�rfelzur�ck[2];
				w�rfelzur�ck[2]=0;
			}
			
			if(e.getX()>x[3] && e.getY()>60 && e.getX()<x[3]+50 && e.getY()<110){
				w�rfel[3]=w�rfelzur�ck[3];
				w�rfelzur�ck[3]=0;
			}
			
			if(e.getX()>x[4] && e.getY()>60 && e.getX()<x[4]+50 && e.getY()<110){
				w�rfel[4]=w�rfelzur�ck[4];
				w�rfelzur�ck[4]=0;
			}
			
			/*-----------------------------------------------------------------------------------*/
			
			/*Ausw�hloptionen im Hauptmen�*/
			
			if(e.getX()>700 && e.getY()>400 && e.getX()<900 && e.getY()<460 && BM==0){
					
				leif.setName(JOptionPane.showInputDialog("Wie ist dein Name, Spieler 1?"));
				fabian.setName(JOptionPane.showInputDialog("Wie ist dein Name, Spieler 2?"));
				BM=1;
					
					
			}
			
			if(e.getX()>700 && e.getY()>500 && e.getX()<900 && e.getY()<560 && BM==0){
					System.exit(0);;
			}
			
			/*-----------------------------------------------------------------------------------*/
			
			
		}
	}
	
	public class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			
			/**Es wird mittels einem ActionListener registriert ob ein Button gedr�ckt wird oder nicht.
			 * Im folgenden Abschnitt wird die Men�leiste �berpr�ft
			 */
			
			if(e.getActionCommand().equals("Neues Spiel")){
				neuesSpiel();
			}
			if(e.getActionCommand().equals("Beenden")){
				System.exit(0);
			}
			if(e.getActionCommand().equals("Pokergr�n")){
				oberfl�che="Pokergr�n";
			}
			if(e.getActionCommand().equals("Holztisch")){
				oberfl�che="Holztisch";
			}
			if(e.getActionCommand().equals("Samt")){
				oberfl�che="Roter Stoff";
			}
			
		}
		}
	
	/*Thread*/
	
	public void startanimation(){
		Thread Grafik = new Thread(this);
		Grafik.start();
	}
	
	
	
	public void run(){
		while(weiter){
			try{
				
				if(istgesetzt==true){
					istgesetzt=false;
					neuerzug();
				}
				
				if(leif.getvoll()==true && fabian.getvoll()==true){
					if(leif.getmaxP()>fabian.getmaxP())sieger=1;
					if(fabian.getmaxP()>leif.getmaxP())sieger=2;
					if(fabian.getmaxP()==leif.getmaxP())sieger=2;
				}
	
	
				
				Thread.sleep(100);}
			catch (InterruptedException f){};
				repaint();}
			}
	
	/*-----------------------------------------------------------------------------------*/
			
			public void paint (Graphics g){
				super.paint(g);
				
				Font consolas = new Font("Consolas",Font.BOLD,50);
				Font consolas2 = new Font("Consolas",Font.BOLD,30);
				Font consolas3 = new Font("Consolas",Font.BOLD,80);
				Font batang = new Font("Batang",Font.BOLD,11);
				
				/** Mittels der String "oberfl�che" wird der Hintergrund ausgesucht, der im
				 * Spiel zu sehen ist. Die String wird im ActionListener gesetzt. Ihr Standardwert ist "Roter Stoff"
				 */
				
				
				if(BM==1){
				
				switch(oberfl�che){
				case "Pokergr�n":
					g.drawImage(b.Pokertisch,0,23,1027,650, this);
					break;
				case "Holztisch":
					g.drawImage(b.Holztisch,0,23,1027,650, this);
					break;
				case "Roter Stoff":
					g.drawImage(b.Samtstoff,0,23,1027,650, this);
					break;
				}
				
				g.drawRect(50,50,310,70); //Das Rechteck das den W�rfelhalter simuliert wird gemalt
				
				g.drawImage(b.Block,500,25,500,620, this);
				g.drawImage(b.Tabelle,570,60,390,560, this);		/*Bilder werden gezeichnet*/		
				g.drawImage(b.Button,180,500,150,135, this);
				
				g.setColor(Color.white);
				g.drawString(leif.getName(), 813, 78);
				g.drawString(fabian.getName(), 890, 78);
				
				g.setFont(consolas);
				g.setColor(Color.white);
				g.drawString(wurfz�hler+"",240,565);     /*Die Zahl auf dem Button wird gemalt, abh�ngig*/
				g.setColor(Color.black);                 /*von den restlichen W�rfen                    */
				g.setFont(batang);
				
				g.setColor(Color.green);
				if(spieler==1){
					g.drawRect(806, 64, 73, 17);
				}
				if(spieler==2){
					g.drawRect(883, 64, 72, 17);
				}
				//Die obrigen IF-Schleifen pr�fen, welcher Spieler
				//am Zug ist und setzten das Markierungsrechteck
				
				g.setColor(Color.black);
				
				if(gew�rfelt==true){
					gew�rfelt=false;  //Der W�rfelvorgang wird ausgef�hrt
					w�rfel=w�rfeln(w�rfel,spieler);
				}
					
				for(int i=0;i<5;i++)w�rfelmalen(g,w�rfel[i],w�rfelzur�ck[i],x[i],y[i]);									
					
					if(spieler==1)
						Kombinator.wasgeht(g,spieler,leif); 
					if(spieler==2)
						Kombinator.wasgeht(g,spieler,fabian); 
					//Die ausw�hlbaren M�glichkeiten werden makiert
					
					leif.spielerlistemalen(g,0,Kombinator);
					fabian.spielerlistemalen(g,90,Kombinator);
					
					if(sieger!=0){
						g.setColor(Color.black);
						g.fillRect(50, 220, 420, 200);
						g.setColor(Color.white);
						g.setFont(consolas2);
					
					
					if(sieger==1){
						g.drawString("Sieger ist "+leif.getName(),75,265);
						g.drawString("mit "+leif.getmaxP()+" Punkten",140,355);
					}
					if(sieger==2){
						g.drawString("Sieger ist "+fabian.getName(),75,265);
						g.drawString("mit "+fabian.getmaxP()+" Punkten",140,355);
					}
					if(sieger==3){
						g.drawString("Unentschieden",150,320);
					}
					
					}
					
					g.setColor(Color.black);
				}
				
				if(BM==0){
					
					g.drawImage(b.Samtstoff,0,0,1027,650, this);
					g.drawImage(b.Button_starten,700,400,200,60, this);
					g.drawImage(b.Button_beenden,700,500,200,60, this);
					
					g.setFont(consolas3);
					g.setColor(Color.white);
					g.drawString("Kniffel", 150, 250);
					
					
				}
					
					
			}
			
			private int[] randomize() {
					
				int[]feld=new int[5];
				for(int i=0;i<5;i++)feld[i]=(int)(Math.random()*300)+150;
				
				return feld;
	}



			public int[] w�rfeln(int[] feld, int spieler){
				
				for(int i=0;i<5;i++){
					if(feld[i]!=10){
					feld[i]=(int)((Math.random()*6)+1);}
				} //F�r alle f�nf W�rfel wird eine Zahl von 1-6 gesucht
				
				if(spieler==1)
				Kombinator.pr�fen(w�rfel,w�rfelzur�ck,leif,wurfz�hler);
				if(spieler==2)
				Kombinator.pr�fen(w�rfel,w�rfelzur�ck,fabian,wurfz�hler);
				//Es wird nach m�glichen Kombis gesucht
				
				return feld;
			}
			
			public void w�rfelmalen(Graphics g,int i,int j,int x,int y){
				
				/**
				 * In der folgenden Methode werden die W�rfel in Abh�ngigkeit der ihnen
				 * zugeordneten Zahl gemalt. Dies gilt auch f�r das zur�ckgelegte W�rfel-Feld
				 */
				
				switch(i){
				
				case 1:g.drawImage(b.W�rfel1,x,y,50,50, this);
					break;
				case 2:g.drawImage(b.W�rfel2,x,y,50,50, this);
					break;
				case 3:g.drawImage(b.W�rfel3,x,y,50,50, this);
					break;
				case 4:g.drawImage(b.W�rfel4,x,y,50,50, this);
					break;
				case 5:g.drawImage(b.W�rfel5,x,y,50,50, this);
					break;
				case 6:g.drawImage(b.W�rfel6,x,y,50,50, this);
					break;
				default:
					break;
						
				}
				
				switch(j){
				
				case 1:g.drawImage(b.W�rfel1,x,60,50,50, this);
					break;
				case 2:g.drawImage(b.W�rfel2,x,60,50,50, this);
					break;
				case 3:g.drawImage(b.W�rfel3,x,60,50,50, this);
					break;
				case 4:g.drawImage(b.W�rfel4,x,60,50,50, this);
					break;
				case 5:g.drawImage(b.W�rfel5,x,60,50,50, this);
					break;
				case 6:g.drawImage(b.W�rfel6,x,60,50,50, this);
					break;
				default:
					break;
						
				}
				
			}
			
			public void neuerzug(){
				
				if(spieler==2)spieler=1;
				else if(spieler==1)spieler=2;
				
				for(int i=0;i<5;i++){
					w�rfel[i]=0;
					w�rfelzur�ck[i]=0;
				}
	
				wurfz�hler=3;
				Kombinator.pr�fen(w�rfel,w�rfelzur�ck,leer,wurfz�hler);
				
				
			}
			
			public void neuesSpiel(){
				
				/**
				 * Ein neues Spiel wird erstellt
				 */
				
				for(int i=0;i<5;i++){
					w�rfel[i]=0;
					w�rfelzur�ck[i]=0;
				}

				wurfz�hler=3;
				spieler=1;
				sieger=0;
				
				leif.resetfelder();
				fabian.resetfelder();
				
				Kombinator.pr�fen(w�rfel,w�rfelzur�ck,leer,wurfz�hler);

			}

}
