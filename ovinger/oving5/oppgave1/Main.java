package ovinger.oving5.oppgave1;

public class Main {

    public static void main(String[] args) {

        Brok brok1 = new Brok(1 ,2); //Brøken 1/2
        Brok brok2 = new Brok(1 ,3); //Brøken 1/3

        brok1.summer(brok2); // 5/6
        System.out.println("Summen: " + brok1.displayBrok() + "\n"); //forventer 5/6

        brok1 = new Brok(1, 2); // Tilbakestill brok1
        brok1.subtraher(brok2); // 1/6
        System.out.println("Differansen: " + brok1.displayBrok() + "\n"); //forventer 1/6

        brok1 = new Brok(1, 2); // Tilbakestill brok1
        brok1.multipliser(brok2); // 1/6
        System.out.println("Produktet: " + brok1.displayBrok() + "\n"); //forventer 1/6

        brok1 = new Brok(1, 2); // Tilbakestill brok1
        brok1.divider(brok2); // 3/2
        System.out.println("Kvotienten: " + brok1.displayBrok() + "\n"); //forventer 3/2
    }

}
