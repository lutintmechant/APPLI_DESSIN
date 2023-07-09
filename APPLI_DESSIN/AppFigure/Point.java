import java.awt.Graphics;

public class Point extends Figure{
      public double x;
      public double y;
      public Point(double x, double y) {
    	  this.x = x;
    	  this.y = y;
      }
      public Point(Point p) {
    	  this.x = p.x;
    	  this.y = p.y;

      }
      public void afficher(){
    	  System.out.println(x+","+y);
      }
	public void translater(double dx, double dy) {
		x += dx;
		y += dy;
	}
	public String tostring() {
		return nom+'('+x+','+y+')';
	}
	public Point getCentre() {
		return this;
	}
	public double distance(Point P) {
		return Math.sqrt(Math.pow(this.x - P.x , 2) + Math.pow(this.y-P.y , 2));
	}
	public boolean equals(Point ob) {
		return ob.x == this.x && ob.y == this.y;
	}
	
	public void paint(Graphics g) {
		int taille = 10;
		g.fillOval((int)x-taille/2, (int)y-taille/2, taille, taille);
	}
	public double distance(int x2, int y2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}