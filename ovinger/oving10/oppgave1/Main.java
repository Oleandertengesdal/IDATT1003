package ovinger.oving10.oppgave1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrangementRegister register = new ArrangementRegister();

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("1. Registrer nytt arrangement");
            System.out.println("2. Finn arrangementer på sted");
            System.out.println("3. Finn arrangementer på dato");
            System.out.println("4. Finn arrangementer innen tidsintervall");
            System.out.println("5. Sorter og vis arrangementer etter sted");
            System.out.println("6. Sorter og vis arrangementer etter type");
            System.out.println("7. Sorter og vis arrangementer etter tidspunkt");
            System.out.println("0. Avslutt");

            int  valg = sc.nextInt();

            switch (valg) {
                case 1:
                    System.out.println("Nummer: ");
                    int nummer  = sc.nextInt();

                    System.out.println("Navn: ");
                    String navn = sc.next();

                    System.out.println("Sted: ");
                    String sted = sc.next();

                    System.out.println("Arrangør: ");
                    String arrang = sc.next();

                    System.out.println("Type: ");
                    String type = sc.next();

                    System.out.println("Tidspunkt (YYYYMMDDHHMM): ");
                    long tidspunkt = sc.nextLong();

                    Arrangment nyttArrangement = new Arrangment(nummer, navn, tidspunkt, type, sted, arrang);
                    register.addArrangment(nyttArrangement);
                case 2:
                    // Finn arrangementer på et sted
                    System.out.print("Sted: ");
                    String søkSted = sc.nextLine();
                    ArrayList<Arrangment> stedListe = register.finnArrangementerSted(søkSted);
                    stedListe.forEach(System.out::println);
                    break;

                case 3:
                    // Finn arrangementer på en dato
                    System.out.print("Dato (YYYYMMDD): ");
                    long dato = sc.nextLong();
                    ArrayList<Arrangment> datoListe = register.finnArrangementerDato(dato);
                    datoListe.forEach(System.out::println);
                    break;

                case 4:
                    // Finn arrangementer innenfor et tidsintervall
                    System.out.print("Starttid (YYYYMMDDHHMM): ");
                    long startTid = sc.nextLong();
                    System.out.print("Slutttid (YYYYMMDDHHMM): ");
                    long sluttTid = sc.nextLong();
                    ArrayList<Arrangment> intervallListe = register.finnArrangementerIntervall(startTid, sluttTid);
                    intervallListe.forEach(System.out::println);
                    break;

                case 5:
                    // Sorter etter sted
                    ArrayList<Arrangment> stedSortert = register.sorterEtterSted();
                    stedSortert.forEach(System.out::println);
                    break;

                case 6:
                    // Sorter etter type
                    ArrayList<Arrangment> typeSortert = register.sorterEtterType();
                    typeSortert.forEach(System.out::println);
                    break;

                case 7:
                    // Sorter etter tidspunkt
                    ArrayList<Arrangment> tidSortert = register.sorterEtterTidspunkt();
                    tidSortert.forEach(System.out::println);
                    break;

                case 0:
                    // Avslutt programmet
                    System.out.println("Avslutter programmet...");
                    sc.close();
                    return;

                default:
                    System.out.println("Ugyldig valg, prøv igjen.");
            }

        }
    }
}
