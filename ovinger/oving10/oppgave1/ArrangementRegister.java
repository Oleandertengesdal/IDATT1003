package ovinger.oving10.oppgave1;

import java.util.ArrayList;
import java.util.List;

public class ArrangementRegister {

    final ArrayList<Arrangment> arrangements;

    public ArrangementRegister() {
        this.arrangements = new ArrayList<Arrangment>();
    }

    public void addArrangment(Arrangment arrangment) {
        arrangements.add(arrangment);
    }

    public List<Arrangment> getArrangements() {
        return arrangements;
    }

    public List<Arrangment> finnArrangementSted(String sted) {
        return arrangements;
    }
}
