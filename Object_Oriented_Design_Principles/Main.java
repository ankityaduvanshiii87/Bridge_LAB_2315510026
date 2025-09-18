package oop3;

public class Main {

	public static void main(String[] args) {
        Course jc = new Course("Java Programming", "CS101", 4);
        Course dbc = new Course("Database Systems", "CS102", 3);
        
        Student s1 = new Student("Nakul", 101, "nakul@example.com", "Male");
        Student s2 = new Student("Priyam", 102, "priyam@example.com", "Male");
        
        Faculty f1 = new Faculty("Dr. Sharma", 201, "Computer Science", jc);
        Faculty f2 = new Faculty("Prof. Mehta", 202, "Computer Science", dbc);
        
        f1.grading(s1, "A");
        f1.grading(s2, "B+");
        f2.grading(s1, "A+");
        f2.grading(s2, "A");
        System.out.println();
        s1.displayStudentInfo();
        System.out.println();
        s1.displayCourses();
        System.out.println();
        s2.displayStudentInfo();
        s2.displayCourses();
        System.out.println();
        jc.displayCourse();
        System.out.println();
        dbc.displayCourse();
    }

}