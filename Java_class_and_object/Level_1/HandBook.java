package Java_class_and_object.Level_1;

public class HandBook {
    String bookTitle;
    String bookAuthor;
    double price;

    HandBook(String bookTitle, String bookAuthor, double price) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Title of the book: " + bookTitle);
        System.out.println("Author of the book: " + bookAuthor);
        System.out.println("Price of the book: " + price);
    }

    public static void main(String[] args) {
        HandBook book1 = new HandBook("2States", "Chetan Bhagat", 500);
        HandBook book2 = new HandBook("Wings Of Fire", "Abdul Kalam A.P.J", 500);

        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}