package drei;

public class Dreidimensional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][][] spielfeld;
		spielfeld= new int[20][5][10];
		
		int[] strichliste;
		strichliste= new int[20];
		
		initialisieren(spielfeld);
		schreiben(spielfeld);
		strichliste=einserProSpielfeld(spielfeld);
		schreibenStrichliste(strichliste);
		System.out.println("Die meisten Einser sind im");
		System.out.println((woMeistenEinser(strichliste)+1) + ". ten Spielfeld");
	}

	
	public static void initialisieren(int[][][] spielfeld){
		int h,i,j,g;
		g=0;
		for(h=0;h<spielfeld.length;h++){
		for(i=0;i<spielfeld[i].length;i++){
			for(j=0;j<spielfeld[j].length;j++){
				g=(int)(200*Math.random());
				if(g%2==0){spielfeld[h][i][j]=0;}
				else{spielfeld[h][i][j]=1;}
			}}
	}}

	public static void schreiben(int[][][] spielfeld){
	int h,i,j;
	for(h=0;h<spielfeld.length;h++){
	for(i=0;i<spielfeld[i].length;i++){
		for(j=0;j<spielfeld[j].length;j++)
		System.out.print(spielfeld[h][i][j]+" ");
	System.out.println();
}}
}
	
	public static int[] einserProSpielfeld(int[][][] spielfeld){
	int h,i,j,m;
	m=0;
	int[] liste;
	liste= new int[20];
	for(h=0;h<spielfeld.length;h++){
	for(i=0;i<spielfeld[i].length;i++){
		for(j=0;j<spielfeld[j].length;j++)
			if(spielfeld[h][i][j]==1)
			{m=m+1;}}
	liste[h]=m;
	}
		return liste;	
	}
			
	public static void schreibenStrichliste(int[] strichliste){
		
		int i;
		for(i=0;i<strichliste.length;i++){
			System.out.print(strichliste[i]+" ");
			}
		}
	
	public static int woMeistenEinser(int[] strichliste){
	
	int i,m,g;
	g=0;
	for(i=0;i<strichliste.length;i++){
		m=strichliste[i];
		if(m>g){g=m;}
		}
	return g;
	}
}
