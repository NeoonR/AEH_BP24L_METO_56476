package pl.pp;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class MyThirteenthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path inputFilePath = null;

        // Ask user for valid input file path
        while (true) {
            System.out.print("Enter the path of the input text file: ");
            String inputPathStr = scanner.nextLine();
            inputFilePath = Paths.get(inputPathStr);

            if (Files.exists(inputFilePath) && Files.isRegularFile(inputFilePath)) {
                break;
            } else {
                System.out.println("File not found. Please enter a valid file path.");
            }
        }

        System.out.print("Enter the path of the output file: ");
        String outputPathStr = scanner.nextLine();
        Path outputFilePath = Paths.get(outputPathStr);

        try {
            // Read content from input file
            String content = Files.readString(inputFilePath);
            String[] words = content.split("\\W+"); // split on non-word characters
            int totalWords = 0;
            Map<String, Integer> wordCountMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER); // sorted map

            // Count words
            for (String word : words) {
                if (!word.isEmpty()) {
                    totalWords++;
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }

            // Display results to console
            System.out.println("\n--- Word Count Summary ---");
            System.out.println("Total words: " + totalWords);
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Write results to output file
            try (BufferedWriter writer = Files.newBufferedWriter(outputFilePath)) {
                writer.write("Input File: " + inputFilePath.getFileName());
                writer.newLine();
                writer.write("Total words: " + totalWords);
                writer.newLine();
                writer.write("Word occurrences:");
                writer.newLine();
                for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                    writer.write(entry.getKey() + ": " + entry.getValue());
                    writer.newLine();
                }
            }

            System.out.println("\nResults successfully written to: " + outputFilePath);

        } catch (IOException e) {
            System.out.println("Error reading or writing files: " + e.getMessage());
        }
    }
}
