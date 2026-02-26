package jeu;
import cases.Case ;
import personnages.Gaulois;
import personnages.Personnage;
public class Jeu {
	private int nbJoueurs = 2 ;
	private int nbCases = 2 ;
	private int nbDes = 2 ;
	private Joueur[] joueurs=new Joueur[2] ;
	private Case[] cases =new Case [30];
}

public void deplacerJoueur(Joueur joueur) {

}
public boolean verifierFinPartie(Joueur joueur) {

}

public void lancerJeu() {
	Joueur joueur1 = new Joueur("Ronaldo",Couleur.BLEU);
	Joueur joueur2 = new Joueur("messi",Couleur.ROUGE);
}

		