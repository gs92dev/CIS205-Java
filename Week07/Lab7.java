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
        double tax = total * 0.09;
        return tax;
    }

    public static double calculateTip(double total) {
        double tip = total * 0.2;
        return tip;
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
        System.out.printf("Cost of Food: $%.2f\n", total);

        System.out.printf("Tax (9%%): $%.2f\n", tax);
        System.out.printf("Tip (20%%): $%.2f\n", tip);

        System.out.println("----------------------------");
        System.out.println();

        System.out.printf("Total: $%.2f\n", total + tax + tip);

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

    /*
     * Output:
     * Please, Enter the number of items ordered by the table:
     * 3
     * Enter the name of the item: 1
     * Burger
     * Enter the price of the item: 1
     * 10.99
     * Enter the name of the item: 2
     * Salad
     * Enter the price of the item: 2
     * 7.49
     * Enter the name of the item: 3
     * Soda
     * Enter the price of the item: 3
     * 1.99
     * Restaurant Receipt
     * ----------------------------
     * Items Details:
     * 1. Burger - $10.99
     * 2. Salad - $7.49
     * 3. Soda - $1.99
     * 
     * Cost of Food: $20.47
     * Tax (9%): $1.84
     * Tip (20%): $4.09
     * ----------------------------
     * 
     * Total: $26.41
     * 
     * Output2:
     * Please, Enter the number of items ordered by the table:
     * 2
     * Enter the name of the item: 1
     * Pizza
     * Enter the price of the item: 1
     * 15.99
     * Enter the name of the item: 2
     * Soda
     * Enter the price of the item: 2
     * 5.60
     * Restaurant Receipt
     * ----------------------------
     * Items Details:
     * 1. Pizza - $15.99
     * 2. Soda - $5.6
     * 
     * Cost of Food: $21.59
     * Tax (9%): $1.94
     * Tip (20%): $4.32
     * ----------------------------
     * 
     * Total: $27.85
     */

}
