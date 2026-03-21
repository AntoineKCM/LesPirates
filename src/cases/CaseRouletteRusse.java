package cases;

import affichage.IAffichage;
import java.security.SecureRandom;
import java.util.Random;
import jeu.Joueur;

public class CaseRouletteRusse extends Case {
	
	private Random random;
    private IAffichage affichage;
    
    
	public CaseRouletteRusse(int numeroCase,IAffichage affichage) {
		
		super(numeroCase);
		this.affichage = affichage;
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void declencherAction(Joueur joueurQuiJoue, Joueur joueurContre) {
		
		joueurQuiJoue.setPositionPlateau(random.nextInt(30));
		affichage.afficherCaseRouletteRusse(joueurQuiJoue.getPositionPlateau(),joueurQuiJoue.getNom());
		
	}

}