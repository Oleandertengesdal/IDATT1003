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

    public Matrise Addisjon(Matrise m1, Matrise m2) {
        //Sjekker om matrisene er like store
        if (m1.martix.length != m2.martix.length || m1.martix[0].length != m2.martix[0].length) {
            throw new IllegalArgumentException("Matrisene er ikke like store");
        }

        //Lager en ny matrise med samme størrelse som de to andre matrisene
        int[][] result = new int[m1.martix.length][m1.martix[0].length];

        //Legger sammen verdiene i de to matrisene og legger de i den nye matrisen

        for (int i = 0; i < m1.martix.length; i++) {
            for (int j = 0; j < m1.martix[i].length; j++) {
                result[i][j] = m1.martix[i][j] + m2.martix[i][j];
            }
        }

        //Returnerer den nye matrisen
        return new Matrise(result);
    }

    //Måte å printe ut matrisen på
    public void printMatrix() {
        for (int[] ints : martix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
