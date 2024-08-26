package ovinger.oving6.oppgave3;

public class Matrise {
    private final int[][] martix;

    Matrise(int[][] martix) {

        this.martix = new int[martix.length][martix[0].length];

        for (int i = 0; i < martix.length; i++) {
            for (int j = 0; j < martix[i].length; j++) {
                this.martix[i][j] = martix[i][j];
            }
        }
        System.out.println(martix);
    }

    public Matrise Adisjon(Matrise m1, Matrise m2) {
        return null;
    }
}
