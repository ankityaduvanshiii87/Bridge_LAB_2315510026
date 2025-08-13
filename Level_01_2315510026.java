import java.util.Scanner;
public class Level_01_2315510026 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Uncomment to run each program:

        // ageOfHarry();
        // samAveragePCM();
        // kmToMiles();
        // profitAndLoss();
        // pensDivision();
        // universityFeeDiscount(sc);
        // earthVolume();
        // kmToMilesUserInput(sc);
        // universityFeeDiscountUserInput(sc);
        // heightConversion(sc);
        // basicCalculator(sc);
        // triangleArea(sc);
        // sideOfSquare(sc);
        // distanceConversion(sc);
        // totalPurchasePrice(sc);
        // maxHandshakes(sc);

        sc.close();
    }

    // 1. Find Harry's Age
    public static void ageOfHarry() {
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.printf("Harry's age in %d is %d%n%n", currentYear, age);
    }

    // 2. Sam’s average mark in PCM
    public static void samAveragePCM() {
        int maths = 94, physics = 95, chemistry = 96;
        double average = (maths + physics + chemistry) / 3.0;
        System.out.printf("Sam’s average mark in PCM is %.2f%n%n", average);
    }

    // 3. Convert 10.8 km to miles
    public static void kmToMiles() {
        double km = 10.8;
        double miles = km / 1.6;
        System.out.printf("The distance %.2f km in miles is %.2f%n%n", km, miles);
    }

    // 4. Profit and Loss calculation
    public static void profitAndLoss() {
        double costPrice = 129;
        double sellingPrice = 191;
        double profit = sellingPrice - costPrice;
        double profitPercent = (profit / costPrice) * 100;

        System.out.printf("The Cost Price is INR %.2f and Selling Price is INR %.2f%n", costPrice, sellingPrice);
        System.out.printf("The Profit is INR %.2f and the Profit Percentage is %.2f%%%n%n", profit, profitPercent);
    }

    // 5. Pens division among students
    public static void pensDivision() {
        int pens = 14;
        int students = 3;
        int pensPerStudent = pens / students;
        int remainingPens = pens % students;

        System.out.printf("The Pen Per Student is %d and the remaining pen not distributed is %d%n%n", pensPerStudent, remainingPens);
    }

    // 6. University fee discount (fixed)
    public static void universityFeeDiscount(Scanner sc) {
        double fee = 125000;
        double discountPercent = 10;
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n%n", discount, finalFee);
    }

    // 7. Volume of Earth in km^3 and miles^3
    public static void earthVolume() {
        double radiusKm = 6378;
        double pi = Math.PI;
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);

        // 1 mile = 1.60934 km
        double radiusMiles = radiusKm / 1.60934;
        double volumeMiles3 = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);

        System.out.printf("The volume of earth in cubic kilometers is %.2e and cubic miles is %.2e%n%n", volumeKm3, volumeMiles3);
    }

    // 8. Convert km to miles - user input
    public static void kmToMilesUserInput(Scanner sc) {
        System.out.print("Enter distance in km: ");
        double km = sc.nextDouble();
        double miles = km / 1.6;
        System.out.printf("The total miles is %.2f mile for the given %.2f km%n%n", miles, km);
    }

    // 9. University fee discount with user input
    public static void universityFeeDiscountUserInput(Scanner sc) {
        System.out.print("Enter the fee amount: ");
        double fee = sc.nextDouble();
        System.out.print("Enter the discount percent: ");
        double discountPercent = sc.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n%n", discount, finalFee);
    }

    // 10. Height conversion cm to feet and inches
    public static void heightConversion(Scanner sc) {
        System.out.print("Enter your height in cm: ");
        double cm = sc.nextDouble();
        double totalInches = cm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f%n%n", cm, feet, inches);
    }

    // 11. Basic calculator
    public static void basicCalculator(Scanner sc) {
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        String div = (number2 != 0) ? String.valueOf(number1 / number2) : "undefined (division by zero)";

        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %s%n%n",
                number1, number2, add, sub, mul, div);
    }

    // 12. Area of triangle in sq inches and sq cm
    public static void triangleArea(Scanner sc) {
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / (2.54 * 2.54);

        System.out.printf("The area of the triangle in sq in is %.2f and sq cm is %.2f%n%n", areaIn2, areaCm2);
    }

    // 13. Side of square from perimeter
    public static void sideOfSquare(Scanner sc) {
        System.out.print("Enter perimeter of square: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n%n", side, perimeter);
    }

    // 14. Distance in yards and miles from feet
    public static void distanceConversion(Scanner sc) {
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.printf("The distance in yards is %.2f while the distance in miles is %.4f%n%n", yards, miles);
    }

    // 15. Total purchase price
    public static void totalPurchasePrice(Scanner sc) {
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f%n%n", totalPrice, quantity, unitPrice);
    }

    // 16. Maximum handshakes among N students
    public static void maxHandshakes(Scanner sc) {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int handshakes = (n * (n - 1)) / 2;
        System.out.printf("The maximum number of possible handshakes among %d students is %d%n%n", n, handshakes);
    }
}