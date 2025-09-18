package oops4;

import java.util.ArrayList;

public class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String role) {
        employees.add(new Employee(name, role));
    }

    public void display() {
        System.out.println("\nDepartment: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
    }
}

