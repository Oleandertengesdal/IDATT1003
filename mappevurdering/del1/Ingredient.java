package mappevurdering.del1;

import java.util.Date;

public class vare {

    private String name;
    private double volume;
    private String unit;
    private Date bestbefore;
    private double pris;

    public vare(String navn, double mengde, String maaleenhet, Date bestfor, double pris) {
        this.name = name;
        this.volume = mengde;
        this.unit = maaleenhet;
        this.bestbefore = bestfor;
        this.pris = pris;
    }


}
