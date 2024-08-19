class oppgave {
    public static void main(String[] args) {
        int sekunder = 4500;
        int timer = sekunder / 3600;
        int minutter = (sekunder % 3600) / 60;
        sekunder = sekunder % 60;

        System.out.println("4500 sekunder er lik " + timer + " timer, " + minutter + " minutter og " + sekunder + " sekunder.");
    }
}