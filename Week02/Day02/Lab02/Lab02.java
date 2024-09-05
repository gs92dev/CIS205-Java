import java.util.Scanner;

public class Lab02 {
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        double monthlyIncome, rent, utilities, groceries, gas, healthInsurance, entertainment, savings;
        System.out.println("Enter your monthly income: ");
        monthlyIncome = userInput.nextDouble();

        System.out.println("Enter your monthly rent: ");
        rent = userInput.nextDouble();

        System.out.println("Enter your monthly utilities: ");
        utilities = userInput.nextDouble();

        System.out.println("Hello, World!");
        userInput.close();
    }

}
