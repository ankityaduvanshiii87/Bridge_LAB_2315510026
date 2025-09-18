package oops4;

public class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void display() {
        System.out.println("Employee: " + name + " (" + role + ")");
    }
}

