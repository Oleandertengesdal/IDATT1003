package ovinger.oving9.oppgave1;

public class Student {

    //Initialiserer veridene
    private String name;
    private int antOppg;


    /*
     * Konstruktøren til klassen, som initialiserer navn, og antall oppgaver.
     */
    public Student(String name, int antOppg) {
        this.name = name;
        this.antOppg = antOppg;
    }

    //Konstruktør nummer 2, i tilfelle studenten ikke har gjort noen oppgaver.
    public Student(String name) {
        this.name = name;
        this.antOppg = 0;
    }

    //Metode for å hente navn
    public String getName() {
        return name;
    }

    //Metode for å hente antall oppgaver
    public int getAntOppg() {
        return antOppg;
    }

    //Metode for å øke antall oppgaver
    public void okAntOppg(int okning) {
        if (okning > 0) {
            this.antOppg += okning;
        }
    }

    //En ToString metode for å displaye studetene
    public String toString() {
        return "Student [name=" + name + ", antOppg=" + antOppg + "]";
    }
}
