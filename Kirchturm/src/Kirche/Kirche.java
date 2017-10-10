package Kirche;

import java.awt.*;

public class Kirche extends Frame{
	
	boolean a=true;
	boolean b=false;
	boolean c=false;
	boolean d=false;

	
	public void paint (Graphics g){
		
		g.drawString("Kirche:",100,100);
		g.drawRect(200,350,300,100);
		g.drawRect(400,150,100,200);
		g.drawOval(410, 160, 80, 80);
		g.drawLine(300,250, 400, 250);
		g.drawLine(300,250, 200, 350);
		g.drawLine(500,150, 450, 50);
		g.drawLine(400,150, 450, 50);
		if(a){
			g.drawLine(450,165, 450, 200);
			}
		if(b){
			g.drawLine(480,200, 450, 200);
			}
		if(c){
			g.drawLine(450,235, 450, 200);
			}
		if(d){
			g.drawLine(420,200, 450, 200);
			}
		g.drawLine(470,200, 450, 200);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Kirche k = new Kirche();
		
		k.setSize(700, 500);
		k.setTitle("Kirche im Bild");
		k.setVisible(true);
		
		while (true){
			
			k.a = true;
			k.b = false;
			k.c = false;
			k.d = false;
			k.repaint();
			Thread.sleep(500);
			
			k.a = false;
			k.b = true;
			k.c = false;
			k.d = false;
			k.repaint();
			Thread.sleep(500);
			
			k.a = false;
			k.b = false;
			k.c = true;
			k.d = false;
			k.repaint();
			Thread.sleep(500);
			
			k.a = false;
			k.b = false;
			k.c = false;
			k.d = true;
			k.repaint();
			Thread.sleep(500);
	}

}
}