package oops4;

public class Library_Books_Main {
	public static void main(String[] args) {
        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("Clean Code", "Robert C. Martin");
        Library cityLibrary = new Library("City");
        Library collegeLibrary = new Library("College");
        cityLibrary.addBook(b1);
        cityLibrary.addBook(b2);

        collegeLibrary.addBook(b2); 
        collegeLibrary.addBook(b3);
        cityLibrary.displayLibraryBooks();
        collegeLibrary.displayLibraryBooks();
    }

}
