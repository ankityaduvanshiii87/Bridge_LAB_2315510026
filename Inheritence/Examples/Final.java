package Inheritence.Examples;

class Base {
    final void important() {
        System.out.println("Do not override this");
    }
}
class Derived extends Base {
   
}
public class Final {
    public static void main(String[] args) {
        new Derived().important();
    }
}
