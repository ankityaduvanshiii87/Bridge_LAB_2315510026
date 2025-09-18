package oops4;

import java.util.ArrayList;

public class Patient {
    private String name;
    private ArrayList<Doctor> consultedDoctors;

    public Patient(String name) {
        this.name = name;
        this.consultedDoctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addConsultation(Doctor d) {
        if (!consultedDoctors.contains(d)) {
            consultedDoctors.add(d);
        }
    }

    public void viewConsultedDoctors() {
        System.out.println("\nPatient " + name + " has consulted:");
        for (Doctor d : consultedDoctors) {
            System.out.println(" - Dr. " + d.getName());
        }
    }
}

