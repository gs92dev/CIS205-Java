/*
 * Guilherme dos Santos
 * In class activity 6
 * 10/03/2024
 */

public class MainClass {

    public static void main(String[] args) {

        // Task 1:
        char c1 = 'a', c2 = '3', c3 = '?', c4 = ' ';
        System.out.println(Character.toUpperCase(c1)); // convert c1 to upper case
        System.out.println(Character.isUpperCase(c1)); // check if c1 is an upper case
        System.out.println(Character.isDigit(c1)); // check if c1 is a digit
        System.out.println(Character.isDigit(c2)); // check if c2 is a digit
        System.out.println(Character.isLetter(c2)); // check if c2 is a letter
        System.out.println(Character.isLetterOrDigit(c3)); // check if c3 is a letter or a digit

        // ------------------------------------------------------------------------

        // Task 2:
        String sentence = "The internationalization of intergovernmental organizations necessitates comprehensive and meticulously detailed documentation";
        // Q1:what is the length of sentence
        System.out.println("The length in the sentence variable: " + sentence.length());

        // Q2: write a java code snippet to determine and print the number of words in
        // sentence variable
        /* add your code here */
        String[] sentenceTrimmed = sentence.split(" ");
        int numWords = sentenceTrimmed.length;
        System.out.println("Number of words in the sentence variable: " + numWords);

        // Q3: print the index of the first z character in sentence
        System.out.println("The first z character is at index: " + sentence.indexOf("z"));

        // Q4: what character is at index 33
        System.out.println("Character at index 33: " + sentence.charAt(33));

        // Q5: does sentence end with "ion"?
        System.out.println("sentence variable ends with \"ion\": " + sentence.endsWith("ion"));

        // Q6: does sentence start with with "the"?
        System.out.println("sentence variable start with \"the\": " + sentence.startsWith("the"));

        // Q7: extract "internationalization of intergovernmental" from sentence, store
        // it in a variable and print it
        /* add your code here */
        String extractedSentence = sentence.substring(4, 45);
        System.out.println("Extracted sentence: " + extractedSentence);

        // ------------------------------------------------------------------------

        // Task 3:
        String name1 = "Adam";
        String name2 = "adam";

        // compare the content of name1 & name2 (case sensitive & not case sensitive)
        System.out.println("name1 variable equals name2 variable (case sensitive): " + name1.equals(name2)); // case
                                                                                                             // sensitive

        System.out
                .println("name1 variable equals name2 variable (not case sensitive): " + name1.equalsIgnoreCase(name2)); // not
                                                                                                                         // case
                                                                                                                         // sensitive
        // ------------------------------------------------------------------------

        // Task 4:
        int num1 = 12;
        double num2 = 12.00009;
        // convert num1 and num2 to strings and store the strings into 2 String
        // variables, after that print the string variables
        /* add your code here */
        String num1String = Integer.toString(num1);
        String num2String = Double.toString(num2);
        System.out.println("num1 variable converted to string: " + num1String);
        System.out.println("num2 variable converted to string: " + num2String);

        // ------------------------------------------------------------------------

        // Task 5:
        // Q1: create a stringBuilder object and initilize it with your full name
        /* add your code here */
        StringBuilder name = new StringBuilder("Guilherme dos Santos");

        // Q2: what is the size (length "how many characters") of the stringBuilder
        // object
        System.out.println("The size of the stringBuilder object: " + name.length());

        // Q3: what is the capacity of the stringBuilder object
        System.out.println("The capacity of the stringBuilder object: " + name.capacity());

        // Q4: add your id number to your name stored in the stringBuilder object
        /* add your code here */
        name.append(" 00985562");

        System.out.println("Name with ID number: " + name);

        // Q5: explain what is the different between the size(length) of a string
        // builder and the capacity
        // The size is the length of the actual string stored in the variable, while the
        // capacity is the space in memory allocated for the string builder object, when
        // we create a StringBuilder Java by default allocate extra space in the memory
        // in case we wang to add more to our string.
        // ------------------------------------------------------------------------

    }

}