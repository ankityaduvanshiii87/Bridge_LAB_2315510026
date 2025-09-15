package Best_Programming_Practise;
class Employee {
    static String companyName = "Tech Solutions Pvt. Ltd.";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name : " + companyName);
            System.out.println("Employee ID  : " + id);
            System.out.println("Name         : " + name);
            System.out.println("Designation  : " + designation);
        } else {
            System.out.println("Not a valid Employee object.");
        }
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

public class Employee_Management_System {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Amit", "Software Engineer");
        Employee e2 = new Employee(102, "Neha", "Project Manager");

        e1.displayEmployeeDetails();
        System.out.println();
        e2.displayEmployeeDetails();

        System.out.println();
        Employee.displayTotalEmployees();

        System.out.println();
        if (e1 instanceof Employee) {
            System.out.println("Yes, e1 is a valid Employee object.");
        }
    }
}

