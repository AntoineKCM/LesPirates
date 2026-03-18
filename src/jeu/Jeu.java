package jeu;
import cases.Case ;
import cases.CaseNormale;
import cases.CaseRouletteRusse;
import cases.CaseVolVie;
import jeu.Plateau;
import affichage.Affichage;
public class Jeu {
	private int nbJoueurs = 2 ;
	private int nbCases = 30 ;
	private Joueur[] joueurs=new Joueur[2] ;
	private Case[] cases =new Case [30];
	public Joueur[] getJoueurs() {
	    return joueurs;
	}

	public boolean verifierFinPartie(Plateau plateau,Joueur joueurQuiJoue, Joueur joueurContre) {
		Affichage affichage = new Affichage();


	        if (joueurQuiJoue.getPositionPlateau() == plateau.getNbCases()) {
	        	affichage.afficherFinPartie(joueurQuiJoue.getNom());
	            return true;
	        }

	        if (!joueurContre.estVivant()) {
	        	affichage.afficherFinPartie(joueurQuiJoue.getNom());
	            return true;
	        }
	        return false;
	    }

	public void lancerJeu(Plateau plateau) {
		Affichage affichage = new Affichage();
		initialiserCases(plateau);
	    De de = new De();

	    int nbTour = 0;
	    boolean finPartie = false;

	    while (!finPartie) {
	    	affichage.afficherTour(nbTour);

	        Joueur joueurQuiJoue = joueurs[nbTour % nbJoueurs];


	        Joueur joueurContre = joueurs[(nbTour + 1) % nbJoueurs];

	        affichage.afficherTourJoueur(joueurQuiJoue.getNom(), joueurQuiJoue.getCouleurPion(),joueurQuiJoue.getPositionPlateau(), joueurQuiJoue.getVie());

	        int resultatDes = de.lancerDes();

	        deplacerJoueur(joueurQuiJoue, resultatDes, plateau,affichage);


	        Case caseTombee = cases[joueurQuiJoue.getPositionPlateau() - 1];

	        caseTombee.declencherAction(joueurQuiJoue, joueurContre);

	        finPartie = verifierFinPartie(plateau,joueurQuiJoue,joueurContre);

	        nbTour++;
	    }

	}

public void deplacerJoueur(Joueur joueur, int resultatDes, Plateau plateau, Affichage affichage) {

    int positionActuelle = joueur.getPositionPlateau();
    int nouvellePosition = positionActuelle + resultatDes;

    int caseFin = plateau.getNbCases();

    if (nouvellePosition > caseFin) {
        int depassement = nouvellePosition - caseFin;
        nouvellePosition = caseFin - depassement;
    }

    joueur.setPositionPlateau(nouvellePosition);
    affichage.afficherDeplacement(joueur.getNom(), resultatDes, joueur.getPositionPlateau());
	}
public void initialiserCases(Plateau plateau) {


    for (int i = 0; i < nbCases; i++) {
        cases[i] = new CaseNormale(i + 1);
    }

    for (Integer pos : plateau.getPositionCaseRouletteRusse()) {
        cases[pos - 1] = new CaseRouletteRusse(pos);
    }
    
    for (Integer pos : plateau.getPositionCaseVolVie()) {
        cases[pos - 1] = new CaseVolVie(pos);
    }
}
}

