package oops4;

import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books;
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void displayLibraryBooks() {
        System.out.println("\nBooks in " + name + " Library:");
        for (Book book : books) {
            book.displayBookDetails();
        }
    }
}
