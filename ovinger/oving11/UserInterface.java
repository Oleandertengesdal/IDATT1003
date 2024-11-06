package ovinger.oving11;

import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public class UserInterface {

    // Constants representing the different menu choices
    private final int ADD_PROPERTY = 1;
    private final int LIST_ALL_PROPERTIES = 2;
    private final int FIND_PROPERTY = 3;
    private final int CALCULATE_AVERAGE_AREA = 4;
    private final int REMOVE_PROPERTY = 5;
    private final int EXIT = 9;

    //Makes so the userInterface is in the right property register
    private PropertyRegister propertyRegister;

    /**
     * Constructor to initialize the propertyRegister
     *
     * @param propertyRegister the property register
     */
    public UserInterface(PropertyRegister propertyRegister) {
        this.propertyRegister = propertyRegister;
    }

    /**
     * Presents the menu for the user, and awaits input from the user. The menu
     * choice selected by the user is being returned.
     *
     * @return the menu choice by the user as a positive number starting from 1.
     * If 0 is returned, the user has entered a wrong value
     */
    private int showMenu() {
        int menuChoice = 0;
        System.out.println("\n***** Property Register Application v0.1 *****\n");
        System.out.println("1. Add property");
        System.out.println("2. List all properties");
        System.out.println("3. Search property");
        System.out.println("4. Calculate average area");
        System.out.println("5. Remove property");
        //TODO: Add more menus
        System.out.println("9. Quit");
        System.out.println("\nPlease enter a number between 1 and 9.\n");

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            menuChoice = sc.nextInt();
        } else {
            System.out.println("You must enter a number, not text");
        }
        return menuChoice;
    }

    int lotNumber, sectionNumber, municipalityNumber;


    /**
     * Starts the application. This is the main loop of the application,
     * presenting the menu, retrieving the selected menu choice from the user,
     * and executing the selected functionality.
     */
    public void start() {
        boolean finished = false;
        // The while-loop will run as long as the user has not selected
        // to quit the application
        Scanner sc = new Scanner(System.in);
        while (!finished) {
            int menuChoice = this.showMenu();
            switch (menuChoice) {
                case ADD_PROPERTY:

                    // Read property details
                    System.out.print("Enter municipality number: ");
                    municipalityNumber = sc.nextInt();
                    sc.nextLine(); // clear the newline after interger input

                    System.out.println("Enter municipality name: ");
                    String municipalityName = sc.nextLine();

                    System.out.print("Enter lot number: ");
                    lotNumber = sc.nextInt();
                    sc.nextLine(); // clear the newline after integer input

                    System.out.println("Enter section number: ");
                    sectionNumber = sc.nextInt();
                    sc.nextLine(); // clear the newline after integer input

                    System.out.println("Enter property name (\"no\" if you don't want name): ");
                    String name = sc.nextLine();

                    System.out.println("Enter property area: ");
                    double area = sc.nextDouble();
                    sc.nextLine(); // clear the newline after double input

                    System.out.println("Enter name of owner: ");
                    String owner = sc.nextLine();


                    // Add the Property depending if the user provided a name or not.
                    if (name.equalsIgnoreCase("no")) {
                        try {
                            Property property = new Property(municipalityNumber, municipalityName,
                                    lotNumber, sectionNumber, area, owner);
                            propertyRegister.addProperty(property);
                        } catch (Exception e) {
                            System.out.println("Feilmelding: " + e);
                        }
                    } else {
                        try {
                            Property property = new Property(municipalityNumber, municipalityName,
                                    lotNumber, sectionNumber, name, area, owner);
                            propertyRegister.addProperty(property);
                        } catch (Exception e) {
                            System.out.println("Feilmelding: " + e);
                        }
                    }
                    municipalityNumber = 0; lotNumber = 0; sectionNumber = 0;
                    break;
                case LIST_ALL_PROPERTIES:

                    //Gets all the properties from the getProperties methond.
                    ArrayList<Property> properties = propertyRegister.getProperties();

                    //Checks if the Array of properties is empty
                    if (properties.isEmpty()) {
                        System.out.println("No properties found in the register.");
                    } else {
                        //Prints out all the properties.
                        for (Property property : properties) {
                            System.out.println(property);
                        }
                    }
                    break;
                case FIND_PROPERTY:

                    // Reads details from user.
                    System.out.println("Enter municipality number: ");
                    municipalityNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter lot number: ");
                    lotNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter section number: ");
                    sectionNumber = sc.nextInt();
                    sc.nextLine();

                    // Checks if the property exists.
                    Property property = propertyRegister.getPropertyByID(municipalityNumber, lotNumber, sectionNumber);
                    if (property != null) {
                        System.out.println(property);
                    } else {
                        System.out.println("Property with ID " + municipalityNumber + "-" + lotNumber + "/" + sectionNumber + "not found.");
                    }

                    municipalityNumber = 0; lotNumber = 0; sectionNumber = 0;
                    break;
                case CALCULATE_AVERAGE_AREA:

                    //Checks if the average area is valid.
                    try {
                        System.out.println("The average area of the properties in the register is " +
                                propertyRegister.avrageArea());
                    } catch (Exception e) {
                        System.out.println("Feilmelding: " + e);
                    }
                    break;
                case REMOVE_PROPERTY:
                    //Gets details from user.
                    System.out.println("Enter municipality number: ");
                    int munNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter lot number: ");
                    lotNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter section number: ");
                    sectionNumber = sc.nextInt();
                    sc.nextLine();

                    //Gets the property the user wants to delete.
                    Property deleteProperty = propertyRegister.getPropertyByID(municipalityNumber, lotNumber, sectionNumber);

                    // Double checks if the user wants to delete the property.
                    System.out.println("Are you sure you want to delete: \n" + deleteProperty + " (y/n).");
                    String check  = sc.nextLine();

                    if (check.equalsIgnoreCase("y") || check.equalsIgnoreCase("yes")) {
                        propertyRegister.removeProperty(deleteProperty);
                        System.out.println("Property deleted.");
                    } else {
                        System.out.println("Did not delete: \n" + deleteProperty);
                    }

                    break;
                case EXIT:
                    System.out.println("Thank you for using the Properties app!\n");
                    finished = true;
                    break;
                default:
                    System.out.println("Unrecognized menu selected..");
                    break;
            }
        }
    }
}
