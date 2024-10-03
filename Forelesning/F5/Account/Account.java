package Forelesning.F5.Account;

/*
 * Account.java  B.K. 2020-08-30
 *
 */
class Account {
    private long accountnr;
    private String name;
    private double saldo;

    public Account(long accountnr, String name, double saldo) {
        this.accountnr = accountnr;
        this.name = name;
        this.saldo = saldo;
    }

    public Account(long accountnr, String name) {
        this.accountnr = accountnr;
        this.name = name;
        this.saldo = 0;
    }

    public long getAccountnr() {
        return accountnr;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getName() {
        return name;
    }

    public boolean doTransaktion(double amount) {
        if (saldo + amount >= 0) {
            saldo += amount;
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return accountnr + " " + name + " " + saldo;
    }

} // Account

