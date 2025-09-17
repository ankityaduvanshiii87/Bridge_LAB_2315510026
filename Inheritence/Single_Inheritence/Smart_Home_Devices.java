package Inheritence.Single_Inheritence;

class Device {
    String deviceId;
    String status;
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}
class Thermostat extends Device {
    int temperatureSetting;
    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    void displayStatus() {
        System.out.println("Device: " + deviceId + ", Status: " + status + ", Temperature: " + temperatureSetting);
    }
}
public class Smart_Home_Devices {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("Thermo1", "ON", 22);
        t.displayStatus();
    }
}

