package pl.pp;
import java.util.Scanner;

public class ageconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age in years: ");
        int ageInYears = scanner.nextInt();
        long ageInSeconds = (long) ageInYears * 365 * 24 * 60 * 60;
        System.out.println("My age in seconds: " + ageInSeconds);

        scanner.close();
    }
}