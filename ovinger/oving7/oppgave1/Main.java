package ovinger.oving7.oppgave1;

public class Main {

    public static void main(String[] args) {
        NyString nyString = new NyString("Dette er den hele");
        System.out.println(nyString.forkort());
        System.out.println(nyString.fjernTegn('e'));

    }
}
