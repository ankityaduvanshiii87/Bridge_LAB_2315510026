package Best_Practices_in_Constructors.Level1;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost(double dailyRate) {
        return dailyRate * rentalDays;
    }

    public static void main(String[] args) {
        CarRental c1 = new CarRental("Amit", "SUV", 5);
        double totalCost = c1.calculateTotalCost(2000.0);
        System.out.println("Customer: " + c1.customerName + ", Car: " + c1.carModel + 
                           ", Days: " + c1.rentalDays + ", Total Cost: " + totalCost);
    }
}
