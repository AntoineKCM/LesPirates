package affichage;

import cases.Case;
import cases.CaseNormale;
import cases.CaseRouletteRusse;
import cases.CaseVolVie;
import jeu.Joueur;

public interface IAffichage {

	public void afficherJeu(String message) ;

    
    public void afficherTourJoueur(Joueur joueur);
    

    public void afficherCase(String message) ;


    public void afficherFinPartie(String message);

    public void afficherNom(Joueur joueur) ;

    public void afficherDeplacement(Joueur joueur, int resultat) ;

    public void afficherVie(Joueur joueur);

    public void afficherCase(Case c);

    public void afficherResultatDes(int resultatDes) ;

    public void afficherTour(int numTour, Joueur joueur) ;
    
    public void afficherActionCase(Case c, Joueur joueurQuiJoue, Joueur joueurContre) ;

    public void afficherFinPartie(Joueur gagnant);
    }