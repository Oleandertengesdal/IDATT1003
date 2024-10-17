package Forelesning.F9.oppgave;

import java.util.Scanner;

public class UserInterface {

    private final Bank bank = new Bank();

    public void start() {
        init();
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            printMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter balance:");
                    double balance = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter owner name:");
                    String ownerName = sc.nextLine();
                    System.out.println("Enter account ID:");
                    int accountID = sc.nextInt();
                    sc.nextLine();
                    Account account = new Account(balance, ownerName, accountID);
                    bank.addAccount(account);
                }
                case 2 -> {
                    System.out.println("Enter from account number:");
                    int fromAccountNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter to account number:");
                    int toAccountNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter amount:");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    bank.transferFromAccountToAccount(fromAccountNumber, toAccountNumber, amount);
                }
                case 3 -> bank.printAllAccounts();
                case 4 -> running = false;
            }
        }

    }

    public void printMenu() {
        System.out.println("1. Add account");
        System.out.println("2. Transfer from account to account");
        System.out.println("3. Print all accounts");
        System.out.println("4. Exit");
    }

    public void init() {
        Account account1 = new Account(100, "Ola", 1);
        Account account2 = new Account(200, "Kari", 2);
        Account account3 = new Account(300, "Per", 3);
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.printAllAccounts();
        bank.transferFromAccountToAccount(1, 2, 50);
        bank.printAllAccounts();
    }
}
