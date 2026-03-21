package jeu;

import affichage.Affichage;

public class TestJeu {

    public static void main(String[] args) {
        Jeu jeu = new Jeu(new Affichage());
        jeu.lancerJeu();
    }
}