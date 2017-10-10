package Grafiken;

import java.awt.*;

public class Ampel extends Frame{
	
	boolean rot = true;
	boolean gelb = false;
	boolean gruen = false;
	
	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.fillRect(100, 50, 100, 300);
		
		if(rot) g.setColor(Color.RED);
		else g.setColor(Color.DARK_GRAY);
		g.fillOval(100, 50, 100, 100);
		
		if(gelb) g.setColor(Color.YELLOW);
		else g.setColor(Color.DARK_GRAY);
		g.fillOval(100, 150, 100, 100);
		
		if(gruen) g.setColor(Color.GREEN);
		else g.setColor(Color.DARK_GRAY);
		g.fillOval(100, 250, 100, 100);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Ampel b = new Ampel();
		
		b.setSize(300, 400);
		b.setTitle("Ampel-Aufgabe");
		b.setVisible(true);
		
		while (true){
			
		b.rot = true;
		b.gelb = false;
		b.gruen = false;
		b.repaint();
		Thread.sleep(3000);
		
		b.rot = true;
		b.gelb = true;
		b.gruen = false;
		b.repaint();
		Thread.sleep(3000);
		
		b.rot = false;
		b.gelb = false;
		b.gruen = true;
		b.repaint();
		Thread.sleep(3000);
		
		b.rot = false;
		b.gelb = true;
		b.gruen = false;
		b.repaint();
		Thread.sleep(3000);
		
		b.rot = true;
		b.gelb = false;
		b.gruen = false;
		b.repaint();
		Thread.sleep(3000);
		
		
		}
	}

}
