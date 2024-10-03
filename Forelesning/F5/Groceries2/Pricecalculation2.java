package Forelesning.F5.Groceries2;

/*
 * Groceries2.java
 */

class Pricecalculation2 {
    public static void main(String[] args) {
        Groceries2 grocery = new Groceries2("Norgesost", 124, 79.50);
        System.out.println(grocery.toString());

        // Leser inn antkg fra bruker
        double numberOfKg = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Antall kg: "));

        //Øensker formatert utskrift
        java.text.DecimalFormat format = new java.text.DecimalFormat("###0.00");

        // beregner pris med og uten moms
        System.out.println(numberOfKg + " ost koster: "  + format.format(grocery.findPriceWithoutTax(numberOfKg)) + ",- u/mva");
        System.out.println(numberOfKg + " ost koster: "+ format.format(grocery.findPriceWithTax(numberOfKg)) + ",- m/mva");

    }
}

/* Kj�ring av programmet:

124: Norgesost, pris pr. kg kr 79,50 u.moms.

*/



