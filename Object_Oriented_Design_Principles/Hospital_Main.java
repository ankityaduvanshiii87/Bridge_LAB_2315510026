package oops4;

public class Hospital_Main {
	public static void main(String[] args) {
        Hospital hospital = new Hospital("CityCare Hospital");
        Doctor d1 = new Doctor("Smith", "Cardiologist");
        Doctor d2 = new Doctor("Williams", "Dermatologist");
        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
        p1.viewConsultedDoctors();
        p2.viewConsultedDoctors();
    }

}
