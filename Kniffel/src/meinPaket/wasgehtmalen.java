package meinPaket;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;


public class wasgehtmalen {

	Bilder b=new Bilder();
	
	public void malen(Graphics g,int spieler,Spieler s,boolean B[],int[] P){
		
		g.setColor(Color.white);
		
		/**
		 * Hier werden in Abhängigkeit der oben gesetzten "boolean"-Variablen Pfeile und vor-
		 * läufige Punktzahlen nach jedem Wurf gesetzt. Ist der erste Spieler dran, so wird dies in
		 * der ersten Spalte gemalt, beim zweiten Spieler in der zweiten. Dies wird mit der aus "Spielfeld"
		 * übergebenen Variable "spieler" überprüft
		 */
		
		/*---------------------------------------------------------------------------------------------*/
		
		if(B[0]==true){
			if(spieler==1){
				g.drawImage(b.pl,860,108,14,17, null);
				g.drawString(""+P[0],830,120);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,108,14,17, null);
				g.drawString(""+P[0],920,120);
			}
		}
		
		if(B[15]==true && s.getGesetzt(1)==false){
			if(spieler==1){
				g.drawImage(b.pl,860,108,14,17, null);
				g.drawString("0",830,120);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,108,14,17, null);
				g.drawString("0",920,120);
			}
		}
		
		/*---------------------------------------------------------------------------------------------*/
		
		if(B[1]==true){
			if(spieler==1){
				g.drawImage(b.pl,860,129,14,17, null);
				g.drawString(""+P[1],830,141);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,129,14,17, null);
				g.drawString(""+P[1],920,141);
			}
		}
		
		if(B[15]==true && s.getGesetzt(2)==false){
			if(spieler==1){
				g.drawImage(b.pl,860,129,14,17, null);
				g.drawString("0",830,141);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,129,14,17, null);
				g.drawString("0",920,141);
			}
		}
		
		/*---------------------------------------------------------------------------------------------*/
		
		if(B[2]==true){
			if(spieler==1){
				g.drawImage(b.pl,860,150,14,17, null);
				g.drawString(""+P[2],830,162);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,150,14,17, null);
				g.drawString(""+P[2],920,162);
			}
		}
		
		if(B[15]==true && s.getGesetzt(3)==false){
			if(spieler==1){
				g.drawImage(b.pl,860,150,14,17, null);
				g.drawString("0",830,162);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,150,14,17, null);
				g.drawString("0",920,162);
			}
		}
		
		/*---------------------------------------------------------------------------------------------*/
		
		if(B[3]==true){
			if(spieler==1){
				g.drawImage(b.pl,860,170,14,17, null);
				g.drawString(""+P[3],830,182);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,170,14,17, null);
				g.drawString(""+P[3],920,182);
			}
		}
		if(B[15]==true && s.getGesetzt(4)==false){
			if(spieler==1){
				g.drawImage(b.pl,860,170,14,17, null);
				g.drawString("0",830,182);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,170,14,17, null);
				g.drawString("0",920,182);
			}
		}
		
		/*---------------------------------------------------------------------------------------------*/
		
		if(B[4]==true){
			if(spieler==1){
				g.drawImage(b.pl,860,190,14,17, null);
				g.drawString(""+P[4],830,202);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,190,14,17, null);
				g.drawString(""+P[4],920,202);
			}
		}
		if(B[15]==true && s.getGesetzt(5)==false){
			if(spieler==1){
				g.drawImage(b.pl,860,190,14,17, null);
				g.drawString("0",830,202);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,190,14,17, null);
				g.drawString("0",920,202);
			}
		}
		
		/*---------------------------------------------------------------------------------------------*/
		
		if(B[5]==true){
			if(spieler==1){
				g.drawImage(b.pl,860,210,14,17, null);
				g.drawString(""+P[5],830,222);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,210,14,17, null);
				g.drawString(""+P[5],920,222);
			}
		}
		if(B[15]==true && s.getGesetzt(6)==false){
			if(spieler==1){
				g.drawImage(b.pl,860,210,14,17, null);
				g.drawString("0",830,222);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,210,14,17, null);
				g.drawString("0",920,222);
			}
		}
		
		/*---------------------------------------------------------------------------------------------*/
		
		if(B[6]==true){
			if(spieler==1){
				g.drawImage(b.pl,860,333,14,17, null);
				g.drawString(""+P[6],830,345);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,333,14,17, null);
				g.drawString(""+P[6],920,345);
			}
		}
		if(B[15]==true && s.getGesetzt(7)==false){
			if(spieler==1){
				g.drawImage(b.pl,860,333,14,17, null);
				g.drawString("0",830,345);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,333,14,17, null);
				g.drawString("0",920,345);
			}
		}
		
		/*---------------------------------------------------------------------------------------------*/
		
		if(B[7]==true){
			if(spieler==1){
				g.drawImage(b.pl,860,353,14,17, null);
				g.drawString(""+P[7],830,365);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,353,14,17, null);
				g.drawString(""+P[7],920,365);
			}
		}
		if(B[15]==true && s.getGesetzt(8)==false){
			if(spieler==1){
				g.drawImage(b.pl,860,353,14,17, null);
				g.drawString("0",830,365);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,353,14,17, null);
				g.drawString("0",920,365);
			}
		}
		
		/*---------------------------------------------------------------------------------------------*/
		
		if(B[8]==true){
			if(spieler==1){
				g.drawImage(b.pl,860,374,14,17, null);
				g.drawString(""+P[8],830,386);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,374,14,17, null);
				g.drawString(""+P[8],920,386);
			}
		}
		if(B[15]==true && s.getGesetzt(9)==false){
			if(spieler==1){
				g.drawImage(b.pl,860,374,14,17, null);
				g.drawString("0",830,386);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,374,14,17, null);
				g.drawString("0",920,386);
			}
		}
		
		/*---------------------------------------------------------------------------------------------*/
		
		if(B[9]==true){
			if(spieler==1){
				g.drawImage(b.pl,860,394,14,17, null);
				g.drawString(""+P[9],830,406);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,394,14,17, null);
				g.drawString(""+P[9],920,406);
			}
		}
		if(B[15]==true && s.getGesetzt(10)==false){
			if(spieler==1){
				g.drawImage(b.pl,860,394,14,17, null);
				g.drawString("0",830,406);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,394,14,17, null);
				g.drawString("0",920,406);
			}
		}
		
		/*---------------------------------------------------------------------------------------------*/
		
		if(B[10]==true){
			if(spieler==1){
				g.drawImage(b.pl,860,415,14,17, null);
				g.drawString(""+P[10],830,427);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,415,14,17, null);
				g.drawString(""+P[10],920,427);
			}
		}
		if(B[15]==true && s.getGesetzt(11)==false){
			if(spieler==1){
				g.drawImage(b.pl,860,415,14,17, null);
				g.drawString("0",830,427);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,415,14,17, null);
				g.drawString("0",920,427);
			}
		}
		
		/*---------------------------------------------------------------------------------------------*/
		
		if(B[11]==true){
			if(spieler==1){
				g.drawImage(b.pl,860,435,14,17, null);
				g.drawString(""+P[11],830,447);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,435,14,17, null);
				g.drawString(""+P[11],920,447);
			}
		}
		if(B[15]==true && s.getGesetzt(12)==false){
			if(spieler==1){
				g.drawImage(b.pl,860,435,14,17, null);
				g.drawString("0",830,447);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,435,14,17, null);
				g.drawString("0",920,447);
			}
		}
		
		/*---------------------------------------------------------------------------------------------*/
		
		if(B[12]==true){
			if(spieler==1){
				g.drawImage(b.pl,860,455,14,17, null);
				g.drawString(""+P[12],830,467);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,455,14,17, null);
				g.drawString(""+P[12],920,467);
			}
		}
		if(B[15]==true && s.getGesetzt(13)==false){
			if(spieler==1){
				g.drawImage(b.pl,860,455,14,17, null);
				g.drawString("0",830,467);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,455,14,17, null);
				g.drawString("0",920,467);
			}
		}
		
		/*---------------------------------------------------------------------------------------------*/
		
		if(B[13]==true){
			if(spieler==1){
				g.drawImage(b.pl,860,476,14,17, null);
				g.drawString(""+P[13],830,488);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,476,14,17, null);
				g.drawString(""+P[13],920,488);
			}
		}
		if(B[15]==true && s.getGesetzt(14)==false){
			if(spieler==1){
				g.drawImage(b.pl,860,476,14,17, null);
				g.drawString("0",830,488);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,476,14,17, null);
				g.drawString("0",920,488);
			}
		}
		
		/*---------------------------------------------------------------------------------------------*/
		
		if(B[14]==true){
			if(spieler==1){
				g.drawImage(b.pl,860,496,14,17, null);
				g.drawString(""+P[14],830,508);
			}
			if(spieler==2){
				g.drawImage(b.pr,890,496,14,17, null);
				g.drawString(""+P[14],920,508);
			}
		}

		/*---------------------------------------------------------------------------------------------*/
		
		g.setColor(Color.black);
		
		
	}
	
	
	
	
}

