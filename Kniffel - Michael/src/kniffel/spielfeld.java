package kniffel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class spielfeld extends JFrame implements ActionListener  {
	
	
	 Kniffel spiel = new Kniffel();
	 private ArrayList<player> spieler = new ArrayList<player>();
	 
	 JButton würfeln,wegwerfen,eintragen1,eintragen2,eintragen3,eintragen4,eintragen5,eintragen6,eintragen7,eintragen8,eintragen9,eintragen10,eintragen11,eintragen12,eintragen13,eintragen14;
	 int x=0;
	 int y=0;
	 int a=0;
	 ImageIcon i0 = new ImageIcon(getClass().getResource("background.JPG"));
	 Image img = i0.getImage();
	 
	 ImageIcon i1 = new ImageIcon(getClass().getResource("Würfel_1.png"));
	 Image würfel1 = i1.getImage();
	 ImageIcon i2 = new ImageIcon(getClass().getResource("Würfel_2.png"));
	 Image würfel2 = i2.getImage();
	 ImageIcon i3 = new ImageIcon(getClass().getResource("Würfel_3.png"));
	 Image würfel3 = i3.getImage();
	 ImageIcon i4 = new ImageIcon(getClass().getResource("Würfel_4.png"));
	 Image würfel4 = i4.getImage();
	 ImageIcon i5 = new ImageIcon(getClass().getResource("Würfel_5.png"));
	 Image würfel5 = i5.getImage();
	 ImageIcon i6 = new ImageIcon(getClass().getResource("Würfel_6.png"));
	 Image würfel6 = i6.getImage();
	 	 
	 
	 public spielfeld(){
		
		 spieler.add(new player());
		 
		 würfeln = new JButton("würfeln");
		 würfeln.setBounds(130,350,160,40);
	     würfeln.addActionListener(this);
		 add(würfeln);
		 
		 wegwerfen = new JButton("Wurf wegwerfen");
		 wegwerfen.setBounds(130,400,160,40);
		 wegwerfen.addActionListener(this);
		 add(wegwerfen);
		 
		 eintragen1 = new JButton("eintragen 1");
		 eintragen1.setBounds(600,65,100,25);
		 eintragen1.addActionListener(this);
		 add(eintragen1);
		 
		 eintragen2 = new JButton("eintragen 2");
		 eintragen2.setBounds(600,90,100,25);
		 eintragen2.addActionListener(this);
		 add(eintragen2);
		 
		 eintragen3 = new JButton("eintragen 3");
		 eintragen3.setBounds(600,115,100,25);
		 eintragen3.addActionListener(this);
		 add(eintragen3);
		 
		 eintragen4 = new JButton("eintragen 4");
		 eintragen4.setBounds(600,140,100,25);
		 eintragen4.addActionListener(this);
		 add(eintragen4);
		 
		 eintragen5 = new JButton("eintragen 5");
		 eintragen5.setBounds(600,165,100,25);
		 eintragen5.addActionListener(this);
		 add(eintragen5);
		 
		 eintragen6 = new JButton("eintragen 6");
		 eintragen6.setBounds(600,190,100,25);
		 eintragen6.addActionListener(this);
		 add(eintragen6);
		 
		 eintragen7 = new JButton("3er. paar");
		 eintragen7.setBounds(600,265,100,25);
		 eintragen7.addActionListener(this);
		 add(eintragen7);
		 
		 eintragen8 = new JButton("4er. paar");
		 eintragen8.setBounds(600,290,100,25);
		 eintragen8.addActionListener(this);
		 add(eintragen8);
		 
		 eintragen9 = new JButton("Full Hous");
		 eintragen9.setBounds(600,315,100,25);
		 eintragen9.addActionListener(this);
		 add(eintragen9);
		 
		 eintragen10 = new JButton("Kl. Straße");
		 eintragen10.setBounds(600,340,100,25);
		 eintragen10.addActionListener(this);
		 add(eintragen10);
		 
		 eintragen11 = new JButton("Gr. Straße");
		 eintragen11.setBounds(600,365,100,25);
		 eintragen11.addActionListener(this);
		 add(eintragen11);
		 
		 eintragen12 = new JButton("Kniffel");
		 eintragen12.setBounds(600,390,100,25);
		 eintragen12.addActionListener(this);
		 add(eintragen12);
		 
		 
		 repaint();
		 
	 }


	

	 public void paint(Graphics g){
		 super.paint(g);
		g.drawImage(img, 0, 0, this);

		for(int i=0;i<5;i++){
			   if(spiel.getfeld(i)==1)g.drawImage(würfel1, 30+x, 50+y,50,50, this);
			   if(spiel.getfeld(i)==2)g.drawImage(würfel2, 30+x, 50+y,50,50, this);
			   if(spiel.getfeld(i)==3)g.drawImage(würfel3, 30+x, 50+y,50,50, this);
			   if(spiel.getfeld(i)==4)g.drawImage(würfel4, 30+x, 50+y,50,50, this);
			   if(spiel.getfeld(i)==5)g.drawImage(würfel5, 30+x, 50+y,50,50, this);
			   if(spiel.getfeld(i)==6)g.drawImage(würfel6, 30+x, 50+y,50,50, this);
			   x=x+70;
			   y=y+60;
		}
		x=0;
		y=0;
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		g.drawString("Spiel" ,420, 90);
		g.drawString("Einer" ,420, 115);
		g.drawString("Zweier" ,420, 140);
		g.drawString("Dreier" ,420, 165);
		g.drawString("Vierer" ,420, 190);
		g.drawString("Fünfer" ,420, 215);
		g.drawString("Sechser" ,420, 240);
		g.drawString("Summe oben" ,420, 265);
		g.drawString("Bonus" ,420, 290);
		g.drawString("Dreierpasch" ,420, 315);
		g.drawString("Viererpasch" ,420, 340);
		g.drawString("Fullhous" ,420, 365);
		g.drawString("Kl. Straße" ,420, 390);
		g.drawString("Gr. Straße",420, 415);
		g.drawString("Full Hous",420, 440);
		g.drawString("Kniffel",420, 465);
		g.drawString("Chance" ,420, 490);
		g.drawString("Summe unten" ,420, 515);
		g.drawString("Summe" ,420, 540);
		
		
		
		g.setColor(Color.white);
		if(spiel.geteineraugen())
			g.drawString(""+spiel.get1augen(),550,115);
		if(spiel.getzweiaugen())
			g.drawString(""+spiel.get2augen(),550,140);
		if(spiel.getdreiaugen())
			g.drawString(""+spiel.get3augen(),550,165);
		if(spiel.getvieraugen())
			g.drawString(""+spiel.get4augen(),550,190);
		if(spiel.getfünfaugen())
			g.drawString(""+spiel.get5augen(),550,215);
		if(spiel.getsechsaugen())
			g.drawString(""+spiel.get6augen(),550,240);
		if(spieler.get(a).get3paar()||spiel.getdreierpaar())
			g.drawString("25" ,550, 315);
		if(spieler.get(a).get4paar()||spiel.getviererpaar())
			g.drawString("30" ,550, 340);
		if(spieler.get(a).getkniffel()||spiel.getkniffel())
			g.drawString("50" ,550, 465);
		if(spieler.get(a).getkl()||spiel.getkleinestraße())
			g.drawString("25" ,550, 390);
		if(spieler.get(a).getgr()||spiel.getgroßestraße())
			g.drawString("40" ,550, 415);
		if(spieler.get(a).getfullhous()||spiel.getfullhous())
			g.drawString("30" ,550, 440);
		
		
		 würfeln.setVisible(true);
		 wegwerfen.setVisible(true);
		
		 
		 eintragen1.setVisible(spiel.geteineraugen());
		 eintragen2.setVisible(spiel.getzweiaugen());
		 eintragen3.setVisible(spiel.getdreiaugen());
		 eintragen4.setVisible(spiel.getvieraugen());
		 eintragen5.setVisible(spiel.getfünfaugen());
		 eintragen6.setVisible(spiel.getsechsaugen());
		 
		 eintragen7.setVisible(spiel.geteineraugen());
		 eintragen8.setVisible(spiel.getzweiaugen());
		 eintragen9.setVisible(spiel.getdreiaugen());
		 eintragen10.setVisible(spiel.getvieraugen());
		 eintragen11.setVisible(spiel.getfünfaugen());
		 eintragen12.setVisible(spiel.getsechsaugen());
	 }

	  public static void main(String[] args) {
		  
		    spielfeld spielfeld = new spielfeld();
		    
			spielfeld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
			spielfeld.setLayout(null);
			spielfeld.setSize(850,580);
			spielfeld.setTitle("Kniffel");
			spielfeld.setVisible(true);
		    
		  }


	  public void paint(){
		  repaint();
	  }

	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==würfeln)
		{
			spiel.würfeln();
			repaint();
			System.out.println(a);
		}
		if (e.getSource()==wegwerfen)
		{
			spiel.wegwerfen();
			nechster();
		}
		if (e.getSource()==eintragen1)
		{
			spieler.get(a).set1(spiel.get1augen());
			nechster();
		}
		if (e.getSource()==eintragen2)
		{
			spieler.get(a).set1(spiel.get2augen());
			nechster();
		}
		if (e.getSource()==eintragen3)
		{
			spieler.get(a).set1(spiel.get3augen());
			nechster();
		}
		if (e.getSource()==eintragen4)
		{
			spieler.get(a).set1(spiel.get4augen());
			nechster();
		}
		if (e.getSource()==eintragen5)
		{
			spieler.get(a).set1(spiel.get5augen());
			nechster();
		}
		if (e.getSource()==eintragen6)
		{
			spieler.get(a).set1(spiel.get6augen());
			nechster();
		}
		
		
	}
	
	public void nechster(){
		if(!(a==spieler.size()))
		a++;
		else
		a=0;
	}



}
