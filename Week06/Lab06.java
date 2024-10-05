
/*
 * Guilherme dos Santos
 * Lab 06
 * 10/05/2024
 */
import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables declaration
        String sentence, longest; // to store the sentence and the longest word
        String[] splittedSentence; // to store the splitted sentence

        // Input sentence from user
        System.out.println("Enter a sentence: ");
        sentence = input.nextLine();

        // Split the sentence into words
        splittedSentence = sentence.split(" ");

        // assume the first word is the longest
        longest = splittedSentence[0];

        for (int i = 0; i < splittedSentence.length; i++) {
            if (splittedSentence[i].length() > longest.length()) {
                longest = splittedSentence[i];
            }
        }

        System.out.println("The longest word in the sentence is: " + longest);
        System.out.println("The length of " + longest + " the longest word is: " + longest.length());
        // close the scanner
        input.close();
    }

    /*
     * output:
     * Enter a sentence:
     * Guilherme dos Santos
     * The longest word in the sentence is: Guilherme
     * The length of Guilherme the longest word is: 9
     * 
     * A longer sentence example:
     * You should always try to avoid long sentences. Below are two examples, as
     * well as some facts about long sentences in general.
     * The longest word in the sentence is: sentences.
     * The length of sentences. the longest word is: 10
     */

}
