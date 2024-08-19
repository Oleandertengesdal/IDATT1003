import java.util.Scanner;

class gangertabeller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv inn det første tallet: ");
        int a = sc.nextInt();
        System.out.println("Skriv in det andre tallet: ");
        int b = sc.nextInt();
        if (a < b) {
            do {
                System.out.println(a +"-gangen:");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(a + " * " + i + " = " + a * i);
                }
                a++;
            } while (a <= b);


        } else {
            System.out.println("Det første tallet må være mindre enn det andre tallet");
            sc.close();
            return;
        }
        sc.close();
    }
}

