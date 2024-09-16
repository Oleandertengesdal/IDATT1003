package ovinger.oving9.oppgave1;

public class Student {

    private String name;
    private int antOppg;

    public Student(String name, int antOppg) {
        this.name = name;
        this.antOppg = antOppg;

    }

    public String getName() {
        return name;
    }
    public int getAntOppg() {
        return antOppg;
    }

    public void okAntOppg(int okning) {
        this.antOppg += okning;
    }

    public String toString() {
        return "Student [name=" + name + ", antOppg=" + antOppg + "]";
    }
}
