package Forelesning.F5.Groceries3;

/*
 * Groceries3.java
 */

class Pricecalculation3 {
    public static void main(String[] args) {
        try{
            Groceries3 grocery = new Groceries3("Norgesost", 12345, 79.50);
            System.out.println(grocery.toString());

            // Leser inn antkg fra bruker
            double numberOfKilo = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Number of kilo: "));

            //Øensker formatert utskrift
            java.text.DecimalFormat format = new java.text.DecimalFormat("###0.00");

            // beregner pris med og uten moms
            while (numberOfKilo < 0.1 || numberOfKilo > 10){
                System.out.println ("Number of kilo must be between 0.1 and 10 kilo");
                numberOfKilo = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Number of kilo: "));
            }
            System.out.println(numberOfKilo + " ost koster: "  + format.format(grocery.findPriceWithoutTax(numberOfKilo)) + ",- u/mva");

            while (numberOfKilo < 0.1 || numberOfKilo > 10){
                System.out.println ("Number of kilo must be between 0.1 and 10 kilo");
                numberOfKilo = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Number of kilo: "));
            }
            System.out.println(numberOfKilo + " ost koster: "+ format.format(grocery.findPriceWithTax(numberOfKilo)) + ",- m/mva");
        } catch (IllegalArgumentException e){
            System.out.println ("Error in contructor");
        }
    }
}

/* Kj�ring av programmet:

 */



