package ovinger.oving9.oppgave1;

public class Oppgaveoversikt {

    //Initial
    private Student[] studenter;
    private int antStud;

    //Kostruktør for oppgaveoversikt.
    Oppgaveoversikt() {
        this.studenter = new Student[100];
        this.antStud = 0;
    }

    //Finner antallet studenter.
    public int finnAntStud() {
        return this.antStud;
    }

    //Registrerer studenten.
    public void registerStudent(Student stud) {
        studenter[antStud] = stud;
        antStud++;
    }

    //Metode for å sammarbeide med student klassen om økning av antaloppgaver.
    public void okAntOppg(Student student, int okning) {
        student.okAntOppg(okning);
    }

    //Finner antalll oppgaver gitt en student
    public int finnAntOppg(Student student) {
        return student.getAntOppg();
    }

    //To String metode
    public String  toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < antStud; i++) {
            sb.append(studenter[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
