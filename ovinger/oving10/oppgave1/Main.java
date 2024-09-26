package ovinger.oving10.oppgave1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrangementRegister register = new ArrangementRegister();

        Scanner sc = new Scanner(System.in);

        register.addArrangment(new Arrangment("Kygo", 202310201800L, "Konsert", "Oslo", "Festivalfeber"));
        register.addArrangment(new Arrangment("Les miserables", 202309151800L, "Teater", "Trondheim", "Samfunet"));
        register.addArrangment(new Arrangment("Foredrag om plastik", 202311051700L, "Foredrag", "Trondheim", "NTNU"));
        register.addArrangment(new Arrangment("Broiler", 202307051800L, "Konsert", "Stavanger", "UIS"));
        register.addArrangment(new Arrangment("ONS", 202311211700L, "Foredrag", "Stavanger", "ONS"));
        register.addArrangment(new Arrangment("Feelings", 202308031700L, "Festival", "Bergen", "UIB"));


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

                    Arrangment nyttArrangement = new Arrangment(navn, tidspunkt, type, sted, arrang);
                    register.addArrangment(nyttArrangement);
                case 2:

                    // Finn arrangementer på et sted
                    System.out.print("Sted: ");
                    String sokSted = sc.next();
                    ArrayList<Arrangment> stedListe = register.getArrangementsSted(sokSted);
                    if (!stedListe.isEmpty()) {
                        register.displayEvents(stedListe);;
                    }
                    break;

                case 3:
                    // Finn arrangementer på en dato
                    System.out.print("Dato (YYYYMMDD): ");
                    long dato = sc.nextLong();
                    ArrayList<Arrangment> datoListe = register.getArrangementDato(dato);
                    if (!datoListe.isEmpty()) {
                        register.displayEvents(datoListe);
                    }
                    break;

                case 4:
                    // Finn arrangementer innenfor et tidsintervall
                    System.out.print("Starttid (YYYYMMDDHHMM): ");
                    long startTid = sc.nextLong();
                    System.out.print("Slutttid (YYYYMMDDHHMM): ");
                    long sluttTid = sc.nextLong();
                    ArrayList<Arrangment> intervallListe = register.getArrangementIntervall(startTid, sluttTid);
                    register.displayEvents(intervallListe);;
                    break;

                case 5:
                    // Sorter etter sted
                    ArrayList<Arrangment> stedSortert = register.getArrangementSortSted();
                    register.displayEvents(stedSortert);;

                    break;

                case 6:
                    // Sorter etter type
                    ArrayList<Arrangment> typeSortert = register.getArrangementSortType();
                    register.displayEvents(typeSortert);;
                    break;

                case 7:
                    // Sorter etter tidspunkt
                    ArrayList<Arrangment> tidSortert = register.getArrangementSortTidspunkt();
                    register.displayEvents(tidSortert);;
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
