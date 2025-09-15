package Best_Programming_Practise;

class BankAccount {
  
    static String bankName = "Reserve Bank of India"; 
    private static int totalAccounts = 0;          
    private final int accountNumber; 
    private String accountHolderName;
    private double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;       
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++; 
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Not a valid BankAccount object.");
        }
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts Created: " + totalAccounts);
    }

}

public class Bank_Account_System {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Pushpendra", 500000000);
        BankAccount acc2 = new BankAccount(102, "Sevi", 10000);

        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();

        System.out.println();
        BankAccount.getTotalAccounts();
        System.out.println();
        if (acc1 instanceof BankAccount) {
            System.out.println("acc1 is a valid BankAccount object.");
        }
    }
}
