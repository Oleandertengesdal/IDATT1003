package ovinger.oving10.oppgave2;

import java.util.ArrayList;

public class meny {

    private ArrayList<Rett> meny;

    public meny() {
        this.meny = new ArrayList<Rett>();
    }

    public void addRett(Rett r) {
        meny.add(r);
    }

    public double getPris() {
        double pris = 0;
        for (Rett r : meny) {
            pris += r.getPris();
        }
        return pris;
    }

    public ArrayList<Rett> getMeny() {
        return meny;
    }


    public void printMeny() {
        for (Rett r : meny) {
            System.out.println(r.toString());
        }
    }
}
