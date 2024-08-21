class kjottdeig {
    public static void main(String[] args) {
        double kjottdeig1Pris = 35.50;
        double kjottdeig1Vekt = 450;
        double kilopris1 = kjottdeig1Pris / kjottdeig1Vekt * 1000;
        double kjottdeig2Pris = 39.50;
        double kjottdeig2Vekt = 500;
        double kilopris2 = kjottdeig2Pris / kjottdeig2Vekt * 1000;

        if (kilopris1 < kilopris2) {
            System.out.println("Kjøttdeig 1 er billigst");
        } else {
            System.out.println("Kjøttdeig 2 er billigst");
        }
    }
}