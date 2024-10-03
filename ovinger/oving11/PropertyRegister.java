package ovinger.oving11;

import java.util.ArrayList;

/**
 * Klasse for til å representere einendoms-registeret.
 * Metoder for å registrere en eiendom, seltte en eiendom, hente ut alle
 * eiendommer i registeret og finne en eiendom basert på (kommune nummer,
 * gardsnummer (gnr) eller bruksnummer.
 */
public class PropertyRegister {

    /*
     * ArrayList slik at man kan leggetil eller fjerne eiendommer uten
     * å måtte lage en ny tabell.
     */
    ArrayList<Property> properties;

    /**
     * Konstruktør for å aktivere Eiendomsregisteret
     */
    public PropertyRegister() {
        this.properties = new ArrayList<>();
    }

    /**
     * Metode for å leggetil en eiendom til registeret.
     *
     * @param property Eiendommen som skal legges til.
     */
    public void addProperty(Property property) {
        this.properties.add(property);
    }


    /**
     * Metode for å fjerne en eiendom fra registeret.
     * Sjekker om eiendommen faktisk finnes i registeret.
     * @param property Eiendommen som skal fjernes.
     */
    public void removeProperty(Property property) {
        if(this.properties.contains(property)) {
            this.properties.remove(property);
        } else {
            throw new IllegalArgumentException("Property does not exist");
        }
    }

    /**
     * Metode for å finnne antall eiendommer i registeret. (heltall).
     *
     * @return antall eiendommer i registeret.
     */
    public int totalProperties() {
        return this.properties.size();
    }

    /**
     * Metode for å finne eiendom med hjelp av EiendomsID.
     * Sjekker om det finnes en eiendom med den ID'en, kaster
     * en feilmelding hvis den ikke finner en.
     *
     * @param municipalityNumber    Postnummer
     * @param lotNumber             Gardsnummer
     * @param sectionNumber         Bruksnummer
     * @return                      Eiendommen som har samme ID
     */
    public Property getPropertyByID(int municipalityNumber, int lotNumber, int sectionNumber) {
        String propertyID = municipalityNumber + "-" + lotNumber + "/" + sectionNumber;
        for (Property property : this.properties) {
            if (property.getPropertyID().equals(propertyID)) {
                return property;
            }
        }
        throw new IllegalArgumentException("No property found with ID: " + propertyID);
    }

    /**
     * Metode for å hente ut de eiendommene som har samme postkode.
     *
     * @param municipalityNumber Hvilket kommunenummer vi skal bruke.
     * @return returnerer alle eiendommmer i denne postkoden.
     */
    public ArrayList<Property> getPropertiesMunicipalityNumber(int municipalityNumber) {
        ArrayList<Property> propertiesMunicipalityNumber = new ArrayList<>();
        for (Property property : this.properties) {
            if (property.getMunicipalityNumber() == municipalityNumber) {
                propertiesMunicipalityNumber.add(property);
            }
        }
        // Sjekker tabellen er tom og kaster en feilmelding hvis den er det.
        if (propertiesMunicipalityNumber.isEmpty()) {
            throw new IllegalArgumentException("No property found with municipality number:"  + municipalityNumber);
        }
        return propertiesMunicipalityNumber;
    }

    /**
     * Metode for å hente ut de eiendommene som har samme gardsnummer.
     *
     * @param lotNumber Hvilket gardsnummer vi skal bruke.
     * @return returnerer alle eiendommmer i dette gardsnummeret.
     */
    public ArrayList<Property> getPropertiesLotNumber(int lotNumber) {
        ArrayList<Property> propertiesLotNumber = new ArrayList<>();
        for (Property property : properties) {
            if (property.getLotNumber() == lotNumber) {
                propertiesLotNumber.add(property);
            }
        }
        // Sjekker tabellen er tom og kaster en feilmelding hvis den er det.
        if (propertiesLotNumber.isEmpty()) {
            throw new IllegalArgumentException("No property found with lot number:"  + lotNumber);
        }
        return propertiesLotNumber;
    }

    /**
     * Metode for å hente ut de eiendommene som har samme bruksnummer.
     *
     * @param sectionNumber Hvilket bruksnummer vi skal bruke.
     * @return returnerer alle eiendommmer i dette bruksnummeret.
     */
    public ArrayList<Property> getPropertiesSectionNumber(int sectionNumber) {
        ArrayList<Property> propertiesWithSectionNumber = new ArrayList<>();
        for (Property property : properties) {
            if (property.getSectionNumber() == sectionNumber) {
                propertiesWithSectionNumber.add(property);
            }
        }
        // Sjekker tabellen er tom og kaster en feilmelding hvis den er det.
        if (propertiesWithSectionNumber.isEmpty()) {
            throw new IllegalArgumentException("No property found with section number:"  + sectionNumber);
        }
        return propertiesWithSectionNumber;
    }

    /**
     * Metode for å hente gjennomsnittareal av alle eiendommene i registeret.
     *
     * @return gjennomsnittarealet av alle eiendommene.
     */
    public double avrageArea() {
        double area = 0.0;
        for (Property property : properties) {
            area += property.getArea();
        }
        return area / this.properties.size();
    }
}
