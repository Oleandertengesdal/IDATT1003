package ovinger.oving7.oppgave1;

public class NyString {

    private String forkortet;
    private final String tekst;
    private String fjernet;

    public NyString(final String initialValue) {
        this.tekst = initialValue;
    }

    public String forkort() {
        String[] ord = tekst.split(" ");

        this.forkortet = "";
        for (int i = 0; i < ord.length; i++) {
            this.forkortet +=  ord[i].charAt(0);
        }
        return this.forkortet;
    }

    public String fjernTegn(char tegn) {
        String
        fjernet = tekst;
        while(true) {
            if ( fjernet.indexOf(tegn) > 0 ) {
                fjernet += tekst.substring(tekst.indexOf(tegn) + 1);
            } else {
                break;
            }
        }
        return fjernet;
    }
}
