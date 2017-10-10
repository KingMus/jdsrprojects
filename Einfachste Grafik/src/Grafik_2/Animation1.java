package Grafik_2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation1 extends Frame implements Runnable{

   private Button bt;
   private MyWindowListener wl=new MyWindowListener();
   private MyActionListener al=new MyActionListener();
   int cnt = 0;
   
   
   public Animation1()   {
      super("Animation1");
      this.setBackground(Color.lightGray);
      this.setLayout(null);
	  this.setLocation(320,150);
	  this.setSize(500,300);
	  this.bt=new Button("Start");
	  this.bt.setBounds(220, 100, 70, 50);
	  this.add(bt);
	  this.setVisible(true);
	    
	  this.addWindowListener(wl);
	  this.bt.addActionListener(al);
   }
   
   public static void main(String[] args)   {
	    Animation1 wnd = new Animation1();
	         
	     }
   
   public class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if (e.getSource()==bt)
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
   
   
 	
	public void run()   {
	      while (true) {
	         try {
	            Thread.sleep(1000);
	         } catch (InterruptedException e) {
	            //nichts
	         }
	         repaint();
	      }
	   }
   
 
   public void paint(Graphics g)
   {
      g.drawString("Counter = "+cnt,10,50);
      cnt++;
      }
   }   
