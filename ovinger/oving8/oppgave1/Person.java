package ovinger.oving8.oppgave1;

public class Person {

    private final String fornavn;
    private final String etternavn;
    private final int fodselsAar;

    public Person(String fornavn, String etternavn, int fodselsAar) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fodselsAar = fodselsAar;
    }

    public String getFornavn() {
        return fornavn;
    }
    public String getEtternavn() {
        return etternavn;
    }
    public int getFodselsAar() {
        return fodselsAar;
    }

}
