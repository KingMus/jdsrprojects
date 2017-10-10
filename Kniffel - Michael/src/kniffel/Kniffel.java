
package kniffel;

public class Kniffel {

	private int[] würfel = new int [5];
	private int einser,zweier,dreier,vierer,fünfer,sechser;
	private int einaugen,zweiaugen,dreiaugen,vieraugen,fünfaugen,sechsaugen;
	private boolean ei,zw,dr,vi,fü,se,paar,dreierpaar,viererpaar,fünferpaar,kniffel,fullhous,kleinestraße,großestraße;
	int würfe=3;
	
	
	public Kniffel(){
	
	}
	
	
	 public int getfeld(int i) {
		  if(i==0)return würfel[0];
		  if(i==1)return würfel[1];
		  if(i==2)return würfel[2];
		  if(i==3)return würfel[3];
		  if(i==4)return würfel[4];
		  
		  return 0;
		 }
	
	
	 public void würfeln(){
		 if(!(würfe==0))
		 {
			 ei=false;zw=false;dr=false;vi=false;fü=false;se=false;paar=false;dreierpaar=false;viererpaar=false;fünferpaar=false;kniffel=false;fullhous=false;kleinestraße=false;großestraße=false;
			 einser=0;
			 zweier=0;
			 dreier=0;
			 vierer=0;
			 fünfer=0;
			 sechser=0;
			 
			 for(int i=0;i<5;i++){
				 
				 würfel[i]=(int) (Math.random()*6+1);	
				 	 
				 if(würfel[i]==1)
					 einser++;
				 if(würfel[i]==2)
					 zweier++;
				 if(würfel[i]==3)
					 dreier++;
				 if(würfel[i]==4)
					 vierer++;
				 if(würfel[i]==5)
					 fünfer++;
				 if(würfel[i]==6)
					 sechser++;
			 } 
			 vergleichen();
			 würfe--;
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
		 if(!(fünfer==0))
		 {
			 fünfaugen=fünfer*5;
			 fü=true;
		 }
		 if(!(sechser==0))
		 {
			 sechsaugen=sechser*6;
			 se=true;
		 }
		 
		 if(einser==2||zweier==2||dreier==2||vierer==2||fünfer==2||sechser==2)
		 {
			 paar=true;
		 }
		 if(einser>=3||zweier>=3||dreier>=3||vierer>=3||fünfer>=3||sechser>=3)
		 {
			 dreierpaar=true;
		 }
		 
		 if(einser>=4||zweier>=4||dreier>=4||vierer>=4||fünfer>=4||sechser>=4)
		 {
			 viererpaar=true;
		 }
		 
		 if(einser==5||zweier==5||dreier==5||vierer==5||fünfer==5||sechser==5)
		 {
			 kniffel=true;
		 }
		 
		 if((einser==1&&zweier==1&&dreier==1&&vierer==1)||(zweier==1&&dreier==1&&vierer==1&&fünfer==1)||(dreier==1&&vierer==1&&fünfer==1&&sechser==1))
		 {
			 kleinestraße=true;
		 }
		 if((einser==1&&zweier==1&&dreier==1&&vierer==1&&fünfer==1)||(zweier==1&&dreier==1&&vierer==1&&fünfer==1&&sechser==1))
		 {
			 großestraße=true;
		 }
		 
		 if(dreierpaar&&paar)
		 {
			 fullhous=true;
		 }
		 
	 }
	 
	 public void wegwerfen(){
		 würfe=3;
		 
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
	 public boolean getfünfaugen(){
			return fü;
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
			return fünfaugen;
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
	public boolean getkleinestraße(){
		return kleinestraße;
	}
	public boolean getgroßestraße(){
		return großestraße;
	}
	public boolean getfullhous(){
		return fullhous;
	}
	
}
