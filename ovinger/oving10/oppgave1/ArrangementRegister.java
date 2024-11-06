package ovinger.oving10.oppgave1;


//Git
import java.util.ArrayList;
import java.util.Comparator;

public class ArrangementRegister {

    private ArrayList<Arrangment> arrangements;

    public ArrangementRegister() {
        this.arrangements = new ArrayList<Arrangment>();
    }


    public void addArrangment(Arrangment arrangment) {
        arrangements.add(arrangment);
    }


    public ArrayList<Arrangment> getArrangementsSted(String sted) {
        ArrayList<Arrangment> temp = new ArrayList<>();
        for (int i = 0; i < arrangements.size(); i++) {
            if((arrangements.get(i).getPlace().equalsIgnoreCase(sted))) {
                temp.add(arrangements.get(i));
            }
        }
        if(temp.isEmpty()) {
            System.out.println("Det finnes ingen arrangement i " + sted);
            return temp;
        }
        return temp;
    }

    public ArrayList<Arrangment> getArrangementDato(long Dato) {
        ArrayList<Arrangment> temp = new ArrayList();
        for (int i = 0; i < arrangements.size(); i++) {
            if ((arrangements.get(i).getDato() / 10000) == Dato) {
                temp.add(arrangements.get(i));
            }
        }

        if(temp.isEmpty()) {
            System.out.println("Det er ingen arrangement på datoen " + Dato);
            return temp;
        }
        return temp;
    }

    public ArrayList<Arrangment> getArrangementIntervall(long start, long slutt) {
        ArrayList<Arrangment> temp = new ArrayList();
        for (int i = 0; i < arrangements.size(); i++) {
            if(start > slutt) {
                if ((arrangements.get(i).getDato() / 10000) <= start || (arrangements.get(i).getDato() / 10000) >= slutt) {
                    temp.add(arrangements.get(i));
                }
            } else {
                if ((arrangements.get(i).getDato() / 10000) >= start || (arrangements.get(i).getDato() / 10000) <= slutt) {
                    temp.add(arrangements.get(i));
                }
            }
        }
        temp.sort(Comparator.comparing(Arrangment::getDato));
        return temp;
    }

    public ArrayList<Arrangment> getArrangementSortSted() {
        ArrayList<Arrangment> temp = new ArrayList();
        for (int i = 0; i < arrangements.size(); i++) {
            temp.add(arrangements.get(i));
        }
        temp.sort(Comparator.comparing(Arrangment::getPlace));
        return temp;
    }

    public ArrayList<Arrangment> getArrangementSortType() {
        ArrayList<Arrangment> temp = new ArrayList();
        for (int i = 0; i < arrangements.size(); i++) {
            temp.add(arrangements.get(i));
        }
        temp.sort(Comparator.comparing(Arrangment::getType));
        return temp;
    }

    public ArrayList<Arrangment> getArrangementSortTidspunkt() {
        ArrayList<Arrangment> temp = new ArrayList();
        for (int i = 0; i < arrangements.size(); i++) {
            temp.add(arrangements.get(i));
        }
        temp.sort(Comparator.comparing(Arrangment::getDato));
        return temp;
    }

    public void displayEvents(ArrayList<Arrangment> arrangeme) {
        for (int i = 0; i < arrangeme.size(); i++) {
            System.out.println(arrangeme.get(i).toString());
        }
    }
}
