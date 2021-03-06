package tp1;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;

public class Calculatrice {
	
	
	 // D?claration de tous les composants de la calculatrice.
	 JPanel contenuFen?tre;
	 JTextField champAffichage;
	 JButton bouton0;
	 JButton bouton1;
	 JButton bouton2;
	 JButton bouton3;
	 JButton bouton4;
	 JButton bouton5;
	 JButton bouton6;
	 JButton bouton7;
	 JButton bouton8;
	 JButton bouton9;
	 JButton bouton10;
	 JButton bouton11;
	 JButton bouton12;
	 JButton bouton13;
	 JButton bouton14;
	 JButton bouton15;
	 JButton boutonVirgule;
	 JButton boutonEgale;
	 JButton boutonE1;
	 JButton boutonE2;
	 JButton boutonT1;
	 JButton boutonT2;
	 JButton boutonT3;
	 JButton boutonT4;
	 JPanel panneauChiffres;
	 JPanel panneauChiffres1;
	 // Le constructeur cr?e les composants en m?moire
	 // et les ajoute au cadre en utilisant une combinaison
	 // de Borderlayout et Gridlayout
	 Calculatrice() {
	 contenuFen?tre = new JPanel();

	 // Affecte un gestionnaire de pr?sentation ? ce panneau
	 BorderLayout dispositionl = new BorderLayout();
	 contenuFen?tre.setLayout(dispositionl);
	 // Cr?e le champ d'affichage et le positionne dans
	 // la zone nord de la fen?tre
	 champAffichage = new JTextField(30);
	 contenuFen?tre.add("North", champAffichage);

	 // Cr?e les boutons en utilisant le constructeur de
	 // la classe JButton qui prend en param?tre le libell?
	 // du bouton
	 bouton0 = new JButton("0");
	 bouton1 = new JButton("1");
	 bouton2 = new JButton("2");
	 bouton3 = new JButton("3");
	 bouton4 = new JButton("4");
	 bouton5 = new JButton("5");
	 bouton6 = new JButton("6");
	 bouton7 = new JButton("7");
	 bouton8 = new JButton("8");
	 bouton9 = new JButton("9");
	 bouton10 = new JButton("MC");
	 bouton11 = new JButton("MR");
	 bouton12 = new JButton("MS");
	 bouton13 = new JButton("M+");
	 bouton14 = new JButton("+/-");
	 bouton15 = new JButton(".");
	 boutonVirgule = new JButton(",");
	 boutonEgale = new JButton("=");
	 boutonE1 = new JButton("/");
	 boutonE2= new JButton("*");
	 boutonT1= new JButton("RAC");
	 boutonT2= new JButton("%");
	 boutonT3= new JButton("1/x");
	 boutonT4= new JButton("+");
	// Cr?e le panneau avec le quadrillage qui contient
	 // les 12 boutons ? les 10 boutons num?riques et ceux
	 // repr?sentant la virgule et le signe ?gale
	 panneauChiffres = new JPanel();
	 GridLayout disposition2 = new GridLayout(4,6);
	 panneauChiffres.setLayout(disposition2);
	 
	 panneauChiffres1 = new JPanel();
	 GridBagLayout disposition3 = new GridBagLayout();
	 panneauChiffres1.setLayout(disposition3);
	 // Ajoute les contr?les au panneau panneauChiffres
	 
	 panneauChiffres1.add(bouton10);
	 panneauChiffres1.add(bouton11);
	 
	 
	 
	 panneauChiffres.add(bouton10);
	 panneauChiffres.add(bouton7);
	 panneauChiffres.add(bouton8);
	 panneauChiffres.add(bouton9);
	 panneauChiffres.add(boutonE1);
	 panneauChiffres.add(boutonT1);
	 panneauChiffres.add(bouton11);
	 panneauChiffres.add(bouton4);
	 panneauChiffres.add(bouton5);
	 panneauChiffres.add(bouton6);
	 panneauChiffres.add(boutonE2);
	 panneauChiffres.add(boutonT2);
	 panneauChiffres.add(bouton12);
	 panneauChiffres.add(bouton1);
	 panneauChiffres.add(bouton2);
	 panneauChiffres.add(bouton3);
	 panneauChiffres.add(bouton15);
	 panneauChiffres.add(boutonT3);
	 panneauChiffres.add(bouton13);
	 panneauChiffres.add(bouton0);
	 panneauChiffres.add(bouton14);
	 panneauChiffres.add(boutonVirgule);
	 panneauChiffres.add(boutonT4);
	 panneauChiffres.add(boutonEgale);
	 // Ajoute panneauChiffres ? la zone centrale de la
	 // fen?tre
	 contenuFen?tre.add("Center", panneauChiffres);
	 // Cr?e le cadre et lui affecte son contenu
	 JFrame frame = new JFrame("Calculatrice");
	 frame.setContentPane(contenuFen?tre);
	 // Affecte ? la fen?tre des dimensions suffisantes pour
	 // prendre en compte tous les contr?les
	 frame.pack();
	 // Enfin, affiche la fen?tre
	 frame.setVisible(true);
	 }
	 public static void main(String[] args) {
	 Calculatrice calc = new Calculatrice();
	 } 

}
