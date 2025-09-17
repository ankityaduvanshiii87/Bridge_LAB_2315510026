package Inheritence.Assisted_Problems;

class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}
class Manager extends Employee {
    int teamSize;
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
class Developer extends Employee {
    String programmingLanguage;
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
class Intern extends Employee {
    String university;
    Intern(String name, int id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("University: " + university);
    }
}
public class Employee1 {
    public static void main(String[] args) {
        Employee[] arr = {
            new Manager("Alice", 1, 90000, 10),
            new Developer("Bob", 2, 80000, "Java"),
            new Intern("Charlie", 3, 15000, "ABC University")
        };
        for (Employee e : arr) {
            e.displayDetails();
            System.out.println("---");
        }
    }
}
