package Best_Programming_Practise;

class Product {
    static double discount = 10.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProductDetails() {
        if (this instanceof Product) {
            double totalPrice = price * quantity;
            double discountedPrice = totalPrice - (totalPrice * discount / 100);
            System.out.println("Product ID   : " + productID);
            System.out.println("Name         : " + productName);
            System.out.println("Price        : " + price);
            System.out.println("Quantity     : " + quantity);
            System.out.println("Discount     : " + discount + "%");
            System.out.println("Final Price  : " + discountedPrice);
        } else {
            System.out.println("Invalid product object.");
        }
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
}

public class Shopping_Cart_System {
    public static void main(String[] args) {
        Product p1 = new Product(201, "Laptop", 50000, 1);
        Product p2 = new Product(202, "Headphones", 2000, 2);

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();

        System.out.println();
        Product.updateDiscount(20);

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();

        System.out.println();
        if (p1 instanceof Product) {
            System.out.println("Yes, p1 is a valid Product object.");
        }
    }
}
