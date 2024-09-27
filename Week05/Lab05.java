/*
 * Guilherme dos Santos
 * Lab05 -Stock Market Analysis
 * 09/26/2024
 */
public class Lab05 {
    public static void main(String[] args) {
        // Variables
        double sum, average, highest, lowest, percentChange;

        double[] stockPrices = { 28.4, 28.34, 28.81, 28.63, 27.94, 26.44, 26.89, 26.62, 26.21, 26.63, 26.72, 26.48,
                26.40, 26.56, 26.56, 27.07, 26.69, 26.44, 26.54, 26.54, };

        // Initialization Section
        highest = 0; // Assume the highest element is 0 since all elements are positive
        lowest = stockPrices[0]; // Assume the lowest is the first element
        sum = 0; // Initialize the sum with 0

        // Processing Section
        for (int i = 0; i < stockPrices.length; i++) {
            // sum each element
            sum += stockPrices[i];
            // This if statement is to get the highest number
            if (stockPrices[i] > highest) {
                highest = stockPrices[i];
            }
            // This if statement is to get the lowest number
            if (stockPrices[i] < lowest) {
                lowest = stockPrices[i];
            }
        }
        // Calculate the average
        average = sum / stockPrices.length;
        // Percentage
        percentChange = ((stockPrices[stockPrices.length - 1] - stockPrices[0]) / stockPrices[0]) * 100;

        // Display Section
        System.out.println("Stock Market Analysis Report");
        System.out.println("-------------------------------");
        System.out.printf("The average price is: $%.4f", average);
        System.out.println("\nHighest price: $" + highest);
        System.out.println("Lowest Stock Price:$" + lowest);
        System.out.println("Total Number of Trading Days: " + stockPrices.length);
        System.out.printf("Percentage Change from Start to End:%.1f", percentChange);
        System.out.print("%");

    }

    /*
     * Output:
     * Stock Market Analysis Report
     * -------------------------------
     * The average price is: $27.0455
     * Highest price: $28.81
     * Lowest Stock Price:$26.21
     * Total Number of Trading Days: 20
     * Percentage Change from Start to End:-6.5%
     */

}
