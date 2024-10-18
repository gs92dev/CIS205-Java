/*
*10/17/2024
 * Guilherme dos Santos
 * Midterm Exam
 * Question1
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {

        // Get the strings from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.println();

        System.out.println("Enter the second string: ");
        String str2 = input.nextLine();
        System.out.println();
        System.out.println("Let's check if the strings are anagrams: ");

        // Convert the strings to char arrays and sort them
        char[] str1Array = str1.toCharArray();
        Arrays.sort(str1Array);
        char[] str2Array = str2.toCharArray();
        Arrays.sort(str2Array);

        // Display the initial strings
        System.out.print("The string: " + str1);
        System.out.print(" and the string: " + str2);

        // Compare the sorted arrays
        if (Arrays.equals(str1Array, str2Array)) {

            System.out.println(" are anagrams.");

        } else {

            System.out.println(" are not anagrams.");
        }

        input.close();

    }

    /*
     * Output:
     * Enter the first string:
     * Guilherme
     * 
     * Enter the second string:
     * uilhermeG
     * 
     * Let's check if the strings are anagrams:
     * The string: Guilherme and the string: uilhermeG are anagrams.
     * 
     * Case sensitive:
     * Enter the first string:
     * Guilherme
     * 
     * Enter the second string:
     * guilherme
     * 
     * Let's check if the strings are anagrams:
     * The string: Guilherme and the string: guilherme are not anagrams.
     */

}
