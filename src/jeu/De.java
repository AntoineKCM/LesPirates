package jeu;

import affichage.IAffichage;
import java.security.SecureRandom;
import java.util.Random;

public class De {

    private IAffichage affichage;
    private Random random = new SecureRandom();

    public De(IAffichage affichage) {
        this.affichage = affichage;
    }

    public int lancerDes() {
        int resultat = random.nextInt(6) + 1 + random.nextInt(6) + 1;
        affichage.afficherResultatDes(resultat);
        return resultat;
    }
}