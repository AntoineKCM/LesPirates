package affichage;

import java.util.Scanner;

public class Affichage implements IAffichage { 	
	
	private Scanner clavier = new Scanner(System.in);

    @Override
    public void afficherTourJoueur(String nom, String couleurPion, int position, int vie) {
        System.out.println(" -------"+nom+ " (Couleur du pion : " + couleurPion +
        "  ; à toi de jouer ! ------- \n "+"case : " +position+" \n " + vie + " points de vie, "+" \n " +"à toi de jouer ! " ) ;
    }
    
    @Override
    public void afficherCaseNormale(int caseNormale,String nom) {
    	
        System.out.println(nom + " tombe sur une case Normale, repos tranquille.");
    }
    
    @Override
    public void afficherCaseRouletteRusse(int caseRouletteRusse,String nom) {
    	
        System.out.println(nom + " tombe sur une case Roulette-Russe,\nle hasard a frappé et il  débarque à la case "+caseRouletteRusse+ " ! ");
    }
    
    @Override
    public void afficherCaseVolVie(int vie, String nom1, String nom2) {
    	
        System.out.println(nom1 + " tombe sur une case Vol-Vie et vole 1 point de vie à " 
                +nom2+"\nCe dernier ne possède plus que "+vie+" point de vie, DANGER ! ");
    }

    @Override
    public void afficherDeplacement(String nom, int resultat, int position) {
    	
        System.out.println(nom + " avance de " + resultat + " cases et se retrouve à la case " + position + " .");
    }

    @Override
    public void afficherResultatDes(int resultatDes) {
    	
        System.out.println(" Résultat du lancé : "+ resultatDes);
    }
    
    @Override
    public void afficherTour(int nbTour) {
 
        System.out.println("\n ======== Tour " + nbTour + " ========");
    }
    
    @Override
    public void afficherFinTour(int nbTour) {

        System.out.println("appuyer sur Entrée pour Le tour "+ nbTour);
    }    

    @Override
    public void afficherFinPartie( String nomGagnant) {
    	
            System.out.println("La partie est terminée ! Le gagnant est : " + nomGagnant);
        } 
	
	@Override
	public void passerTour(String nomJoueur, int nbTour,boolean finPartie) {
		if (!finPartie) {
			System.out.println("\n Appuies sur Entrée pour commencer  le tour " + nbTour + " !");
			clavier.nextLine();
	    }

	}
    }