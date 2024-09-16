package ovinger.oving9.oppgave1;

public class Oppgaveoversikt {

    private Student[] studenter;
    private int antStud;

    Oppgaveoversikt() {
        this.studenter = new Student[100];
        this.antStud = 0;
    }

    public int finnAntStud() {
        return this.antStud;
    }

    public void registerStudent(Student stud) {
        studenter[antStud] = stud;
        antStud++;
    }

    public void okAntOppg(Student student, int okning) {
        student.okAntOppg(okning);
    }

    public int finnAntOppg(Student student) {
        return student.getAntOppg();
    }

    public String  toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < antStud; i++) {
            sb.append(studenter[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
