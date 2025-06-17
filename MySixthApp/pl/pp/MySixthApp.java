package pl.pp;

public class MySixthApp {
    public static void main(String[] args) {
        int N = 20; // You can change this value for different factorial inputs

        // Iterative factorial calculation
        long startTimeIterative = System.nanoTime();
        long resultIterative = factorialIterative(N);
        long endTimeIterative = System.nanoTime();
        long durationIterative = endTimeIterative - startTimeIterative;

        System.out.println("Iterative Factorial of " + N + " is: " + resultIterative);
        System.out.println("Time taken (Iterative): " + durationIterative + " ns");

        // Recursive factorial calculation
        long startTimeRecursive = System.nanoTime();
        long resultRecursive = factorialRecursive(N);
        long endTimeRecursive = System.nanoTime();
        long durationRecursive = endTimeRecursive - startTimeRecursive;

        System.out.println("Recursive Factorial of " + N + " is: " + resultRecursive);
        System.out.println("Time taken (Recursive): " + durationRecursive + " ns");
    }
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static long factorialRecursive(int n) {
        if (n <= 1)
            return 1;
        return n * factorialRecursive(n - 1);
    }
}
