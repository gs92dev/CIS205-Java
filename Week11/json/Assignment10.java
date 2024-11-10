/*
 * Guilherme dos Santos
 * Assignment 10
 * Read Json file
 * 11/09/2024
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Assignment10 {

    public static void main(String[] args) {

        File file = new File("file.json");
        StringBuilder contentBuilder = new StringBuilder();
        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            while ((line = reader.readLine()) != null) {
                if (line.contains("{") || line.contains("}")) {
                    continue;
                }
                line = line.replaceAll("\"", "");
                line = line.replaceAll(",", "");
                contentBuilder.append(line);
                contentBuilder.append("\n");

            }

            String content = contentBuilder.toString();
            System.out.println(content);

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    /*
     * Output:
     * name: John Doe
     * age: 30
     * city: New York
     * email: john.doe@example.com
     */
    /*
     * Difference between JSON, XML and CSV:
     * JSON is a lightweight data-interchange format that's easy for both humans and
     * machines to read and write. Based on a subset of JavaScript, it's widely used
     * for data exchange between web applications and servers.
     * 
     * XML, while once a popular choice, is less commonly used today due to its
     * verbosity and complexity compared to JSON. It's a markup language that
     * defines rules for encoding documents in a human-readable and machine-readable
     * format.
     * 
     * CSV is a simple file format for storing tabular data, such as spreadsheets or
     * databases. It uses plain text to represent data, making it easy to read and
     * edit.
     */
}