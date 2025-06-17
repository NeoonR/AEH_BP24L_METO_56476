package pl.pp;
import java.util.Scanner;

public class DaysToWeeks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;

        while (true) {
            System.out.print("Enter the number of days (enter 0 or a negative number to quit): ");
            days = scanner.nextInt();

            if (days <= 0) {
                System.out.println("Exiting program...");
                break;
            }

            int weeks = days / 7;
            int remainingDays = days % 7;

            System.out.println(days + " days is " + weeks + " week(s) and " + remainingDays + " day(s).");
        }

        scanner.close();
    }
}
