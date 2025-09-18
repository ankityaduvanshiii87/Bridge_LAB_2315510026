package oops4;

public class Company_Departments_Main {
	public static void main(String[] args) {
        Company comp = new Company("TechSoft");
        Department dev = comp.addDepartment("Development");
        Department hr = comp.addDepartment("Human Resources");
        dev.addEmployee("Alice", "Developer");
        dev.addEmployee("Bob", "Senior Developer");

        hr.addEmployee("Carol", "HR Manager");
        hr.addEmployee("David", "Recruiter");
        comp.displayCompany();
        comp.closeCompany();
    }

}
