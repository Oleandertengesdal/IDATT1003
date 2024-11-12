package Forelesning.F9.oppgave2;

public class Bank {

    public boolean validateUser(String username, String password) {
        return username.equals("admin") && password.equals("admin");
    }
}
