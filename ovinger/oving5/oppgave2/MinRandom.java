package ovinger.oving5.oppgave2;

import java.util.Random;

public class MinRandom {

    Random rand = new Random();

    // metode nesteHeltall
    public int nesteHeltall(int nedre, int ovre) {
        return rand.nextInt(ovre - nedre) + nedre; //returnerer ett random heltall mellom nedre og ovre.
    }

    // metode nesteDesimaltall
    public double nesteDesimaltall(double nedre, double ovre) {
        return rand.nextDouble() * (ovre - nedre) + nedre; //returnerer ett random desimaltall mellom nedre og ovre
    }
}
