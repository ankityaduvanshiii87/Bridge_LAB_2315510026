package Inheritence.Examples;

class Superclass {
    Superclass() { System.out.println("Superclass initialized"); }
}
class Subclass extends Superclass {
    Subclass() { super(); System.out.println("Subclass initialized"); }
}
public class Constructor {
    public static void main(String[] args) {
        new Subclass();
    }
}

