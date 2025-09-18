package oops4;

import java.util.*;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }
    public void openAccount(Customer customer, double initialBalance) {
        customer.addAccount(new Account(this, initialBalance));
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for " + customer.getName() + " in " + name + " Bank");
    }

    public String getName() {
        return name;
    }
}

