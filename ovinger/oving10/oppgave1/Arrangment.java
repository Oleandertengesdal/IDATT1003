package ovinger.oving10.oppgave1;

import org.w3c.dom.CDATASection;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * Klasse som skal representere ett gitt arrangement.
 */
public class Arrangment {

    // Unik ID til arrangementet
    private final int ID;
    private static int idCounter = 1;
    // Navnet til arrangementet.
    private String name;

    // Lokasjonen
    private String place;

    //Arrenkjør
    private String arrangor;

    //Dato på formen - YYYYMMDDHHMM
    private long dato;

    //Type arrangement.
    private String type;


    /*
     * Konstruktøren til klassen
     */
    public Arrangment(String name, long dato, String type, String place, String arrangor) {
        this.name = name;
        this.ID = idCounter;
        idCounter++;
        this.dato = dato;
        this.type = type;
        this.place = place;
        this.arrangor = arrangor;
    }

    //Henter ID'en til er Arrangement.
    public int getID() {
        return ID;
    }

    //Henter navnet.
    public String getName() {
        return name;
    }

    //Henter plassen
    public String getPlace() {
        return place;
    }

    //Henter arrangør
    public String getArrangor() {
        return arrangor;
    }

    //Henter Dato
    public long getDato() {
        return dato;
    }

    //Henter Type.
    public String getType() {
        return type;
    }

    // Printe ut dato.
    public String printDato() {

        // Konverterer longen til en String
        String date = this.dato + "";

        // Trekker ut år, måned, dag, time, minutt av Stringen.
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(4, 6));
        int day = Integer.parseInt(date.substring(6, 8));
        int hour = Integer.parseInt(date.substring(8, 10));
        int minute = Integer.parseInt(date.substring(10, 12));

        LocalDateTime dateTime = LocalDateTime.of(year, month, day, hour, minute);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        String formattedDate = dateTime.format(formatter);
        return formattedDate;
    }

    @Override
    public String toString() {
        return "Arrangement{" +
                "ID=" + ID +
                ", navn='" + name + '\'' +
                ", sted='" + place + '\'' +
                ", arrangor='" + arrangor + '\'' +
                ", type='" + type + '\'' +
                ", dato=" + printDato() +
                '}';
    }

}

