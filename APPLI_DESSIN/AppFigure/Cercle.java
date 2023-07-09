import java.awt.Graphics;

public class Cercle extends Figure {
    public double Rayon;
    public Point Centre;
    
    // Constructeur
    public Cercle(Point Centre, double Rayon) {
        this.Centre = Centre;
        this.Rayon = Rayon;
    }
    
    // Méthode pour afficher les coordonnées du cercle
    public void afficher(){
        System.out.println(Centre.x+","+Centre.y);
        System.out.println(Rayon);
    }
    
    // Méthode pour translater le cercle de dx et dy
    public void translater(double dx, double dy) {
        Centre.x += dx;
        Centre.y += dy;
    }
    
    // Méthode pour obtenir le centre du cercle
    public Point getCentre() {
        return this.Centre;
    }
    
    // Méthode pour obtenir la longueur du cercle
    public double getLongueur() {
        return  Rayon * 2 * Math.PI;
    }
    
    // Méthode pour obtenir le milieu du cercle
    public Point getMilieu() {
        return this.Centre;
    }
    
    // Méthode pour obtenir une chaîne de caractères représentant le cercle
    public String tostring(){
        return nom + '(' + Centre.tostring() + ',' + this.Rayon + ')';
    }
    
    // Méthode pour comparer si deux cercles sont égaux
    public boolean equals(Cercle ob) {
        return this.Rayon == ob.Rayon;
    }
    
    // Méthode pour dessiner le cercle
    public void paint(Graphics g) {
        g.drawOval((int)Centre.x - (int)Rayon, (int)Centre.y - (int)Rayon, (int)Rayon * 2, (int)Rayon * 2);
    }
}
