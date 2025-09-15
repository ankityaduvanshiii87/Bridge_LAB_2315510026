package Best_Programming_Practise;

class Student {
    static String universityName = "ABC University";
    private static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private String grade;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University   : " + universityName);
            System.out.println("Roll Number  : " + rollNumber);
            System.out.println("Name         : " + name);
            System.out.println("Grade        : " + grade);
        } else {
            System.out.println("Invalid Student object.");
        }
    }

    void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated successfully for Roll Number: " + rollNumber);
        } else {
            System.out.println("Invalid Student object. Cannot update grade.");
        }
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
}

public class University_Student_Management {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rohit", "A");
        Student s2 = new Student(102, "Priya", "B");

        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();

        System.out.println();
        Student.displayTotalStudents();

        System.out.println();
        s2.updateGrade("A+");
        s2.displayStudentDetails();

        System.out.println();
        if (s1 instanceof Student) {
            System.out.println("Yes, s1 is a valid Student object.");
        }
    }
}
