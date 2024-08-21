class timer_min_til_s {
    public static void main(String[] args) {
        int timer = 1; 
        int minutter = 30;
        int sekunder = (timer * 60 + minutter) * 60;
        System.out.println(timer + " timer og " + minutter + " minutter er lik " + sekunder + " sekunder.");
    }
}