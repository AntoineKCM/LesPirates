package jeu;

import affichage.Affichage;
import java.security.SecureRandom;
import java.util.Random;

public class De {

    private Affichage affichage = new Affichage();
    private Random random = new SecureRandom();

    public int lancerDes() {

        int resultat = random.nextInt(6) + 1 + random.nextInt(6) + 1;
        affichage.afficherResultatDes(resultat);

        return resultat;
    }
}