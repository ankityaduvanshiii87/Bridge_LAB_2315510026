package Java_class_and_object.Level2;

public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "N/A";
        this.price = 0.0;
        this.isBooked = false;
    }

    // Method to book ticket
    public void bookTicket(String seatNumber, double price) {
        if (isBooked) {
            System.err.println("❌ Sorry, ticket already booked for this movie!");
        } else {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("✅ Ticket successfully booked!");
            displayTicket();
        }
    }

    // Method to display ticket details
    public void displayTicket() {
        if (this.isBooked) {
            System.out.println("🎬 Movie: " + this.movieName);
            System.out.println("💺 Seat Number: " + this.seatNumber);
            System.out.println("💰 Price: $" + this.price);
            System.out.println("---------------------------");
        } else {
            System.out.println("⚠️ Ticket has not been booked yet.");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Creating ticket object
        MovieTicket ticket1 = new MovieTicket("Dragon");

        // Test cases
        ticket1.displayTicket(); // Not booked yet
        ticket1.bookTicket("A10", 120.0); // Successful booking
        ticket1.bookTicket("B10", 120.0); // Already booked
        ticket1.bookTicket("A11", 120.0); // Already booked
        ticket1.displayTicket(); // Display booked ticket
    }
}
