import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Editeur extends JPanel implements MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String typeFigure = "Point";
	ArrayList<Figure> liste = new ArrayList<Figure>();
	Point tempPoint = null;
	private Point pointInitial;
	
//	private String typeFigure = "Segment"; // par défaut, on dessine des points

    public void setTypeFigure(String type) {
        Editeur.typeFigure = type;
    }
	      	
	public void paint(Graphics g) {
		super.paint(g);
		for(Figure f : liste) {
			f.paint(g);
			if (f instanceof Segment) {
	            Segment s = (Segment) f;
	            s.P1.paint(g);
	            s.P2.paint(g);
	        }
			if (f instanceof Cercle) {
	            Cercle c = (Cercle) f;
	            c.Centre.paint(g);
	        }
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (typeFigure.equals("Point")) {
			int x = arg0.getX();
			int y = arg0.getY();
			Point p = new Point(x,y);
			liste.add(p);
			repaint();
		}
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (typeFigure.equals("Segment")) {
			tempPoint = new Point(e.getX(), e.getY());
		}
		
		// Stocker le point initial
		if (typeFigure.equals("Cercle")) {
			pointInitial = new Point(e.getX(), e.getY());
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if (typeFigure.equals("Segment")) {
			if(tempPoint != null) {
				Point p2 = new Point(e.getX(), e.getY());
				Segment s = new Segment(tempPoint, p2);
				liste.add(s);
				tempPoint = null;
				repaint();
			}
		}
			
		if (typeFigure.equals("Cercle")) {
			// Calculer le rayon du cercle
			double rayon = pointInitial.distance(new Point(e.getX(), e.getY()));
	
			// Créer un objet Cercle avec le point initial comme centre et le rayon calculé
			Cercle cercle = new Cercle(pointInitial, rayon);
	
			// Ajouter l'objet Cercle à la liste de figures
			liste.add(cercle);
	
			// Redessiner la zone de dessin
			repaint();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
