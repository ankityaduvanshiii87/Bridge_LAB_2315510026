package Best_Practices_in_Constructors.Level1;

public class Book1 {
    String title;
    String author;
    double price;
    boolean available;

    Book1(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public static void main(String[] args) {
        Book1 b1 = new Book1("The Alchemist", "Paulo Coelho", 350.50, true);
        System.out.println("Available: " + b1.available);
        b1.borrowBook();
        System.out.println("Available after borrowing: " + b1.available);
        b1.borrowBook();
    }
}

