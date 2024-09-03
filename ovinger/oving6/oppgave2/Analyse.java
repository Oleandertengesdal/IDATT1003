package ovinger.oving6.oppgave2;

public class Analyse {
    private static int[] antallTegn;

    Analyse(String tekst){
        antallTegn = new int[30];

        for (int i = 0; i < tekst.length(); i++) {
            char bokstav = tekst.charAt(i);

            if (bokstav >= 'a' && bokstav <= 'z') {
                antallTegn[bokstav-'a']++;
            } else if (bokstav >= 'A' && bokstav <= 'Z') {
                antallTegn[bokstav-'A']++;
            } else if (bokstav == 'æ') {
                antallTegn[26]++;
            } else if (bokstav == 'ø') {
                antallTegn[27]++;
            } else if (bokstav == 'å') {
                antallTegn[28]++;
            } else {
                antallTegn[29]++;
            }
        }
    }
    public static int antallBokstaver() {
        int antallForkjelligeBokstaver = 0;
        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] > 0) {
                antallForkjelligeBokstaver++;
            }
        }
        return antallForkjelligeBokstaver;
    }

    public static int antallBokstaverITeksten() {
        int antallBokstaverTotalt = 0;
        for (int i = 0; i < 29; i++) {
            antallBokstaverTotalt += antallTegn[i];
        }
        return antallBokstaverTotalt;
    }

    public static double prosentIkkeBokstav() {
        int abokstaver = antallBokstaverITeksten();
        int ibokstaver = antallTegn[29];

        if (ibokstaver + abokstaver == 0) {
            return 0.0;
        }

        return (double) (ibokstaver * 100.0)/ (ibokstaver + abokstaver);
    }

    public static int hvorMangeGanger(char tegn) {
        int antallGanger = 0;
        for (int i = 0; i < 29; i++) {
            if(i == tegn - 'a' || i == tegn - 'A' ) {
                antallGanger = antallTegn[i];
            }
        }
        return antallGanger;
    }
    public static String finnMestVanligeBokstaver() {
        int maxForekomster = 0;
        StringBuilder mestVanlige = new StringBuilder();

        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] > maxForekomster) {
                maxForekomster = antallTegn[i];
                mestVanlige.setLength(0); // Tømmer tidligere resultater
                mestVanlige.append((char) (i + 'a'));
            } else if (antallTegn[i] == maxForekomster) {
                mestVanlige.append((char) (i + 'a'));
            }
        }

        return mestVanlige.toString();
    }

}
