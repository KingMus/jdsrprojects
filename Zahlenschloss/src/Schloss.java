
public class Schloss {
	
	private int zustand;
	private int aktion;
	private char[] code={'5','3','7'};
	private int[][] uebergangsTab=
		{{1,0,0,0},
		{1,2,0,0},
		{1,0,3,0}};

	private int[][] ausgabeTab=
		{{0,0,0,0},
		{0,0,0,0},
		{0,0,1,0}};
	
	
	public Schloss(){
		
	}
	
	public int ereignis(int x){
		
		int token;
		
if(x==code[0]){
	token=0;
}else 
	if(x==code[1]){
		token=1;
}else 
	if(x==code[2]){
		token=2;
}else{token=3;}

aktion=ausgabeTab[zustand][token];
zustand=uebergangsTab[zustand][token];
		
	return aktion;
	}
	
	public int getAktion(){
		return aktion;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
