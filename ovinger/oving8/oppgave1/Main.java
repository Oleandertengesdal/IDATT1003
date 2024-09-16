package ovinger.oving8.oppgave1;

import java.awt.*;
import java.util.Scanner;

/*
Oppgave 1
Lag en klasse Person med attributter fornavn, etternavn og fødselsår. Klassen skal ha en get-
metode for hvert attributt og være immutabel.
Lag en klasse ArbTaker med attributter personalia (datatype Person), arbtakernr, ansettelsesår,
månedslønn og skatteprosent. I tillegg til get-metoder for alle attributtene og set-metoder for å
endre attributter som det er naturlig at bør kunne forandres, skal klassen tilby operasjoner som
finner ut
• Hvor mange kroner arbeidstakeren trekkes i skatt per måned;
• Bruttolønn per år;
• Skattetrekk per år. Husk at juni er skattefri og i desember betales halv skatt;
• Navn på formen: etternavn, fornavn, eksempel: Johnsen, Berit;
• Alder;
• Antall år ansatt i bedriften;
• Om personen har vært ansatt mer enn et gitt antall år (parameter);
Finn ut i hvilke av disse tilfellene at ArbTaker-objektet må samarbeide med personalia-
objektet for å løse oppgaven. Tegn sekvensdiagram for disse operasjonene.
Inneværende år får du ut med følgende kodelinjer:
Java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
Int år = kalender.get(java.util.Calendar.YEAR);
Lag et enkelt klientprogram som legger inn data i et objekt av klassen ArbTaker og kaller alle
objektmetodene du har laget. Kontroller at resultatene blir riktige.
Lag et menystyrt program som gir brukeren muligheten til å forandre på datainnholdet i
objektet. La programmet gå i løkke slik at flere forandringer kan gjøres. For hvert
løkkegjennomløp skal programmet sende passende get-meldinger til objektet og skrive ut
resultatet av disse, slik at det er mulig å kontrollere at endringen er blitt utført. Lag eventuelt
toStrin()-metoder og bruk disse.
 */
public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Oleander", "Tengesdal", 2003);
        ArbTaker a1 = new ArbTaker(p1, 1, 2021, 1000, 0.5);

        System.out.println(a1.getAlder());
        System.out.println(a1.harJobbetI(2));
        System.out.println(a1.getNavn());
        System.out.println(a1.getSkatteTrekkAar());

        while (true) {
            System.out.println("1: Hvor mange kroner arbeidstakeren trekkes i skatt per måned\n2: Bruttolønn per år.\n3: Skatte trekk per år.\n4: Navn.\n5: Alder.\n6: Antall år i bedriften.\n7: Personen vært ansatt i x antall år.\n 8: Avslutt programmet.");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

            if (input == 8) {
                System.out.print("Avslutter programmet!");
                break;
            }


            switch (input) {
                case 1:
                    System.out.println("Arbeids takeren trekkes " + a1.getSkatteTrekk() + "kr i skat pr måned.");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Velg på nytt.");
                    break;



            }

        }
    }
}
