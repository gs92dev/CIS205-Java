/*
 * Guilherme dos Santos
 * Lab 7
 * Restaurant Receipt system
 * 12/10/2024
 */

import java.util.Scanner;

public class Lab7 {

    public static double calculateTotal(double[] itemsPrice) {
        double total = 0;
        for (int i = 0; i < itemsPrice.length; i++) {
            total += itemsPrice[i];
        }
        return total;
    }

    public static double calculateTax(double total) {
        return total * 0.09;
    }

    public static double calculateTip(double total) {
        return total * 0.2;
    }

    public static void printReceipt(String[] itemsName, double[] itemsPrice, double total, double tax, double tip) {
        System.out.println("Restaurant Receipt");
        System.out.println(
                "----------------------------");
        System.out.println("Items Details: ");
        for (int i = 0; i < itemsName.length; i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(itemsName[i] + " - $" + itemsPrice[i]);
        }

        System.out.println();

        System.out.println("Cost of Food: $" + total);
        System.out.println("Tax (9%): $" + tax);
        System.out.println("Tip (20%): $" + tip);
        System.out.println(
                "----------------------------");
        System.out.println("Total: $" + (total + tax + tip));

    }

    public static void main(String args[]) {
        // ------------------ Scanner ------------------
        Scanner input = new Scanner(System.in);
        // ------------------ Variables ------------------
        // input variables
        int numberOfItems;
        String itemName;
        double itemPrice;

        System.out.println("Please, Enter the number of items ordered by the table: ");
        numberOfItems = input.nextInt();

        String itemsName[] = new String[numberOfItems];
        double itemsPrice[] = new double[numberOfItems];

        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Enter the name of the item: " + (i + 1));
            itemName = input.next();
            System.out.println("Enter the price of the item: " + (i + 1));
            itemPrice = input.nextDouble();

            itemsName[i] = itemName;
            itemsPrice[i] = itemPrice;
        }

        double total = calculateTotal(itemsPrice);
        double tax = calculateTax(total);
        double tip = calculateTip(total);
        printReceipt(itemsName, itemsPrice, total, tax, tip);

        input.close();

    }

}
