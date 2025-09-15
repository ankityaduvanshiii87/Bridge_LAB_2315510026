package Best_Practices_in_Constructors.Level1;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("Neha", "Deluxe", 3);
        HotelBooking b3 = new HotelBooking(b2);

        System.out.println("Default: " + b1.guestName + ", " + b1.roomType + ", " + b1.nights);
        System.out.println("Parameterized: " + b2.guestName + ", " + b2.roomType + ", " + b2.nights);
        System.out.println("Copy: " + b3.guestName + ", " + b3.roomType + ", " + b3.nights);
    }
}

