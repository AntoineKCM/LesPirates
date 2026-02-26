package jeu;

import affichage.Affichage;
import java.security.SecureRandom;
import java.util.Random;

public class De {

    private Affichage affichage = new Affichage();
    private Random random = new SecureRandom();

    public int lancerDes() {
        int resultatde1 = random.nextInt(6) + 1;
        int resultatde2 = random.nextInt(6) + 1;
        int resultat = resultatde1 + resultatde2;

        affichage.afficherResultatDe(
            "Résultat du lancé : dé 1 : " + resultatde1 +
            "   dé 2 : " + resultatde2 +
            "   TOTAL : " + resultat
        );

        return resultat;
    }
}