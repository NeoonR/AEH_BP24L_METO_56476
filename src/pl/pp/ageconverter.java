package pl.pp;
import java.util.Scanner;

public class ageconverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their age
        System.out.print("Enter your age in years: ");
        int ageInYears = scanner.nextInt();

        // Convert age to seconds (1 year = 365 days, 1 day = 24 hours, 1 hour = 60 minutes, 1 minute = 60 seconds)
        long ageInSeconds = (long) ageInYears * 365 * 24 * 60 * 60;

        // Display the result
        System.out.println("My age in seconds: " + ageInSeconds);

        // Close the scanner
        scanner.close();
    }
}

