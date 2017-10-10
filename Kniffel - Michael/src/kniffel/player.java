package kniffel;

public class player {
	
		
	private int würfe =3;
	private int einer,zweier,dreier,vierer,fünfer,sechser;
	private boolean paar,dreierpaar,viererpaar,fünferpaar,kniffel,fullhous,kleinestraße,großestraße;
	
	
	public player(){
		
	}


	public void set1(int i) {
		einer=i;		
	}
	public void set2(int i) {
		zweier=i;		
	}
	public void set3(int i) {
		dreier=i;		
	}
	public void set4(int i) {
		vierer=i;		
	}
	public void set5(int i) {
		fünfer=i;		
	}
	public void set6(int i) {
		sechser=i;		
	}
	
	public boolean get3paar(){
		return dreierpaar;
	}
	public boolean get4paar(){
		return viererpaar;
	}
	public boolean getkniffel(){
		return kniffel;
	}
	public boolean getfullhous(){
		return fullhous;
	}
	public boolean getkl(){
		return kleinestraße;
	}
	public boolean getgr(){
		return großestraße;
	}
	
	public int geteiner(){
		return einer;
	}
	
	
	
}
