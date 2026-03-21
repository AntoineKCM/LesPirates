package affichage;

public interface IAffichage {


    public void afficherTourJoueur(String nom, String couleurPion, int position, int vie);
    
    public void afficherCaseNormale(int caseNormale,String nom) ;
    
    public void afficherCaseRouletteRusse(int caseRouletteRusse, String nom) ;
    
    public void afficherCaseVolVie(int vie, String nom1, String nom2) ;


    public void afficherDeplacement(String nom, int resultat, int position);


    public void afficherResultatDes(int resultatDes) ;

    public void afficherTour(int nubTour);
    
    public void afficherFinTour(int nbTour);
    
    public void afficherFinPartie(String nomGagnant);
    
	public void passerTour(String nomJoueur, int nbTour,boolean finPartie);
    }