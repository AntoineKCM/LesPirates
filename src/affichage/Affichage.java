package affichage;

import jeu.Joueur;
import cases.Case;
import cases.CaseNormale;
import cases.CaseVolVie;
import cases.CaseRouletteRusse;

public class Affichage implements IAffichage {

    @Override
    public void afficherJeu(String message) {
        System.out.println(message);
    }

    @Override
    public void afficherTourJoueur(Joueur joueur) {
        System.out.println(joueur.getNom()+"  à toi de jouer ! " ) ;
    }

    @Override
    public void afficherCase(String message) {
        System.out.println(message);
    }

    @Override
    public void afficherFinPartie(String message) {
        System.out.println(message);
    }
    @Override
    public void afficherNom(Joueur joueur) {
        System.out.println("Le joueur s'appelle : " + joueur.getNom() +
                           " (Couleur du pion : " + joueur.getCouleurPion() + ")");
    }
    @Override
    public void afficherDeplacement(Joueur joueur, int resultat) {
        System.out.println(joueur.getNom() + " avance de " + resultat + " cases et se retrouve à la case " 
                           + joueur.getPositionPlateau());
    }
    @Override
    public void afficherVie(Joueur joueur) {
        System.out.println(joueur.getNom() + " a " + joueur.getVie() + " points de vie.");
    }
    @Override
    public void afficherCase(Case c) {
        String typeCase;
        if (c instanceof CaseVolVie) typeCase = "Case Vol-Vie";
        else if (c instanceof CaseRouletteRusse) typeCase = "Case Roulette-Russe";
        else typeCase = "Case Normale";

        System.out.println("Case numéro " + c.getNumeroCase() + " : " + typeCase);
    }
    @Override
    public void afficherResultatDes(int resultatDes) {
        System.out.println("Résultat du lancé : "+ resultatDes);
    }
    @Override
    public void afficherTour(int numTour, Joueur joueur) {
        System.out.println("===== Tour " + numTour + " : " + joueur.getNom() + " =====");
    }
    @Override
    public void afficherActionCase(Case c, Joueur joueurQuiJoue, Joueur joueurContre) {
        if (c instanceof CaseVolVie) {
            System.out.println(joueurQuiJoue.getNom() + " tombe sur une case Vol-Vie et vole 1 point de  vie à " 
                               + joueurContre.getNom());
        } else if (c instanceof CaseRouletteRusse) {
            System.out.println(joueurQuiJoue.getNom() + " tombe sur une case Roulette-Russe, prudence !");
        } else if (c instanceof CaseNormale) {
            System.out.println(joueurQuiJoue.getNom() + " tombe sur une case Normale, repos tranquille.");
        }
    }
    @Override
    public void afficherFinPartie(Joueur gagnant) {
        if (gagnant != null) {
            System.out.println("La partie est terminée ! Le gagnant est : " + gagnant.getNom());
        } else {
            System.out.println("La partie est terminée ! Aucun gagnant clair (un joueur est mort).");
        }
    }
}