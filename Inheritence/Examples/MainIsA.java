package Inheritence.Examples;

class Vehicle { }
class Car extends Vehicle { }
public class MainIsA {
    public static void main(String[] args) {
        Vehicle v = new Car();
        System.out.println(v instanceof Car);
    }
}
