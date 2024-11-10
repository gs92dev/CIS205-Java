import java.io.*;

public class FileHandlingDemo {

    // Method to read from a text file
    public static void readFromTextFile(String filePath) {
        try (/* create BufferedReader object and call it br */) {
            String line;
            while (/* using br, read from the file and assign it to line, make sure the it doesn't equal null*/) { 
                /* print line */
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to write to a text file
    public static void writeToTextFile(String filePath, String[] data) {
        try (/* create BufferedWriter object and call it bw */) { 
            for (/* iterate throw the data array */ ) {
                /* using bw write the data item to the file */
                /* using bw write a new line */ 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read from a CSV file
    public static void readFromCSVFile(String filePath) {
        String[][] records = new String[100][]; // why 100?
        int row = 0;
        try (/* create BufferedReader object and call it br */) {
            String line;
            while (/* using br, read from the file and assign it to line, make sure the it doesn't equal null, also make sure row is less than 100 */) {
                /* split the line using ", " and assign it to records[row]*/
                // increment row.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // print the data stored in records 
        for (String[] record : records) {
            if (record != null) {
                // using String.join, convert record array to a string and print it
                // System.out.println(record[0]+", "+record[1]+", "+record[2]); not the best choice
            }
        }
    }

    // Method to write to a CSV file
    public static void writeToCSVFile(String filePath, String[][] data) {
        try (/* create BufferedWriter object and call it bw */) {
            for (/* iterate throw the data 2D array, call each array line*/) {
                if (line != null) {
                    /*using bw write the data item (line) to the file, note that line is an array itself */
                	/* using bw write a new line */ 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String textFilePath = "example.txt";
        String csvFilePath = "example.csv";

        // Data to write to text file
        String[] textData = {
                "This is line 1",
                "This is line 2",
                "This is line 3"
        };

        // Data to write to CSV file
        String[][] csvData = {
                {"Name", "Age", "City"},
                {"Alice", "30", "New York"},
                {"Bob", "25", "San Francisco"},
                {"Charlie", "35", "Chicago"}
        };

        // Write to text file
        writeToTextFile(textFilePath, textData);

        // Read from text file
        System.out.println("Reading from text file:");
        readFromTextFile(textFilePath);

        // Write to CSV file
        writeToCSVFile(csvFilePath, csvData);

        // Read from CSV file
        System.out.println("\nReading from CSV file:");
        readFromCSVFile(csvFilePath);
        
    }
}
