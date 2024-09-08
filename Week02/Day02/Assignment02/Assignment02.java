/*
 * Name: Guilherme dos Santos
 * Date: 09/03/2024
 * In Class Activity
 */

import java.util.Scanner;

public class Assignment02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Q1
        /*
         * calculates the Body Mass Index (BMI) given weight (in kg) and height (in
         * meters). Use the formula: BMI = weight/height2
         */
        double weight, height, BMI;
        System.out.println("Enter your weight in kg: ");
        weight = input.nextDouble();
        System.out.println("Enter your height in meters: ");
        height = input.nextDouble();
        BMI = weight / (height * height);
        System.out.println("Your weight is: " + weight);
        System.out.println("Your height is: " + height);
        System.out.println("Your BMI is: " + BMI);
        /*
         * Calculates the area of a circle given its radius. Use the formula: area = PI
         * * * radius2
         */

        double radius, area;
        final double PI = 3.14159;
        System.out.println("Enter the radius of the circle: ");
        radius = input.nextDouble();
        area = PI * radius * radius;
        System.out.println("The radius of the circle is: " + radius);
        System.out.println("The area of the circle is: " + area + " square units");

        /*
         * swap the values of two integers (num1 & num2 ) using a third integer (num3).
         */
        int num1, num2, num3;
        System.out.println("Enter the first number: ");
        num1 = input.nextInt();
        System.out.println("You entered: " + num1);

        System.out.println("Enter the second number: ");
        num2 = input.nextInt();
        System.out.println("You entered: " + num2);

        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("The first number is now: " + num1);
        System.out.println("The second number is now: " + num2);

        // ---------------------------------------------------------
        // Q2

        // 1 - Variable representing the age of a person.
        String name = "Guilherme";
        // 2 - Variable representing the name of a city.
        String city = "Kansas City";
        // 3 - Variable representing the price of a product in dollars.
        double price = 10.99;
        // 4 - Variable representing the score achieved in a test.
        int score = 95;
        // 5 - Variable representing the length of a piece of string in meters.
        double stringLength = 5.5;
        // 6 - Variable representing the speed of a car in kilometers per hour.
        double speedInKm = 60.5;
        // 7 - Variable representing the number of pages in a book.
        int pages = 300;
        // 8 - Variable representing the name of a country.
        String countryName = "Brazil";
        // 9 - Variable representing the volume of water in a tank in liters.
        double WaterVolume = 100.5;
        // 10 - Variable representing the salary of an employee in dollars per hour.
        double salaryPerHour = 15.5;
        // 11 - Variable representing the length of a side of a square in centimeters.
        double sideLength = 10.5;
        // 12 - Variable representing the number of students in a classroom.
        int studentsInClass = 30;
        // 13 - Variable representing the amount of rainfall in millimeters.
        double rainfallInMillimeters = 10.5;
        // 14 - Variable representing the rating of a movie out of 10.
        double movieRating = 8.5;
        // 15 - Variable representing the brightness level of a screen.
        int brightnessLevel = 50;

        input.close();
    }
    /*
     * Output:
     * Enter your weight in kg:
     * 70
     * Enter your height in meters:
     * 1.7
     * Your weight is: 70.0
     * Your height is: 1.7
     * Your BMI is: 24.221453287197235
     * Enter the radius of the circle:
     * 5
     * The radius of the circle is: 5.0
     * The area of the circle is: 78.53975 square units
     * Enter the first number:
     * 2
     * You entered: 2
     * Enter the second number:
     * 5
     * You entered: 5
     * The first number is now: 5
     * The second number is now: 2
     *
     */
}
