import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class reading {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("readed.txt");
        path.toString();
        System.out.println(path);
        System.out.println(path.getFileName());
        System.out.println(path.getNameCount());
        System.out.println("absolute path: ");
        System.out.println(path.toAbsolutePath());

        BufferedReader reader = java.nio.file.Files.newBufferedReader(path);
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ");
            System.out.println(parts);
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("writing.txt"));

        writer.write("Hello, world!");
        writer.newLine();
        writer.write("Hello, world!");
        System.out.println("File writed");

    }
}