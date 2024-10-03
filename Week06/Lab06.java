
/*
 * Guilherme dos Santos
 * Lab 06
 * 10/03/2024
 */
import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence, longest;
        String[] splittedSentence;

        System.out.println("Enter a sentence: ");
        sentence = input.nextLine();

        splittedSentence = sentence.split(" ");

        longest = splittedSentence[0];

        for (int i = 0; i < splittedSentence.length; i++) {
            if (splittedSentence[i].length() > longest.length()) {
                longest = splittedSentence[i];
            }
        }

        System.out.println("The longest word in the sentence is: " + longest);
        System.out.println("The length of " + longest + " the longest word is: " + longest.length());

    }

}
