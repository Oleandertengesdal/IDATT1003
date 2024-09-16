package ovinger.oving9.oppgave1;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Oleander Tengesdal", 3);
        Student s2 = new Student("Silje Kristensen");


        Oppgaveoversikt oppg = new Oppgaveoversikt();


        oppg.registerStudent(s1);
        oppg.registerStudent(s2);

        oppg.okAntOppg(s1 ,3);

        System.out.println("Antall studenter: " + oppg.finnAntStud());
        System.out.println(oppg.toString());
    }
}
