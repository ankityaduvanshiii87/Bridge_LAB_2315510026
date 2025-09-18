package oops4;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public Department addDepartment(String deptName) {
        Department d = new Department(deptName);
        departments.add(d);
        return d;
    }

    public void displayCompany() {
        System.out.println("\nCompany: " + name);
        for (Department d : departments) {
            d.display();
        }
    }
    public void closeCompany() {
        departments.clear(); 
        System.out.println("\nCompany " + name + " is closed. All departments and employees removed.");
    }
}

