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

    public Matrise addisjon(Matrise m1) {
        //Sjekker om matrisene er like store
        if (m1.martix.length != martix.length || m1.martix[0].length != martix[0].length) {
            System.out.print("Matrisene er ikke like store");
            return null;
        }

        //Lager en ny matrise med samme størrelse som de to andre matrisene
        int[][] result = new int[m1.martix.length][m1.martix[0].length];

        //Legger sammen verdiene i de to matrisene og legger de i den nye matrisen

        for (int i = 0; i < martix.length; i++) {
            for (int j = 0; j < martix[i].length; j++) {
                result[i][j] = martix[i][j] + m1.martix[i][j];
            }
        }

        //Returnerer den nye matrisen
        return new Matrise(result);
    }

    public Matrise multiplikasjon(Matrise m1) {

        if (martix.length != m1.martix[0].length && martix[0].length != m1.martix.length) {
            System.out.print("Matrisene er ikke like store");
            return null;
        }
        int[][] result = new int[m1.martix.length][m1.martix[0].length];

        result[0][0] = martix[0][0] * m1.martix[0][0] + martix[0][1] * m1.martix[1][0];
        result[1][0] = martix[1][0] * m1.martix[0][0] + martix[1][1] * m1.martix[1][0];
        result[0][1] = martix[0][0] * m1.martix[0][1] + martix[0][1] * m1.martix[1][1];
        result[1][1] = martix[1][0] * m1.martix[0][1] + martix[1][1] * m1.martix[1][1];
                /*
                [a, b * [e, f = [a*e + b*g, a*f + b*h
                 c, d]   g, h].  c*e + d*g, c*f + d*h]
                 */


        return new Matrise(result);
    }

    public Matrise transpose() {
        int[][] result = new int[martix.length][martix[0].length];

        for (int i = 0; i < martix.length; i++) {
            for (int j = 0; j < martix[i].length; j++) {
                result[j][i] = martix[i][j];
            }
        }
        return new Matrise(result);
    }

    //Måte å printe ut matrisen på
    public void printMatrix() {
        for (int[] ints : martix) {
            System.out.println(Arrays.toString(ints));
        }
    }


}
