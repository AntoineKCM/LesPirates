package cases;

import affichage.Affichage;

import jeu.Joueur;

public class CaseVolVie extends Case {
	
    private Affichage affichage = new Affichage();
    
	public CaseVolVie(int numeroCase) {
		super(numeroCase);
	}

	@Override
	public void declencherAction(Joueur joueurQuiJoue, Joueur joueurContre) {
		
		joueurQuiJoue.ajouterVie(1);
		joueurContre.ajouterVie(-1);
		affichage.afficherCaseVolVie(joueurContre.getVie(), joueurQuiJoue.getNom(), joueurContre.getNom());
	}

}