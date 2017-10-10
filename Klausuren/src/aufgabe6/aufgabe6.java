package aufgabe6;

public class aufgabe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		point p = new point(0,0);
		point q = new point(0,1);
		point r = new point(1,0);
		
		triangle t = new triangle(p,q,r);
		
		System.out.println(t.toString());
		System.out.println(t.getUmfang());
		t.turn(90);
		System.out.println(t.toString());
		System.out.println(t.getUmfang());
		
	}

}
