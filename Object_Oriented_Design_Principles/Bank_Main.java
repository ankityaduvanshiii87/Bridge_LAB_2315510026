package oops4;

public class Bank_Main {
	public static void main(String[] args) {
        Bank bank1 = new Bank("City Bank");
        Bank bank2 = new Bank("National Bank");
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");
        bank1.openAccount(c1, 5000);
        bank2.openAccount(c1, 3000);  
        bank2.openAccount(c2, 7000);
        c1.viewBalance();
        c2.viewBalance();
    }

}
