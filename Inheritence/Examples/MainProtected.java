package Inheritence.Examples;

class Encapsulated {
    private int value;
    public int getValue() { return value; }
    public void setValue(int v) { value = v; }
}
public class MainProtected {
    public static void main(String[] args) {
        Encapsulated e = new Encapsulated();
        e.setValue(5);
        System.out.println(e.getValue());
    }
}
