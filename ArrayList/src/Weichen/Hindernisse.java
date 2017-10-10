package Weichen;

import java.awt.Graphics;

public class Hindernisse {
	
	int xh,yh;
	
	public Hindernisse(int x, int y){
		
		xh=x;
		yh=y;
		
	}
	
	public void hindernissmalen(Graphics g){
	
		g.fillRect(xh, yh, 20, 20);
		xh++;
		
	}

	public int getx() {
		// TODO Auto-generated method stub
		return xh;
	}

	public int gety() {
		// TODO Auto-generated method stub
		return yh;
	}
	
}
