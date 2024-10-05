
/*
 * Guilherme dos Santos
 * Assignment 06
 * Search for a character in a string
 * 10/05/2024
 */
import java.util.Scanner;

public class Assignment06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variables declaration
        String string, searchChar;
        char searchCharConverted;
        int counter = 0;

        // Input string from user
        System.out.println("Enter a string: ");
        string = input.nextLine();

        // Input character to search from user
        System.out.println("Enter a character to search: ");
        searchChar = input.nextLine();

        // Basic validation for the input
        Boolean stringValidation = string.length() > 0 && string != null;
        Boolean CharValidation = searchChar.length() > 0 && searchChar != null;

        // If the string and the character are not empty or null
        if (stringValidation && CharValidation) {
            searchCharConverted = searchChar.charAt(0);
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == searchCharConverted) {
                    /// using case sensitive
                    counter++;
                }
            }

            System.out.println(
                    "The character \"" + searchCharConverted + "\" appears " + counter + " times in the string.");
        } else {
            System.out.println("The string or the character is empty or null.");
        }

        input.close(); // close the scanner
    }
    /*
     * output:
     * Enter a string:
     * santos
     * Enter a character to search:
     * s
     * The character "s" appears 2 times in the string.
     * Empty char
     * Enter a string:
     * santos
     * Enter a character to search:
     * 
     * The string or the character is empty or null.
     * 
     * empty string
     * Enter a string:
     * 
     * Enter a character to search:
     * s
     * The string or the character is empty or null.
     */

}
