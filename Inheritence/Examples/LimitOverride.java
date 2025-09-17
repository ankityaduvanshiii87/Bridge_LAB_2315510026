package Inheritence.Examples;

class Animal {
    void eat() { System.out.println("Animal eats"); }
}
class Cow extends Animal { }
public class LimitOverride {
    public static void main(String[] args) {
        Animal a = new Cow();
        a.eat();
    }
}

