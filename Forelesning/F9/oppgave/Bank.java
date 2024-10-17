package Forelesning.F9.oppgave;

import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void transferFromAccountToAccount(Account fromAccount, Account toAccount, double amount) {
        fromAccount.subFromBalance(amount);
        toAccount.addToBalance(amount);
    }

    public void transferFromAccountToAccount(int fromAccountNumber, int toAccountNumber, double amount) {
        Account fromAccount = getAccount(fromAccountNumber);
        Account toAccount = getAccount(toAccountNumber);
        transferFromAccountToAccount(fromAccount, toAccount, amount);
    }

    public Account getAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountID() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void printAllAccounts() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    


}
