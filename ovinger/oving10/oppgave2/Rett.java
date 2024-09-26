package ovinger.oving10.oppgave2;

import java.io.File;

public class Rett {

    private String type;
    private String oppskrift;
    private String navn;
    private double pris;


    public Rett(String oppskrift, String navn, String type, double pris)  {
        this.oppskrift = oppskrift;
        this.type = type;
        this.navn = navn;
        this.pris = pris;
    }

    public String getOppskrift() {
        return oppskrift;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return navn;
    }

    public double getPris() {
        return pris;
    }

    public String toString() {
        return "Rett{" +
                "navn='" + navn + '\'' +
                ", type='" + type + '\'' +
                ", pris=" + pris +
                ", oppskrift='" + oppskrift + '\'' +
                '}'  + '\n';
    }
}
