package ovinger.oving6.oppgave3;

import java.util.Arrays;

public class Matrise {
    private final int[][] martix;

    //Lager matrise konstruktøren
    Matrise(int[][] martix) {

        //Legger tabellen/array i rett størrelse
        this.martix = new int[martix.length][martix[0].length];

        //Legger til verdiene til matrisen/tabellen/array.
        for (int i = 0; i < martix.length; i++) {
            for (int j = 0; j < martix[i].length; j++) {
                this.martix[i][j] = martix[i][j];
            }
        }
    }

    public Matrise Adisjon(Matrise m1, Matrise m2) {
        return null;
    }
}
