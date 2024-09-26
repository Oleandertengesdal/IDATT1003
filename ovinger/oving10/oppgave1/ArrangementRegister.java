package ovinger.oving10.oppgave1;

import java.util.ArrayList;

public class ArrangementRegister {

    final ArrayList<Arrangment> arrangements;

    public ArrangementRegister() {
        this.arrangements = new ArrayList<Arrangment>();
    }


    public void addArrangment(Arrangment arrangment) {
        arrangements.add(arrangment);
    }


    public ArrayList<Arrangment> getArrangements() {
        return arrangements;
    }


    public ArrayList<Arrangment> finnArrangementSted(String sted) {
        return arrangements;
    }
}
