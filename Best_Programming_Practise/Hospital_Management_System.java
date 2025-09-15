package Best_Programming_Practise;

class Patient {
    static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;

    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name : " + hospitalName);
            System.out.println("Patient ID    : " + patientID);
            System.out.println("Name          : " + name);
            System.out.println("Age           : " + age);
            System.out.println("Ailment       : " + ailment);
        } else {
            System.out.println("Invalid Patient object.");
        }
    }

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
}

public class Hospital_Management_System {
    public static void main(String[] args) {
        Patient p1 = new Patient(201, "Amit Kumar", 45, "Flu");
        Patient p2 = new Patient(202, "Neha Sharma", 30, "Fracture");

        p1.displayPatientDetails();
        System.out.println();
        p2.displayPatientDetails();

        System.out.println();
        Patient.getTotalPatients();

        System.out.println();
        if (p1 instanceof Patient) {
            System.out.println("Yes, p1 is a valid Patient object.");
        }
    }
}