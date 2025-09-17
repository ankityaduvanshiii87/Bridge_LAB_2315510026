package Inheritence.Examples;

interface Walkable { void walk(); }
interface Swimmable { void swim(); }
class Duck implements Walkable, Swimmable {
    public void walk() { System.out.println("Duck walks"); }
    public void swim() { System.out.println("Duck swims"); }
}
public class Multiple {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.walk();
        d.swim();
    }
}

