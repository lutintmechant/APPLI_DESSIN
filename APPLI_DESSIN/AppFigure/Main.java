import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main{
    public static void main(String[] args){
        JFrame fen = new JFrame();
        fen.setSize(800, 600);
        fen.setTitle("Ma fenetre");
        fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         //Obtention du conteneur de la fenêtre
        Container contenu = fen.getContentPane();

        //Création et configuration d'un panneau Editeur (à gauche)
        Editeur p1= new Editeur();
        p1.addMouseListener(p1);
        p1.setBackground(Color.CYAN);
        contenu.add(p1,BorderLayout.WEST);
        p1.setPreferredSize(new Dimension(250, 0));
        p1.setLayout(new FlowLayout());

        //Ajout des boutons pour chaque type de figure à dessiner (Point, Segment, Cercle)
        JButton btPoint = new JButton("Point");
        btPoint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	p1.setTypeFigure(Editeur.typeFigure = "Point");
            }
        });
        p1.add(btPoint);
        
        JButton btSegment = new JButton("Segment");
        btSegment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	p1.setTypeFigure(Editeur.typeFigure = "Segment");
            }
        });
        p1.add(btSegment);
        
        JButton btCercle = new JButton("Cercle");
        btCercle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	p1.setTypeFigure(Editeur.typeFigure = "Cercle");
            }
        });
        p1.add(btCercle);
    	
        //Configuration des dimensions des boutons
        btPoint.setPreferredSize(new Dimension(230,45));
        btSegment.setPreferredSize(new Dimension(230,45));
        btCercle.setPreferredSize(new Dimension(230,45));
        //Création et configuration d'un deuxième panneau Editeur (au centre)
        Editeur p2 = new Editeur();
        p2.addMouseListener(p2);
        
        contenu.add(p2, BorderLayout.CENTER);

        //Affichage de la fenêtre
        fen.setVisible(true);
    }
}