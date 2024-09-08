import java.util.Scanner;

/*
 * Guilherme dos Santos
 * Lab02
 * 09/07/2024
 */

public class FinanceAssistant {
    public static void main(String args[]) {
        // ------------------ Scanner ------------------
        Scanner input = new Scanner(System.in);
        // ------------------ Variables ------------------
        // input variables

        double monthlyIncome, rent, utilities, groceries, entertainment;

        // ----- output variables

        double totalExpenses, remainingIncome, rentPercentage, utilitiesPercentage, groceriesPercentage,
                entertainmentPercentage;

        // ---------------------- input-----------------------
        System.out.println("Enter your monthly income: ");
        monthlyIncome = input.nextDouble();

        System.out.println("Enter your monthly rent: ");
        rent = input.nextDouble();

        System.out.println("Enter your monthly utilities: ");
        utilities = input.nextDouble();

        System.out.println("Enter your monthly groceries: ");
        groceries = input.nextDouble();

        System.out.println("Enter your monthly entertainment: ");
        entertainment = input.nextDouble();

        // ------------------ Calculations ------------------
        //
        totalExpenses = rent + utilities + groceries + entertainment;
        // rent percentage
        rentPercentage = (rent / monthlyIncome) * 100;
        // utilities percentage
        utilitiesPercentage = (utilities / monthlyIncome) * 100;
        // groceries percentage
        groceriesPercentage = (groceries / monthlyIncome) * 100;
        // entertainment percentage
        entertainmentPercentage = (entertainment / monthlyIncome) * 100;

        remainingIncome = monthlyIncome - totalExpenses;

        // ------------------ Output ------------------
        System.out.println("Monthly income: $" + monthlyIncome);
        System.out.println("Rent: $" + rent + " (" + rentPercentage + "%) of your monthly income");
        System.out.println("Utilities: $" + utilities + " (" + utilitiesPercentage + "%) of your monthly income");
        System.out.println("Groceries: $" + groceries + " (" + groceriesPercentage + "%)    of your monthly income");
        System.out.println(
                "Entertainment: $" + entertainment + " (" + entertainmentPercentage + "%) of your monthly income");

        System.out.println("Total expenses: $" + totalExpenses);
        System.out.println("Remaining income: $" + remainingIncome);

        // close scanner
        input.close();
    }
    /*
     * Output:
     * Enter your monthly income:
     * 1000
     * Enter your monthly rent:
     * 500
     * Enter your monthly utilities:
     * 100
     * Enter your monthly groceries:
     * 85
     * Enter your monthly entertainment:
     * 55
     * Monthly income: $1000.0
     * Rent: $500.0 (50.0%) of your monthly income
     * Utilities: $100.0 (10.0%) of your monthly income
     * Groceries: $85.0 (8.5%) of your monthly income
     * Entertainment: $55.0 (5.5%) of your monthly income
     * Total expenses: $740.0
     * Remaining income: $260.0
     */

}
