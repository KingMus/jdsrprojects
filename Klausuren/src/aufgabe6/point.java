package aufgabe6;

public class point {

	private double x;
	private double y;

	public point(double x, double y) {
	this.x = x;
	this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void turn(double phi) {
		// dreht das aufrufende Objekt um den Winkel phi
		double xAlt = x;
		x = xAlt * Math.cos(phi) - y * Math.sin(phi);
		y = xAlt * Math.sin(phi) + y * Math.cos(phi);
	}

	public static double distance(point p, point q) {
		// liefert den Abstand zwischen p und q
		double xdiff = p.getX() - q.getX();
		double ydiff = p.getY() - q.getY();
		return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
	}

	public String toString() {
		// liefert die String-Darstellung des aufrufenden Objekts
		return "(" + x + "," + y + ")";
	}

}
