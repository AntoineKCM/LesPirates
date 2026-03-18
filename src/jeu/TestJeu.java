package jeu;


public class TestJeu {

    public static void main(String[] args) {

        Joueur joueur1 = new Joueur("Pessi", Couleur.ROUGE);
        Joueur joueur2 = new Joueur("Penaldo", Couleur.BLEU);

        Integer[] posCaseRouletteRusse = {5, 10, 20, 25, 27};
        Integer[] posCaseVolVie = {3, 9, 18, 21, 29};

        Plateau plateau = new Plateau(posCaseRouletteRusse, posCaseVolVie);

        Jeu jeu = new Jeu();

        jeu.getJoueurs()[0] = joueur1;
        jeu.getJoueurs()[1] = joueur2;

        jeu.lancerJeu(plateau);
    }
}