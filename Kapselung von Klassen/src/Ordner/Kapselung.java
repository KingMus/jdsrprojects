package Ordner;

class Rechteck{
	private int laenge,breite;
	
	public int flaecheninhalt(){
		return this.laenge*this.breite;
	}
	public int umfang(){
		return 2*(this.breite+this.laenge);
	}
	public void setbreite(int br){
		this.breite=br;
	}
	public int getbreite(){
		return this.breite;
	}
	public void setlaenge(int lae){
		this.laenge=lae;
	}
	public int getlaenge(){
		return this.laenge;
	}
}

public class Kapselung {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Rechteck r1;
	r1=new Rechteck();
	
	System.out.println("Zuerst den gewünschten Wert in -setbreite- eingeben, dann mit -getbreite- umwandeln.");
	r1.setbreite((int)(99*Math.random()));
	System.out.println("Die Breite ist " + r1.getbreite()+" cm");
	System.out.println();
	System.out.println("Zuerst den gewünschten Wert in -setlaenge- eingeben, dann mit -getlaenge- umwandeln.");
	r1.setlaenge((int)(99*Math.random()));
	System.out.println("Die Länge ist " + r1.getlaenge()+ " cm");
	System.out.println();
	System.out.println("Dann mit den Programmen -flaecheninhalt- und -umfang- ausrechnen.");
	System.out.println("Der Umfang beträgt: "+r1.umfang()+" cm");
	System.out.println("Der Flächeninhalt beträgt: "+r1.flaecheninhalt()+" cm");
	
	
	
}}