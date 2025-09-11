package Java_class_and_object.Level_1;


public class Employee_Details {
    String name;
    int id;
    double salary;

    Employee_Details(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee_Details emp = new Employee_Details("Rohan", 1, 500000);
        emp.displayEmployee();
    }
}
