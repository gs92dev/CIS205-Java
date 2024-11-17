import java.util.ArrayList;
import java.util.Scanner;

/*
 * Guilherme dos Santos
 * Lab11 - Finance Assistant 2
 * 11/16/2024
 */

public class FinanceAssistant {
        public static void main(String args[]) {
                // ------------------ Scanner ------------------
                Scanner input = new Scanner(System.in);
                // ------------------ Variables ------------------
                // input variables

                double monthlyIncome;
                int categories;
                ArrayList<String> expenseCategories = new ArrayList<String>();
                ArrayList<Double> expenseAmounts = new ArrayList<Double>();

                // ----- output variables

                double remainingIncome;
                double totalExpenses = 0;

                System.out.println("\nWelcome to the Finance Assistant!");
                System.out.println("");

                // ---------------------- input-----------------------

                System.out.println("Enter your monthly income: ");
                monthlyIncome = input.nextDouble();

                System.out.println("Enter the number of categories: ");
                categories = input.nextInt();
                System.out.println("Number of categories: " + categories);

                for (int i = 0; i < categories; i++) {
                        System.out.println("Enter the name of the category: ");
                        expenseCategories.add(input.next());
                }

                for (int i = 0; i < categories; i++) {
                        System.out.println("Enter the amount for " + expenseCategories.get(i) + ": ");
                        expenseAmounts.add(input.nextDouble());
                }

                // ------------------ Calculations and Output ------------------

                System.out.println("Monthly income: $" + monthlyIncome);

                for (int i = 0; i < expenseAmounts.size(); i++) {
                        totalExpenses += expenseAmounts.get(i);
                }

                for (int i = 0; i < expenseAmounts.size(); i++) {
                        System.out.println(expenseCategories.get(i) + ": $" + expenseAmounts.get(i) + " ("
                                        + (expenseAmounts.get(i) / monthlyIncome) * 100 + "%) of your monthly income");
                }

                remainingIncome = monthlyIncome - totalExpenses;

                System.out.println("Total expenses: $" + String.format("%.2f", totalExpenses));
                System.out.println("Remaining income: $" + String.format("%.2f", remainingIncome));

                // close scanner
                input.close();
        }
        /*
         * Output:
         * 
         * Welcome to the Finance Assistant!
         * 
         * Enter your monthly income:
         * 1000
         * Enter the number of categories:
         * 4
         * Number of categories: 4
         * Enter the name of the category:
         * Rent
         * Enter the name of the category:
         * Utitlities
         * Enter the name of the category:
         * Groceries
         * Enter the name of the category:
         * Entertainment
         * Enter the amount for Rent:
         * 505
         * Enter the amount for Utitlities:
         * 202.6
         * Enter the amount for Groceries:
         * 120.5
         * Enter the amount for Entertainment:
         * 35.9
         * Monthly income: $1000.0
         * Rent: $505.0 (50.5%) of your monthly income
         * Utitlities: $202.6 (20.26%) of your monthly income
         * Groceries: $120.5 (12.049999999999999%) of your monthly income
         * Entertainment: $35.9 (3.5900000000000003%) of your monthly income
         * Total expenses: $864.00
         * Remaining income: $136.00
         */

}
