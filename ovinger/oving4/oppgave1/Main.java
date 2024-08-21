package ovinger.oving4.oppgave1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Valuta dollar = new Valuta("Dollar", 10.8);
        Valuta euro = new Valuta("Euro", 12.2);
        Valuta svenskeKroner = new Valuta("Svenske Kroner", 0.9);


        while(true) {

            System.out.println("Velg valuta: \n 1: dollar \n 2: euro \n 3: Svenske kroner \n 4: Avslutt");
            int x = sc.nextInt();

            if( x == 4) {
                System.out.println("Avslutter programmet!");
                break;
            }

            Valuta valgtValuta = null;

            switch(x) {
                case 1:
                    valgtValuta = dollar;
                    break;
                case 2:
                    valgtValuta = euro;
                    break;
                case 3:
                    valgtValuta = svenskeKroner;
                    break;
                default:
                    System.out.println("Ugyldig valg, vennligst prøv igjen!");
                    continue;
            }

            System.out.println("Du har valgt: " + valgtValuta.getNavn());
            System.out.print("Skriv inn beløp i " + valgtValuta.getNavn() + ": ");
            double belop = sc.nextDouble();

            double nokBelop = valgtValuta.tilNok(belop);
            System.out.println(belop + " " + valgtValuta.getNavn() + " er lik " + nokBelop + " NOK");
        }
        sc.close();
    }
}