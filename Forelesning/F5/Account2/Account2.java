package Forelesning.F5.Account2;

/*
 * Account2.java  B.K. 2020-08-30
 * En utgave av klassen Konto der vi bruker oere i stedet for kroner
 * for aa utnytte fordelene med heltallsberegninger.
 * Grensesnittet mot omverdenen er det samme.
 */
class Account2 {
    private long accountnr;
    private String name;
    private long saldo; //oere

    public Account2(long accountnr, String name, double saldo) {
        this.accountnr = accountnr;
        this.name = name;
        this.saldo = changeIntoOere(saldo);
    }

    public long getAccountnr() {
        return accountnr;
    }

    public String getName() {
        return name;
    }

    public double getSaldo() {
        double saldoKr = changeIntoKr(saldo);
        return saldoKr;
    }


    public boolean doTransaktion(double amount) {
        int amountOere = changeIntoOere(amount);
        if (saldo + amountOere >= 0) {
            saldo += amountOere;
            return true;
        } else {
            return false;
        }
    }

    /* Hjelpemetoder */
    private int changeIntoOere(double kr) {
        return (int) (kr * 100);
    }

    private double changeIntoKr(long oere) {
        return oere * 0.01;
    }

    public String toString() {
        return accountnr + " " + name + " " + saldo;
    }

} // Account
