package oops4;

public class Doctor {
    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }
    public void consult(Patient p) {
        System.out.println("Dr. " + name + " (Specialist: " + specialization + 
                           ") is consulting patient " + p.getName());
        p.addConsultation(this); 
    }
}

