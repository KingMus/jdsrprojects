package aufgabe7;

public class aufgabe7 {

	public static void main(String[] args) {
		double a, b, c, d, e;
		a = 1;
		b = 2;
		c = 3;
		d = 4;

		if (a > b && a > c && a > d) {
			e = a;
		}else
		if (b > c && b > d) {
			e = b;
		}else
		if (c > d) {
			e = c;
		}else
			e = d;

		System.out.println("e = " + e);

	}

}
