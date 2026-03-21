package jeu;

import affichage.IAffichage;
import cases.Case;
import cases.CaseNormale;
import cases.CaseRouletteRusse;
import cases.CaseVolVie;
import java.util.Scanner;

public class Jeu {

    private static final int NB_JOUEURS = 2;
    private static final int NB_CASES = 30;

    private IAffichage affichage;
    private De de;
    private Joueur joueur1;
    private Joueur joueur2;
    private Joueur[] joueurs;
    private Plateau plateau;
    private Case[] cases = new Case[NB_CASES];

    public Jeu(IAffichage affichage) {
        this.affichage = affichage;
        this.de = new De(affichage);
    }

    public void lancerJeu() {
        initialiserJeu();
        jouerJeu();
    }

    private void initialiserJeu() {
        joueur1 = new Joueur("Pessi", Couleur.ROUGE);
        joueur2 = new Joueur("Penaldo", Couleur.BLEU);
        joueurs = new Joueur[]{joueur1, joueur2};

        Integer[] posCaseRouletteRusse = {5, 10, 20, 25, 27};
        Integer[] posCaseVolVie = {3, 9, 18, 21, 29};

        plateau = new Plateau(posCaseRouletteRusse, posCaseVolVie);
        initialiserCases();
    }

    private void jouerJeu() {
        Scanner clavier = new Scanner(System.in);
        int nbTour = 1;
        boolean finPartie = false;

        do {
            affichage.afficherTour(nbTour);

            Joueur joueurQuiJoue = joueurs[nbTour % NB_JOUEURS];
            Joueur joueurContre = joueurs[(nbTour + 1) % NB_JOUEURS];

            affichage.afficherTourJoueur(
                joueurQuiJoue.getNom(),
                joueurQuiJoue.getCouleurPion(),
                joueurQuiJoue.getPositionPlateau(),
                joueurQuiJoue.getVie()
            );

            int resultatDes = de.lancerDes();
            deplacerJoueur(joueurQuiJoue, resultatDes);

            cases[joueurQuiJoue.getPositionPlateau() - 1].declencherAction(joueurQuiJoue, joueurContre);

            nbTour++;
            finPartie = verifierFinPartie(joueurQuiJoue, joueurContre);
            affichage.passerTour(joueurQuiJoue.getNom(), nbTour, finPartie);

        } while (!finPartie);

        clavier.close();
    }

    private boolean verifierFinPartie(Joueur joueurQuiJoue, Joueur joueurContre) {
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

    private void deplacerJoueur(Joueur joueur, int resultatDes) {
        int nouvellePosition = joueur.getPositionPlateau() + resultatDes;
        int dernierCase = plateau.getNbCases();

        if (nouvellePosition > dernierCase) {
            nouvellePosition = dernierCase - (nouvellePosition - dernierCase);
        }

        joueur.setPositionPlateau(nouvellePosition);
        affichage.afficherDeplacement(joueur.getNom(), resultatDes, joueur.getPositionPlateau());
    }

    private void initialiserCases() {
        for (int i = 0; i < NB_CASES; i++) {
            cases[i] = new CaseNormale(i + 1);
        }
        for (Integer pos : plateau.getPositionCaseRouletteRusse()) {
            cases[pos - 1] = new CaseRouletteRusse(pos, affichage);
        }
        for (Integer pos : plateau.getPositionCaseVolVie()) {
            cases[pos - 1] = new CaseVolVie(pos, affichage);
        }
    }
}