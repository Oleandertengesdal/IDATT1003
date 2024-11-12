package Forelesning.F9.oppgave2;

public class Customer {

    private String username;

    private String password;

    public boolean login() {
        Bank bank = new Bank();
        return bank.validateUser(username, password);
    }
}
