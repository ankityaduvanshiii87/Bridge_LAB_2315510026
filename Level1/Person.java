package Best_Practices_in_Constructors.Level1;

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Rohit", 25);
        Person p2 = new Person(p1);
        System.out.println("Original: " + p1.name + ", " + p1.age);
        System.out.println("Copy: " + p2.name + ", " + p2.age);
    }
}

