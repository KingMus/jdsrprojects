package meinPaket;

import java.awt.Color;
import java.awt.Graphics;

public class Spieler {
	
	private static int speicher=1;
	private String name="Spieler"+speicher;
	private boolean[] gf= {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
	private int[] pfg={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	private boolean voll=false;
	
	public Spieler(){
		
		/*Laden.aktualisiereDaten(speicher);
		speicher++;
		pfg=Laden.getpunktefeld();
		gf=Laden.getwahrfeld();*/
		
	}
	
	
		public void setGesetzt(int nummer,Kombi k, int x){
		
			if(nummer==1 && gf[0]==false){gf[0]=true;
				if(x==0)pfg[0]=k.getPunkte(1);
				if(x==1)pfg[0]=0;
			}
			if(nummer==2 && gf[1]==false){gf[1]=true;
				if(x==0)pfg[1]=k.getPunkte(2);
				if(x==1)pfg[1]=0;
			}
			if(nummer==3 && gf[2]==false){gf[2]=true;
				if(x==0)pfg[2]=k.getPunkte(3);
				if(x==1)pfg[2]=0;
			}
			if(nummer==4 && gf[3]==false){gf[3]=true;
				if(x==0)pfg[3]=k.getPunkte(4);
				if(x==1)pfg[3]=0;
			}
			if(nummer==5 && gf[4]==false){gf[4]=true;
				if(x==0)pfg[4]=k.getPunkte(5);
				if(x==1)pfg[4]=0;
			}
			if(nummer==6 && gf[5]==false){gf[5]=true;
				if(x==0)pfg[5]=k.getPunkte(6);
				if(x==1)pfg[5]=0;
			}
			if(nummer==7 && gf[6]==false){gf[6]=true;
				if(x==0)pfg[6]=k.getPunkte(7);
				if(x==1)pfg[6]=0;
			}
			if(nummer==8 && gf[7]==false){gf[7]=true;
				if(x==0)pfg[7]=k.getPunkte(8);
				if(x==1)pfg[7]=0;
			}
			if(nummer==9 && gf[8]==false){gf[8]=true;
				if(x==0)pfg[8]=k.getPunkte(9);
				if(x==1)pfg[8]=0;
			}
			if(nummer==10 && gf[9]==false){gf[9]=true;
				if(x==0)pfg[9]=k.getPunkte(10);
				if(x==1)pfg[9]=0;
			}
			if(nummer==11 && gf[10]==false){gf[10]=true;
				if(x==0)pfg[10]=k.getPunkte(11);
				if(x==1)pfg[10]=0;
			}
			if(nummer==12 && gf[11]==false){gf[11]=true;
				if(x==0)pfg[11]=k.getPunkte(12);
				if(x==1)pfg[11]=0;
			}
			if(nummer==13 && gf[12]==false){gf[12]=true;
				if(x==0)pfg[12]=k.getPunkte(13);
				if(x==1)pfg[12]=0;
			}
			if(nummer==14 && gf[13]==false){gf[13]=true;
				if(x==0)pfg[13]=k.getPunkte(14);
				if(x==1)pfg[13]=0;
			}
			if(nummer==15 && gf[14]==false){gf[14]=true;
			pfg[14]=k.getPunkte(15);
			}
			
		}
		
		public boolean getGesetzt(int nummer){
			
			if(nummer==1)return gf[0];
			if(nummer==2)return gf[1];
			if(nummer==3)return gf[2];
			if(nummer==4)return gf[3];
			if(nummer==5)return gf[4];
			if(nummer==6)return gf[5];
			if(nummer==7)return gf[6];
			if(nummer==8)return gf[7];
			if(nummer==9)return gf[8];
			if(nummer==10)return gf[9];
			if(nummer==11)return gf[10];
			if(nummer==12)return gf[11];
			if(nummer==13)return gf[12];
			if(nummer==14)return gf[13];
			if(nummer==15)return gf[14];
			
			return false;
		}

		public void spielerlistemalen(Graphics g,int x,Kombi k) {
			
			pfg[15]=pfg[0]+pfg[1]+pfg[2]+pfg[3]+pfg[4]+pfg[5];
			pfg[17]=0;
			pfg[16]=pfg[6]+pfg[7]+pfg[8]+pfg[9]+pfg[10]+pfg[11]+pfg[12]+pfg[13]+pfg[14];

			if(gf[0]==true){
					g.drawString(""+pfg[0],830+x,120);
			}
			if(gf[1]==true){
					g.drawString(""+pfg[1],830+x,141);
			}
			if(gf[2]==true){
					g.drawString(""+pfg[2],830+x,162);
			}
			if(gf[3]==true){
					g.drawString(""+pfg[3],830+x,182);
			}
			if(gf[4]==true){
					g.drawString(""+pfg[4],830+x,202);
			}
			if(gf[5]==true){
					g.drawString(""+pfg[5],830+x,222);
			}
			
			if(gf[6]==true){
					g.drawString(""+pfg[6],830+x,345);
			}
			if(gf[7]==true){
					g.drawString(""+pfg[7],830+x,365);
			}
			if(gf[8]==true){
					g.drawString(""+pfg[8],830+x,386);
			}
			if(gf[9]==true){
					g.drawString(""+pfg[9],830+x,406);
			}
			if(gf[10]==true){
					g.drawString(""+pfg[10],830+x,427);
			}
			if(gf[11]==true){
					g.drawString(""+pfg[11],830+x,447);
			}
			if(gf[12]==true){
					g.drawString(""+pfg[12],830+x,467);
			}
			if(gf[13]==true){
					g.drawString(""+pfg[13],830+x,488);			
			}
			if(gf[14]==true){
					g.drawString(""+pfg[14],830+x,508);
			}
			
			g.drawString(""+pfg[15],830+x,263);
			
			if(pfg[15]>=63){
				pfg[17]=35;
			}
			
			g.drawString(""+pfg[17],830+x,283);
			g.drawString(""+(pfg[15]+pfg[17]),830+x,304);
			
			g.drawString(""+(pfg[15]+pfg[17]),830+x,569);
			g.drawString(""+pfg[16],830+x,549);
			g.drawString(""+(pfg[15]+pfg[16]+pfg[17]),830+x,590);
			
			if(gf[0]==true && gf[1]==true && gf[2]==true && gf[3]==true && gf[4]==true && gf[5]==true && gf[6]==true && 
					gf[7]==true && gf[8]==true && gf[9]==true && gf[10]==true && gf[11]==true && gf[12]==true && gf[13]==true && 
							gf[14]==true){
				
				setvoll(true);
				
			}

			g.setColor(Color.black);
			
		}

		private void setvoll(boolean b) {

			voll=b;
		}

		public boolean getvoll() {
			
			return voll;
		}

		public int getmaxP() {
			
			return (pfg[15]+pfg[16]+pfg[17]);
		}

		public void resetfelder() {

			gf[0]=false;gf[1]=false;gf[2]=false;gf[3]=false;gf[4]=false;gf[5]=false;gf[6]=false;
			gf[7]=false;gf[8]=false;gf[9]=false;gf[10]=false;gf[11]=false;gf[12]=false;gf[13]=false;gf[14]=false;
			
			pfg[0]=0;pfg[1]=0;pfg[2]=0;pfg[3]=0;pfg[4]=0;pfg[5]=0;pfg[6]=0;
			pfg[7]=0;pfg[8]=0;pfg[9]=0;pfg[10]=0;pfg[11]=0;pfg[12]=0;pfg[13]=0;pfg[14]=0;
			pfg[15]=0;pfg[16]=0;pfg[17]=0;
			
			voll=false;
			
		}


		public void setName(String s) {
			name=s;
		}
		public String getName() {
			return name;
		}
}
