package Java_class_and_object.Level2;

import java.util.ArrayList;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int quantityToAdd) {
        this.quantity += quantityToAdd;
        System.out.println("Added " + quantityToAdd + " of " + this.itemName + " to the cart.");
    }

    public void removeItem(int quantityToRemove) {
        if (quantityToRemove > this.quantity) {
            System.out.println("Cannot remove " + quantityToRemove + " of " + this.itemName + " as there are only " + this.quantity + " left.");
        } else {
            this.quantity -= quantityToRemove;
            System.out.println("Removed " + quantityToRemove + " of " + this.itemName + " from the cart.");
        }
    }

    public double totalCost() {
        return this.price * this.quantity;
    }

    public void displayItem() {
        System.out.println("Item: " + this.itemName + ", Price: $" + this.price + ", Quantity: " + this.quantity);
    }
}

class ShoppingCart {
    private ArrayList<CartItem> items = new ArrayList<>();

    public void addToCart(CartItem item) {
        items.add(item);
        System.out.println(item + " added to cart.");
    }

    public void displayCart() {
        System.out.println("\n🛒 Shopping Cart:");
        if (items.isEmpty()) {
            System.out.println("Cart is empty!");
        } else {
            for (CartItem item : items) {
                item.displayItem();
            }
            System.out.println("Total Cart Value: $" + calculateTotal());
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.totalCost();
        }
        return total;
    }
}

public class CartDemo {
    public static void main(String[] args) {
        CartItem laptop = new CartItem("Laptop", 999.99, 1);
        CartItem phone = new CartItem("Phone", 599.50, 2);

        laptop.addItem(1);
        phone.removeItem(1);

        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(laptop);
        cart.addToCart(phone);

        cart.displayCart();
    }
}