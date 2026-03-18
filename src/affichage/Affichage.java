package affichage;

public class Affichage implements IAffichage {

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
    	
        System.out.println(nom + " tombe sur une case Roulette-Russe,le hasard a frappé et il  débarque à la case "+caseRouletteRusse);
    }
    
    @Override
    public void afficherCaseVolVie(int vie, String nom1, String nom2) {
    	
        System.out.println(nom1 + " tombe sur une case Vol-Vie et vole 1 point de  vie à " 
                +nom2+" ce dernier ne possède plus que  "+vie+" point de vie ");
    }

    @Override
    public void afficherDeplacement(String nom, int resultat, int position) {
    	
        System.out.println(nom + " avance de " + resultat + " cases et se retrouve à la case " + position);
    }

    @Override
    public void afficherResultatDes(int resultatDes) {
    	
        System.out.println(" Résultat du lancé : "+ resultatDes);
    }
    
    @Override
    public void afficherTour(int numTour) {
    	
    	numTour++ ;
        System.out.println("\n ===== Tour " + numTour + " =====");
    }
    

    @Override
    public void afficherFinPartie( String nomGagnant) {
    	
            System.out.println("La partie est terminée ! Le gagnant est : " + nomGagnant);
        } 
    }