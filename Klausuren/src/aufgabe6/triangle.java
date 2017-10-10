package aufgabe6;

public class triangle {

	private point p;
	private point q;
	private point r;

	public triangle(point p, point q, point r) {

		this.p = p;
		this.q = q;
		this.r = r;

	}

	public String toString() {
			
		return p+"_"+q+"_"+r;

	}

	public double getUmfang() {
		
		return point.distance(p, q)+point.distance(p, r)+point.distance(q, r);
		
	}

	public void turn(double phi) {

		p.turn(phi);
		q.turn(phi);
		r.turn(phi);
		
		
	}
	
	

}
