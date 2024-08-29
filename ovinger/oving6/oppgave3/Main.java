package ovinger.oving6.oppgave3;

public class Main {
    public static void main(String[] args) {

        int[][] data1 = {
                {1, 2},
                {3, 2},
        };

        int[][] data2 = {
                {1, 2},
                {3, 2},
        };

        Matrise m1 = new Matrise(data1);
        Matrise m2 = new Matrise(data2);

        

        Matrise result = m1.Addisjon(m2);
        System.out.println("Resultatet av addisjonen er: ");
        result.printMatrix();

        Matrise result2 = m1.multiplikasjon(m2);
        System.out.println("Resultatet av multiplikasjonen er: ");
        result2.printMatrix();
    }
}
