
package kniffel;

public class Kniffel {

	private int[] w�rfel = new int [5];
	private int einser,zweier,dreier,vierer,f�nfer,sechser;
	private int einaugen,zweiaugen,dreiaugen,vieraugen,f�nfaugen,sechsaugen;
	private boolean ei,zw,dr,vi,f�,se,paar,dreierpaar,viererpaar,f�nferpaar,kniffel,fullhous,kleinestra�e,gro�estra�e;
	int w�rfe=3;
	
	
	public Kniffel(){
	
	}
	
	
	 public int getfeld(int i) {
		  if(i==0)return w�rfel[0];
		  if(i==1)return w�rfel[1];
		  if(i==2)return w�rfel[2];
		  if(i==3)return w�rfel[3];
		  if(i==4)return w�rfel[4];
		  
		  return 0;
		 }
	
	
	 public void w�rfeln(){
		 if(!(w�rfe==0))
		 {
			 ei=false;zw=false;dr=false;vi=false;f�=false;se=false;paar=false;dreierpaar=false;viererpaar=false;f�nferpaar=false;kniffel=false;fullhous=false;kleinestra�e=false;gro�estra�e=false;
			 einser=0;
			 zweier=0;
			 dreier=0;
			 vierer=0;
			 f�nfer=0;
			 sechser=0;
			 
			 for(int i=0;i<5;i++){
				 
				 w�rfel[i]=(int) (Math.random()*6+1);	
				 	 
				 if(w�rfel[i]==1)
					 einser++;
				 if(w�rfel[i]==2)
					 zweier++;
				 if(w�rfel[i]==3)
					 dreier++;
				 if(w�rfel[i]==4)
					 vierer++;
				 if(w�rfel[i]==5)
					 f�nfer++;
				 if(w�rfel[i]==6)
					 sechser++;
			 } 
			 vergleichen();
			 w�rfe--;
		 }
	}
	
	 public void vergleichen(){
		 
		 if(!(einser==0))
		 {
			 einaugen=einser;
			 ei=true;
		 }
		 if(!(zweier==0))
		 {
			 zweiaugen=zweier*2;
			 zw=true;
		 }
		 if(!(dreier==0))
		 {
			 dreiaugen=dreier*3;
			 dr=true;
		 }
		 if(!(vierer==0))
		 {
			 vieraugen=vierer*4;
			 vi=true;
		 }
		 if(!(f�nfer==0))
		 {
			 f�nfaugen=f�nfer*5;
			 f�=true;
		 }
		 if(!(sechser==0))
		 {
			 sechsaugen=sechser*6;
			 se=true;
		 }
		 
		 if(einser==2||zweier==2||dreier==2||vierer==2||f�nfer==2||sechser==2)
		 {
			 paar=true;
		 }
		 if(einser>=3||zweier>=3||dreier>=3||vierer>=3||f�nfer>=3||sechser>=3)
		 {
			 dreierpaar=true;
		 }
		 
		 if(einser>=4||zweier>=4||dreier>=4||vierer>=4||f�nfer>=4||sechser>=4)
		 {
			 viererpaar=true;
		 }
		 
		 if(einser==5||zweier==5||dreier==5||vierer==5||f�nfer==5||sechser==5)
		 {
			 kniffel=true;
		 }
		 
		 if((einser==1&&zweier==1&&dreier==1&&vierer==1)||(zweier==1&&dreier==1&&vierer==1&&f�nfer==1)||(dreier==1&&vierer==1&&f�nfer==1&&sechser==1))
		 {
			 kleinestra�e=true;
		 }
		 if((einser==1&&zweier==1&&dreier==1&&vierer==1&&f�nfer==1)||(zweier==1&&dreier==1&&vierer==1&&f�nfer==1&&sechser==1))
		 {
			 gro�estra�e=true;
		 }
		 
		 if(dreierpaar&&paar)
		 {
			 fullhous=true;
		 }
		 
	 }
	 
	 public void wegwerfen(){
		 w�rfe=3;
		 
	 }
	 public boolean geteineraugen(){
			return ei;
		}
	 public boolean getzweiaugen(){
			return zw;
		}
	 public boolean getdreiaugen(){
			return dr;
		}
	 public boolean getvieraugen(){
			return vi;
		}
	 public boolean getf�nfaugen(){
			return f�;
		}
	 public boolean getsechsaugen(){
			return se;
		}
	 
	 
	 public int get1augen(){
			return einaugen;
		}
	 public int get2augen(){
			return zweiaugen;
		}
	 public int get3augen(){
			return dreiaugen;
		}
	 public int get4augen(){
			return vieraugen;
		}
	 public int get5augen(){
			return f�nfaugen;
		}
	 public int get6augen(){
			return sechsaugen;
		}
	 
	 
	 
	public boolean getdreierpaar(){
		return dreierpaar;
	}
	
	public boolean getviererpaar(){
		return viererpaar;
	}
	public boolean getkniffel(){
		return kniffel;
	}
	public boolean getkleinestra�e(){
		return kleinestra�e;
	}
	public boolean getgro�estra�e(){
		return gro�estra�e;
	}
	public boolean getfullhous(){
		return fullhous;
	}
	
}
