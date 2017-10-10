package Frage;

public class lalala {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean geschichte=true;
		int gesch;
		System.out.println("Bekommen wir Geschichte?");
		
		gesch=(int)(10*Math.random());
		if(gesch<5){geschichte=true;}
		if(gesch>5){geschichte=false;}
		
		if(geschichte==true){System.out.println("Ja");}
		if(geschichte==false){System.out.println("Nein");}
		
	}

}
