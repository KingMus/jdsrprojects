package Rechteck;

class rechtecke{
	int laenge,breite;
	
	int flaecheninhalt(){
		int i;
		i=breite * laenge;
		return i;
	}
	int umfang(){
		int i;
		i=breite + laenge + breite + laenge;
		return i;
	}
}


public class Rechteck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rechtecke rechteck1,rechteck2;
		rechteck1=new rechtecke();
		rechteck2=new rechtecke();
		
		rechteck1.laenge=12;
		rechteck1.breite=8;
		rechteck2.laenge=34;
		rechteck2.breite=27;
		
		System.out.println("Das erste Rechteck hat eine Breite von "+rechteck1.breite+" cm");
		System.out.println("und eine Länge von "+rechteck1.laenge+" cm.");
		System.out.println("Der Flächeninhalt des ersten Rechteckes beträgt: "+rechteck1.flaecheninhalt()+" cm");
		System.out.println("Der Umfang des ersten Rechteckes beträgt: "+rechteck1.umfang()+" cm");
		System.out.println();
		System.out.println();
		System.out.println("Das zweite Rechteck hat eine Breite von "+rechteck2.breite+" cm");
		System.out.println("und eine Länge von "+rechteck2.laenge+" cm.");
		System.out.println("Der Flächeninhalt des zweiten Rechteckes beträgt: "+rechteck2.flaecheninhalt()+" cm");
		System.out.println("Der Umfang des zweiten Rechteckes beträgt: "+rechteck2.umfang()+" cm");
		
	}

}
