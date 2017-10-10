package Ey;

import java.awt.*;
import java.awt.event.*;

public class Planet extends Frame implements Runnable{


  private Color weltFarbe;
  private Kobold willi;
  private Kobold siggi;
  private Kobold fabian;
  private Button williZeigen = new Button();
  private Button siggiZeigen = new Button();
  private Button fabianZeigen = new Button();
  private Button verstecken = new Button();
  private Button exit = new Button();
  private FlowLayout myFlowLayout = new FlowLayout();
  boolean fertig=true;



  
  public Planet() {

    weltFarbe=Color.BLACK;

   
    willi = new Kobold();
    willi.setzeAussehen(250, 100, 50, Color.LIGHT_GRAY,   Color.yellow);
    
    fabian = new Kobold();
    fabian.setzeAussehen(250, 250, 30, Color.magenta,   Color.red);

    siggi = new Kobold();
    siggi.setzeAussehen(200, 200, 60, Color.green, Color.red);

    this.setLayout(myFlowLayout);
    setBackground(weltFarbe);

    williZeigen.setLabel("Willi zeigen");
    williZeigen.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        williZeigen_mouseClicked(e);
      }
    });
    this.add(williZeigen, null);
    
    
    fabianZeigen.setLabel("Fabian zeigen");
    fabianZeigen.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        fabianZeigen_mouseClicked(e);
      }
    });
    this.add(fabianZeigen, null);
    
    

    
    siggiZeigen.setLabel("Siggi zeigen");
    siggiZeigen.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        siggiZeigen_mouseClicked(e);
      }
    });
    this.add(siggiZeigen, null);

 
    verstecken.setLabel("verstecken");
    verstecken.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        verstecken_mouseClicked(e);
      }
    });
    this.add(verstecken, null);

    exit.setLabel("EXIT");

    exit.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        exit_mouseClicked(e);
      }
    });
    this.add(exit, null);

    this.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        canvas_mousePressed(e);
      }
    });

    
    
    Thread Grafik = new Thread(this);
	Grafik.start();	
    }


  public void paint(Graphics g)  {
	  siggi.malen(g);
	  willi.malen(g);
    fabian.malen(g);
    }


  public void williZeigen_mouseClicked(MouseEvent e) {
    willi.zeigen();
    repaint();
    }
  
  public void fabianZeigen_mouseClicked(MouseEvent e) {
	    fabian.zeigen();
	    repaint();
	    }

  public void siggiZeigen_mouseClicked(MouseEvent e) {
    siggi.zeigen();
    repaint();
    }

  public void verstecken_mouseClicked(MouseEvent e) {
    willi.verstecken();
    siggi.verstecken();
    fabian.verstecken();
    repaint();
    }

  public void exit_mouseClicked(MouseEvent e) {
    System.exit(0);
    }

  public void canvas_mousePressed(MouseEvent e) {
    int x=e.getX();
    int y=e.getY();
   
 
    Graphics g=this.getGraphics();
    g.setColor(Color.black);
    g.fillOval(x,y, 4,4);
    
    
    willi.gehen(x , y);
    siggi.gehen(x , y);
    fabian.gehen(x , y);
  }
  
  public void run()   {
      while (fertig==true) {
    	  
  repaint();
         try {
            Thread.sleep(100);
         } catch (InterruptedException e) {
  
         }
      }
   }
  
}
