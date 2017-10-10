package KoboldeundWelt;
import java.awt.*;
import java.awt.event.*;


public class Planet extends Frame{
	
	private Color weltFarbe;
	private Kobold willi;
	private Kobold siggi;
	private Kobold manni;
	private Button williZeigen = new Button();
	private Button siggiZeigen = new Button();
	private Button manniZeigen = new Button();
	private Button siggi_verstecken = new Button();
	private Button willi_verstecken = new Button();
	private Button manni_verstecken = new Button();
	private Button exit = new Button();
	private FlowLayout myFlowLayout = new FlowLayout();
	
	public Planet(){
		
		weltFarbe=Color.black;
		
		willi = new Kobold();
		willi.setzeAussehen("Willi",250,100,50, Color.magenta, Color.cyan, 20);
		
		siggi = new Kobold();
		siggi.setzeAussehen("Siggi",200,200,60, Color.green, Color.red, 10);
		
		manni = new Kobold();
		manni.setzeAussehen("Manni",300,150,30, Color.blue, Color.gray, 15);
		
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
		
		
		
		
		
		manniZeigen.setLabel("Manni zeigen");
		manniZeigen.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				manniZeigen_mouseClicked(e);
			}
		});
		this.add(manniZeigen, null);
		
		
		
		
		siggi_verstecken.setLabel("Siggi verstecken");
		siggi_verstecken.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				siggi_verstecken_mouseClicked(e);
			}
		});
		this.add(siggi_verstecken, null);
		
		
		
		
		
		willi_verstecken.setLabel("Willi verstecken");
		willi_verstecken.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				willi_verstecken_mouseClicked(e);
			}
		});
		this.add(willi_verstecken, null);
		
		
		
		
		
		manni_verstecken.setLabel("Manni verstecken");
		manni_verstecken.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				manni_verstecken_mouseClicked(e);
			}
		});
		this.add(manni_verstecken, null);
		
		
		
		
		
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
		}
	
	
	
	
	
	
	
	public void paint(Graphics g) {
		siggi.malen(g);
		willi.malen(g);
		manni.malen(g);
		
	}
	
	public void williZeigen_mouseClicked(MouseEvent e) {
		willi.zeigen();
		repaint();
	}
	public void siggiZeigen_mouseClicked(MouseEvent e) {
		siggi.zeigen();
		repaint();
	}
	public void manniZeigen_mouseClicked(MouseEvent e) {
		manni.zeigen();
		repaint();
	}
	
	public void willi_verstecken_mouseClicked(MouseEvent e) {
		willi.verstecken();
		repaint();
	}
	
	public void siggi_verstecken_mouseClicked(MouseEvent e) {
		siggi.verstecken();
		repaint();
	}
	
	public void manni_verstecken_mouseClicked(MouseEvent e) {
		manni.verstecken();
		repaint();
	}
	
	public void exit_mouseClicked(MouseEvent e) {
		System.exit(0);;
	}
	
	public void canvas_mousePressed(MouseEvent e) {
		int x=e.getX();
		int y=e.getY();
		
		willi.gehen(x,y);
		siggi.gehen(x,y);
		manni.gehen(x,y);
		repaint();
	}
	
}
