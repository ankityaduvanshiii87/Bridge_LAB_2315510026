package Inheritence.Hierarchical_Inheritance;

class BankAccount {
    String accountNumber;
    double balance;
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    void displayAccountType() {
        System.out.println("Savings Account");
    }
}
class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType() {
        System.out.println("Checking Account");
    }
}
class FixedDepositAccount extends BankAccount {
    int term;
    FixedDepositAccount(String accountNumber, double balance, int term) {
        super(accountNumber, balance);
        this.term = term;
    }
    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}
public class Bank {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA1", 10000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA1", 5000, 2000);
        FixedDepositAccount fa = new FixedDepositAccount("FD1", 50000, 24);
        sa.displayAccountType();
        ca.displayAccountType();
        fa.displayAccountType();
    }
}

