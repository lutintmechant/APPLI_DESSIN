import java.awt.Graphics;

public  abstract class Figure {
	public String nom;
	//public abstract void translater();
	public void afficher(){
		System.out.println(toString());
	}
	
	public abstract void paint(Graphics g);
}