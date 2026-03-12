package cases;

import jeu.Joueur;

public class CaseVolVie extends Case {
	
	public CaseVolVie(int numeroCase) {
		super(numeroCase);
	}
	
	@Override
	public void declencherAction(Joueur joueurQuiJoue, Joueur joueurContre) {
		joueurQuiJoue.ajouterVie(1);
		joueurContre.ajouterVie(-1);
	}

}