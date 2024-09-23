package ovinger.oving10.oppgave2;

import java.io.File;

public class Rett {

    private String type;
    private String oppskrift;
    private String ingridienser;


    public Rett(String oppskrift, String ingridienser, String type)  {
        this.oppskrift = oppskrift;
        this.ingridienser = ingridienser;
        this.type = type;
    }

    public String getOppskrift() {
        return oppskrift;
    }

    public String getIngridienser() {
        return ingridienser;
    }

    public String getType() {
        return type;
    }
}
