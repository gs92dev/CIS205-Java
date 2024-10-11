/*
 * Guilherme dos Santos
 * In class activity 7
 * 10/10/2024
 */

import java.util.Scanner;

public class MainClass7 {

	public static int addInt(int firstInt, int secondInt) {
		int result = firstInt + secondInt;
		return result;

	}

	public static boolean isValidInput(int num) {
		if (num >= 5 && num <= 10)
			return true;
		else
			return false;
	}

	// the first add method (int):
	public static double add(int firstInt, int secondInt) {
		int sum = firstInt + secondInt;
		return sum;
	}

	// the second add method (double):
	public static double add(double firstDouble, double secondDouble) {
		double sum = firstDouble + secondDouble;
		return sum;
	}

	public static void main(String[] args) {

		// Task 1:
		// Q1: find and print the square root of 12.0931
		System.out.println(Math.sqrt(12.0931));

		// Q2: Generate and print a random number within the range [0, 1) (including 0
		// but excluding 1)
		System.out.println("Random number between 0 and 1 (excluding 1): " + Math.random());

		// Q3: Generate and print a random number within the range [1, 100] (including 0
		// & 100)
		System.out.println("Random number between 0 and 100 (including 100): " + (int) (Math.random() * 101));

		// Q4: find and print the absolute value of -12.090031
		System.out.println("The absolute value of -12.090031 is: " + Math.abs(-12.090031));
		// ------------------------------------------------------------------------

		// Task 2: complete the method addInt where the method:
		// accepts 2 parameters,
		// add the values and store the results
		// return the results
		System.out.println("The result of the addInt method is: " + addInt(10, 15)); // 25

		// ------------------------------------------------------------------------

		// Task 3: input validation check
		// ask the user to enter a value between 5 and 10.
		// create a method to check if the user entered a valid value
		// test method.
		Scanner inputTool = new Scanner(System.in);
		System.out.print("enter a value between 5 and 10 >> ");
		int valu = inputTool.nextInt();
		if (isValidInput(valu))
			System.out.println("Congrats, " + valu + " is valid!"); // print a proper message for a valid entry
		else
			System.out.println("Sorry, " + valu + " is invalid!"); // print a proper message for a not valid entry

		// ------------------------------------------------------------------------

		// Task 4: (overloading methods)create 2 methods named add:
		// The first method takes two int parameters and returns an int, which
		// represents the result of adding the two int parameters.

		System.out.println("The sum of the two integers is: " + add(45, 55)); // 100
		// The second method takes two double parameters and returns a double, which
		// represents the result of adding the two double parameters.

		System.out.println("The sum of the two doubles is: " + add(45.5, 55.3)); // 101.0

		// ------------------------------------------------------------------------
		inputTool.close();
	}

	/*
	 * Output:
	 * Invalid entry:
	 * 3.4775134794850184
	 * Random number between 0 and 1 (excluding 1): 0.07847501322171402
	 * Random number between 0 and 100 (including 100): 82
	 * The absolute value of -12.090031 is: 12.090031
	 * The result of the addInt method is:25
	 * enter a value between 5 and 10 >> 4
	 * Sorry, 4 is invalid!
	 * The sum of the two integers is: 100.0
	 * The sum of the two doubles is: 100.8
	 * 
	 * Valid entry:
	 * 3.4775134794850184
	 * Random number between 0 and 1 (excluding 1): 0.06269953707770615
	 * Random number between 0 and 100 (including 100): 17
	 * The absolute value of -12.090031 is: 12.090031
	 * The result of the addInt method is:25
	 * enter a value between 5 and 10 >> 10
	 * Congrats, 10 is valid!
	 * The sum of the two integers is: 100.0
	 * The sum of the two doubles is: 100.8
	 * 
	 */

}
