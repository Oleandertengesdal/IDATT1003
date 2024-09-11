package ovinger.oving7.oppgave2;

public class Main {
    public static void main(String[] args) {
        tekstbehandling tb = new tekstbehandling("Dette er den settningen jeg skal analysere!");
        System.out.printf("%.2f\n", tb.getGjennomsnittligOrd());

        tekstbehandling tb2 = new tekstbehandling("Dette er en setning, men dette er en annen. Klarer vi dette da?");
        System.out.printf("%.2f\n", tb2.getGjennomsnitligSetning());
    }
}
