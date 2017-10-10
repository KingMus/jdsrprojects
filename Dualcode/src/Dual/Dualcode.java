package Dual;

public class Dualcode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] spielfeld;
		spielfeld= new int [5][10];
		
		initialisieren(spielfeld);
		schreiben(spielfeld);
		konvertieren(spielfeld);
		System.out.println("wird konvertiert zu");
		schreiben(spielfeld);
	}
	
	
    public static void schreiben(int[][] spielfeld){
    	int i,j;
    	for(i=0;i<spielfeld.length;i++){
    		for(j=0;j<spielfeld[i].length;j++)
    		System.out.print(spielfeld[i][j]+" ");
    	System.out.println();
    }
    }
    
    public static void initialisieren(int[][] spielfeld){
    	int i,j,g;
    	g=0;
    	for(i=0;i<spielfeld.length;i++){
    		for(j=0;j<spielfeld[i].length;j++){
    			g=(int)(200*Math.random());
    		if(g%2==0){spielfeld[i][j]=0;}
    		else{spielfeld[i][j]=1;}
    		}}
    }

    public static void konvertieren(int[][] spielfeld){
    	int i,j;
    	for(i=0;i<spielfeld.length;i++){
    		for(j=0;j<spielfeld[i].length;j++)
    		if(spielfeld[i][j]==0){spielfeld[i][j]=1;}
    		else{spielfeld[i][j]=0;}
    		}
    }
    
    } 
