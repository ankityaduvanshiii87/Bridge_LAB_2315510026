package oops5;
import java.util.*;
public class Ecommerce_MAin {
	public static void main(String[] args) {
        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Headphones", 2000);
        Product p3 = new Product("Mouse", 800);
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");
        ArrayList<Product> order1Products = new ArrayList<>();
        order1Products.add(p1);
        order1Products.add(p2);
        c1.placeOrder(order1Products);

        ArrayList<Product> order2Products = new ArrayList<>();
        order2Products.add(p3);
        c2.placeOrder(order2Products);
        c1.viewOrders();
        c2.viewOrders();
    }

}
