package ovinger.oving6.oppgave1;

import java.util.Random;

public class Main {
    static int antallRunder = 1000;
    static int antallTall = 10;
    public static void main(String[] args) {

        //For å bruke Random funsjon i JAva
        Random rand = new Random();

        //Lager en Array til lagring av Tall,
        int[] sumPerTall = new int[antallTall];

        // Går igjennom ønsket antallRunder
        for (int i = 0; i < antallRunder; i++) {

            //Lager ett Randomtall fra 0 til 9
            int tall = rand.nextInt(antallTall);

            //dobbel loop
            for (int j = 0; j < antallTall; j++) {

                //Sjekker hvilket tall det er
                if(tall == j) {

                    //Legger tallet til Arrayen.
                    sumPerTall[j]++;
                }
            }
        }

        //Til printing av antall tall.
        for (int i = 0; i < antallTall; i++) {
            System.out.println(sumPerTall[i]);
        }
    }
}
