package ovinger.oving10.oppgave2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MenyRegister register = new MenyRegister();

        Rett rett1 = new Rett("Stekt biff med tilbehør" , "Biff", "Hovedrett", 199.0);
        Rett rett2 = new Rett("Grønnsakssuppe", "Grønnsakssuppe", "Forrett", 89.0);
        Rett rett3 = new Rett("Deilig sjokoladekake", "Sjokoladekake", "Dessert", 59.0);
        Rett rett4 = new Rett("oppskrift dronningmaud", "Dronningmaud", "Dessert", 59.0);
        Rett rett5 = new Rett("Laks med potetmouse", "Laks", "Hovedrett", 179.0);
        Rett rett6 = new Rett("Fiskesuppe", "Fiskesuppe", "Forrett", 109.0);


        // Registrerer retter i registeret
        register.registerRett(rett1);
        register.registerRett(rett2);
        register.registerRett(rett3);
        register.registerRett(rett4);
        register.registerRett(rett5);
        register.registerRett(rett6);

        Meny meny1 = new Meny();
        meny1.addRett(rett1);
        meny1.addRett(rett2);
        meny1.addRett(rett3);

        register.registerMeny(meny1);

        Meny meny2 = new Meny();
        meny2.addRett(rett4);
        meny2.addRett(rett5);
        meny2.addRett(rett6);

        register.registerMeny(meny2);


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menyregister ---");
            System.out.println("1. Registrer en ny rett");
            System.out.println("2. Finn en rett basert på navn");
            System.out.println("3. Finn retter av en bestemt type");
            System.out.println("4. Registrer en ny meny");
            System.out.println("5. Finn menyer innenfor et prisintervall");
            System.out.println("0. Avslutt");
            System.out.print("Velg et alternativ: ");

            int valg = sc.nextInt();
            sc.nextLine();


            switch (valg) {
                case 1:
                    // Registrer en ny rett
                    System.out.print("Navn på retten: ");
                    String navn = sc.nextLine();
                    System.out.print("Type (Forrett, Hovedrett, Dessert): ");
                    String type = sc.nextLine();
                    System.out.print("Pris: ");
                    double pris = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Oppskrift: ");
                    String oppskrift = sc.nextLine();

                    Rett nyRett = new Rett(oppskrift, navn, type, pris);
                    register.registerRett(nyRett);
                    System.out.println("Ny rett er registrert.");
                    break;

                case 2:
                    // Finn en rett basert på navn
                    System.out.print("Skriv inn navnet på retten: ");
                    String rettNavn = sc.nextLine();
                    if (register.getRett(rettNavn) != null) {
                        System.out.println(register.getRett(rettNavn).toString());
                    } else {
                        System.out.println("Ingen rett funnet med det navnet.");
                    }
                    break;

                case 3:
                    // Finn retter av en bestemt type
                    System.out.print("Skriv inn typen rett (Forrett, Hovedrett, Dessert): ");
                    String rettType = sc.nextLine();
                    ArrayList<Rett> retterAvType = register.getRettType(rettType);
                    if (!retterAvType.isEmpty()) {
                        System.out.println("Fant følgende retter av type " + rettType + ":");
                        register.printRetter(retterAvType);
                    } else {
                        System.out.println("Ingen retter funnet av typen " + rettType);
                    }
                    break;

                case 4:
                    // Registrer en ny meny
                    Meny nyMeny = new Meny();
                    while (true) {
                        System.out.print("Legg til en rett i menyen (skriv inn navnet, eller 'ferdig' for å avslutte): ");
                        String rettNavnForMeny = sc.nextLine();
                        if (rettNavnForMeny.equalsIgnoreCase("ferdig")) {
                            break;
                        }
                        Rett rettTilMeny = register.getRett(rettNavnForMeny);
                        if (rettTilMeny != null) {
                            nyMeny.addRett(rettTilMeny);
                            System.out.println("Rett lagt til i menyen.");
                        } else {
                            System.out.println("Ingen rett funnet med det navnet.");
                        }
                    }
                    register.registerMeny(nyMeny);
                    System.out.println("Ny meny er registrert.");
                    break;

                case 5:
                    // Finn menyer innenfor et prisintervall
                    System.out.print("Skriv inn minimumspris: ");
                    double minPris = sc.nextDouble();
                    System.out.print("Skriv inn maksimumspris: ");
                    double maxPris = sc.nextDouble();
                    sc.nextLine();  // Rydder opp etter `nextDouble`

                    ArrayList<Meny> menyerInnenIntervall = register.getMenyerPrisIntervall(minPris, maxPris);
                    if (!menyerInnenIntervall.isEmpty()) {
                        System.out.println("Fant følgende menyer innenfor prisintervallet " + minPris + " - " + maxPris + ":");
                        register.printMenyer(menyerInnenIntervall);  // Bruker printMenyer for å vise resultatet
                    } else {
                        System.out.println("Ingen menyer funnet innenfor prisintervallet.");
                    }
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
