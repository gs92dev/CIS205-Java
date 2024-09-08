/*
 * Name: Guilherme dos Santos
 * Date: 09/03/2024
 * In Class Activity
 */

import java.util.Scanner;

public class Assignment02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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

        input.close();
    }
    /*
     * Output:
     *
     *
     *
     *
     *
     */
}
