
/*
 * Guilherme dos Santos
 * In-Class Activity 05
 * 09/26/2024
 */
import java.util.Random;
import java.util.Scanner;

public class InClassActivity05 {

    public static void main(String[] args) {
        // Task 1: create an array (name it numbers) of integers of a size 10 and set
        // the first five values to 5 print the array using enhanced for loop
        // 1- Create an array of integers (numbers) with a size of 10
        int[] numbers = new int[10];
        // 2- Set the first five values to 5 using a for loop
        for (int i = 0; i < 5; i++) {
            numbers[i] = 5;
        }
        // 3- Print the array using an enhanced for loop
        System.out.println("Array numbers:");
        for (int num : numbers) {
            System.out.print(num + ", ");
        }
        // ---------------------------------------------------------------------

        // Task 2: find the average (mean) of the values of the array numbers
        // 1- create an int variable called sum and initialize it to 0
        int sum = 0;
        // 2- Calculate the sum of all values in the array (numbers) using enhanced for
        // loop
        for (int num : numbers) {
            sum += num;
        }
        // 3- Calculate the average by dividing the sum by the total number of values
        double average = (double) sum / numbers.length;
        // 4- Print the average
        System.out.println("\n\nThe average of the array numbers is: " + average);
        // ---------------------------------------------------------------------

        // Task 3: re-populate the array numbers with values randomly created in the
        // range of 1 to 100
        // print the array using enhanced for loop
        // 1- Populate the array elements with random values in the range of 1 to 100
        // using a for loop
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1, 100);
        }

        // 2 -Print the array using an enhanced for loop
        System.out.println("--------------------------------------------");
        System.out.println("\nArray numbers after re-populating:");
        for (int num : numbers) {
            System.out.print(num + ", ");
        }
        // ---------------------------------------------------------------------

        // Task 4: ask the user to enter a value between 1 and 100
        // and check if the value does exist in the array numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nEnter a value between 1 and 100: ");
        int userInput = scanner.nextInt();
        // Initialize the variable ind with -1 to indicate that the element is not found
        int ind = -1;
        // 1: Check if the entered value exists in the array numbers
        /*
         * When a match is found, update the ind value with the current counter value of
         * the loop use a for loop to complete this task, make sure to use break when a
         * match is found
         */
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == userInput) {
                ind = i;
                break;
            }
        }
        /*
         * 2: Check if ind is still -1, which indicates that the element doesn't exist
         * Otherwise, the element exists at the index stored in ind
         * Print the result using an if-else statement
         */
        if (ind == -1) {
            System.out.println("The value " + userInput + " does not exist in the array numbers");
        } else {
            System.out.println("The value " + userInput + " exists at index " + ind);
        }
        // ------------------------------------------------------------------------
        // Task 5: find the smallest and the greatest values of the array numbers
        // 1- Initialize variables to hold the smallest and greatest values
        // Assume the first element is the smallest initially
        int smallest = numbers[0];
        // Assume the first element is the greatest initially
        int greatest = numbers[0];

        // 2- Iterate through the array to find the smallest and greatest values
        for (int num : numbers) { // use enhanced for loop
            // Check if the current number is smaller than the smallest value found so far
            // Check if the current number is smaller than the smallest value found so far
            if (num < smallest) {
                smallest = num; // Update the smallest value
            }
            // Check if the current number is greater than the greatest value found so far
            if (num > greatest) {
                greatest = num; // Update the greatest value
            }
        }

        // 3 Print the smallest and greatest values
        System.out.println("The smallest value in the array is: " + smallest); // The smallest value in the array is: X
        System.out.println("The greatest value in the array is: " + greatest); // The greatest value in the array is: Y
        // ---------------------------------------------------------------------

        scanner.close();

    }
    /*
     * output:
     * Array numbers:
     * 5, 5, 5, 5, 5, 0, 0, 0, 0, 0,
     * 
     * The average of the array numbers is: 2.5
     * --------------------------------------------
     * 
     * Array numbers after re-populating:
     * 12, 32, 83, 54, 54, 36, 6, 78, 77, 9,
     * 
     * Enter a value between 1 and 100: 36
     * The value 36 exists at index 5
     * The smallest value in the array is: 6
     * The greatest value in the array is: 83
     */
}
