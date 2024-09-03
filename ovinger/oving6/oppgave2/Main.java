package ovinger.oving6.oppgave2;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {

            System.out.println("Skriv inn setningen som skal analyseres (eller exit for å avslutte): ");
            String inSetning = sc.nextLine();



            if (inSetning.equals("exit")) {
                System.out.println("Avslutter programmet!");
                break;
            }

            Analyse tekst = new Analyse(inSetning);

            System.out.println("Antall forskjellige bokstaver: " + Analyse.antallBokstaver());
            System.out.println("Totalt antall bokstaver: " + Analyse.antallBokstaverITeksten());
            System.out.printf("Prosent ikke-bokstaver: %.2f%%\n", Analyse.prosentIkkeBokstav());

            System.out.print("Skriv inn en bokstav for å finne antall forekomster: ");

            char bokstav = sc.nextLine().charAt(0);

            System.out.println("Antall forekomster av '" + bokstav + "': " + Analyse.hvorMangeGanger(bokstav));
            System.out.println("Mest vanlige bokstaver: " + Analyse.finnMestVanligeBokstaver());

            sc.reset();
        }
        sc.close();

    }

}

