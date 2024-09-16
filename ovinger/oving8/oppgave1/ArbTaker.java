package ovinger.oving8.oppgave1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ArbTaker {

    private final Person personalia;
    private final int arbtakenr;
    private int ansettelsesaar;
    private double maanedslonn;
    private double skatteprosent;

    public ArbTaker(Person person, int arbtakenr, int ansettelsesaar, double maanedslonn, double skatteprosent) {
        this.personalia = person;
        this.arbtakenr = arbtakenr;
        this.ansettelsesaar = ansettelsesaar;
        this.maanedslonn = maanedslonn;
        this.skatteprosent = skatteprosent;
    }

    public ArbTaker(Person person, int arbtakenr, int ansettelsesaar) {
        this.personalia = person;
        this.arbtakenr = arbtakenr;
        this.ansettelsesaar = ansettelsesaar;
    }

    public int getArbtakenr(){
        return arbtakenr;
    }

    public int getAnsettelsesaar(){
        return ansettelsesaar;
    }
    public double getMaanedslonn(){
        return maanedslonn;
    }
    public double getSkatteprosent(){
        return skatteprosent;
    }
    public String getNavn() {
        return personalia.getEtternavn() + ", " + personalia.getFornavn();
    }

    public void setMaanedslonn(double maanedslonn) {
        this.maanedslonn = maanedslonn;
    }

    public void setSkatteprosent (double skatteprosent) {
        this.skatteprosent = skatteprosent;
    }

    public int getAlder() {
        GregorianCalendar kalender = new GregorianCalendar();
        int aar = kalender.get(Calendar.YEAR);
        return aar - personalia.getFodselsAar();
    }

    public boolean harJobbetI(int aar) {
        GregorianCalendar kalender = new GregorianCalendar();
        int ar = kalender.get(Calendar.YEAR);
        return (ar - this.ansettelsesaar) > aar;
    }

    public double getBruttoLonn() {
        return this.maanedslonn * 12;
    }

    public double getSkatteTrekk() {
        return (this.maanedslonn * this.skatteprosent);
    }

    public double getSkatteTrekkAar() {
        return getSkatteTrekk() * 10 + (this.maanedslonn * this.skatteprosent * 0.5);
    }

    public int getAntallAar() {
        GregorianCalendar kalender = new GregorianCalendar();
        int aar = kalender.get(Calendar.YEAR);
        return aar - this.ansettelsesaar;
    }
}
