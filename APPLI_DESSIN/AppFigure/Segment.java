import java.awt.Graphics;

public class Segment extends Figure {
	public Point P1;
	public Point P2;
	public Segment(Point P1, Point P2) {
		this.P1 = P1;
	    this.P2 = P2;
	}
	public void afficher(){
		System.out.println("("+P1.x+","+P1.y+"),("+P2.x+","+P2.y+")");
	}
	public void translater(double dx, double dy) {
		P1.x += dx;
		P1.y += dy;
		P2.x += dx;
		P2.y += dy;
	}
	public Point getCentre() {
		return getMilieu();
	}
	public double getLongueur() {
		return this.P1.distance(this.P2);
	}
	public Point getMilieu() {
		Point P = new Point((P1.x + P2.x)/2, (P1.y + P2.y)/2);
		return P;
	}
	public double distance(Segment S) {
		return Math.sqrt(Math.pow(P1.x - P2.x , 2) + Math.pow(P2.y-P2.y , 2));
	}
	public boolean equals(Segment ob) {
		return ob.P1 == this.P1 && ob.P2 == this.P2 || ob.P2 == this.P1 && ob.P1 == this.P2;
	}
	public String tostring(){
		return nom+','+P1.tostring()+P2.tostring();
	}
	public void paint(Graphics g) {
		g.drawLine((int)P1.x, (int)P1.y, (int)P2.x, (int)P2.y);
	}
}
