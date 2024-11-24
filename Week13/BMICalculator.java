
/**
 * Add your name
 * Guilherme dos Santos
 * 11/24/2024
 * Assignment BMI Calculator
 * Add the name of the assignment
 * 
 * add a description for the project here
 * The BMI Calculator is a program that calculates the Body Mass Index (BMI) of a person based on their weight and height in kilograms and meters.
 * The program allows the user to calculate the BMI multiple times and displays the health status of the person each time.
 */

import java.util.Scanner;

public class BMICalculator {

    /**
     * Main method that drives the program.
     * 
     * @param args Command line arguments (not used in this program).
     *             no need to do anything here, use this part as a guide for the
     *             other methods
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // purpose of the next 2 lines
        // The variables weight and height are declared to store the user's weight and
        // height, respectively.
        double weight;
        double height;

        // purpose of this while loop
        // The while loop allows the user to calculate the BMI multiple times. Each time
        // the loop runs, the user is prompted to enter their weight and height.
        while (true) {
            // purpose of the next 2 lines
            // The user is prompted to enter their weight in kilograms.
            System.out.print("Enter your weight in kilograms: ");
            weight = scanner.nextDouble();

            // purpose of the next 2 lines
            // The user is prompted to enter their height in meters.
            System.out.print("Enter your height in meters: ");
            height = scanner.nextDouble();

            // purpose of this line
            // The calculateBMI method is called with the user's weight and height as the
            // arguments and the result is stored in the bmi variable.
            double bmi = calculateBMI(weight, height);

            // purpose of this line
            // The getHealthStatus method is called with the bmi as the argument and the
            // result is stored in the healthStatus variable.
            String healthStatus = getHealthStatus(bmi);

            // purpose of the next 2 lines
            // The user's BMI and health status are displayed to the user.
            System.out.println("Your BMI is: " + bmi);
            System.out.println("Health Status: " + healthStatus);

            // purpose of the next three lines
            // The user is asked if they want to calculate the BMI again. If the user enters
            // "yes", the loop continues, otherwise it breaks.
            System.out.print("Do you want to calculate again? (yes/no): ");
            scanner.nextLine(); // purpose of this line // The nextLine method is called to consume the newline
                                // character left by the previous nextDouble method.
            String response = scanner.nextLine();

            if (!response.equalsIgnoreCase("yes")) {
                break; // purpose of this line // The break statement is used to exit the loop if the
                       // user does not want to calculate the BMI again.
            }
        }

        scanner.close(); // purpose of this line // The scanner is closed to release the resources.
        System.out.println("Thank you for using the BMI Calculator!");
    }

    /**
     * Method to Calculate the BMI of a person.
     * 
     * @param args The weight of the person in kilograms.
     * @param args The height of the person in meters.
     * @return . The BMI of the person.
     */
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    /**
     * Method to ?. Validate the BMI and return the health status.
     * 
     * @param args The BMI value to be validated.
     * @return The health status based on the BMI value.
     */
    public static String getHealthStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    /*
     * Output:
     * Enter your weight in kilograms: 71
     * Enter your height in meters: 1.7
     * Your BMI is: 24.56747404844291
     * Health Status: Normal weight
     * Do you want to calculate again? (yes/no): no
     * Thank you for using the BMI Calculator!
     * 
     */
}
