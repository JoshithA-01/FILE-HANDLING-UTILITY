import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        String fileName = "example.txt";

        // Writing to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello, this is a test file.");
            writer.newLine();
            writer.write("This is the second line.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Modifying a file (Appending new content)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.newLine();
            writer.write("This is an appended line.");
            System.out.println("File modified successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
