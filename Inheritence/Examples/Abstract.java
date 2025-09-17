package Inheritence.Examples;

abstract class Shape {
    abstract double area();
    double perimeter() { return 0; }
}
class Square extends Shape {
    double side;
    Square(double side) { this.side = side; }
    @Override
    double area() { return side * side; }
}
public class Abstract {
    public static void main(String[] args) {
        Shape s = new Square(4);
        System.out.println(s.area());
    }
}
