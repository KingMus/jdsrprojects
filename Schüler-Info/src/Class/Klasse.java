package Class;

class Schueler{
	String name;
	int anzahlFaecher, alter;
	boolean brille;
}

public class Klasse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Schueler schueler1;
		schueler1=new Schueler();
		
		schueler1.name="Marco";
		schueler1.alter=15;
		schueler1.anzahlFaecher=13;
		schueler1.brille=false;
		
		
		System.out.println("Der Schüler "+schueler1.name+" hat");
		System.out.println("insgesamt "+schueler1.anzahlFaecher+" verschiedene Fächer an seine Schule.");
	}

}
