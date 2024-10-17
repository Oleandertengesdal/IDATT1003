package Forelesning.F9.oppgave2;

public class Bank {

    public boolean confirmUser(String username, String password) {
        if (username.equals("admin") && password.equals("admin")) {
            return true;
        }
        return false;
    }
}
