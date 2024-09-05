/*
 * Name: Guilherme dos Santos
 * Date: 09/03/2024
 * In Class Activity
 */

import java.util.Scanner;

public class InClassActivites {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Task 1: Create a variable for each of the following data types: int,
        // Use appropriate variable names that follow Java naming conventions.
        // double, char, boolean
        int myInteger = 10;
        double myDouble = 3.14;
        char myChar = 'G';
        boolean myBoolean = true;

        // Task 2: Declare variables with appropriate data types based on the
        // descriptions provided below.
        // Description 1: Store the first letter of a person's name.
        char firstLetterName = 'A';
        // Description 2: Store whether a person is a student.
        boolean isStudent = true;
        // Description 3: Store the population of a city.
        int cityPopulation = 1000000;
        // Description 4: Store the average grade of a class.
        double averageGrade = 85.5;
        // Description 5: Store a person's full name.
        String fullName = "Guilherme dos Santos";
        // Description 6: Store the number of days in a week.
        int daysInWeek = 7;
        // Description 10: Store the price of an item in a shop.
        double itemPrice = 19.99;
        // Task 3: Declare a constant for the speed of light in meters per second.
        // (299792458)
        final int SPEED_OF_LIGHT = 299792458;
        // Print the value of this constant to the console.
        System.out.println("The speed of light is " + SPEED_OF_LIGHT + " m/s");
        // Task 4: Write an arithmetic expression that calculates the area of a
        // /rectangle.
        // The expression should use two variables (length and width) and print the
        // result.
        double length = 11.5;
        double width = 6.5;
        double areaOfRectangle = length * width;
        System.out.println("The area of the rectangle is " + areaOfRectangle + " m^2");

        // Task 5: Demonstrate explicit casting from a double to an int.
        // Print both the original double value and the casted int value.
        // Task 6: Print a string that includes the following: a tab, a newline,
        // and a double quote.
        // Task 7: Create a String variable and perform the following operations:
        // 1. Concatenate two strings.
        // 2. Find the length of a string.
        // Print the results of each operation.
        // Task 8: Import the Scanner class and create a Scanner object.
        // Use the Scanner to read an integer, a double, and a string from the
        // user.
        // Print each value entered by the user.
    }
}
