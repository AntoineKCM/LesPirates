package jeu;
import cases.Case ;
import cases.CaseNormale;
import cases.CaseRouletteRusse;
import cases.CaseVolVie;
import jeu.Plateau;
public class Jeu {
	private int nbJoueurs = 2 ;
	private int nbCases = 2 ;
	private int nbDes = 2 ;
	private Joueur[] joueurs=new Joueur[2] ;
	private Case[] cases =new Case [30];
	

public boolean verifierFinPartie(Joueur joueur) {

}

public void lancerJeu() {
	CaseNormale caseNormale = new CaseNormale(0);
	CaseRouletteRusse caseRouletteRusse = new CaseRouletteRusse(0); 
	CaseVolVie caseVolVie = new CaseVolVie(0);
	int nbtour = 0;
	int resultatDes = 0 ; 
	Joueur joueurQuiJoue;
	Joueur joueurContre;
}

public void deplacerJoueur(Joueur joueur, int resultatDes, Plateau plateau) {

    int positionActuelle = joueur.getPositionPlateau();
    int nouvellePosition = positionActuelle + resultatDes;

    int caseFin = plateau.getNbCases();

    if (nouvellePosition > caseFin) {
        int depassement = nouvellePosition - caseFin;
        nouvellePosition = caseFin - depassement;
    }

    joueur.setPositionPlateau(nouvellePosition);
	}
}
