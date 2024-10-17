import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        int[] arr1;
        int[] arr2 = { 1, 2, 3, 4 };
        int[] arr3 = new int[5];

        int x = 10;

        // int y=30;
        {
            // block 1
            int y = 10;
        }

        {
            // block 2
            int y = 20;
        }
        /*
         * Covert a string to an array of characters : (toCharArray())
         * sort arrays: Arrays.sort()
         * compare arrays: Arrays.equals()
         * iterate throw an array
         * calculate the frequencies of elements in an array.
         * process parallel arrays
         */

        String str1 = "jcccjavaprogrammingcs";

        char[] charArr = str1.toCharArray();
        for (char c : charArr) {
            System.out.print(c + " ");
        }
        System.out.println();

        Arrays.sort(charArr);
        System.out.println("After sorting");
        for (char c : charArr) {
            System.out.print(c + " ");
        }
        System.out.println();
        // char[] charArr2 = { '6', '4', 't' };
        // System.out.println(charArr.equals(charArr2)); // do not use ==
        // int size = charArr2.length;
        // for (int i = 0; i < size; i++) {
        // System.out.print("char at position " + charArr2[i] + " ");
        // }
        System.out.println();

        // int[] grades = { 67, 89, 79, 91, 55, 71, 45, 27 };
        // String[] names = { "Adam", "Smith", "John", "Mick", "Ahmed", "Joan", "Steve",
        // "Amylee" };

        // for (int i = 0; i < 8; i++) {
        // if (grades[i] < 70) {
        // System.out.println(names[i] + " did not pass the exam");
        // }
        // }

        int[] counters = new int[26];
        // {0,0,0,0,0,0,0,....,0,0} size is 26
        // a,b,c,d,e,f,g,....,y,z
        // 0,1,2,3,4,5,6,...,24,25

        // System.out.println((int)'z'-((int)'a'));

        for (char c : charArr) {
            System.out.println("The character is " + c);
            counters[(int) c - (int) 'a']++;

        }
        for (int i = 0; i < 26; i++) {
            System.out.println(counters[i]);
        }

        // for (int i = 0; i < 26; i++) {
        // if (counters[i] != 0) {
        // System.out.println("The frequencies of the character " + (char) (i + (int)
        // 'a') + " is " + counters[i]);

        // }
        // }

    }
}
