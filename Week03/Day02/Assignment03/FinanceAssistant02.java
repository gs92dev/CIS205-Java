import java.util.Scanner;

/*
 * Guilherme dos Santos
 * Lab02
 * 09/12/2024
 */

public class FinanceAssistant02 {
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

        if (remainingIncome < 0) {
            System.out.println("You are in debt. You need to save $" + Math.abs(remainingIncome) + " to break even.");
        } else if (remainingIncome > 0) {
            System.out.println("You are saving $" + remainingIncome + " this month.");
        } else {
            System.out.println(remainingIncome + " You are breaking even.");
        }
        // close scanner
        input.close();
    }
    /*
     * output:
     * Saving:
     * Enter your monthly income:
     * 1000
     * Enter your monthly rent:
     * 800
     * Enter your monthly utilities:
     * 0
     * Enter your monthly groceries:
     * 0
     * Enter your monthly entertainment:
     * 0
     * Monthly income: $1000.0
     * Rent: $800.0 (80.0%) of your monthly income
     * Utilities: $0.0 (0.0%) of your monthly income
     * Groceries: $0.0 (0.0%) of your monthly income
     * Entertainment: $0.0 (0.0%) of your monthly income
     * Total expenses: $800.0
     * Remaining income: $200.0
     * You are saving $200.0 this month.
     * 
     * Debt:
     * Enter your monthly income:
     * 1000
     * Enter your monthly rent:
     * 800
     * Enter your monthly utilities:
     * 200
     * Enter your monthly groceries:
     * 600
     * Enter your monthly entertainment:
     * 500
     * Monthly income: $1000.0
     * Rent: $800.0 (80.0%) of your monthly income
     * Utilities: $200.0 (20.0%) of your monthly income
     * Groceries: $600.0 (60.0%) of your monthly income
     * Entertainment: $500.0 (50.0%) of your monthly income
     * Total expenses: $2100.0
     * Remaining income: $-1100.0
     * You are in debt. You need to save $1100.0 to break even.
     * 
     * Even:
     * Enter your monthly income:
     * 1500
     * Enter your monthly rent:
     * 800
     * Enter your monthly utilities:
     * 200
     * Enter your monthly groceries:
     * 300
     * Enter your monthly entertainment:
     * 200
     * Monthly income: $1500.0
     * Rent: $800.0 (53.333333333333336%) of your monthly income
     * Utilities: $200.0 (13.333333333333334%) of your monthly income
     * Groceries: $300.0 (20.0%) of your monthly income
     * Entertainment: $200.0 (13.333333333333334%) of your monthly income
     * Total expenses: $1500.0
     * Remaining income: $0.0
     * 0.0You are breaking even.
     * 
     */

}
