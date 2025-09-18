package oops5;

import java.util.ArrayList;

public class Order {
    private static int orderCounter = 1;

    private int orderId;
    private Customer customer;              
    private ArrayList<Product> products;    

    public Order(Customer customer, ArrayList<Product> products) {
        this.orderId = orderCounter++;
        this.customer = customer;
        this.products = products;
    }

    public void showOrderDetails() {
        System.out.println("Order #" + orderId + " by " + customer.getName() + ":");
        double total = 0;
        for (Product p : products) {
            System.out.println(" - " + p.getName() + " (₹" + p.getPrice() + ")");
            total += p.getPrice();
        }
        System.out.println("Total: ₹" + total + "\n");
    }
}

