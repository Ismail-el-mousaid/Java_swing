package tp1;

import javax.swing.*;
import java.awt.FlowLayout;

public class CalculatriceSimple {
	public static void main(String[] args) {
		// crer un panneau
		JPanel contenuFenetre = new JPanel();
		
		FlowLayout disposition = new FlowLayout();
		contenuFenetre.setLayout(disposition);
		
		//crer les controles en memoire
		JLabel label1 = new JLabel("Nombre 1:");
		JTextField entree1 = new JTextField(10);
		JLabel label2 = new JLabel("Nombre 2:");
		JTextField entree2 = new JTextField(10);
		JLabel label3 = new JLabel("Somme:");
		JTextField resultat = new JTextField(10);
		JButton lancer = new JButton("Ajouter");
		
		//Ajouter les controles au panneau
		contenuFenetre.add(label1);
		contenuFenetre.add(entree1);
		contenuFenetre.add(label2);
		contenuFenetre.add(entree2);
		contenuFenetre.add(label3);
		contenuFenetre.add(resultat);
		contenuFenetre.add(lancer);
		
		//crer le cadre et y ajoute la panneau
		JFrame cadre = new JFrame("Ma premiere calculatrice");
		
		cadre.setContentPane(contenuFenetre);
		
		//Positionne les dimensions et rend les fenetres visible
		cadre.setSize(400,100);
		cadre.setVisible(true);


	}

}
