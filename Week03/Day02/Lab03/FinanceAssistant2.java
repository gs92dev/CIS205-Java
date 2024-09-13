import java.util.Scanner;

/*
 * Guilherme dos Santos
 * Lab02
 * 09/12/2024
 */

public class FinanceAssistant2 {
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
                System.out.println(
                                "Utilities: $" + utilities + " (" + utilitiesPercentage + "%) of your monthly income");
                System.out.println("Groceries: $" + groceries + " (" + groceriesPercentage
                                + "%)    of your monthly income");
                System.out.println(
                                "Entertainment: $" + entertainment + " (" + entertainmentPercentage
                                                + "%) of your monthly income");

                System.out.println("Total expenses: $" + totalExpenses);
                System.out.println("Remaining income: $" + remainingIncome);

                if (remainingIncome > 0) {
                        System.out.println("You have savings of $" + remainingIncome);
                } else if (remainingIncome < 0) {
                        System.out.println("You have a deficit of $" + remainingIncome);
                } else {
                        System.out.println("You broke even");
                }

                // close scanner
                input.close();
        }
        /*
         * Output:
         * savings:
         * Enter your monthly income:
         * 200
         * Enter your monthly rent:
         * 0
         * Enter your monthly utilities:
         * 0
         * Enter your monthly groceries:
         * 0
         * Enter your monthly entertainment:
         * 0
         * Monthly income: $200.0
         * Rent: $0.0 (0.0%) of your monthly income
         * Utilities: $0.0 (0.0%) of your monthly income
         * Groceries: $0.0 (0.0%) of your monthly income
         * Entertainment: $0.0 (0.0%) of your monthly income
         * Total expenses: $0.0
         * Remaining income: $200.0
         * You have savings of $200.0
         * 
         * even:
         * Enter your monthly income:
         * 1500
         * Enter your monthly rent:
         * 1000
         * Enter your monthly utilities:
         * 500
         * Enter your monthly groceries:
         * 0
         * Enter your monthly entertainment:
         * 0
         * Monthly income: $1500.0
         * Rent: $1000.0 (66.66666666666666%) of your monthly income
         * Utilities: $500.0 (33.33333333333333%) of your monthly income
         * Groceries: $0.0 (0.0%) of your monthly income
         * Entertainment: $0.0 (0.0%) of your monthly income
         * Total expenses: $1500.0
         * Remaining income: $0.0
         * You broke even
         * 
         * deficit:
         * Enter your monthly income:
         * 1000
         * Enter your monthly rent:
         * 10000
         * Enter your monthly utilities:
         * 0
         * Enter your monthly groceries:
         * 0
         * Enter your monthly entertainment:
         * 0
         * Monthly income: $1000.0
         * Rent: $10000.0 (1000.0%) of your monthly income
         * Utilities: $0.0 (0.0%) of your monthly income
         * Groceries: $0.0 (0.0%) of your monthly income
         * Entertainment: $0.0 (0.0%) of your monthly income
         * Total expenses: $10000.0
         * Remaining income: $-9000.0
         * You have a deficit of $-9000.0
         */

}
