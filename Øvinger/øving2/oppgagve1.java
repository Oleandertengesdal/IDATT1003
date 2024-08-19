class skuddaar {

    public static void main(String[] args) {
        int aar = 2000;
        if (aar % 4 == 0 && aar % 100 != 0 || aar % 400 == 0) {
            System.out.println("Skuddaar");
        } else {
            System.out.println("Ikke skuddaar");
        }
    }
}