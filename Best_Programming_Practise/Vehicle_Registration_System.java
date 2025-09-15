package Best_Programming_Practise;

class Vehicle {
    static double registrationFee = 5000.0;

    private final int registrationNumber;
    private String ownerName;
    private String vehicleType;

    Vehicle(int registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number : " + registrationNumber);
            System.out.println("Owner Name          : " + ownerName);
            System.out.println("Vehicle Type        : " + vehicleType);
            System.out.println("Registration Fee    : " + registrationFee);
        } else {
            System.out.println("Invalid Vehicle object.");
        }
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class Vehicle_Registration_System {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(101, "Rohit Sharma", "Car");
        Vehicle v2 = new Vehicle(102, "Priya Mehta", "Bike");

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        System.out.println();
        Vehicle.updateRegistrationFee(6000.0);

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        System.out.println();
        if (v1 instanceof Vehicle) {
            System.out.println("Yes, v1 is a valid Vehicle object.");
        }
    }
}