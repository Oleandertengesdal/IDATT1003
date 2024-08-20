package Øvinger.øving4.oppgave1;

public class Valuta {

    private String navn;
    private double kurs;

    public Valuta(String navn, double kurs) {
        this.navn = navn;
        this.kurs = kurs;
        
    }

    public double tilNok(double belop) {
        return belop * kurs;
    }

    public double fraNok(double belop) {
        return belop / kurs;
    }

    public String getNavn() {
        return navn;
    }

    public double getKurs() {
        return kurs;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    
    
    
}
