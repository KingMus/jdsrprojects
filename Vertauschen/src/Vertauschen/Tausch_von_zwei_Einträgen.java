package Vertauschen;

public class Tausch_von_zwei_Einträgen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int[] feld={1,2,3,4,6,5,7,8,9,10};
		schreiben(feld);
		tausch(feld,11,12);
		schreiben(feld);
		tausch(feld,4,5);
		schreiben(feld);
		}

	public static void tausch(int[] a, int i, int j){
		int g;
		if (i<11||j<11){
			g=a[j];
			a[j]=a[i];
			a[i]=g;
			System.out.println("Tauschvorgang abgeschlossen!");
		}
		else System.out.println("Fehler");
		System.out.println();
	}
	
	public static void schreiben (int[] a) {
		int i;
		System.out.println("Das Feld:");
		for (i=0;i<a.length;i++) System.out.println(a[i]+" ");
		System.out.println("");
	}
}
