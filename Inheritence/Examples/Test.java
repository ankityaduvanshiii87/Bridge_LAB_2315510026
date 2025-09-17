package Inheritence.Examples;

class Alpha {
    void display() { System.out.println("Alpha"); }
}
class Beta extends Alpha {
    @Override
    void display() { System.out.println("Beta"); }
}
public class Test {
    public static void main(String[] args) {
        Alpha a1 = new Alpha();
        Alpha a2 = new Beta();
        a1.display();
        a2.display();
    }
}
