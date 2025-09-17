package Inheritence.Examples;

class X {
    void print(int n) { System.out.println(n); }
}
class Y extends X {
    @Override
    void print(int n) { System.out.println("Y: " + n); }
}
public class MainOverloading {
    public static void main(String[] args) {
        X x = new Y();
        x.print(4);
    }
}
