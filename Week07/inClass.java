/*
 * Guilherme
 * Class 10/08/2024
 * 
 */

public class inClass {
    public static void printWelcome(String name) {
        System.out.println("Welcome to the class " + name);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        String name = "Guilherme";
        printWelcome(name);

        int num1 = 5;
        int num2 = 6;
        System.out.println(add(num1, num2));
        System.out.println(add(5.5, 6.6));
    }
}
