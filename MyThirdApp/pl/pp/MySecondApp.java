package pl.pp;
import java.util.Scanner;

public class MySecondApp {
    public static void main(String[] args) {

        // This is a line comment
        Scanner scanner = new Scanner(System.in);

        /* This is a block comment
           it can have multiple lines
           just like here */

        System.out.println("Please enter your name:");
        String forename = scanner.nextLine();

        System.out.println("Please enter your surname:");
        String surname = scanner.nextLine();

        System.out.println("Welcome " + forename + " " + surname);
        int x = 10;
        int doubleX = 2 * x;
        int squareX = x * x;
        System.out.println("x squared = " + squareX);

        // Task: Age in years → seconds
        System.out.println("\nPlease enter your age in years:");
        int ageInYears = scanner.nextInt();

        double secondsInAYear = 365.25 * 24 * 60 * 60;
        long ageInSeconds = (long)(ageInYears * secondsInAYear);

        System.out.println("My age in seconds: " + ageInSeconds);

        scanner.close();
    }
}
