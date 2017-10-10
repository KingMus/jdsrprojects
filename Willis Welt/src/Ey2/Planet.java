package Ey2;
import java.awt.*;
import java.awt.event.*;



public class Planet extends Frame {



  private Color weltFarbe;
  private Kobold willi;
  private Kobold siggi;
  private Button williZeigen = new Button();
  private Button siggiZeigen = new Button();
  private Button verstecken = new Button();
  private Button exit = new Button();
  private FlowLayout myFlowLayout = new FlowLayout();



 
  public Planet() {

    weltFarbe=Color.yellow;

    
    willi = new Kobold();
    willi.setzeAussehen(450, 400, 50, Color.red,   Color.blue, 20,2);

    siggi = new Kobold();
    siggi.setzeAussehen(500, 300, 60, Color.green, Color.red, 10,3);

    this.setLayout(myFlowLayout);
    setBackground(weltFarbe);

   
    williZeigen.setLabel("Willi zeigen");
   
    williZeigen.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        williZeigen_mouseClicked(e);
      }
    });
    this.add(williZeigen, null);

   
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

    }//Ende des Konstruktors

 
  public void paint(Graphics g)  {
    willi.malen(g);
    siggi.malen(g);
    }

  
  public void williZeigen_mouseClicked(MouseEvent e) {
    willi.zeigen();
    repaint();
    }

 
  public void siggiZeigen_mouseClicked(MouseEvent e) {
    siggi.zeigen();
    repaint();
    }

 
  public void verstecken_mouseClicked(MouseEvent e) {
    willi.verstecken();
    siggi.verstecken();
    repaint();
    }

  public void exit_mouseClicked(MouseEvent e) {
    System.exit(0);
    }

  
  public void canvas_mousePressed(MouseEvent e) {
    int x=e.getX();
    int y=e.getY();
    
    
    willi.gehen(x,y);
    siggi.gehen(x,y);
    
    repaint();
  }
}