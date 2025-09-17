package Inheritence.Examples;

class Parent {
    void greet() {
        System.out.println("Hello from Parent");
    }
}
class Child extends Parent {
    @Override
    void greet() {
        System.out.println("Hello from Child");
    }
}
public class MainOverride {
    public static void main(String[] args) {
        Parent c = new Child();
        c.greet();
    }
}

