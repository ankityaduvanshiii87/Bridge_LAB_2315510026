import java.util.Scanner;

public class Level_02_2315510026 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

//         basicCalculator(sc);
        // areaOfTriangle(sc);
        // sideOfSquare(sc);
        // distanceConversion(sc);
        // totalPurchasePrice(sc);
        // quotientAndRemainder(sc);
        // intOperations(sc);
        // doubleOperations(sc);

        sc.close();
    }

    // 1. Basic Calculator
    public static void basicCalculator(Scanner sc) {
        System.out.println("Basic Calculator:");
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        String div = (number2 != 0) ? String.valueOf(number1 / number2) : "undefined (division by zero)";

        System.out.printf("The addition, subtraction, multiplication, and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %s%n%n",
                number1, number2, add, sub, mul, div);
    }

    // 2. Area of Triangle (sq cm and sq inches)
    public static void areaOfTriangle(Scanner sc) {
        System.out.println("Area of Triangle:");
        System.out.print("Enter the base of the triangle in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle in cm: ");
        double height = sc.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / (2.54 * 2.54);

        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n%n", areaIn2, areaCm2);
    }

    // 3. Side of square from perimeter
    public static void sideOfSquare(Scanner sc) {
        System.out.println("Side of Square:");
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n%n", side, perimeter);
    }

    // 4. Distance conversion (feet to yards and miles)
    public static void distanceConversion(Scanner sc) {
        System.out.println("Distance Conversion:");
        System.out.print("Enter the distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.printf("The distance in yards is %.2f while the distance in miles is %.4f%n%n", yards, miles);
    }

    // 5. Total purchase price calculation
    public static void totalPurchasePrice(Scanner sc) {
        System.out.println("Total Purchase Price:");
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f%n%n", totalPrice, quantity, unitPrice);
    }

    // 6. Quotient and remainder
    public static void quotientAndRemainder(Scanner sc) {
        System.out.println("Quotient and Remainder:");
        System.out.print("Enter first integer: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = sc.nextInt();

        if (number2 != 0) {
            int quotient = number1 / number2;
            int remainder = number1 % number2;
            System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d%n%n", quotient, remainder, number1, number2);
        } else {
            System.out.println("Division by zero is undefined.\n");
        }
    }

    // 7. IntOperation with int inputs
    public static void intOperations(Scanner sc) {
        System.out.println("Integer Operations:");
        System.out.print("Enter integer a: ");
        int a = sc.nextInt();
        System.out.print("Enter integer b: ");
        int b = sc.nextInt();
        System.out.print("Enter integer c: ");
        int c = sc.nextInt();

        int op1 = a + b * c;
        int op2 = a * b + c;
        int op3 = c + a / b;
        int op4 = a % b + c;

        System.out.printf("The results of Int Operations are %d, %d, %d, and %d%n%n", op1, op2, op3, op4);
    }

    // 8. DoubleOpt with double inputs
    public static void doubleOperations(Scanner sc) {
        System.out.println("Double Operations:");
        System.out.print("Enter double a: ");
        double a = sc.nextDouble();
        System.out.print("Enter double b: ");
        double b = sc.nextDouble();
        System.out.print("Enter double c: ");
        double c = sc.nextDouble();

        double op1 = a + b * c;
        double op2 = a * b + c;
        double op3 = c + a / b;
        double op4 = a % b + c; // % operator works with double in Java

        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f%n%n", op1, op2, op3, op4);
    }
}   

