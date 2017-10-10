package Laser;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;


	public class KMC extends Frame implements Runnable {
	
		int xs=200;
		int ys=200;
		int g1=31;
		int key;
		int g2=31;
		int dauer=15;
		int neustart;
		int xa,ya,xb,yb,xc,yc,xd,yd,xe,ye,xf,yf,xg,yg,xh,yh,xi,yi,xj,yj,xk,yk,xl,yl,xm,ym,xn,yn,xo,yo,xp,yp,xq,yq,xr,yr,xt,yt,xu,yu;
		int bildschirmmodus=0;
		int zaehlerv=1;
		int zaehler1=0; // Zaehler Level 1
		int zaehler2=0; // Zaehler Level 2
		int zaehler3=0; // Zaehler Level 3
		int zaehler4=0; // Zaehler Level 4
		int zaehler5=0; // Zaehler Level 5
		int level=1;
		int altlevel=1;
		int levelprüfer=1;
		int punkte=0;
		int zufall=(int)(5*Math.random());
		boolean weiter=true;
		
		
	private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	private TextField t1,t2;
	
	 private Image dbImage;
	 private Graphics dbg;
	 
	 Image Yodaskal,Sterneskal,Sterneskal2,Sterneskal3,Sterneskal4,Sterneskal5,Laserskal,Laserskal2,Laserskal3,Laserskal4,Laserskal5,Gameskal,gameoverskal,Siegskal,gameover2skal;
	 java.net.URL figur =getClass().getResource("raumschiff.png");
	    Image Yodas = Toolkit.getDefaultToolkit().createImage(figur);
	    java.net.URL hintergrund1 = getClass().getResource("Level1.png");
	    Image Stern = Toolkit.getDefaultToolkit().createImage(hintergrund1);
	    java.net.URL hintergrund2 = getClass().getResource("Level2.png");
	    Image Stern2 = Toolkit.getDefaultToolkit().createImage(hintergrund2);
	    java.net.URL hintergrund3 = getClass().getResource("Level3.png");
	    Image Stern3 = Toolkit.getDefaultToolkit().createImage(hintergrund3);
	    java.net.URL hintergrund4 = getClass().getResource("Level4.png");
	    Image Stern4 = Toolkit.getDefaultToolkit().createImage(hintergrund4);
	    java.net.URL hintergrund5 = getClass().getResource("Level5.png");
	    Image Stern5 = Toolkit.getDefaultToolkit().createImage(hintergrund5);
	    java.net.URL Laser = getClass().getResource("Laser.png");
	    Image Punkt = Toolkit.getDefaultToolkit().createImage(Laser);
	    java.net.URL Laser2 = getClass().getResource("Laser2.png");
	    Image Punkt2 = Toolkit.getDefaultToolkit().createImage(Laser2);
	    java.net.URL Laser3 = getClass().getResource("Laser3.png");
	    Image Punkt3 = Toolkit.getDefaultToolkit().createImage(Laser3);
	    java.net.URL Laser4 = getClass().getResource("Laser4.png");
	    Image Punkt4 = Toolkit.getDefaultToolkit().createImage(Laser4);
	    java.net.URL Laser5 = getClass().getResource("Laser5.png");
	    Image Punkt5 = Toolkit.getDefaultToolkit().createImage(Laser5);
	    java.net.URL gameover = getClass().getResource("gameover.png");
	    Image g = Toolkit.getDefaultToolkit().createImage(gameover);
	    java.net.URL Sieg = getClass().getResource("Sieg.png");
	    Image s = Toolkit.getDefaultToolkit().createImage(Sieg);
	    java.net.URL gameover2 = getClass().getResource("Vader.png");
	    Image gameoverr = Toolkit.getDefaultToolkit().createImage(gameover2);
	    
	    java.net.URL musik = getClass().getResource("Whispy.MID");
	    AudioClip sound = Applet.newAudioClip(musik);
	    java.net.URL musik2 = getClass().getResource("brinstair_red.mid");
	    AudioClip sound2 = Applet.newAudioClip(musik2);
	    java.net.URL musik3 = getClass().getResource("KingMus.MID");
	    AudioClip sound3 = Applet.newAudioClip(musik3);
	    java.net.URL musik5 = getClass().getResource("GameOver.MID");
	    AudioClip sound5 = Applet.newAudioClip(musik5);

	   

	
	private myWindowListener w1=new myWindowListener();
	private MyActionListener a1=new MyActionListener();
	
	

	
	public KMC(){
		
		super("Weiche aus");
		this.setLayout(null);
	    sound2.loop();
		
		this.t1=new TextField(10);
		this.t1.setBounds(150, 95, 100, 20);
		t1.setText("30");
		this.t2=new TextField(10);
		this.t2.setBounds(150, 225, 100, 20);
		t2.setText("15");
		
		//-------------------------------------------BUTTON------------------------------------------------------------------------
		this.b1=new Button("Level 1");
		this.b1.setBounds(200, 150, 70, 50);
		b1.addActionListener(a1);
		this.b2=new Button("Level 2");
		this.b2.setBounds(200,200,70,50);
		b2.addActionListener(a1);
		this.b3=new Button("Anleitung");
		this.b3.setBounds(350,350,100,50);
		b3.addActionListener(a1);
		this.add(b3);
		this.b4=new Button("Beenden");
		this.b4.setBounds(215,365,70,50);
		b4.addActionListener(a1);
		this.b5=new Button("Level 3");
		this.b5.setBounds(200, 250, 70, 50);
		b5.addActionListener(a1);
		this.b6=new Button("Level 4");
		this.b6.setBounds(200,300,70,50);
		b6.addActionListener(a1);
		this.b7=new Button("Einstellungen");
		this.b7.setBounds(340, 410, 120, 50);
		b7.addActionListener(a1);
		this.add(b7);
		this.b8=new Button("O K");
		this.b8.setBounds(215,390,70,50);
		b8.addActionListener(a1);
		this.b9=new Button("START");
		this.b9.setBounds(40,360,100,100);
		b9.addActionListener(a1);
		this.add(b9);
		this.b10=new Button("Master-Level");
		this.b10.setBounds(190,400,90,50);
		b10.addActionListener(a1);
		
		//-------------------------------------------BUTTON------------------------------------------------------------------------
			
		this.setLocation(50,50);
		this.setSize(500,506);
		this.setVisible(true);
		this.addWindowListener(w1);	
		this.addMouseListener(new Mouseklick());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KMC versuch = new KMC();
	}
	public class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
				if(e.getSource()==b9){
					bildschirmmodus=90;
					remove(b3);
					remove(b7);
					add(b1);
					add(b2);
					add(b5);
					add(b6);
					add(b10);
					remove(b9);
					repaint();
				}
			
			
				if(e.getSource()==b1){
				bildschirmmodus=1;
				altlevel=level;
				levelprüfer=level;
				startanimation();}
				
				if(e.getSource()==b2){
					bildschirmmodus=1;
					level=2;
					altlevel=level;
					levelprüfer=level;
					startanimation();}
				
				if(e.getSource()==b5){
					bildschirmmodus=1;
					level=3;
					altlevel=level;
					levelprüfer=level;
					startanimation();}
				
				if(e.getSource()==b6){
					bildschirmmodus=1;
					level=4;
					altlevel=level;
					levelprüfer=level;
					startanimation();}
				
				if(e.getSource()==b10){
					bildschirmmodus=1;
					level=5;
					altlevel=level;
					levelprüfer=level;
					startanimation();}
				
				if(e.getSource()==b3){
					bildschirmmodus=3;
					add(b4);
					remove(b3);
					remove(b7);
					remove(b9);
					repaint();}
				
				if(e.getSource()==b4){
					bildschirmmodus=0;
					remove(b4);
					add(b3);
					add(b7);
					add(b9);
					repaint();}
				
				if(e.getSource()==b7){
					bildschirmmodus=4;
					add(b8);
					add(t1);
					add(t2);
					remove(b3);
					remove(b7);
					remove(b9);
					repaint();}
				
				if(e.getSource()==b8){
					bildschirmmodus=0;
					remove(b8);
					g1=Integer.parseInt(t1.getText());
					g2=Integer.parseInt(t1.getText());
					if(g1<10 || g1>100){
						g1=30;
						g2=30;
					}
					remove(t1);
					dauer=Integer.parseInt(t2.getText());
					if(dauer<5 || dauer>40){
						dauer=20;
					}
					remove(t2);
					add(b3);
					add(b7);
					add(b9);
					repaint();}
				
				
			
		}
	}
	
	public class Mouseklick extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			
			if(bildschirmmodus==1){
				xs=(e.getX()-(g1/2));
				ys=(e.getY()-(g2/2));
				punkte=punkte-20;	
			}
	
	
	
	        	
	        	if(bildschirmmodus==2 && (e.getX()>350 && e.getX()<450) && e.getY()>430 && e.getY()<480){
	        		
	        		xs=(int)(500*Math.random());
					ys=(int)(500*Math.random());
					punkte=0;
	        		weiter=true;
	        	bildschirmmodus=1;
				level=altlevel;
				zaehlerv=1;
				levelprüfer=altlevel;
				
	        	zaehler1=0;
	        	zaehler2=0;
	        	zaehler3=0;
	        	zaehler4=0;
	        	zaehler5=0;
	        	
	        	neustart++;
	        
	        	startanimation();
	        	}
		}}

	
		
	public void startanimation(){
		Thread Grafik = new Thread(this);
		Grafik.start();
	}
	public void run(){
		
		sound2.stop();
		sound5.stop();
		if(zufall!=2){sound3.loop();}
		else{sound.loop();}

		
		Yodaskal = Yodas.getScaledInstance(g1,g2,Image.SCALE_DEFAULT);
		Sterneskal = Stern.getScaledInstance(500,500,Image.SCALE_DEFAULT);
		Sterneskal2 = Stern2.getScaledInstance(500,500,Image.SCALE_DEFAULT);
		Sterneskal3 = Stern3.getScaledInstance(500,500,Image.SCALE_DEFAULT);
		Sterneskal4 = Stern4.getScaledInstance(500,500,Image.SCALE_DEFAULT);
		Sterneskal5 = Stern5.getScaledInstance(500,500,Image.SCALE_DEFAULT);
		Laserskal = Punkt.getScaledInstance(10,10,Image.SCALE_DEFAULT);
		Laserskal2 = Punkt2.getScaledInstance(10,10,Image.SCALE_DEFAULT);
		Laserskal3 = Punkt3.getScaledInstance(10,10,Image.SCALE_DEFAULT);
		Laserskal4 = Punkt4.getScaledInstance(10,10,Image.SCALE_DEFAULT);
		Laserskal5 = Punkt5.getScaledInstance(10,10,Image.SCALE_DEFAULT);
		gameoverskal = g.getScaledInstance(500,500,Image.SCALE_DEFAULT);
		Siegskal = s.getScaledInstance(500,500,Image.SCALE_DEFAULT);
		gameover2skal = gameoverr.getScaledInstance(500,500,Image.SCALE_DEFAULT);
		
		while(weiter){
			try{
				
				//----------------------------------------------------------------------------------  Level 1 - Anfang - Einstellungen
				if(level==1){
					
				if(zaehler1==0){
				ya++;
				yb++;
				yc++;}
				if(zaehler1==1){
				xd++;
				xe++;
				xf++;}
				if(zaehler1==2){
				xg++;
				yg++;}
				if(zaehler1==3 || zaehler1==4){
				xh--;
				xi--;}
				
				
				if(yc==520 && zaehler1==0){zaehler1=1;punkte=punkte+25;}
				if(xf==520 && zaehler1==1){zaehler1=2;punkte=punkte+25;}
				if(xg==520 && zaehler1==2){zaehler1=3;punkte=punkte+50;}
				if(xi==-100 && zaehler1==3){zaehler1=4;punkte=punkte+100;}
				if(xi==-500){level=2;punkte=punkte+100;zaehlerv=1;}
				
				
			if(zaehler1==0){
				if((xa>xs && xa<xs+g1 ) && (ya>ys && ya<ys+g1)){
					bildschirmmodus=2;}
				if((xb>xs && xb<xs+g1 ) && (yb>ys && yb<ys+g1)){
					bildschirmmodus=2;}
				if((xc>xs && xc<xs+g1 ) && (yc>ys && yc<ys+g1)){
					bildschirmmodus=2;}}
			if(zaehler1==1){
				if((xd>xs && xd<xs+g1 ) && (yd>ys && yd<ys+g1)){
					bildschirmmodus=2;}
				if((xe>xs && xe<xs+g1 ) && (ye>ys && ye<ys+g1)){
					bildschirmmodus=2;}
				if((xf>xs && xf<xs+g1 ) && (yf>ys && yf<ys+g1)){
					bildschirmmodus=2;}}
			if(zaehler1==2){
				if((xg>xs && xg<xs+g1 ) || (yg>ys && yg<ys+g1)){
					bildschirmmodus=2;}}
			if(zaehler1==3){
				if((xh>xs && xh<xs+g1) || (yh>ys && yh<ys+g1)){
					bildschirmmodus=2;}
				if((xi>xs && xi<xs+g1 ) || (yi>ys && yi<ys+g1)){
					bildschirmmodus=2;}}
				
			
				}
				//----------------------------------------------------------------------------------  Level 1 - Ende - Einstellungen
				
				
				
				//----------------------------------------------------------------------------------  Level 2 - Anfang - Einstellungen
				if(level==2){
					
					if(zaehler2==0){
						xa++;
						ya++;
						xb--;
						yb--;}
					if(zaehler2==1){
						xc++;
						yc++;
						xd--;
						yd--;
						ye++;}
					if(zaehler2==2){
						xf++;
						yf++;
						xg--;
						yg--;
						yh++;
						xi++;}
					if(zaehler2==3){
						xj--;
						yj--;
						xk--;
						yk--;
						xl--;
						yl--;
						xm--;
						ym--;
					}
					if(zaehler2==4){
						xm--;
						ym--;
					}

					
					
					if(yb==-20 && zaehler2==0){zaehler2=1;punkte=punkte+100;}
					if(ye==520 && zaehler2==1){zaehler2=2;punkte=punkte+150;}
					if(xi==520 && zaehler2==2){zaehler2=3;punkte=punkte+200;}
					if(xm==-100 && zaehler2==3){zaehler2=4;punkte=punkte+200;}
					if(xm==-500 && zaehler2==4){level=3;punkte=punkte+200;zaehlerv=1;}
					
					
					
					if(zaehler2==0){
						if((xa>xs && xa<xs+g1 ) || (ya>ys && ya<ys+g1)){
							bildschirmmodus=2;}
						if((xb>xs && xb<xs+g1 ) || (yb>ys && yb<ys+g1)){
							bildschirmmodus=2;}}
					if(zaehler2==1){
						if((xc>xs && xc<xs+g1 ) || (yc>ys && yc<ys+g1)){
							bildschirmmodus=2;}
						if((xd>xs && xd<xs+g1 ) || (yd>ys && yd<ys+g1)){
							bildschirmmodus=2;}
						if((xe>xs && xe<xs+g1 ) || (ye>ys && ye<ys+g1)){
							bildschirmmodus=2;}}
					if(zaehler2==2){
						if((xf>xs && xf<xs+g1 ) || (yf>ys && yf<ys+g1)){
							bildschirmmodus=2;}
						if((xg>xs && xg<xs+g1 ) || (yg>ys && yg<ys+g1)){
							bildschirmmodus=2;}
						if((xh>xs && xh<xs+g1 ) || (yh>ys && yh<ys+g1)){
							bildschirmmodus=2;}
						if((xi>xs && xi<xs+g1 ) || (yi>ys && yi<ys+g1)){
							bildschirmmodus=2;}}
					if(zaehler2==3){
						if((xj>xs && xj<xs+g1 ) || (yj>ys && yj<ys+g1)){
							bildschirmmodus=2;}
						if((xk>xs && xk<xs+g1 ) || (yk>ys && yk<ys+g1)){
							bildschirmmodus=2;}
						if((xl>xs && xl<xs+g1 ) || (yl>ys && yl<ys+g1)){
							bildschirmmodus=2;}
						if((xm>xs && xm<xs+g1 ) || (ym>ys && ym<ys+g1)){
							bildschirmmodus=2;}}
					}
				//----------------------------------------------------------------------------------  Level 2 - Ende - Einstellungen
				
				
				
				//----------------------------------------------------------------------------------  Level 3 - Anfang - Einstellungen
				if(level==3){
				
					if(zaehler3==0){
						xa++;
						ya++;
						xb--;
						yb++;
						xc++;
						yc++;
						xd--;
						yd++;
						xe++;
						ye++;
						xf--;
						yf++;
						xg--;
						yg--;
					}
					if(zaehler3==1){
						xh++;
						yh++;
						xi--;
						yi--;
						xj++;
						xj++;
						yj++;
						xk--;
						xk--;
						yk--;
					}
					if(zaehler3==2){
						xh++;
						yh++;
					}
					
					if(xg==-20 && zaehler3==0){zaehler3=1;punkte=punkte+350;}
					if(xh==600 && zaehler3==1){zaehler3=2;punkte=punkte+200;}
					if(xh==1000 && zaehler3==2){level=4;punkte=punkte+300;zaehlerv=1;}
					
					if(zaehler3==0){
						if((xa>xs && xa<xs+g1 ) || (ya>ys && ya<ys+g1)){
							bildschirmmodus=2;}
						if((xb>xs && xb<xs+g1 ) || (yb>ys && yb<ys+g1)){
							bildschirmmodus=2;}
						if((xc>xs && xc<xs+g1 ) || (yc>ys && yc<ys+g1)){
							bildschirmmodus=2;}
						if((xd>xs && xd<xs+g1 ) || (yd>ys && yd<ys+g1)){
							bildschirmmodus=2;}
						if((xe>xs && xe<xs+g1 ) || (ye>ys && ye<ys+g1)){
							bildschirmmodus=2;}
						if((xf>xs && xf<xs+g1 ) || (yf>ys && yf<ys+g1)){
							bildschirmmodus=2;}
						if((xg>xs && xg<xs+g1 ) || (yg>ys && yg<ys+g1)){
							bildschirmmodus=2;}
						if((xh>xs && xh<xs+g1 ) || (yh>ys && yh<ys+g1)){
							bildschirmmodus=2;}}
					
					if(zaehler3==1){
						if((xi>xs && xi<xs+g1 ) || (yi>ys && yi<ys+g1)){
							bildschirmmodus=2;}
						if((xj>xs && xj<xs+g1 ) || (yj>ys && yj<ys+g1)){
							bildschirmmodus=2;}
						if((xk>xs && xk<xs+g1 ) || (yk>ys && yk<ys+g1)){
							bildschirmmodus=2;}
						if((xl>xs && xl<xs+g1 ) || (yl>ys && yl<ys+g1)){
							bildschirmmodus=2;}}
					
					
				}
				//----------------------------------------------------------------------------------  Level 3 - Ende - Einstellungen
				
				
				
				
				//----------------------------------------------------------------------------------  Level 4 - Anfang - Einstellungen
	
			
				if(level==4){
					if(zaehler4==0){
						xa++;
						ya++;
						xb--;
						yb--;
						xc++;
						xc++;
						yc++;
						xd--;
						xd--;
						yd--;
					}
					if(zaehler4==1){
						xe++;
						ye++;
						xf--;
						yf--;
						xg++;
						xg++;
						yg++;
						xh--;
						xh--;
						yh--;
						yi++;
					}
					if(zaehler4==2){
						xj++;
						yj++;
						xk--;
						yk--;
						xl++;
						xl++;
						yl++;
						xm--;
						xm--;
						ym--;
						yn++;
						xo++;
					}
					if(zaehler4==3){
						xm--;
						ym--;
					}
					
					
					if(yd==-20 && zaehler4==0){zaehler4=1;punkte=punkte+200;}
					if(yh==-20 && zaehler4==1){zaehler4=2;punkte=punkte+250;}
					if(ym==-100 && zaehler4==2){zaehler4=3;punkte=punkte+300;}
					if(ym==-500 && zaehler4==3){level=5;punkte=punkte+400;zaehlerv=1;}
					
					if(zaehler4==0){
						if((xa>xs && xa<xs+g1 ) || (ya>ys && ya<ys+g1)){
							bildschirmmodus=2;}
						if((xb>xs && xb<xs+g1 ) || (yb>ys && yb<ys+g1)){
							bildschirmmodus=2;}
						if((xc>xs && xc<xs+g1 ) || (yc>ys && yc<ys+g1)){
							bildschirmmodus=2;}
						if((xd>xs && xd<xs+g1 ) || (yd>ys && yd<ys+g1)){
							bildschirmmodus=2;}}
					
					if(zaehler4==1){
						if((xe>xs && xe<xs+g1 ) || (ye>ys && ye<ys+g1)){
							bildschirmmodus=2;}
						if((xf>xs && xf<xs+g1 ) || (yf>ys && yf<ys+g1)){
							bildschirmmodus=2;}
						if((xg>xs && xg<xs+g1 ) || (yg>ys && yg<ys+g1)){
							bildschirmmodus=2;}
						if((xh>xs && xh<xs+g1 ) || (yh>ys && yh<ys+g1)){
							bildschirmmodus=2;}
						if((xi>xs && xi<xs+g1 ) || (yi>ys && yi<ys+g1)){
							bildschirmmodus=2;}}
					
					if(zaehler4==2){
						if((xj>xs && xj<xs+g1 ) || (yj>ys && yj<ys+g1)){
							bildschirmmodus=2;}
						if((xk>xs && xk<xs+g1 ) || (yk>ys && yk<ys+g1)){
							bildschirmmodus=2;}
						if((xl>xs && xl<xs+g1 ) || (yl>ys && yl<ys+g1)){
							bildschirmmodus=2;}
						if((xm>xs && xm<xs+g1 ) || (ym>ys && ym<ys+g1)){
							bildschirmmodus=2;}
						if((xn>xs && xn<xs+g1 ) || (yn>ys && yn<ys+g1)){
							bildschirmmodus=2;}
						if((xo>xs && xo<xs+g1 ) || (yo>ys && yo<ys+g1)){
							bildschirmmodus=2;}}
				}


				//----------------------------------------------------------------------------------  Level 4 - Ende - Einstellungen
				
				
				//----------------------------------------------------------------------------------  Level 5 - Anfang - Einstellungen
				if(level==5){
					
					if(zaehler5==0){
				ya++;
				yb++;
				yc++;
				xd++;
				xe++;
				xf++;
				yg--;
				yh--;
				yi--;
				xj--;
				xk--;
				xl--;}
					
				if(zaehler5==1){
				xm++;
				ym++;
				yn++;
				xo--;
				yo++;	
				xp--;
				xq--;
				yq--;
				yr--;
				xt++;
				yt--;			
				xu++;}
				
				
				if(zaehler5==2){
					xu++;
				}
				 
		        if(xl==-40 && zaehler5==0) {zaehler5=1;punkte=punkte+300;}
		        if(xu==540 && zaehler5==1) {zaehler5=2;punkte=punkte+400;}
				if(xu==900 && zaehler5==2) {bildschirmmodus=10;punkte=punkte+500;zaehlerv=1;}
				
				
				
				if(zaehler5==0){
					if((xa>xs && xa<xs+g1 ) && (ya>ys && ya<ys+g1)){
						bildschirmmodus=2;}
					if((xb>xs && xb<xs+g1 ) && (yb>ys && yb<ys+g1)){
						bildschirmmodus=2;}
					if((xc>xs && xc<xs+g1 ) && (yc>ys && yc<ys+g1)){
						bildschirmmodus=2;}
					if((xd>xs && xd<xs+g1 ) && (yd>ys && yd<ys+g1)){
						bildschirmmodus=2;}
					if((xe>xs && xe<xs+g1 ) && (ye>ys && ye<ys+g1)){
						bildschirmmodus=2;}
					if((xf>xs && xf<xs+g1 ) && (yf>ys && yf<ys+g1)){
						bildschirmmodus=2;}
					if((xg>xs && xg<xs+g1 ) && (yg>ys && yg<ys+g1)){
						bildschirmmodus=2;}
					if((xh>xs && xh<xs+g1 ) && (yh>ys && yh<ys+g1)){
						bildschirmmodus=2;}
					if((xi>xs && xi<xs+g1 ) && (yi>ys && yi<ys+g1)){
						bildschirmmodus=2;}
					if((xj>xs && xj<xs+g1 ) && (yj>ys && yj<ys+g1)){
						bildschirmmodus=2;}
					if((xk>xs && xk<xs+g1 ) && (yk>ys && yk<ys+g1)){
						bildschirmmodus=2;}
					if((xl>xs && xl<xs+g1 ) && (yl>ys && yl<ys+g1)){
						bildschirmmodus=2;}}
				
				
				if(zaehler5==1){
					if((xm>xs && xm<xs+g1 ) || (ym>ys && ym<ys+g1)){
						bildschirmmodus=2;}
					if((xn>xs && xn<xs+g1 ) || (yn>ys && yn<ys+g1)){
						bildschirmmodus=2;}
					if((xo>xs && xo<xs+g1 ) || (yo>ys && yo<ys+g1)){
						bildschirmmodus=2;}
					if((xp>xs && xp<xs+g1 ) || (yp>ys && yp<ys+g1)){
						bildschirmmodus=2;}
					if((xq>xs && xq<xs+g1 ) || (yq>ys && yq<ys+g1)){
						bildschirmmodus=2;}
					if((xr>xs && xr<xs+g1 ) || (yr>ys && yr<ys+g1)){
						bildschirmmodus=2;}
					if((xt>xs && xt<xs+g1 ) || (yt>ys && yt<ys+g1)){
						bildschirmmodus=2;}
					if((xu>xs && xu<xs+g1 ) || (yu>ys && yu<ys+g1)){
						bildschirmmodus=2;}}
				
				}
				//----------------------------------------------------------------------------------  Level 5 - Ende - Einstellungen
				Thread.sleep(dauer);
				
			}
			catch (InterruptedException f){};
			repaint();
		}
	}
	
	
	
	
	public void paint (Graphics g){
		if(bildschirmmodus==0){
			g.setColor(Color.blue);
			g.fillRect(0,0,500,500);
			g.setColor(Color.black);
			g.fillRect(0, 20, 500, 30);
			g.fillRect(0, 470, 500, 30);
			g.fillRect(0, 0, 30, 500);
			g.fillRect(470, 0, 30, 500);
			g.setColor(Color.white);
			Font arial2 = new Font("Arial",Font.PLAIN,12);
			g.setFont(arial2);
			g.drawString("Manchmal wirst du sterben, ohne",150,160);
			g.drawString("es zu verstehen. Spiele es",150,180);
			g.drawString("noch einmal, und du wirst",150,200);
			g.drawString("den Grund dafür erkennen !",150,220);
			g.drawString("Spiel lieber zuerst Level 1 !!!", 150, 280);
			g.drawString("Oder lies die Anleitung...", 150, 320);
			Font arial = new Font("Arial",Font.BOLD,20);
			g.setFont(arial);
			g.drawString("King Mus' Überlebensgame", 120, 100);
		}
		if(bildschirmmodus==1){
		remove(b1);
		remove(b2);
		remove(b3);
		remove(b6);
		remove(b5);
		remove(b7);
		remove(b10);
		if(neustart==0){
		levelprüfer=level;}
		else{levelprüfer=altlevel;}
		if(zaehlerv==1){
		switch (levelprüfer) {
		case 1:  xa=100;ya=0;
		 xb=250;yb=0;
		 xc=400;yc=0;
		 xd=0;yd=100;
		 xe=0;ye=250;
		 xf=0;yf=400;
		 xg=0;yg=0;
		 xh=500;yh=350;
		 xi=500;yi=150;
		levelprüfer=10;
		 zaehlerv=0;
			
		break;
		case 2:  xa=0;ya=0;
		 xb=500;yb=500;
		 xc=0;yc=0;
		 xd=500;yd=500;
		 xe=250;ye=0;
		 xf=0;yf=0;
		 xg=500;yg=500;
		 xh=250;yh=0;
		 xi=0;yi=250;
		 xj=500;yj=500;
		 xk=630;yk=630;
		 xl=760;yl=760;
		 xm=890;ym=890;
		levelprüfer=10;
		 zaehlerv=0;
			
		break;
		case 3:  xa=0;ya=0;
		 xb=700;yb=-200;
		 xc=-400;yc=-400;
		 xd=1100;yd=-600;
		 xe=-600;ye=-600;
		 xf=-600;yf=1100;
		 xg=1200;yg=1100;
		 xh=0;yh=0;
		 xi=500;yi=500;
		 xj=0;yj=0;
		 xk=500;yk=500;
		 levelprüfer=10;
		 zaehlerv=0;
			break;
		case 4: xa=0;ya=0;
		 xb=500;yb=500;
		 xc=0;yc=0;
		 xd=500;yd=500;
		
		 xe=0;ye=0;
		 xf=500;yf=500;
		 xg=0;yg=0;
		 xh=500;yh=500;
		 xi=250;yi=0;
		
		 xj=0;yj=0;
		 xk=500;yk=500;
		 xl=0;yl=0;
		 xm=500;ym=500;
		 xn=250;yn=0;
		 xo=0;yo=250;
		levelprüfer=10;
		 zaehlerv=0;
		
		break;
		case 5: 
		 xa=100;ya=0;
		 xb=250;yb=0;
		 xc=400;yc=0;
		 xd=-30;yd=100;
		 xe=-30;ye=250;
		 xf=-30;yf=400;
		 xg=100;yg=560;
		 xh=250;yh=560;
		 xi=400;yi=560;
		 xj=590;yj=100;
		 xk=590;yk=250;
		 xl=590;yl=400;
		 xm=0;ym=0;
		 xn=250;yn=-50;
		 xo=600;yo=-100;
		 xp=650;yp=250;
		 xq=700;yq=700;
		 xr=250;yr=750;
		 xt=-300;yt=800;
		 xu=-350;yu=250;
		levelprüfer=10;
		 zaehlerv=0;
			
		break;}
		}
		switch (zufall) {
		case 1:  	g.drawImage(Sterneskal, 0, 0, this);
		break;
		case 2:  	g.drawImage(Sterneskal2, 0, 0, this);
		break;
		case 3:  	g.drawImage(Sterneskal3, 0, 0, this);
		break;
		case 4: 	g.drawImage(Sterneskal4, 0, 0, this);
		break;
		case 0: 	g.drawImage(Sterneskal5, 0, 0, this);
		break;}

		g.setColor(Color.black);

		
		g.setColor(Color.black);
		Font arial = new Font("Arial",Font.BOLD,20);
		g.setFont(arial);
		g.drawString("Level: "+level,50,490);
		g.drawString("Punkte: "+punkte,150,490);
		
		g.drawImage(Yodaskal, xs,ys,this);

		
		//----------------------------------------------------------------------------------  Level 1 - Anfang
		if(level==1){

		g.setColor(Color.red);
		
		if(zaehler1==0){
			g.drawImage(Laserskal, xa,ya,this);
			g.drawImage(Laserskal, xb,yb,this);
			g.drawImage(Laserskal, xc,yc,this);}
		
		if(zaehler1==1){
			g.drawImage(Laserskal, xd,yd,this);
			g.drawImage(Laserskal, xe,ye,this);
			g.drawImage(Laserskal, xf,yf,this);}
		
		if(zaehler1==2){
			
		g.drawLine(xg-1000, yg+5, xg+1000, yg+5);
		g.drawLine(xg+5, yg-1000, xg+5, yg+1000);
		g.drawImage(Laserskal, xg,yg,this);}
		if(zaehler1==3){
			
			g.drawLine(xh-200, yh+5, xh+200, yh+5);
			g.drawLine(xh+5, yh-200, xh+5, yh+200);
			g.drawImage(Laserskal, xh,yh,this);
			
			g.drawLine(xi-200, yi+5, xi+200, yi+5);
			g.drawLine(xi+5, yi-200, xi+5, yi+200);
			g.drawImage(Laserskal, xi,yi,this);
		}
		}
		//----------------------------------------------------------------------------------  Level 1 - Ende
		
		
		
		//----------------------------------------------------------------------------------  Level 2 - Anfang
		if(level==2){

		g.setColor(Color.green);
			
		if(zaehler2==0){
			
			g.drawLine(xa-1000, ya+5, xa+1000, ya+5);
			g.drawLine(xa+5, ya-1000, xa+5, ya+1000);
			g.drawImage(Laserskal2, xa,ya,this);
			
			g.drawLine(xb-1000, yb+5, xb+1000, yb+5);
			g.drawLine(xb+5, yb-1000, xb+5, yb+1000);
		g.drawImage(Laserskal2, xb,yb,this);}
		if(zaehler2==1){
			
			g.drawLine(xc-1000, yc+5, xc+1000, yc+5);
			g.drawLine(xc+5, yc-1000, xc+5, yc+1000);
			g.drawImage(Laserskal2, xc,yc,this);
			
			g.drawLine(xd-1000, yd+5, xd+1000, yd+5);
			g.drawLine(xd+5, yd-1000, xd+5, yd+1000);
		g.drawImage(Laserskal2, xd,yd,this);
			
			g.drawLine(xe-1000, ye+5, xe+1000, ye+5);
			g.drawLine(xe+5, ye-1000, xe+5, ye+1000);
		g.drawImage(Laserskal2, xe,ye,this);}
		if(zaehler2==2){
			
			g.drawLine(xf-1000, yf+5, xf+1000, yf+5);
			g.drawLine(xf+5, yf-1000, xf+5, yf+1000);
			g.drawImage(Laserskal2, xf,yf,this);
			
			g.drawLine(xg-1000, yg+5, xg+1000, yg+5);
			g.drawLine(xg+5, yg-1000, xg+5, yg+1000);
		g.drawImage(Laserskal2, xg,yg,this);
			
			g.drawLine(xh-1000, yh+5, xh+1000, yh+5);
			g.drawLine(xh+5, yh-1000, xh+5, yh+1000);
			g.drawImage(Laserskal2, xh,yh,this);
			
			g.drawLine(xi-1000, yi+5, xi+1000, yi+5);
			g.drawLine(xi+5, yi-1000, xi+5, yi+1000);
		g.drawImage(Laserskal2, xi,yi,this);}
		if(zaehler2==3){
			
			g.drawLine(xj-1000, yj+5, xj+1000, yj+5);
			g.drawLine(xj+5, yj-1000, xj+5, yj+1000);
			g.drawImage(Laserskal2, xj,yj,this);
			
			g.drawLine(xk-1000, yk+5, xk+1000, yk+5);
			g.drawLine(xk+5, yk-1000, xk+5, yk+1000);
			g.drawImage(Laserskal2, xk,yk,this);
			
			g.drawLine(xl-1000, yl+5, xl+1000, yl+5);
			g.drawLine(xl+5, yl-1000, xl+5, yl+1000);
			g.drawImage(Laserskal2, xl,yl,this);
			
			g.drawLine(xm-1000, ym+5, xm+1000, ym+5);
			g.drawLine(xm+5, ym-1000, xm+5, ym+1000);
		g.drawImage(Laserskal2, xm,ym,this);}
		}
		//----------------------------------------------------------------------------------  Level 2 - Ende
		
		//----------------------------------------------------------------------------------  Level 3 - Anfang
		if(level==3){

			g.setColor(Color.orange);
			
			if(zaehler3==0){
				
				g.drawLine(xa-1000, ya+5, xa+1000, ya+5);
				g.drawLine(xa+5, ya-1000, xa+5, ya+1000);
				g.drawImage(Laserskal3, xa,ya,this);
				
				g.drawLine(xb-1000, yb+5, xb+1000, yb+5);
				g.drawLine(xb+5, yb-1000, xb+5, yb+1000);
			g.drawImage(Laserskal3, xb,yb,this);
				
			g.drawLine(xc-1000, yc+5, xc+1000, yc+5);
			g.drawLine(xc+5, yc-1000, xc+5, yc+1000);
			g.drawImage(Laserskal3, xc,yc,this);
			
			g.drawLine(xd-1000, yd+5, xd+1000, yd+5);
			g.drawLine(xd+5, yd-1000, xd+5, yd+1000);
		g.drawImage(Laserskal3, xd,yd,this);
			
			g.drawLine(xe-1000, ye+5, xe+1000, ye+5);
			g.drawLine(xe+5, ye-1000, xe+5, ye+1000);
		g.drawImage(Laserskal3, xe,ye,this);
				
		g.drawLine(xf-1000, yf+5, xf+1000, yf+5);
		g.drawLine(xf+5, yf-1000, xf+5, yf+1000);
		g.drawImage(Laserskal3, xf,yf,this);
		
		g.drawLine(xg-1000, yg+5, xg+1000, yg+5);
		g.drawLine(xg+5, yg-1000, xg+5, yg+1000);
	g.drawImage(Laserskal3, xg,yg,this);
			}
			
			if(zaehler3==1){
				
				g.drawLine(xh-1000, yh+5, xh+1000, yh+5);
				g.drawLine(xh+5, yh-1000, xh+5, yh+1000);
				g.drawImage(Laserskal3, xh,yh,this);
				
				g.drawLine(xi-1000, yi+5, xi+1000, yi+5);
				g.drawLine(xi+5, yi-1000, xi+5, yi+1000);
			g.drawImage(Laserskal3, xi,yi,this);
				
			g.drawLine(xj-1000, yj+5, xj+1000, yj+5);
			g.drawLine(xj+5, yj-1000, xj+5, yj+1000);
			g.drawImage(Laserskal3, xj,yj,this);
			
			g.drawLine(xk-1000, yk+5, xk+1000, yk+5);
			g.drawLine(xk+5, yk-1000, xk+5, yk+1000);
			g.drawImage(Laserskal3, xk,yk,this);
			}
			
		}
		//----------------------------------------------------------------------------------  Level 3 - Ende
		
		//----------------------------------------------------------------------------------  Level 4 - Anfang
			if(level==4){

				g.setColor(Color.cyan);
				if(zaehler4==0){
					
					g.drawLine(xa-1000, ya+5, xa+1000, ya+5);
					g.drawLine(xa+5, ya-1000, xa+5, ya+1000);
					g.drawImage(Laserskal4, xa,ya,this);
					
					g.drawLine(xb-1000, yb+5, xb+1000, yb+5);
					g.drawLine(xb+5, yb-1000, xb+5, yb+1000);
				g.drawImage(Laserskal4, xb,yb,this);
					
				g.drawLine(xc-1000, yc+5, xc+1000, yc+5);
				g.drawLine(xc+5, yc-1000, xc+5, yc+1000);
				g.drawImage(Laserskal4, xc,yc,this);
				
				g.drawLine(xd-1000, yd+5, xd+1000, yd+5);
				g.drawLine(xd+5, yd-1000, xd+5, yd+1000);
			g.drawImage(Laserskal4, xd,yd,this);
				}
				if(zaehler4==1){
					
					g.drawLine(xe-1000, ye+5, xe+1000, ye+5);
					g.drawLine(xe+5, ye-1000, xe+5, ye+1000);
				g.drawImage(Laserskal4, xe,ye,this);
						
				g.drawLine(xf-1000, yf+5, xf+1000, yf+5);
				g.drawLine(xf+5, yf-1000, xf+5, yf+1000);
				g.drawImage(Laserskal4, xf,yf,this);
				
				g.drawLine(xg-1000, yg+5, xg+1000, yg+5);
				g.drawLine(xg+5, yg-1000, xg+5, yg+1000);
			g.drawImage(Laserskal4, xg,yg,this);
					
			g.drawLine(xh-1000, yh+5, xh+1000, yh+5);
			g.drawLine(xh+5, yh-1000, xh+5, yh+1000);
			g.drawImage(Laserskal4, xh,yh,this);
			
			g.drawLine(xi-1000, yi+5, xi+1000, yi+5);
			g.drawLine(xi+5, yi-1000, xi+5, yi+1000);
		g.drawImage(Laserskal4, xi,yi,this);
				}
				if(zaehler4==2){
					
					g.drawLine(xj-1000, yj+5, xj+1000, yj+5);
					g.drawLine(xj+5, yj-1000, xj+5, yj+1000);
					g.drawImage(Laserskal4, xj,yj,this);
					
					g.drawLine(xk-1000, yk+5, xk+1000, yk+5);
					g.drawLine(xk+5, yk-1000, xk+5, yk+1000);
					g.drawImage(Laserskal4, xk,yk,this);
					
					g.drawLine(xl-1000, yl+5, xl+1000, yl+5);
					g.drawLine(xl+5, yl-1000, xl+5, yl+1000);
					g.drawImage(Laserskal4, xl,yl,this);
					
					g.drawLine(xm-1000, ym+5, xm+1000, ym+5);
					g.drawLine(xm+5, ym-1000, xm+5, ym+1000);
					g.drawImage(Laserskal4, xm,ym,this);
					
					g.drawLine(xn-1000, yn+5, xn+1000, yn+5);
					g.drawLine(xn+5, yn-1000, xn+5, yn+1000);
					g.drawImage(Laserskal4, xn,yn,this);
					
					g.drawLine(xo-1000, yo+5, xo+1000, yo+5);
					g.drawLine(xo+5, yo-1000, xo+5, yo+1000);
					g.drawImage(Laserskal4, xo,yo,this);
				}
			}

		//----------------------------------------------------------------------------------  Level 4 - Ende
			
			//----------------------------------------------------------------------------------  Level 5 - Anfang
			
			if(level==5){
				g.setColor(Color.white);
				
				if(zaehler5==0){
				g.drawImage(Laserskal5, xa,ya,this);
				g.drawImage(Laserskal5, xb,yb,this);
				g.drawImage(Laserskal5, xc,yc,this);
				g.drawImage(Laserskal5, xd,yd,this);
				g.drawImage(Laserskal5, xe,ye,this);
				g.drawImage(Laserskal5, xf,yf,this);
				g.drawImage(Laserskal5, xg,yg,this);
				g.drawImage(Laserskal5, xh,yh,this);
				g.drawImage(Laserskal5, xi,yi,this);
				g.drawImage(Laserskal5, xj,yj,this);
				g.drawImage(Laserskal5, xk,yk,this);
				g.drawImage(Laserskal5, xl,yl,this);}
				
				if(zaehler5==1){
					g.drawLine(xm-1000, ym+5, xm+1000, ym+5);
					g.drawLine(xm+5, ym-1000, xm+5, ym+1000);
					g.drawImage(Laserskal5, xm,ym,this);
					
					g.drawLine(xn-1000, yn+5, xn+1000, yn+5);
					g.drawLine(xn+5, yn-1000, xn+5, yn+1000);
					g.drawImage(Laserskal5, xn,yn,this);
					
					g.drawLine(xo-1000, yo+5, xo+1000, yo+5);
					g.drawLine(xo+5, yo-1000, xo+5, yo+1000);
					g.drawImage(Laserskal5, xo,yo,this);
				
				g.drawLine(xp-1000, yp+5, xp+1000, yp+5);
				g.drawLine(xp+5, yp-1000, xp+5, yp+1000);
			g.drawImage(Laserskal5, xp,yp,this);
				
				g.drawLine(xq-1000, yq+5, xq+1000, yq+5);
				g.drawLine(xq+5, yq-1000, xq+5, yq+1000);
			g.drawImage(Laserskal5, xq,yq,this);
					
			g.drawLine(xr-1000, yr+5, xr+1000, yr+5);
			g.drawLine(xr+5, yr-1000, xr+5, yr+1000);
			g.drawImage(Laserskal5, xr,yr,this);
			
			g.drawLine(xt-1000, yt+5, xt+1000, yt+5);
			g.drawLine(xt+5, yt-1000, xt+5, yt+1000);
		g.drawImage(Laserskal5, xt,yt,this);
				
		g.drawLine(xu-1000, yu+5, xu+1000, yu+5);
		g.drawLine(xu+5, yu-1000, xu+5, yu+1000);
		g.drawImage(Laserskal5, xu,yu,this);}
			}
		
			//----------------------------------------------------------------------------------  Level 5 - Ende
	}
		if(bildschirmmodus==2){
			weiter=false;
			sound.stop();
			sound3.stop();
			sound5.play();
			
			if(zufall!=3){
			g.drawImage(gameoverskal, 0,0,this);
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
				g.drawImage(gameover2skal,0,0,this);
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
		
		if(bildschirmmodus==3){
			g.fillRect(0,0,500,500);
			g.setColor(Color.white);
			Font arial2 = new Font("Arial",Font.PLAIN,12);
			g.setFont(arial2);
			g.drawString("Du bist ein Schiff, das versucht,",150,90);
			g.drawString("in einem Schlachtfeld aus Lasern" , 150, 110);
			g.drawString("und Kugeln zu überleben.",150,130);
			g.drawString("Du bewegst es, indem du" , 150, 180);
			g.drawString("mit der linken Maustaste auf",150,200);
			g.drawString("einen Ort auf der Fläche drückst." , 150, 220);
			g.drawString("Es wird dann direkt an diesen Fleck",150,240);
			g.drawString("teleportiert. Allerdings kostet es das Benzin" , 150, 260);
			g.drawString("und du verlierst 20 deiner Punkte !" , 150, 280);
			g.drawString("Lass es ja nicht soweit kommen...", 150, 330);
			Font arial = new Font("Arial",Font.BOLD,20);
			g.setFont(arial);
			g.drawString("Story:", 150, 70);
			g.drawString("Steuerung:",150, 160);
			g.drawString("Tod:", 150, 310);
			
		}
		
		if(bildschirmmodus==4){
			g.fillRect(0,0,500,500);
			g.setColor(Color.white);
			Font arial2 = new Font("Arial",Font.PLAIN,12);
			g.setFont(arial2);
			g.drawString("Je größer die Zahl, umso größer dein Schiff !", 100, 140);
			g.drawString("Je kleiner die Zahl, umso schneller die Objekte ! ", 100, 270);
			Font arial = new Font("Arial",Font.BOLD,20);
			g.setFont(arial);
			g.drawString("Größe vom Schiff:", 100, 70);
			g.drawString("Schnelligkeit der Hindernisse:",100, 200);
		}
		
		
		if(bildschirmmodus==10){
			g.setColor(Color.white);
			g.drawImage(Siegskal, 0,0,this);
			Font arial = new Font("Arial",Font.BOLD,20);
			g.setFont(arial);
			g.drawString("Du bist ein wahrer Meister!",100,100);
			Font arial2 = new Font("Arial",Font.PLAIN,12);
			g.setFont(arial2);
			g.drawString("Begonnen auf Level "+altlevel+" !", 50, 340);
			g.drawString(punkte+" Punkte erreicht !", 50, 380);
			
		}
		
		if(bildschirmmodus==90){
			g.setColor(Color.blue);
			g.fillRect(0,0,500,500);
			g.setColor(Color.black);
			g.fillRect(0, 20, 500, 30);
			g.fillRect(0, 470, 500, 30);
			g.fillRect(0, 0, 30, 500);
			g.fillRect(470, 0, 30, 500);
			g.setColor(Color.white);
			Font arial = new Font("Arial",Font.BOLD,20);
			g.setFont(arial);
			g.drawString("Bitte wähle dein Level !!!",120,100);
		}
		}
	public void update (Graphics g)
	{
	// Initialisierung des DoubleBuffers
	if (dbImage == null)
	{
	dbImage = createImage (this.getSize().width, this.getSize().height);
	dbg = dbImage.getGraphics ();
	}

	// Bildschirm im Hintergrund löschen
	dbg.setColor (getBackground ());
	dbg.fillRect (0, 0, this.getSize().width, this.getSize().height);

	// Auf gelöschten Hintergrund Vordergrund zeichnen
	dbg.setColor (getForeground());
	paint (dbg);

	// Nun fertig gezeichnetes Bild Offscreen auf dem richtigen Bildschirm anzeigen
	g.drawImage (dbImage, 0, 0, this);
	}}
	