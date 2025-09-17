package Inheritence.Examples;

abstract class Payment {
    abstract void processPayment(double amount);
}
class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
class PayPalPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
public class LSP {
    public static void main(String[] args) {
        Payment p = new CreditCardPayment();
        p.processPayment(100.0);
        p = new PayPalPayment();
        p.processPayment(200.0);
    }
}
