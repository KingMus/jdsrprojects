package Felder;

public class Vergleich_von_Feldern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int[] feld1={1,2,3,4,5};
			int[] feld2={1,2,3,4};
			int[] feld3={1,2,3,4,6};
			int[] feld4={-1,2,3,4,5};
			int[] feld5={1,2,3,4,5};
			
			if (vergleich(feld1, feld2)) System.out.println("Feld 1 und Feld 2 sind gleich");
			if (vergleich(feld1, feld3)) System.out.println("Feld 1 und Feld 3 sind gleich");
			if (vergleich(feld1, feld4)) System.out.println("Feld 1 und Feld 4 sind gleich");
			if (vergleich(feld1, feld5)) System.out.println("Feld 1 und Feld 5 sind gleich");
	}

	
	public static boolean vergleich(int[] x,int[] y){
		int i;
		if (!(x.length == y.length)){ return false;}
		else {
			
			for (i=0;i<5;i++)
			      if (x[i]!=y[i])
			        return false;
			    return true;
			
		}
		      
	}
	
}
