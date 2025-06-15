package pl.pp;
import java.io.*;
import java.util.Scanner;

public class MyTwelfthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File inputFile = null;

        // Loop until a valid input file is provided
        while (true) {
            System.out.print("Enter the path to the input text file: ");
            String inputPath = scanner.nextLine();
            inputFile = new File(inputPath);

            if (!inputFile.exists() || !inputFile.isFile()) {
                System.out.println("Error: The file does not exist. Please try again.");
            } else {
                break;
            }
        }

        System.out.print("Enter the path to the output text file: ");
        String outputPath = scanner.nextLine();

        int lineCount = 0;

        // Count lines in the input file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            System.out.println("Error reading the input file: " + e.getMessage());
            return;
        }

        System.out.println("Number of lines in the file: " + lineCount);

        // Write result to the output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            writer.write("File: " + inputFile.getName() + "\n");
            writer.write("Number of lines: " + lineCount + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to the output file: " + e.getMessage());
        }

        scanner.close();
    }
}
