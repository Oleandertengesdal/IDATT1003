package ovinger.oving11;

/**
 *  Property klassen representerer en tomt, med flere egenskaper, som municipalityNumber, municipalityName, lotNumber,
 *  sectionNumber, name, area, nameOfOwner.
 *  Klassen har aksesso-metoder for å hente data, og mutator-metoder for å sette ny data.
 */
public class Property {

    private final int municipalityNumber; //
    private final String municipalityName;
    private final int lotNumber;
    private final int sectionNumber;
    private String name;
    private double area;
    private String nameOfOwner;

    /**
     * Konstruktør for å intialaisere Property objektet med de gitte parameterene.
     *
     * @param municipalityNumber    kommune nummeret positivt heltall fra og med 101 til og med 5054
     * @param municipalityName      Kommunens navn
     * @param lotNumber             Gårdsnummeret et positivt heltall
     * @param sectionNumber         Bruksnummeret et positivt heltall
     * @param name                  Navn på tomten, valgfrtitt
     * @param area                  Arealet til tomten positivt deismaltall
     * @param nameOfOwner           Navnet til eieren.
     */
    public Property(int municipalityNumber, String municipalityName, int lotNumber,
                    int sectionNumber, String name, double area, String nameOfOwner) {


        /*
         * Sjekker om dataen som er gitt til konstuktøren følger de reglene som følger
         * de reglene vi har satt for de forkjellige egenskapene.
         */
        if (municipalityNumber < 101 || municipalityNumber > 5054) {
            throw new IllegalArgumentException("Municipality number must be between 101 and 5054");
        }
        if (municipalityName == null || municipalityName.isEmpty()) {
            throw new IllegalArgumentException("Municipality name cannot be empty");
        }
        if (lotNumber < 1) {
            throw new IllegalArgumentException("LotNumber must be greater than 0");
        }
        if (sectionNumber < 1) {
            throw new IllegalArgumentException("Section number must be greater than 0");
        }
        if (area <= 0) {
            throw new IllegalArgumentException("Area should be greater than 0");
        }

        this.municipalityNumber = municipalityNumber;
        this.municipalityName = municipalityName;
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.name = name;
        this.area = area;
        this.nameOfOwner = nameOfOwner;

    }

    /**
     * Overbelastet konstruktør itilfelle eiendommen ikke har ett navn.
     *
     * @param municipalityNumber    kommune nummeret positivt heltall fra og med 101 til og med 5054
     * @param municipalityName      Kommunens navn
     * @param lotNumber             Gårdsnummeret et positivt heltall
     * @param sectionNumber         Bruksnummeret et positivt heltall
     * @param area                  Arealet til tomten positivt deismaltall
     * @param nameOfOwner           Navnet til eieren.
     */
    public Property(int municipalityNumber, String municipalityName, int lotNumber,
                    int sectionNumber, double area, String nameOfOwner) {
        if (municipalityNumber < 101 || municipalityNumber > 5054) {
            throw new IllegalArgumentException("Municipality number must be between 101 and 5054");
        }
        if (municipalityName == null || municipalityName.isEmpty()) {
            throw new IllegalArgumentException("Municipality name cannot be empty");
        }
        if (lotNumber < 1) {
            throw new IllegalArgumentException("LotNumber must be greater than 0");
        }
        if (sectionNumber < 1) {
            throw new IllegalArgumentException("Section number must be greater than 0");
        }
        if (area <= 0) {
            throw new IllegalArgumentException("Area should be greater than 0");
        }

        this.municipalityNumber = municipalityNumber;
        this.municipalityName = municipalityName;
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.name = null;
        this.area = area;
        this.nameOfOwner = nameOfOwner;

    }


    // Aksessor metoder for å hente forkjellig data fra Property.
    public int getMunicipalityNumber() {
        return municipalityNumber;
    }

    public String getMunicipalityName() {
        return municipalityName;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    //Mutator metoder.

    /**
     * Metode for sette nytt navn på tomten, ved eierskifte eller om man ønsker nytt navn.
     *
     * @param name nytt navn til tomten.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metode for å sette nytt areal, ved kjøp/salg av grunnjord/tomt.
     *
     * @param area det nye arealet.
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Metode for å sette nytt navn på eier av tomten, ved eierskifte.
     * @param nameOfOwner
     */
    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    /**
     * Metode for å hente ID av eiendommen.
     *
     * @return ID'en til einedommen.
     */
    public String getPropertyID() {
        return municipalityNumber + "-" + lotNumber + "/" + sectionNumber;
    }

    /**
     * Metode for å gi en Streng som er lettere å lese.
     *
     * @return Streng som er lettere å lese for brukeren.
     */
    @Override
    public String toString() {
        return municipalityName + " " + municipalityNumber + "-" + lotNumber + "-" + sectionNumber + "\n" +
                "Navn på eier: " + name + ", Areal: " + area;
    }
}
