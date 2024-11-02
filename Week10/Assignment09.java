/*
 * Guilherme do Santos
 * Assignment 9
 * 11/02/2024
 */

public class Assignment09 {

    public static class Person {
        private String firstName;
        private String lastName;

        public String getFirstName() {
            return firstName;
        }

        public Person setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public Person setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public class Search {

        public static int search(int[] arr, int target) {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target)
                    return i; // Return index of the element if found
            }
            return -1; // Return -1 if element not found
        }

        // Overload the method shown below to process arrays of data types:
        // double, char, string:

        public static int search(char[] arr, char target) { // char overload

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i; // Return index of the element if found
                }
            }
            return -1; // Return -1 if element not found
        }

        public static int search(String[] arr, String target) { // String overload

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(target)) {
                    return i; // Return index of the element if found
                }
            }
            return -1; // Return -1 if element not found
        }

        public static int search(double[] arr, double target) { // double overload
            final double EPSILON = 1e-9; // Define a small value to compare double values

            for (int i = 0; i < arr.length; i++) {
                if (Math.abs(arr[i] - target) < EPSILON) {
                    return i; // Return index of the element if found
                }
            }
            return -1; // Return -1 if element not found
        }

    }

    public static void main(String[] args) {
        Person person = new Person().setFirstName("Jane").setLastName("Smith");
        System.out.println("The first and last name are: " + person);

    }

    /*
     * Output:
     * The first and last name are: Jane Smith
     */

}