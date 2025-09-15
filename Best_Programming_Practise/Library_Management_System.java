package Best_Programming_Practise;

class Book {
    static String libraryName = "National Library of India"; 
    private final String isbn;   // final → cannot be changed
    private String title;
    private String author;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;   
        this.title = title;
        this.author = author;
    }

    void displayBookDetails() {
        if (this instanceof Book) { // check object type
            System.out.println("Library Name : " + libraryName);
            System.out.println("ISBN         : " + isbn);
            System.out.println("Title        : " + title);
            System.out.println("Author       : " + author);
        } else {
            System.out.println("Not a valid Book object.");
        }
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}

public class Library_Management_System {
    public static void main(String[] args) {
        Book book1 = new Book("978-3-16-148410-0", "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("978-0-14-118263-6", "1984", "George Orwell");

        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();

        System.out.println();
        Book.displayLibraryName();
        System.out.println();
        if (book1 instanceof Book) {
            System.out.println("book1 is a valid Book object.");
        }
    }
}
