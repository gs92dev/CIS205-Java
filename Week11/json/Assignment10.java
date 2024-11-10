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

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder contentBuilder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line);
                contentBuilder.append(System.lineSeparator());

            }

            String content = contentBuilder.toString();
            System.out.println(content);

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}