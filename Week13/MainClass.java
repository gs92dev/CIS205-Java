/*
 * Lab 12 - Sort
 * Guilherme dos Santos
 * 11/24/2024
 */

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {

        // Example with an array of integers
        int[] intArray = { 5, 3, 8, 2, 1, 4 };

        // Example with an array of strings
        String fruits = "banana,apple,cherry,date";
        // convert the String fruits to an array of Strings: call it stringArray
        String[] stringArray = fruits.split(",");
        System.out.println("Array of strings:");
        for (String s : stringArray) {
            System.out.println(s);
        }

        // sort and display both arrays using the static sort method (Array.sort())
        Arrays.sort(intArray);
        Arrays.sort(stringArray);

        System.out.println("\nSorted array of integers:");
        for (int i : intArray) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("\nSorted array of strings:");
        for (String s : stringArray) {
            System.out.println(s);
        }

        // Example with an ArrayList of integers
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(3);
        intList.add(8);
        intList.add(2);
        intList.add(1);
        intList.add(4);

        // Example with an ArrayList of strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("banana");
        stringList.add("apple");
        stringList.add("cherry");
        stringList.add("date");

        // sort and display both array lists using the static sort method
        // (Collections.sort())
        intList.sort(null);
        System.out.println("\nSorted array list of integers:");
        for (int i : intList) {
            System.out.print(i + " ");
        }

        stringList.sort(null);
        System.out.println("\nSorted array list of strings:");
        for (String s : stringList) {
            System.out.println(s);
        }

    }
    /*
     * Output:
     * Array of strings:
     * banana
     * apple
     * cherry
     * date
     * 
     * Sorted array of integers:
     * 123458
     * 
     * Sorted array of strings:
     * apple
     * banana
     * cherry
     * date
     * 
     * Sorted array list of integers:
     * 1 2 3 4 5 8
     * Sorted array list of strings:
     * apple
     * banana
     * cherry
     * date
     */

}
