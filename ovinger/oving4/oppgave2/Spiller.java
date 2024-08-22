package ovinger.oving4.oppgave2;

import java.util.Random;

public class Spiller {

    Random terning  = new Random();

    // lager verdier
    private String navn;
    private boolean ferdig;
    private int sumPoeng;

    // Setter opp spilleren, med verdiene.
    Spiller(String navn, boolean ferdig, int poeng) {
        this.navn = navn;
        this.ferdig = ferdig;
        this.sumPoeng = poeng;

    }

    //metode for å få summert poeng
    public int getSumPoeng() {
        return sumPoeng;
    }

    public void kastTerningen() {
        int terningkast = terning.nextInt(6) + 1;
        System.out.println(navn + " kastet " + terningkast);

        // Sjekk om terningkastet er 1
        if (terningkast == 1) {
            sumPoeng = 0; // Setter summen lik 0
            System.out.println(navn + " mistet alle poengene!");

        //Sjekk om terningkastet er noe annet.
        } else {
            sumPoeng += terningkast; // legger til kastet til summen.
        }

        // Sjekk om spilleren er over 100 poeng
        if (sumPoeng > 100) {
            sumPoeng -= terningkast; // Trekk fra ternigkastet
            System.out.println(navn + " gikk over 100 poeng!");

        // Sjekk om spilleren har nøyaktig 100 poeng.
        } else if (sumPoeng == 100) {
            ferdig = true; // Settet ferdig til True
            System.out.println(navn + " har vunnet!!!!");
        }

    }

    //Returnerer om spilleren er ferdig.
    public boolean erFerdig() {
        return ferdig;
    }

}
