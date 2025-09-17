package Inheritence.Hybrid_Inheritance;

class Vehicle {
    int maxSpeed;
    String model;
    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}
interface Refuelable {
    void refuel();
}
class ElectricVehicle extends Vehicle {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    void charge() {
        System.out.println("Charging electric vehicle");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    public void refuel() {
        System.out.println("Refueling petrol vehicle");
    }
}
public class MainHybridVehicle {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "E-Car");
        PetrolVehicle pv = new PetrolVehicle(140, "P-Car");
        ev.charge();
        pv.refuel();
    }
}

