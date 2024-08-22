package ovinger.oving4.oppgave2;

public class Main {

    public static void main(String[] args) {
        Spiller spillerA = new Spiller("Spiller A", false, 0);
        Spiller spillerB = new Spiller("Spiller B", false, 0);

        int rundeNummer = 1;

        while(!spillerA.erFerdig() && !spillerB.erFerdig()) {
            System.out.println("Runde " + rundeNummer);
            spillerA.kastTerningen();
            if(!spillerA.erFerdig()) {
                spillerB.kastTerningen();
            }
            System.out.println("Poengsum: " + spillerA.getSumPoeng() + " - " + spillerB.getSumPoeng());
            rundeNummer++;
        }
    }
}
