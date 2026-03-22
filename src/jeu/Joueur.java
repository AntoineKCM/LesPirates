package jeu;

public class Joueur {

    private String nom;
    private int vie = 5;
    private int positionPlateau = 1;
    private Couleur couleurPion;

    public Joueur(String nom, Couleur couleurPion) {
        this.nom = nom;
        this.couleurPion = couleurPion;
    }

    public boolean estVivant() {
        return vie > 0;
    }

    public void ajouterVie(int valeur) {
        vie += valeur;
    }

    public int getVie() {
        return vie;
    }

    public int getPositionPlateau() {
        return positionPlateau;
    }

    public String getNom() {
        return nom;
    }

    public String getCouleurPion() {
        return couleurPion.getTypeCouleur();
    }

    public void setPositionPlateau(int nouvellePositionPlateau) {
        positionPlateau = nouvellePositionPlateau;
    }
}