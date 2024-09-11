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
        } else if (remainingIncome == 0) {
            System.out.println("You are saving $" + remainingIncome + " this month.");
        } else {
            System.out.println("You are saving $" + remainingIncome + " this month.");
        }

        // close scanner
        input.close();
    }

}
