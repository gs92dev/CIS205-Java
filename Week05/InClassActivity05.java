public class InClassActivity05 {

    public static void main(String[] args) {
        // Task 1: create an array (name it numbers) of integers of a size 10 and set
        // the first five values to 5
        // print the array using enhanced for loop
        // 1- Create an array of integers (numbers) with a size of 10
        int[] numbers = new int[10];
        // 2- Set the first five values to 5 using a for loop
        for (int i = 0; i < 5; i++) {
            numbers[i] = 5;
        }
        // 3- Print the array using an enhanced for loop
        for (int num : numbers) {
            System.out.println(num + " ");
        }
        // ---------------------------------------------------------------------

        // Task 2: find the average (mean) of the values of the array numbers
        // 1- create an int variable called sum and initialize it to 0
        // 2- Calculate the sum of all values in the array (numbers) using enhanced for
        // loop
        // 3- Calculate the average by dividing the sum by the total number of values
        // 4- Print the average
        // ---------------------------------------------------------------------

        // Task 3: re-populate the array numbers with values randomly created in the
        // range of 1 to 100
        // print the array using enhanced for loop
        // Random random = new Random();
        // 1- Populate the array elements with random values in the range of 1 to 100
        // using a for loop
        // 2 -Print the array using an enhanced for loop
        // ---------------------------------------------------------------------

        // Task 4: ask the user to enter a value between 1 and 100
        // and check if the value does exist in the array numbers
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a value between 1 and 100: ");
        // int userInput = scanner.nextInt();
        // Initialize the variable ind with -1 to indicate that the element is not found
        // initially
        // int ind = -1;
        // 1: Check if the entered value exists in the array numbers
        // When a match is found, update the ind value with the current counter value of
        // the loop
        // use a for loop to complete this task, make sure to use break when a match is
        // found
        // 2: Check if ind is still -1, which indicates that the element doesn't exist
        // Otherwise, the element exists at the index stored in ind
        // Print the result using an if-else statement
        // ------------------------------------------------------------------------
        // Task 5: find the smallest and the greatest values of the array numbers
        // 1- Initialize variables to hold the smallest and greatest values
        // Assume the first element is the smallest initially
        // Assume the first element is the greatest initially
        // 2- Iterate through the array to find the smallest and greatest values
        // for (/*add your code here*/) { // use enhanced for loop
        // Check if the current number is smaller than the smallest value found so far
        // if (/*add your code here*/) {
        // Update the smallest value
        // }
        // Check if the current number is greater than the greatest value found so far
        // if (/*add your code here*/) {
        // Update the greatest value
        // }
        // }
        // 3 Print the smallest and greatest values
        // System.out.println(/*add your code here*/); // The smallest value in the
        // array is: X
        // System.out.println(/*add your code here*/); // The greatest value in the
        // array is: Y
        // ---------------------------------------------------------------------

        // }

    }
}
