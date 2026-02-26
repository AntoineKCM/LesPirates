package affichage;

public class Affichage implements IAffichage {

    @Override
    public void afficherJeu(String message) {
    	System.out.println(message);
    }

    @Override
    public void afficherJoueur(String message) {
    	System.out.println(message);
    }

    @Override
    public void afficherCase(String message) {
    	System.out.println(message);
    }

    @Override
    public void afficherResultatDe(String message) {
        System.out.println(message);
    }

    @Override
    public void afficherFinPartie(String message) {
    	System.out.println(message);
    }
}