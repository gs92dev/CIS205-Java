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

                double monthlyIncome, rent, utilities, groceries, entertainment;
                int categories;
                double totalExpenses = 0;
                ArrayList<String> expenseCategories = new ArrayList<String>();
                ArrayList<Double> expenseAmounts = new ArrayList<Double>();

                // ----- output variables

                double remainingIncome, rentPercentage, utilitiesPercentage, groceriesPercentage,
                                entertainmentPercentage;

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

                // System.out.println("Enter your monthly rent: ");
                // rent = input.nextDouble();

                // System.out.println("Enter your monthly utilities: ");
                // utilities = input.nextDouble();

                // System.out.println("Enter your monthly groceries: ");
                // groceries = input.nextDouble();

                // System.out.println("Enter your monthly entertainment: ");
                // entertainment = input.nextDouble();

                // ------------------ Calculations ------------------
                //

                for (int i = 0; i < expenseAmounts.size(); i++) {
                        totalExpenses += expenseAmounts.get(i);
                }

                for (int i = 0; i < expenseAmounts.size(); i++) {
                        System.out.println(expenseCategories.get(i) + ": $" + expenseAmounts.get(i) + " ("
                                        + (expenseAmounts.get(i) / monthlyIncome) * 100 + "%) of your monthly income");
                }
                // // rent percentage
                // rentPercentage = (rent / monthlyIncome) * 100;
                // // utilities percentage
                // utilitiesPercentage = (utilities / monthlyIncome) * 100;
                // // groceries percentage
                // groceriesPercentage = (groceries / monthlyIncome) * 100;
                // // entertainment percentage
                // entertainmentPercentage = (entertainment / monthlyIncome) * 100;

                remainingIncome = monthlyIncome - totalExpenses;

                // ------------------ Output ------------------
                // System.out.println("Monthly income: $" + monthlyIncome);
                // System.out.println("Rent: $" + rent + " (" + rentPercentage + "%) of your
                // monthly income");
                // System.out.println(
                // "Utilities: $" + utilities + " (" + utilitiesPercentage + "%) of your monthly
                // income");
                // System.out.println("Groceries: $" + groceries + " (" + groceriesPercentage
                // + "%) of your monthly income");
                // System.out.println(
                // "Entertainment: $" + entertainment + " (" + entertainmentPercentage
                // + "%) of your monthly income");

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
