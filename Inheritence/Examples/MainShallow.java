package Inheritence.Examples;

class A { }
class B extends A { }
class C extends B { }
public class MainShallow {
    public static void main(String[] args) {
        C obj = new C();
        System.out.println(obj instanceof A);
    }
}
