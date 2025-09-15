package Best_Practices_in_Constructors.Access_Modifiers;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void display() {
        System.out.println("ID: " + employeeID + ", Department: " + department + ", Salary: " + getSalary());
    }

    public static void main(String[] args) {
        Manager m = new Manager(1001, "IT", 50000);
        m.display();
        m.setSalary(60000);
        m.display();
    }
}
