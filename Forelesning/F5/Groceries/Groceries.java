package Forelesning.F5.Groceries;

class Groceries {

    private String groceryName;
    private int groceryNr;
    private double price; // pris pr kilo, alltid uten moms

    public Groceries(String startGroceryName, int startGroceryNr, double startPrice) {
        groceryName = startGroceryName;
        groceryNr = startGroceryNr;
        price = startPrice;
    }

    public Groceries(String startGroceryName, int startGroceryNr) {
        groceryName = startGroceryName;
        groceryNr = startGroceryNr;
        price = 0.0;
    }

    public String getGroceryName() {
        return groceryName;
    }

    public int getGroceryNr() {
        return groceryNr;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        java.util.Formatter f = new java.util.Formatter();
        f.format("%.2f", price);
        return groceryNr + ": " + groceryName + ", pris pr. TEST kg kr " + f.toString() + " u.moms.";
    }
}
