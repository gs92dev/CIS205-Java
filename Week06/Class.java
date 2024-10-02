/**
 * Class 10/01/2024
 */
public class Class {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        // String name1 = "Hello";
        // String name2 = new String("Hello");
        // String name3 = "Guilhernme";
        // String name4 = name3;
        // String name5 = "Guilhernme";
        // System.out.println(name1 == name2);
        // System.out.println(name3 == name4);
        // System.out.println(name3 == name5);
        // System.out.println(name1.equals(name2));
        char c1 = 'a', c2 = 'A', c3 = 'b';
        System.out.println(Character.isUpperCase(c1));
        System.out.println(Character.isLowerCase(c1));
        System.err.println(Character.toUpperCase(c2));

        char d1 = '5', d2 = 't', d3 = 'r', d4 = ' ';
        System.out.println(Character.isDigit(d1));
        System.out.println(Character.isLetter(d2));
        System.out.println(Character.isWhitespace(d4));
        System.out.println(Character.isLetterOrDigit(d3));

        String name10 = "guilherme";
        char character = name10.charAt(5);
        System.out.println(name10.indexOf("g"));
        System.out.println(name10.startsWith("gui"));
        System.out.println(name10.endsWith("me"));
        System.out.println(name10.substring(0, 5));
        System.out.println(name10.length());
        System.out.println(name10.replace("e", "a"));
        System.out.println(name10.toUpperCase());
        System.out.println(name10.toLowerCase());
        System.out.println(name10.contains("ui"));
        System.out.println(name10.equals("guilherme"));
        System.out.println(character);

        Integer number = 10;
        System.out.println(number.toString());

        String[] letters = name10.split("");
        System.out.println(letters);

        for (String letter : letters) {
            System.out.print(letter);
        }

    }
}