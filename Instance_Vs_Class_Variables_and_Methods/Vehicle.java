package Best_Practices_in_Constructors.Instance_Vs_Class_Variables_and_Methods;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000.0;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rahul", "Car");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(6000);
        Vehicle v2 = new Vehicle("Anita", "Bike");
        v2.displayVehicleDetails();
    }
}
