package Teilen;

public class Teilbarkeit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Eine dreistellige Zahl, die durch drei teilbar ist, ist zum Beispiel");
		System.out.println(zahl(findeZahl()));
	}
	
	public static int[] findeZahl() {
		int[] res;
		
		res=null;
		
		while (res==null)
		{
			int zufall = (int) (Math.random());
		}
		return res;
	}
	
	public static String zahl(int[] z) {
		String res;
		int i;
		
		res="";
		for (i=0;i<3;i++)
			res=z[i] +res;
			return res;
		}
	}


