package jeu;

public enum Couleur {

    BLEU("BLEU"),
    ROUGE("ROUGE");

    private String typeCouleur;

    Couleur(String typeCouleur) {
        this.typeCouleur = typeCouleur;
    }

    public String getTypeCouleur() {
        return typeCouleur;
    }
}