package cases;

import jeu.Joueur;

public abstract class Case {

    private int numeroCase;

    public Case(int numeroCase) {
        this.numeroCase = numeroCase;
    }

    public int getNumeroCase() {
        return numeroCase;
    }

    public abstract void declencherAction(Joueur joueur1, Joueur joueur2);
}