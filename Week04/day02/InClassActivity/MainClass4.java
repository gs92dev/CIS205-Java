/*
 * In Class Activity 04
 * Guilherme dos Santos
 * 09/19/2024
 */

import java.util.Random;
import java.util.Scanner;

public class MainClass4 {
    public static void main(String[] args) {
        // Task 1: write a program to print numbers from 1 to 5.
        int number = 1;
        while (number <= 5) { // boolean expression to check if number is less or equal 5
            System.out.println("Number: " + number);
            /* increment number here */
            number++;
            /*
             * Question: what will happen if you ignore increasing number?explain your
             * answer
             * We will have an infinite loop that will keep printing the number 1
             */
        }
        // ---------------------------------------------------------------------

        // Task 2:write a program that repeatedly asks a user for their name until they
        // enter a non-empty name.
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isEmpty()) { // tip: there is a method that check if a string is empty
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello, " + name + "!");
        // ---------------------------------------------------------------------

        // Task 3: re-do task 1, this time use do while loop
        number = 1;
        do {
            System.out.println("Number: " + number);
            number++;
        } while (number <= 5); // boolean expression to check if number is less or equal 5
        // ---------------------------------------------------------------------

        // Task 4: write a program that asks a user to guess a number until they guess
        // correctly.
        // Create an instance of Random class
        Random random = new Random();
        // Generate a random integer between 0 & 100
        int targetNumber = random.nextInt(100) + 1;
        int guess;
        do {
            System.out.print("Guess the number: ");
            guess = scanner.nextInt();
        } while (guess != targetNumber); // check if the guess value doesn't matches the targetNumber value
        System.out.println("Congratulations! You guessed the correct number.");
        // ---------------------------------------------------------------------

        // Task 5: re-do Task 1 using a for loop
        for (int numberloop = 0; numberloop <= 5; numberloop++) {

            System.out.println("Number: " + numberloop);
        }
        // ---------------------------------------------------------------------

        // Task 5: print the time table of 10
        for (int numberloop = 0; numberloop <= 10; numberloop++) {

            System.out.println(numberloop + " * " + "10 = " + (numberloop * 10));
        }
        // ---------------------------------------------------------------------
        scanner.close();
    }
    /*
     * Output:
     * Number: 1
     * Number: 2
     * Number: 3
     * Number: 4
     * Number: 5
     * Enter your name: Guilherme
     * Hello, Guilherme!
     * Number: 1
     * Number: 2
     * Number: 3
     * Number: 4
     * Number: 5
     * Guess the number: 50
     * Guess the number: 49
     * Guess the number: 48
     * Guess the number: 47
     * Guess the number: 46
     * Guess the number: 45
     * Guess the number: 44
     * Guess the number: 43
     * Guess the number: 42
     * Guess the number: 41
     * Guess the number: 40
     * Guess the number: 39
     * Guess the number: 38
     * Guess the number: 37
     * Guess the number: 36
     * Guess the number: 35
     * Guess the number: 34
     * Guess the number: 33
     * Guess the number: 32
     * Guess the number: 31
     * Guess the number: 30
     * Guess the number: 29
     * Guess the number: 28
     * Guess the number: 27
     * Guess the number: 26
     * Guess the number: 25
     * Guess the number: 24
     * Guess the number: 23
     * Guess the number: 22
     * Guess the number: 21
     * Guess the number: 20
     * Guess the number: 19
     * Guess the number: 18
     * Guess the number: 17
     * Guess the number: 16
     * Guess the number: 15
     * Guess the number: 14
     * Guess the number: 13
     * Guess the number: 12
     * Guess the number: 11
     * Guess the number: 10
     * Guess the number: 9
     * Guess the number: 8
     * Guess the number: 7
     * Guess the number: 6
     * Guess the number: 5
     * Guess the number: 4
     * Guess the number: 3
     * Guess the number: 2
     * Guess the number: 1
     * Guess the number: 0
     * Guess the number: 51
     * Guess the number: 52
     * Guess the number: 53
     * Guess the number: 54
     * Guess the number: 55
     * Guess the number: 56
     * Guess the number: 57
     * Guess the number: 58
     * Guess the number: 59
     * Guess the number: 60
     * Guess the number: 80
     * Guess the number: 81
     * Guess the number: 82
     * Guess the number: 83
     * Guess the number: 84
     * Guess the number: 85
     * Guess the number: 86
     * Guess the number: 87
     * Guess the number: 88
     * Guess the number: 89
     * Guess the number: 90
     * Guess the number: 91
     * Guess the number: 92
     * Guess the number: 93
     * Guess the number: 94
     * Guess the number: 95
     * Guess the number: 96
     * Congratulations! You guessed the correct number.
     * Number: 0
     * Number: 1
     * Number: 2
     * Number: 3
     * Number: 4
     * Number: 5
     * 0 * 10 = 0
     * 1 * 10 = 10
     * 2 * 10 = 20
     * 3 * 10 = 30
     * 4 * 10 = 40
     * 5 * 10 = 50
     * 6 * 10 = 60
     * 7 * 10 = 70
     * 8 * 10 = 80
     * 9 * 10 = 90
     * 10 * 10 = 100
     */
}
