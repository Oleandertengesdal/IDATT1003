package ovinger.oving7.oppgave2;

public class tekstbehandling {

    private String tekst;

    public tekstbehandling(String initialValue) {
        this.tekst = initialValue;
    }

    public int getAntallOrd() {
        String[] ord = tekst.split(" ");
        return ord.length;
    }

    public double getGjennomsnittligOrd() {
        String[] ord = tekst.split(" ");
        double antallBokstaver = 0.0;
        for (String str : ord) {
            for (int i = 0; i < str.length(); i++) {
                antallBokstaver++;
            }
        }
        return antallBokstaver / ord.length;
    }

    public double getGjennomsnitligSetning() {

        String[] setning = tekst.split("[!\\.\\,\\?\\;\\:]");

        double antallSetninger = 0.0;
        double antallOrdPrSetning = 0.0;

        for (String str : setning) {

            String[] ord = str.trim().split("\\s");

            if (ord.length > 0 && !ord[0].isEmpty()) {
                antallOrdPrSetning += ord.length;
                antallSetninger++;
            }
        }
        return antallOrdPrSetning / antallSetninger;
    }

    public String skiftUtOrd(String str1, String str2) {
        return str1 + " " + str2;
    }

    public String getTekstStorebokstaver() {
        return tekst.toUpperCase();
    }

    public String getTekst() {
        return tekst;
    }
}
