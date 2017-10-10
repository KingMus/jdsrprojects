package Ordner;

public class sortieren {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] feld={6,2,8,5,10,9,12,1,15,7,3,13,4,11,16,14};
		System.out.println("SORTIER-ALGORYTHMUS VON EINEM FELD");
		System.out.println();
		System.out.println("   Davor:");
		schreibe(feld);
		sortiere(feld,0,feld.length-1);
		System.out.println("   Danach:");
		schreibe(feld);
	}
	public static int partition(int[] feld,int links, int rechts){
		int pivot=feld[links];
		int L=links,R=rechts;
		int trennindex;
		
		while(L<R){
			while((feld[L]<=pivot) & (L<=rechts)) L=L+1;		
			while((feld[R]>pivot) & (R>=links)) R=R-1;
			if(L<R) tausche(feld,L,R);
			}
		trennindex=R;
		tausche(feld,links,trennindex);
		return trennindex;
	}
	public static void tausche(int[]feld, int a, int b){
		int hilfe=feld[a];
		feld[a]=feld[b];
		feld[b]=hilfe;	
	}	
	public static void schreibe(int[] feld){
		int i,j=feld.length;
		System.out.print("   ");
		for(i=0;i<j;i++){System.out.print(feld[i]+"|");}
		System.out.println();
	}
	public static void sortiere(int[] feld,int links, int rechts){
		int trennindex;
		if(links<rechts){
			trennindex=partition(feld,links,rechts);
			sortiere(feld,links,trennindex-1);
			sortiere(feld,trennindex+1,rechts);}}	

}