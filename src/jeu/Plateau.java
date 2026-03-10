	package jeu;
	import cases.CaseNormale;
	
	
public class Plateau {
	private int nbCases = 30 ;
	private Integer[] posistionCaseRouletteRusse;
	private Integer[] positionCaseVolVie;
	private CaseNormale caseDebut = new CaseNormale(1);
	private CaseNormale caseArrivée = new CaseNormale(nbCases);


public Plateau(Integer[] positionCaseRouletteRusse, Integer[] positionCaseVolVie) {
	this.posistionCaseRouletteRusse = positionCaseRouletteRusse;
	this.positionCaseVolVie = positionCaseVolVie;
}

public int getNbCases() {
	return nbCases;
}

public CaseNormale getCaseFin() {
	return caseArrivée;
	}
}