package Grafik;


	import java.awt.*;

	public class GrafikA1 extends Frame 
	{ 	
		public void paint(Graphics g)
		{
			g.drawString("Hallo", 100, 100);
		}
		
		public GrafikA1(){
			this.setSize(200,200);
			this.setVisible(true);
		
		}
		public static void main(String[] args) 
		{ 
			GrafikA1 b = new GrafikA1();
	
		} 
	}

