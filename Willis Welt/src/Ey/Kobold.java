package Ey;

import java.awt.*;



public class Kobold implements Runnable{


    private int ortX;
    private int ortY;
    private int groesse;
    private int schrittweite1;
    private int schrittweite2;
    private Color hautFarbe;
    private Color augenFarbe;
    private boolean show;
    boolean fertig=true;


      public void setzeAussehen(int x, int y, int g, Color fHaut, Color fAugen)  {
      ortX=x;
      ortY=y;
      groesse=g;
      hautFarbe=fHaut;
      augenFarbe=fAugen;

      show=false;
    }

    
    public void zeigen() {
      show=true;
    }
    
    
    public void verstecken()  {
      show=false;
    }
    
    public void gehen(int a, int b) {
    	
    	schrittweite1=a;
    	schrittweite2=b;
    	Thread Grafik = new Thread(this);
		Grafik.start();	
    	
    	
    	
    	}
    
    public void malen(Graphics g) {
      if (show) {
        
         g.setColor(hautFarbe);
         g.fillOval(ortX-groesse/2, ortY-groesse/2, groesse, groesse);

        
         g.setColor(Color.black);
         int part=groesse/8;
         g.drawLine(ortX, ortY-part, ortX, ortY+2*part);

         
         part=2*groesse/3;
         g.drawArc(ortX-part/2, ortY-part/2, part, part, -125, 80);

        
         g.setColor(augenFarbe);
         part=groesse/8;
         g.fillOval((int)(ortX-3*part), ortY-2*part, 2*part,part);
         g.fillOval((int)(ortX+1*part), ortY-2*part, 2*part,part);
      }
    }

    
    public void run()   {
	      while (fertig==true) {
	    	  
	    	if(ortX<schrittweite1){ortX++;}
	      	if(ortX>schrittweite1){ortX--;}
	      	if(ortY<schrittweite2){ortY++;}
	      	if(ortY>schrittweite2){ortY--;}
	    	  
	    	  
	    	  
	         try {
	            Thread.sleep(100);
	         } catch (InterruptedException e) {
	
	        	 
	         }
	      }
	   }

}

