package Forelesning.F9.oppgave;

public class Account {
    private double balance;
    private final String ownerName;
    private final int accountID;


    public Account(double balance, String ownerName, int accountID) {
        this.balance = balance;
        this.ownerName = ownerName;
        this.accountID = accountID;
    }

    public Account(String ownerName, int accountID) {
        this.ownerName = ownerName;
        this.accountID = accountID;
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void addToBalance(double amount) {
        this.balance += amount;
    }

    public void subFromBalance(double amount) {
        this.balance -= amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return ownerName + " " + accountID + " " + balance;
    }
}
