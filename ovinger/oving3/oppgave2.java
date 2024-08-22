package ovinger.oving3;

import java.util.Scanner;

public class oppgave2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {

            System.out.println("Skriv inn det tallet du vil se om er et primtall:  (Skriv inn 0 for å avslutte)");
            int a = sc.nextInt();

            if (a == 0) {
                System.out.println("Avslutter programmet");
                break;
            }

            if (a == 2) {
                System.out.println("2 er et primtall");
                break;
            }


            for (int i = 2; i < a;i++) {
                if (a % i == 0) {
                    System.out.println(a + " er ikke et primtall");
                    break;
                } else if (i == (a - 1)) {
                    System.out.println(a + " er et primtall");
                    break;
                }
            }

        }
        sc.close();
    }
}
