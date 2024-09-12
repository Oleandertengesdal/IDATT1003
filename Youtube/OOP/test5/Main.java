package Youtube.OOP.test5;

public class Main {
    public static void main(String[] args) {
        try {
            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x + b + d);
        } catch (NumberFormatException e) {
            System.out.println("Bad number");
        }
    }
}