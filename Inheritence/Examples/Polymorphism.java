package Inheritence.Examples;

class Animal {
    void sound() { System.out.println("Some sound"); }
}
class Dog extends Animal {
    @Override
    void sound() { System.out.println("Woof"); }
}
public class Polymorphism {
    public static void main(String[] args) {
        Animal x = new Dog();
        x.sound();
    }
}
