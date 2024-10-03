
/*
 * Guilherme dos Santos
 * Assignment 06
 * 10/03/2024
 */
import java.util.Scanner;

public class Assignment06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence, searchChar;
        char searchCharConverted;
        int counter = 0;

        System.out.println("Enter a sentence: ");
        sentence = input.nextLine();

        System.out.println("Enter a character to search: ");
        searchChar = input.nextLine();
        searchCharConverted = searchChar.charAt(0);

        if (sentence.length() > 0 && sentence != null) {
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == searchCharConverted) {
                    counter++;
                }
            }
        } else {
            System.out.println("The sentence is empty or null.");
        }

        System.out.println("The character " + searchCharConverted + " appears " + counter + " times in the sentence.");

        input.close();
    }

}
