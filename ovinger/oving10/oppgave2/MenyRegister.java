package ovinger.oving10.oppgave2;

import java.util.ArrayList;

public class MenyRegister {

    ArrayList<Rett> retter;
    ArrayList<meny> menyer;

    MenyRegister() {
        this.retter = new ArrayList<>();
        this.menyer = new ArrayList<>();
    }

    public void registerRett(Rett rett) {
        retter.add(rett);
    }


    public Rett getRett(String name) {
        for (Rett rett : retter) {
            if(rett.getName().equalsIgnoreCase(name)) {
                return rett;
            }
        }
        return null;
    }

    public ArrayList<Rett> getRettType(String type) {
        ArrayList<Rett> types = new ArrayList();
        for (Rett rett : retter) {
            if(rett.getType().equalsIgnoreCase(type)) {
                types.add(rett);
            }
        }
        return types;
    }

    public void registerMeny(meny meny) {
        menyer.add(meny);
    }

    public ArrayList<meny> getMenyerPrisIntervall(double minPris, double maxPris) {
        ArrayList<meny> prisIntervall = new ArrayList();
        for (ovinger.oving10.oppgave2.meny meny : menyer) {
            double totalPris = meny.getPris();
            if(totalPris >= minPris && totalPris <= maxPris) {
                prisIntervall.add(meny);
            }
        }
        return prisIntervall;
    }

    public void printRetter(ArrayList<Rett> menyer) {
        for (Rett retter : menyer) {
            System.out.println(retter.toString());
        }
    }

    public void printMenyer(ArrayList<meny> menyer) {
        for (ovinger.oving10.oppgave2.meny meny : menyer) {
            System.out.println("Meny:");
            for (Rett rett : meny.getMeny()) {  // Hent listen med retter fra menyen
                System.out.println(" - " + rett.getName() + ": " + rett.getPris() + " kr");
            }
            System.out.println("Totalpris for menyen: " + meny.getPris() + " kr");
            System.out.println("------------------------------");
        }
    }
}
