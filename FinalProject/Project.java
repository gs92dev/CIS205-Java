/*
 * Name: Guilherme dos Santos
 * 12/08/2024
 * Simple Linear Regression
 * 
 * With this model we have two sets of values and we use them to
 * make a linear regression and predict future outcomes
*/

public class Project {

	// Method to calculate the mean of an array
	public static double means(int[] valuerArray) {
		// Initialize variables
		double mean = 0;
		double sum = 0;

		// Loop through the array to calculate the sum of all values
		for (int i = 0; i < valuerArray.length; i++) {
			sum += valuerArray[i];
		}
		// Calculate the mean
		mean = sum / valuerArray.length;
		// Return the mean so I can store it in a variable
		return mean;
	}

	public static double numerator(int[] x, int[] y, double mean_x, double mean_y) {
		double numerator = 0;
		for (int i = 0; i < x.length; i++) {
			numerator += (x[i] - mean_x) * (y[i] - mean_y);
		}
		return numerator;
	}

	public static double denominator(int[] x, double mean_x) {
		double denominator = 0;
		for (int i = 0; i < x.length; i++) {
			denominator += Math.pow(x[i] - mean_x, 2);
		}
		return denominator;
	}

	public static double r_squared(int[] x, int[] y, double m, double b) {
		double r_squared = 0;
		double y_predicted = 0;
		double sse = 0; // Sum of Squared Errors
		double sst = 0; // Total Sum of Squares
		double mean_y = means(y);

		for (int i = 0; i < x.length; i++) {
			y_predicted = (m * x[i]) + b;
			sse += Math.pow(y[i] - y_predicted, 2);
			sst += Math.pow(y[i] - mean_y, 2);
		}
		r_squared = 1 - (sse / sst);
		return r_squared;
	}

	public static void main(String[] args) {

		int[] advertisingBudget = { 9500, 6500, 3000, 4000, 7500, 8000, 10500, 5000, 5500, 2000, 7000, 1000, 8500, 6000,
				4500, 9000, 1500, 2500, 7000, 9000 };
		int[] monthlyRevenue = { 44986, 35353, 18436, 26017, 36779, 40885, 50692, 30040, 33171, 14834, 35229, 12211,
				41102, 32085, 25362, 43156, 12376, 17188, 20487, 46421 };

		double mean_x = means(advertisingBudget);
		double mean_y = means(monthlyRevenue);

		double m = 0;

		double numerator = numerator(advertisingBudget, monthlyRevenue, mean_x, mean_y);
		double denominator = denominator(advertisingBudget, mean_x);

		m = numerator / denominator;

		System.out.println("Slope (m): " + m);

		double b = mean_y - (m * mean_x);
		System.out.println("Intercept (b): " + b);

		System.out.println("Regression Equation: Y = " + m + " x + " + b);

		double r_squared = r_squared(advertisingBudget, monthlyRevenue, m, b);

		System.out.println("R^2: " + r_squared);

		int[] newValues = { 13000, 18000, 2500, 6000, 10000 };

		for (int i = 0; i < newValues.length; i++) {
			double newY = m * newValues[i] + b;
			System.out.println("X = " + newValues[i] + " Y = " + newY);
		}

	}
}
