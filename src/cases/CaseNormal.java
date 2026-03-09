package cases;

import jeu.Joueur;

public class CaseNormale extends Case {
	
	public CaseNormale(int numeroCase) {
		super(numeroCase);
	}
	
	@Override
	public void declencherAction(Joueur joueurActuel, Joueur joueurAdversaire) {
		System.out.println("AMERISSAGE TRANQUILLE,case normale ,repose toi"); // à remplacer avec Affichage
	}

}