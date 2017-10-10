package Rund;
import java.awt.Button;
import java.awt.Color;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
 class Kreisbewegtsich extends Frame implements Runnable
{
	 
	private Button bt1;
	private MyWindowListener wl=new MyWindowListener();
	private MyActionListener al=new MyActionListener();
	
	int dx=1;
	int xs=50;
	int dy =1;
	int ys=50;
	boolean weiter=true;
	
	public Kreisbewegtsich()
	{
		super("Kreis soll sich bewegen");
		this.setLayout(null);
			
		this.bt1=new Button("Go!");
		this.bt1.setBounds(220, 200, 70, 50);
		this.add(bt1);
		this.setLocation(320,150);
		this.setSize(500,500);
		this.setVisible(true);
		
		this.addWindowListener(wl);
		this.bt1.addActionListener(al);
		this.addMouseListener(new Mouseklick());
		
	}

	public static void main(String[] args)
	{
		Kreisbewegtsich versuch = new Kreisbewegtsich();
			
	}
	
	public class Mouseklick extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			if ((xs-e.getX())*(xs-e.getX())+(ys-e.getY())*(ys-e.getY())<=2500) {
				System.out.println("Kreis verschwunden");
				weiter=false;
				repaint();
			}
		}
	}

	public class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if (e.getSource()==bt1)
			{
				startanimation();
			}
		}
	}
	
		
	public void startanimation()
	{
		Thread Grafik = new Thread(this);
		Grafik.start();
	}

	public void run(){
		while(weiter){
			if(xs==450)dy=2;
			if(dy==2)xs=xs-dx;
			
			if(xs==0)dy=1;
			if(dy==1)xs=xs+dx;

			try {
		         Thread.sleep(10);
		      } 
			catch (InterruptedException f) {};
		    repaint();
		}}	
	
		
	public void paint(Graphics g) 
	{
	  if(weiter){ g.setColor(Color.blue);
	   g.fillOval(xs, ys, 50, 50); }
	   else{ g.setColor(Color.white);   
	   g.fillOval(xs, ys, 50, 50);} 	      
    }

}

