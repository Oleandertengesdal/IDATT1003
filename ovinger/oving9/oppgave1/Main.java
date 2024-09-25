package ovinger.oving9.oppgave1;

public class Main {

    //Main metode.
    public static void main(String[] args) {

        //Tester funksjonene i Oppgaveoversikt of Student.
        Student oleander = new Student("Oleander Tengesdal", 3);
        Student silje = new Student("Silje Kristensen");


        Oppgaveoversikt oppg = new Oppgaveoversikt();


        oppg.registerStudent(oleander);
        oppg.registerStudent(silje);

        oppg.okAntOppg(oleander ,3);
        oppg.okAntOppg(silje ,3);

        System.out.println("Antall studenter: " + oppg.finnAntStud());
        System.out.println(oppg.toString());
    }
}
