package Best_Practices_in_Constructors.Instance_Vs_Class_Variables_and_Methods;

public class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC Institute";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: " + fee + ", Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 5000);
        c1.displayCourseDetails();
        Course.updateInstituteName("XYZ Academy");
        Course c2 = new Course("Python", 8, 6000);
        c2.displayCourseDetails();
    }
}
