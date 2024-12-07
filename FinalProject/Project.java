/*
 * Name: Guilherme dos Santos
 * 12/08/2024
 * Simple Linear Regression
 * 
 * With this model we have two sets of values and we use them to
 * make a linear regression and predict future outcomes based on the previous ones.
*/

//Main class for the project Simple Linear Regression
public class Project {

	/**
	 * Method to calculate the mean of x and y.
	 * 
	 * @param valueArray The array of integers which we want to calculate the mean.
	 * @return The double mean.
	 */
	public static double mean(int[] valueArray) {
		// Initialize variables
		double mean = 0; // Mean value
		double sum = 0; // Sum of all values

		// Loop through the array to calculate the sum of all values
		for (int i = 0; i < valueArray.length; i++) {
			sum += valueArray[i];
		}
		// Calculate the mean
		mean = sum / valueArray.length;
		// Return the mean so I can store it in a variable
		return mean;
	}

	/**
	 * Method to calculate the numerator of the slope formula.
	 * 
	 * @param budget       array of int representing the x values.
	 * @param revenue      array of int representing the y values.
	 * @param mean_budget  double representing the mean of the x values.
	 * @param mean_revenue double representing the mean of the y values.
	 * @return The double value of the numerator.
	 */
	public static double numerator(int[] budget, int[] revenue, double mean_budget, double mean_revenue) {
		double numerator = 0; // Initialize the numerator
		// Loop through the arrays to calculate the numerator
		for (int i = 0; i < budget.length; i++) {
			numerator += (budget[i] - mean_budget) * (revenue[i] - mean_revenue);
		}
		return numerator;
	}

	/**
	 * Method to calculate the denominator of the slope formula.
	 * 
	 * @param x      array of int representing the x values.
	 * @param mean_x double representing the mean of the x values.
	 * @return The double value of the denominator.
	 */
	public static double denominator(int[] x, double mean_x) {
		double denominator = 0; // Initialize the denominator
		// Loop through the array to calculate the denominator
		for (int i = 0; i < x.length; i++) {
			denominator += Math.pow(x[i] - mean_x, 2);
		}
		return denominator;
	}

	/**
	 * Method to calculate the R^2 (R squared) value.
	 * 
	 * @param budget  array of int representing the x values.
	 * @param revenue array of int representing the y values.
	 * @param m       double representing the slope.
	 * @param b       double representing the intercept.
	 * @param mean_y  double representing the mean of the y values.
	 * @return The double value of the denominator.
	 */
	public static double r_squared_method(int[] budget, int[] revenue, double m, double b, double mean_y) {
		double r_squared = 0;
		double y_predicted = 0;
		double sse = 0; // Sum of Squared Errors
		double sst = 0; // Total Sum of Squares

		// Loop through the arrays to calculate the R^2 value
		for (int i = 0; i < budget.length; i++) {
			y_predicted = (m * budget[i]) + b;
			sse += Math.pow(revenue[i] - y_predicted, 2);
			sst += Math.pow(revenue[i] - mean_y, 2);
		}
		r_squared = 1 - (sse / sst); // Calculate the R^2 value
		return r_squared;
	}

	public static void main(String[] args) {

		// ------------------- Variables to use -------------------
		int[] advertisingBudget = { 9500, 6500, 3000, 4000, 7500, 8000, 10500, 5000, 5500, 2000, 7000, 1000, 8500, 6000,
				4500, 9000, 1500, 2500, 7000, 9000 };
		int[] monthlyRevenue = { 44986, 35353, 18436, 26017, 36779, 40885, 50692, 30040, 33171, 14834, 35229, 12211,
				41102, 32085, 25362, 43156, 12376, 17188, 20487, 46421 };

		// Initialize the slope
		double m = 0;
		// New values to predict
		int[] newValues = { 13000, 18000, 2500, 6000, 10000 };
		// Initialize the intercept
		double b = 0;
		double r_squared = 0;

		// ------------------- Simple Linear Regression -------------------

		// Calculate the mean of x and y
		double mean_x = mean(advertisingBudget);
		double mean_y = mean(monthlyRevenue);

		// Calculate the numerator and denominator of the slope formula
		double numerator = numerator(advertisingBudget, monthlyRevenue, mean_x, mean_y);
		double denominator = denominator(advertisingBudget, mean_x);

		// Calculate the slope and intercept
		m = numerator / denominator;
		b = mean_y - (m * mean_x);

		// Print the slope and intercept
		System.out.println("Slope (m): " + m);
		System.out.println("Intercept (b): " + b);

		// Print the regression equation
		System.out.println("Regression Equation: Y = " + m + " * x + " + b);

		// Calculate the R^2 (R squared) value
		r_squared = r_squared_method(advertisingBudget, monthlyRevenue, m, b, mean_y);

		// Print the R^2 value
		System.out.println("R squared");
		System.out.println("R^2: " + r_squared);

		// ------------------- Predictions -------------------
		System.out.println("------------------------------------------");
		System.err.println("\nPredictions:\n");
		System.out.println("------------------------------------------");

		for (int i = 0; i < newValues.length; i++) {
			double newY = m * newValues[i] + b;
			System.out.printf("X = %d\t\tY = %.2f\n", newValues[i], newY);
			System.out.println("------------------------------------------");
		}

	}
}
