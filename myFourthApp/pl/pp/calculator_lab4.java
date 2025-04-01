package pl.pp;
import java.util.Scanner;

public class calculator_lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = true;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    }
                    break;
            }

            if (validOperation) {
                System.out.println("Result: " + result);
            }
        }

        scanner.close();
    }
}
