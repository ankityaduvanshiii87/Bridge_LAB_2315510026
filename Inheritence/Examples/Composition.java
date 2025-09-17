package Inheritence.Examples;

class Address {
    private String city, state, zip;
    Address(String city, String state, String zip) {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    String getFullAddress() {
        return city + ", " + state + ", " + zip;
    }
}
class Person {
    private String name;
    private Address address;
    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    String getDetails() {
        return name + " - " + address.getFullAddress();
    }
}
public class Composition {
    public static void main(String[] args) {
        Address addr = new Address("Springfield", "IL", "12345");
        Person p = new Person("Geek1", addr);
        System.out.println(p.getDetails());
    }
}
