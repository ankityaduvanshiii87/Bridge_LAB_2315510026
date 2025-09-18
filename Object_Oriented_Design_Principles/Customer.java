package oops4;

import java.util.*;

public class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("\nAccounts of " + name + ":");
        for (Account acc : accounts) {
            System.out.println("Bank: " + acc.getBank().getName() + ", Balance: " + acc.getBalance());
        }
    }
}
