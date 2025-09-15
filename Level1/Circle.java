package Best_Practices_in_Constructors.Level1;



class Circle {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        System.out.println("Default radius: " + defaultCircle.radius);

        Circle customCircle = new Circle(5.5);
        System.out.println("Custom radius: " + customCircle.radius);
    }
}