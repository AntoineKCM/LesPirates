package cases;
import affichage.Affichage;
import java.security.SecureRandom;
import java.util.Random;
import jeu.Joueur;

public class CaseRouletteRusse extends Case {
	
	private Random random;
    private Affichage affichage = new Affichage();
	public CaseRouletteRusse(int numeroCase) {
		super(numeroCase);
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void declencherAction(Joueur joueurQuijoue, Joueur joueurContre) {
		joueurQuijoue.setPositionPlateau(random.nextInt(30));
		affichage.afficherCaseRouletteRusse(joueurQuijoue.getPositionPlateau(),joueurQuijoue.getNom());
		
	}

}