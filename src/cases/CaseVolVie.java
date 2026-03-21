package cases;

import affichage.IAffichage;
import jeu.Joueur;

public class CaseVolVie extends Case {
	
    private IAffichage affichage;
    
	public CaseVolVie(int numeroCase,IAffichage affichage) {
		super(numeroCase);
        this.affichage = affichage;
	}

	@Override
	public void declencherAction(Joueur joueurQuiJoue, Joueur joueurContre) {
		
		joueurQuiJoue.ajouterVie(1);
		joueurContre.ajouterVie(-1);
		affichage.afficherCaseVolVie(joueurContre.getVie(), joueurQuiJoue.getNom(), joueurContre.getNom());
	}

}