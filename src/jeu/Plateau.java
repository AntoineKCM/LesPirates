package jeu;

public class Plateau {

    private static final int NB_CASES = 30;

    private Integer[] positionCaseRouletteRusse;
    private Integer[] positionCaseVolVie;

    public Plateau(Integer[] positionCaseRouletteRusse, Integer[] positionCaseVolVie) {
        this.positionCaseRouletteRusse = positionCaseRouletteRusse;
        this.positionCaseVolVie = positionCaseVolVie;
    }

    public Integer[] getPositionCaseRouletteRusse() {
        return positionCaseRouletteRusse;
    }

    public Integer[] getPositionCaseVolVie() {
        return positionCaseVolVie;
    }

    public int getNbCases() {
        return NB_CASES;
    }
}