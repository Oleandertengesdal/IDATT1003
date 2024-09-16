package ovinger.oving10.oppgave1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrangementRegister register = new ArrangementRegister();

        Scanner sc = new Scanner(System.in);


        while (true) {
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
            }

        }
    }
}
