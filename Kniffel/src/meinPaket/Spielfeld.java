package meinPaket;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Spielfeld extends JPanel implements Runnable{
	
	private static String pfad=System.getProperty("user.dir").replace('\\', '/'); // Pfad, hilft zum Laden der Bilder
	
	boolean weiter=true;  // Lässt den Thread laufen
	boolean gewürfelt=false;  //Wenn gewürfelt wurde ist der Wert "true"
	boolean istgesetzt=false;
	
	String oberfläche="Holztisch";  // Variable die durch String den Hintergrund bestimmt
	
	int key;  // Key-Listener
	int wurfzähler=3; // Pro Zug drei Mal Würfeln
	int spieler=1; 	//Welcher Spieler ist am Zug
	int sieger=0;  //Wer ist der Gewinner
	int BM=0; //Welcher Bildschirm
	
	int[] x={60,120,180,240,300};
	int[] y={160,220,280,340,400};
	
	int[] würfel={0,0,0,0,0};
	int[] würfelzurück={0,0,0,0,0}; 
	
	/**Die beiden Würfelfelder. "würfel" ist die tatsächliche Augenzahl, "würfelzurück" ist das feld für die zurückgelegten Felder.
	 * Werden per Mosue-Listener vertauscht, siehe weiter unten...
	 */

	 
	 JMenuBar menüleiste;
	 JMenu Spiel,Oberfläche;
	 JMenuItem NeuesSpiel,Beenden,Pokergrün,Holz,Samt;
	 // Die kompletten Menüleisten-Elemente werden generiert
	 	
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
			
			/* Die Menüleiste und ihre Komponenten werden erstellt */
			
			menüleiste= new JMenuBar();
			add(menüleiste, BorderLayout.PAGE_START); /*Menüleiste wird definiert*/
			
			Spiel=new JMenu("Spiel");
	    	Oberfläche=new JMenu("Oberflächen-Design");  /*Menüzeilen werden erstellt*/
	    	
	    	menüleiste.add(Spiel);
	    	menüleiste.add(Oberfläche); /*Menüzeilen werden der Leiste hinzugefügt*/
	    	
	    	NeuesSpiel=new JMenuItem("Neues Spiel");  /*Menüspalten von "Spiel" werden erstellt*/
	    	NeuesSpiel.addActionListener(a1);
	    	Beenden=new JMenuItem("Beenden");
	    	Beenden.addActionListener(a1);
	    	
	    	Spiel.add(NeuesSpiel);
	    	Spiel.add(Beenden);  /*Menüspalten werden hinzugefügt*/
	    	
	    	Pokergrün=new JMenuItem("Pokergrün");  /*Menüspalten von "Oberfläche" werden erstellt*/
	    	Pokergrün.addActionListener(a1);
	    	Holz=new JMenuItem("Holztisch");
	    	Holz.addActionListener(a1);
	    	Samt=new JMenuItem("Samt");
	    	Samt.addActionListener(a1);
	    	
	    	Oberfläche.add(Pokergrün);
	    	Oberfläche.add(Holz);
	    	Oberfläche.add(Samt);   /*Menüspalten werden hinzugefügt*/
	    	
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

			if(e.getX()>180 && e.getY()>500 && e.getX()<330 && e.getY()<635 && wurfzähler!=0 && gewürfelt==false){
				gewürfelt=true;
				wurfzähler--;
			} //Würfelvorgang wird erkannt
			
			
			/*Zurücklegen der Würfel*/
			
			if(e.getX()>x[0] && e.getY()>y[0] && e.getX()<x[0]+50 && e.getY()<y[0]+50){
				x[0]=60;
				würfelzurück[0]=würfel[0];
				würfel[0]=10;
			}
			
			if(e.getX()>x[1] && e.getY()>y[1] && e.getX()<x[1]+50 && e.getY()<y[1]+50){
				x[1]=120;
				würfelzurück[1]=würfel[1];
				würfel[1]=10;
			}
			
			if(e.getX()>x[2] && e.getY()>y[2] && e.getX()<x[2]+50 && e.getY()<y[2]+50){
				x[2]=180;
				würfelzurück[2]=würfel[2];
				würfel[2]=10;
			}
			
			if(e.getX()>x[3] && e.getY()>y[3] && e.getX()<x[3]+50 && e.getY()<y[3]+50){
				x[3]=240;
				würfelzurück[3]=würfel[3];
				würfel[3]=10;
			}
			
			if(e.getX()>x[4] && e.getY()>y[4] && e.getX()<x[4]+50 && e.getY()<y[4]+50){
				x[4]=300;
				würfelzurück[4]=würfel[4];
				würfel[4]=10;
			}
			
			/*-----------------------------------------------------------------------------------*/
			
			/*Wiederaufnahme ins Spiel der Würfel*/
			
			if(e.getX()>x[0] && e.getY()>60 && e.getX()<x[0]+50 && e.getY()<110){
				würfel[0]=würfelzurück[0];
				würfelzurück[0]=0;
			}
			
			if(e.getX()>x[1] && e.getY()>60 && e.getX()<x[1]+50 && e.getY()<110){
				würfel[1]=würfelzurück[1];
				würfelzurück[1]=0;
			}
			
			if(e.getX()>x[2] && e.getY()>60 && e.getX()<x[2]+50 && e.getY()<110){
				würfel[2]=würfelzurück[2];
				würfelzurück[2]=0;
			}
			
			if(e.getX()>x[3] && e.getY()>60 && e.getX()<x[3]+50 && e.getY()<110){
				würfel[3]=würfelzurück[3];
				würfelzurück[3]=0;
			}
			
			if(e.getX()>x[4] && e.getY()>60 && e.getX()<x[4]+50 && e.getY()<110){
				würfel[4]=würfelzurück[4];
				würfelzurück[4]=0;
			}
			
			/*-----------------------------------------------------------------------------------*/
			
			/*Auswähloptionen im Hauptmenü*/
			
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
			
			/**Es wird mittels einem ActionListener registriert ob ein Button gedrückt wird oder nicht.
			 * Im folgenden Abschnitt wird die Menüleiste überprüft
			 */
			
			if(e.getActionCommand().equals("Neues Spiel")){
				neuesSpiel();
			}
			if(e.getActionCommand().equals("Beenden")){
				System.exit(0);
			}
			if(e.getActionCommand().equals("Pokergrün")){
				oberfläche="Pokergrün";
			}
			if(e.getActionCommand().equals("Holztisch")){
				oberfläche="Holztisch";
			}
			if(e.getActionCommand().equals("Samt")){
				oberfläche="Roter Stoff";
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
				
				/** Mittels der String "oberfläche" wird der Hintergrund ausgesucht, der im
				 * Spiel zu sehen ist. Die String wird im ActionListener gesetzt. Ihr Standardwert ist "Roter Stoff"
				 */
				
				
				if(BM==1){
				
				switch(oberfläche){
				case "Pokergrün":
					g.drawImage(b.Pokertisch,0,23,1027,650, this);
					break;
				case "Holztisch":
					g.drawImage(b.Holztisch,0,23,1027,650, this);
					break;
				case "Roter Stoff":
					g.drawImage(b.Samtstoff,0,23,1027,650, this);
					break;
				}
				
				g.drawRect(50,50,310,70); //Das Rechteck das den Würfelhalter simuliert wird gemalt
				
				g.drawImage(b.Block,500,25,500,620, this);
				g.drawImage(b.Tabelle,570,60,390,560, this);		/*Bilder werden gezeichnet*/		
				g.drawImage(b.Button,180,500,150,135, this);
				
				g.setColor(Color.white);
				g.drawString(leif.getName(), 813, 78);
				g.drawString(fabian.getName(), 890, 78);
				
				g.setFont(consolas);
				g.setColor(Color.white);
				g.drawString(wurfzähler+"",240,565);     /*Die Zahl auf dem Button wird gemalt, abhängig*/
				g.setColor(Color.black);                 /*von den restlichen Würfen                    */
				g.setFont(batang);
				
				g.setColor(Color.green);
				if(spieler==1){
					g.drawRect(806, 64, 73, 17);
				}
				if(spieler==2){
					g.drawRect(883, 64, 72, 17);
				}
				//Die obrigen IF-Schleifen prüfen, welcher Spieler
				//am Zug ist und setzten das Markierungsrechteck
				
				g.setColor(Color.black);
				
				if(gewürfelt==true){
					gewürfelt=false;  //Der Würfelvorgang wird ausgeführt
					würfel=würfeln(würfel,spieler);
				}
					
				for(int i=0;i<5;i++)würfelmalen(g,würfel[i],würfelzurück[i],x[i],y[i]);									
					
					if(spieler==1)
						Kombinator.wasgeht(g,spieler,leif); 
					if(spieler==2)
						Kombinator.wasgeht(g,spieler,fabian); 
					//Die auswählbaren Möglichkeiten werden makiert
					
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



			public int[] würfeln(int[] feld, int spieler){
				
				for(int i=0;i<5;i++){
					if(feld[i]!=10){
					feld[i]=(int)((Math.random()*6)+1);}
				} //Für alle fünf Würfel wird eine Zahl von 1-6 gesucht
				
				if(spieler==1)
				Kombinator.prüfen(würfel,würfelzurück,leif,wurfzähler);
				if(spieler==2)
				Kombinator.prüfen(würfel,würfelzurück,fabian,wurfzähler);
				//Es wird nach möglichen Kombis gesucht
				
				return feld;
			}
			
			public void würfelmalen(Graphics g,int i,int j,int x,int y){
				
				/**
				 * In der folgenden Methode werden die Würfel in Abhängigkeit der ihnen
				 * zugeordneten Zahl gemalt. Dies gilt auch für das zurückgelegte Würfel-Feld
				 */
				
				switch(i){
				
				case 1:g.drawImage(b.Würfel1,x,y,50,50, this);
					break;
				case 2:g.drawImage(b.Würfel2,x,y,50,50, this);
					break;
				case 3:g.drawImage(b.Würfel3,x,y,50,50, this);
					break;
				case 4:g.drawImage(b.Würfel4,x,y,50,50, this);
					break;
				case 5:g.drawImage(b.Würfel5,x,y,50,50, this);
					break;
				case 6:g.drawImage(b.Würfel6,x,y,50,50, this);
					break;
				default:
					break;
						
				}
				
				switch(j){
				
				case 1:g.drawImage(b.Würfel1,x,60,50,50, this);
					break;
				case 2:g.drawImage(b.Würfel2,x,60,50,50, this);
					break;
				case 3:g.drawImage(b.Würfel3,x,60,50,50, this);
					break;
				case 4:g.drawImage(b.Würfel4,x,60,50,50, this);
					break;
				case 5:g.drawImage(b.Würfel5,x,60,50,50, this);
					break;
				case 6:g.drawImage(b.Würfel6,x,60,50,50, this);
					break;
				default:
					break;
						
				}
				
			}
			
			public void neuerzug(){
				
				if(spieler==2)spieler=1;
				else if(spieler==1)spieler=2;
				
				for(int i=0;i<5;i++){
					würfel[i]=0;
					würfelzurück[i]=0;
				}
	
				wurfzähler=3;
				Kombinator.prüfen(würfel,würfelzurück,leer,wurfzähler);
				
				
			}
			
			public void neuesSpiel(){
				
				/**
				 * Ein neues Spiel wird erstellt
				 */
				
				for(int i=0;i<5;i++){
					würfel[i]=0;
					würfelzurück[i]=0;
				}

				wurfzähler=3;
				spieler=1;
				sieger=0;
				
				leif.resetfelder();
				fabian.resetfelder();
				
				Kombinator.prüfen(würfel,würfelzurück,leer,wurfzähler);

			}

}
