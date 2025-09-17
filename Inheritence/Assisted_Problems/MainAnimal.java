package Inheritence.Assisted_Problems;

class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println("Woof!");
    }
}
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println("Meow!");
    }
}
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println("Chirp!");
    }
}
public class MainAnimal {
    public static void main(String[] args) {
        Animal[] arr = { new Dog("Buddy", 3), new Cat("Kitty", 2), new Bird("Tweety",1) };
        for (Animal a : arr) {
            System.out.print(a.name + ": ");
            a.makeSound();
        }
    }
}
