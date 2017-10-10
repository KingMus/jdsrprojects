package KoboldeundWelt;
import java.awt.*;

public class Kobold {
	
	private int ortX;
	private int ortY;
	private String koboldName;
	private int groesse;
	private int schrittweite;
	private Color hautFarbe;
	private Color augenFarbe;
	private boolean show;
	
	public void setzeAussehen(String name, int x, int y, int g, Color fHaut, Color fAugen, int s) {
		koboldName=name;
		ortX=x;
		ortY=y;
		groesse=g;
		hautFarbe=fHaut;
		augenFarbe=fAugen;
		schrittweite= s;
		show= false;
	}
	
	public void zeigen() {
		show=true;
	}
	public void verstecken() {
		show=false;
	}
	
	public void malen(Graphics g) {
		if (show) {
			g.setColor(hautFarbe);
			g.fillOval(ortX-groesse/2,  ortY-groesse/2,  groesse,  groesse);
			
			g.setColor(Color.black);
			int part=groesse/8;
			g.drawLine(ortX, ortY-part, ortX, ortY+2+part);
			
			part=2*groesse/3;
			g.drawArc(ortX-part/2, ortY-part/2, part, part,-125,80);
			
			g.setColor(Color.white);
			g.drawString(koboldName,ortX-10,ortY-40);
			
			g.setColor(augenFarbe);
			part=groesse/8;
			g.fillOval((int)(ortX-3*part), ortY-2*part,  2*part,  part);
			g.fillOval((int)(ortX+1*part), ortY-2*part,  2*part,  part);
			
		}
	}
	
	public void gehen(int x, int y) {
		
		if(ortX<x) ortX=ortX+schrittweite;
		if(ortX>x) ortX=ortX-schrittweite;
		if(ortY<y) ortY=ortY+schrittweite;
		if(ortY>y) ortY=ortY-schrittweite;
	}

}
