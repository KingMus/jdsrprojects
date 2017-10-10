package Laser;

public class LvL {

	int[] x=new int[22];
	int[] y=new int[22];

	
	public int[] konfiguriere(int level,int[] zaehler,int punkte,int variablenänderer,int bildschirmmodus){
		
		int[] rückgabefeld={0,0,0,0,0,0,0,0,0};
		
		//----------------------------------------------------------------------------------  Level 1 - Anfang - Einstellungen
		if(level==1){
			
		if(zaehler[0]==0){
		y[1]++;
		y[2]++;
		y[3]++;}
		if(zaehler[0]==1){
		x[4]++;
		x[5]++;
		x[6]++;}
		if(zaehler[0]==2){
		x[7]++;
		y[7]++;}
		if(zaehler[0]==3 || zaehler[0]==4){
		x[8]--;
		x[9]--;}
		
		
		if(y[3]==520 && zaehler[0]==0){zaehler[0]=1;punkte=punkte+25;}
		if(x[6]==520 && zaehler[0]==1){zaehler[0]=2;punkte=punkte+25;}
		if(x[7]==520 && zaehler[0]==2){zaehler[0]=3;punkte=punkte+50;}
		if(x[9]==-100 && zaehler[0]==3){zaehler[0]=4;punkte=punkte+100;}
		if(x[9]==-500){level=2;punkte=punkte+100;variablenänderer=1;}
		
	
		}
		//----------------------------------------------------------------------------------  Level 1 - Ende - Einstellungen
		
		
		
		//----------------------------------------------------------------------------------  Level 2 - Anfang - Einstellungen
		if(level==2){
			
			if(zaehler[1]==0){
				x[1]++;
				y[1]++;
				x[2]--;
				y[2]--;}
			if(zaehler[1]==1){
				x[3]++;
				y[3]++;
				x[4]--;
				y[4]--;
				y[5]++;}
			if(zaehler[1]==2){
				x[6]++;
				y[6]++;
				x[7]--;
				y[7]--;
				y[8]++;
				x[9]++;}
			if(zaehler[1]==3){
				x[10]--;
				y[10]--;
				x[11]--;
				y[11]--;
				x[12]--;
				y[12]--;
				x[13]--;
				y[13]--;
			}
			if(zaehler[1]==4){
				x[13]--;
				y[13]--;
			}

			
			
			if(y[2]==-20 && zaehler[1]==0){zaehler[1]=1;punkte=punkte+100;}
			if(y[5]==520 && zaehler[1]==1){zaehler[1]=2;punkte=punkte+150;}
			if(x[9]==520 && zaehler[1]==2){zaehler[1]=3;punkte=punkte+200;}
			if(x[13]==-100 && zaehler[1]==3){zaehler[1]=4;punkte=punkte+200;}
			if(x[13]==-500 && zaehler[1]==4){level=3;punkte=punkte+200;variablenänderer=1;}
			
			}
		//----------------------------------------------------------------------------------  Level 2 - Ende - Einstellungen
		
		
		
		//----------------------------------------------------------------------------------  Level 3 - Anfang - Einstellungen
		if(level==3){
		
			if(zaehler[2]==0){
				x[1]++;
				y[1]++;
				x[2]--;
				y[2]++;
				x[3]++;
				y[3]++;
				x[4]--;
				y[4]++;
				x[5]++;
				y[5]++;
				x[6]--;
				y[6]++;
				x[7]--;
				y[7]--;
			}
			if(zaehler[2]==1){
				x[8]++;
				y[8]++;
				x[9]--;
				y[9]--;
				x[10]++;
				x[10]++;
				y[10]++;
				x[11]--;
				x[11]--;
				y[11]--;
			}
			if(zaehler[2]==2){
				x[8]++;
				y[8]++;
			}
			
			if(x[7]==-20 && zaehler[2]==0){zaehler[2]=1;punkte=punkte+350;}
			if(x[8]==600 && zaehler[2]==1){zaehler[2]=2;punkte=punkte+200;}
			if(x[8]==1000 && zaehler[2]==2){level=4;punkte=punkte+300;variablenänderer=1;}
			
			
		}
		//----------------------------------------------------------------------------------  Level 3 - Ende - Einstellungen
		
		
		
		
		//----------------------------------------------------------------------------------  Level 4 - Anfang - Einstellungen

	
		if(level==4){
			if(zaehler[3]==0){
				x[1]++;
				y[1]++;
				x[2]--;
				y[2]--;
				x[3]++;
				x[3]++;
				y[3]++;
				x[4]--;
				x[4]--;
				y[4]--;
			}
			if(zaehler[3]==1){
				x[5]++;
				y[5]++;
				x[6]--;
				y[6]--;
				x[7]++;
				x[7]++;
				y[7]++;
				x[8]--;
				x[8]--;
				y[8]--;
				y[9]++;
			}
			if(zaehler[3]==2){
				x[10]++;
				y[10]++;
				x[11]--;
				y[11]--;
				x[12]++;
				x[12]++;
				y[12]++;
				x[13]--;
				x[13]--;
				y[13]--;
				y[14]++;
				x[15]++;
			}
			if(zaehler[3]==3){
				x[13]--;
				y[13]--;
			}
			
			
			if(y[4]==-20 && zaehler[3]==0){zaehler[3]=1;punkte=punkte+200;}
			if(y[8]==-20 && zaehler[3]==1){zaehler[3]=2;punkte=punkte+250;}
			if(y[13]==-100 && zaehler[3]==2){zaehler[3]=3;punkte=punkte+300;}
			if(y[13]==-500 && zaehler[3]==3){level=5;punkte=punkte+400;variablenänderer=1;}
			
			
		}


		//----------------------------------------------------------------------------------  Level 4 - Ende - Einstellungen
		
		
		//----------------------------------------------------------------------------------  Level 5 - Anfang - Einstellungen
		if(level==5){
			
			if(zaehler[4]==0){
		y[1]++;
		y[2]++;
		y[3]++;
		x[4]++;
		x[5]++;
		x[6]++;
		y[7]--;
		y[8]--;
		y[9]--;
		x[10]--;
		x[11]--;
		x[12]--;}
			
		if(zaehler[4]==1){
		x[13]++;
		y[13]++;
		y[14]++;
		x[15]--;
		y[15]++;	
		x[16]--;
		x[17]--;
		y[17]--;
		y[18]--;
		x[20]++;
		y[20]--;			
		x[21]++;}
		
		
		if(zaehler[4]==2){
			x[21]++;
		}
		 
        if(x[12]==-40 && zaehler[4]==0) {zaehler[4]=1;punkte=punkte+300;}
        if(x[21]==540 && zaehler[4]==1) {zaehler[4]=2;punkte=punkte+400;}
		if(x[21]==900 && zaehler[4]==2) {level=6;punkte=punkte+500;variablenänderer=1;}
		
		
		
		
		}
		//----------------------------------------------------------------------------------  Level 5 - Ende - Einstellungen

		//----------------------------------------------------------------------------------  Level 6 - Anfang - Einstellungen
				if(level==6){
					
				if(zaehler[5]==0){
					x[5]++;
					y[5]++;
					x[6]--;
					y[6]--;
					x[7]++;
					x[8]++;
						}
				if(zaehler[5]==1){
					x[1]++;
					y[1]++;
					x[2]--;
					y[2]--;
					x[3]++;
					y[3]--;
					x[4]--;
					y[4]++;
						}
				
		        if(x[8]==550 && zaehler[5]==0) {zaehler[5]=1;punkte=punkte+400;}
		        if(x[21]==540 && zaehler[5]==1) {zaehler[4]=2;punkte=punkte+400;}
				if(x[21]==900 && zaehler[5]==2) {bildschirmmodus=10;punkte=punkte+500;variablenänderer=1;}
				
				
				
				
				}
				//----------------------------------------------------------------------------------  Level 6 - Ende - Einstellungen
		
		
		
		for(int i=0;i<5;i++)rückgabefeld[i]=zaehler[i];
			
		rückgabefeld[5]=punkte;
		rückgabefeld[6]=variablenänderer;
		rückgabefeld[7]=bildschirmmodus;
		rückgabefeld[8]=level;
		
		return rückgabefeld;
		
	}


	public int[] holdirdiexwerte() {

		return x;
	}


	public int[] holdirdieywerte() {

		return y;
	}


	public int[] setzeVAR(int level,int modus) {
		
		if(level==1){
			x[1]=100;y[1]=0;
			x[2]=250;y[2]=0;
			x[3]=400;y[3]=0;
			x[4]=0;y[4]=100;
			x[5]=0;y[5]=250;
			x[6]=0;y[6]=400;
			x[7]=0;y[7]=0;
			x[8]=500;y[8]=350;
			x[9]=500;y[9]=150;}
		
		if(level==2){
			x[1]=0;y[1]=0;
			x[2]=500;y[2]=500;
			x[3]=0;y[3]=0;
			x[4]=500;y[4]=500;
			x[5]=250;y[5]=0;
			x[6]=0;y[6]=0;
			x[7]=500;y[7]=500;
			x[8]=250;y[8]=0;
			x[9]=0;y[9]=250;
			x[10]=500;y[10]=500;
			x[11]=630;y[11]=630;
			x[12]=760;y[12]=760;
			x[13]=890;y[13]=890;}
			
		if(level==3){
			x[1]=0;y[1]=0;
	 		x[2]=700;y[2]=-200;
	 		x[3]=-400;y[3]=-400;
	 		x[4]=1100;y[4]=-600;
	 		x[5]=-600;y[5]=-600;
	 		x[6]=-600;y[6]=1100;
	 		x[7]=1200;y[7]=1100;
	 		x[8]=0;y[8]=0;
	 		x[9]=500;y[9]=500;
	 		x[10]=0;y[10]=0;
	 		x[11]=500;y[11]=500;}
	 		
	 		
 		if(level==4){
	 		x[1]=0;y[1]=0;
	 		x[2]=500;y[2]=500;
	 		x[3]=0;y[3]=0;
	 		x[4]=500;y[4]=500;	
	 		x[5]=0;y[5]=0;
	 		x[6]=500;y[6]=500;
	 		x[7]=0;y[7]=0;
	 		x[8]=500;y[8]=500;
	 		x[9]=250;y[9]=0;	
	 		x[10]=0;y[10]=0;
	 		x[11]=500;y[11]=500;
	 		x[12]=0;y[12]=0;
	 		x[13]=500;y[13]=500;
	 		x[14]=250;y[14]=0;
	 		x[15]=0;y[15]=250;}
	 		
	 		
 		if(level==5){
	 		x[1]=100;y[1]=0;
			 x[2]=250;y[2]=0;
			 x[3]=400;y[3]=0;
			 x[4]=-30;y[4]=100;
			 x[5]=-30;y[5]=250;
			 x[6]=-30;y[6]=400;
			 x[7]=100;y[7]=560;
			 x[8]=250;y[8]=560;
			 x[9]=400;y[9]=560;
			 x[10]=590;y[10]=100;
			 x[11]=590;y[11]=250;
			 x[12]=590;y[12]=400;
			 x[13]=0;y[13]=0;
			 x[14]=250;y[14]=-50;
			 x[15]=600;y[15]=-100;
			 x[16]=650;y[16]=250;
			 x[17]=700;y[17]=700;
			 x[18]=250;y[18]=750;
			 x[20]=-300;y[20]=800;
			 x[21]=-350;y[21]=250;}
 		
 		if(level==6){
	 		 x[1]=50;y[1]=50;
			 x[2]=450;y[2]=450;
			 x[3]=200;y[3]=200;
			 x[4]=300;y[4]=300;
		 	 x[5]=-30;y[5]=-30;
		 	 x[6]=530;y[6]=530;
			 x[7]=0;y[7]=120;
			 x[8]=0;y[8]=380;}
 		
 		if(modus==0)return x;
 		if(modus==1)return y;
 		
 		return null;
		
	}
	
	
	
	
	
}
