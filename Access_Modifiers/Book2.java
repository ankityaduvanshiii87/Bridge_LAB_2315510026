package Best_Practices_in_Constructors.Access_Modifiers;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor());
    }

    public static void main(String[] args) {
        EBook eb = new EBook("123-456", "Java Programming", "John Doe");
        eb.display();
        eb.setAuthor("Jane Doe");
        eb.display();
    }
}
