/*
 * Guilherme dos Santos
 * 11/14/2024
 * In class assignment 11
 */

import java.util.ArrayList;

public class MainClass11 {

	public static void main(String[] args) {
		// Create an ArrayList of Strings, name it myList
		// write your code here
		ArrayList<String> myList = new ArrayList<String>();

		// Add the following elements to the ArrayList: Apple, Banana, Cherry, Date
		// write your code here
		myList.add("Apple");
		myList.add("Banana");
		myList.add("Cherry");
		myList.add("Date");

		// Display the ArrayList: using a single print statement and throw iteration
		// process
		// single print statement: write your code here
		System.out.println(myList.toString());
		// using loop: write your code here
		// For each loop
		System.out.println("For each loop");
		for (String fruit : myList) {
			System.out.println(fruit);
		}
		// Regular for loop
		System.out.println("Regular for loop");
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}

		// store the second item in myList in a variable called fruit and display it.
		// write your code here
		String fruit = myList.get(1);

		// change the third element in myList to Blueberry and print the list using
		// single print statement
		// write your code here
		myList.set(2, "Blueberry");
		System.out.println(myList.toString());

		// Remove the first element in myList and print the list using single print
		// statement
		// write your code here
		myList.remove(0);
		System.out.println(myList.toString());

		// Check if Banana exists in myList
		// write your code here
		System.out.println("Contains Banana? " + myList.contains("Banana"));

		// print the size of the ArrayList
		// write your code here
		System.out.println("Size: " + myList.size());

		// Clear myList and print the list using single print statement
		// write your code here
		myList.clear();
		System.out.println(myList.toString());

		// Check if myList is empty
		// write your code here
		System.out.println("Is empty? " + myList.isEmpty());

		// Adding elements after clearing: Fig, Grape, & Kiwi
		// write your code here
		myList.add("Fig");
		myList.add("Grape");
		myList.add("Kiwi");

		// Iterating over elements of myList using for-each loop
		// write your code here
		for (String fruit1 : myList) {
			System.out.println(fruit1);
		}

		// Check index of the following elements: Grape & Durian
		// write your code here
		System.out.println("Index of Grape: " + myList.indexOf("Grape"));
		System.out.println("Index of Durian: " + myList.indexOf("Durian"));

	}
	/*
	 * Output:
	 * [Apple, Banana, Cherry, Date]
	 * For each loop
	 * Apple
	 * Banana
	 * Cherry
	 * Date
	 * Date
	 * Regular for loop
	 * Apple
	 * Apple
	 * Banana
	 * Banana
	 * Cherry
	 * Date
	 * [Apple, Banana, Blueberry, Date]
	 * Cherry
	 * Date
	 * [Apple, Banana, Blueberry, Date]
	 * [Apple, Banana, Blueberry, Date]
	 * [Banana, Blueberry, Date]
	 * Contains Banana? true
	 * Size: 3
	 * []
	 * Is empty? true
	 * Fig
	 * Grape
	 * Kiwi
	 * Index of Grape: 1
	 * Index of Durian: -1
	 * 
	 */

}
