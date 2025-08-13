import java.util.*;
public class firstProgram {

    // 1. Welcome to Bridgelabz!
    public static void welcome() {
        System.out.println("Welcome to Bridgelabz!");
    }

    // 2. Add Two Numbers
    public static void addTwoNumbers(Scanner sc) {
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Sum = " + (num1 + num2));
    }

    // 3. Celsius to Fahrenheit Conversion
    public static void celsiusToFahrenheit(Scanner sc) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }

    // 4. Area of a Circle
    public static void areaOfCircle(Scanner sc) {
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle = " + area);
    }

    // 5. Volume of a Cylinder
    public static void volumeOfCylinder(Scanner sc) {
        System.out.print("Enter radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        double height = sc.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder = " + volume);
    }

    //Calculate Simple Interest
    public static void calculateSimpleInterest(Scanner sc) {
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time: ");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + simpleInterest);
    }

    //Perimeter of a Rectangle
    public static void perimeterOfRectangle(Scanner sc) {
        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle = " + perimeter);
    }

    //Power Calculation (without loops or conditionals)
    public static void powerCalculation(Scanner sc) {
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " = " + result);
    }

    //Calculate Average of Three Numbers
    public static void averageOfThreeNumbers(Scanner sc) {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average = " + average);
    }

    //Convert Kilometers to Miles
    public static void kilometersToMiles(Scanner sc) {
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " kilometers = " + miles + " miles");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        welcome();

        System.out.println("\nProblem 2: Add Two Numbers");
        addTwoNumbers(sc);

        System.out.println("\nProblem 3: Celsius to Fahrenheit");
        celsiusToFahrenheit(sc);

        System.out.println("\nProblem 4: Area of Circle");
        areaOfCircle(sc);

        System.out.println("\nProblem 5: Volume of Cylinder");
        volumeOfCylinder(sc);

        System.out.println("\nSelf Problem 1: Simple Interest");
        calculateSimpleInterest(sc);

        System.out.println("\nSelf Problem 2: Perimeter of Rectangle");
        perimeterOfRectangle(sc);

        System.out.println("\nSelf Problem 3: Power Calculation");
        powerCalculation(sc);

        System.out.println("\nSelf Problem 4: Average of Three Numbers");
        averageOfThreeNumbers(sc);

        System.out.println("\nSelf Problem 5: Kilometers to Miles");
        kilometersToMiles(sc);

        sc.close();
    }
}
