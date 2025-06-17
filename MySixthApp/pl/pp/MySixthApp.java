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

        /*

        System.out.println("Calculations and display of the result for values assigned in the application code");
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your score #1 is " + finalScore);
        }

        System.out.println("Calculations and display of the result for values assigned in the application code (different before)");
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your score #2 is " + finalScore);
        }

        System.out.println("Calculations using the method calculateScore_noArguments(), but still for values assigned in the method code");
        calculateScore_noArguments();

        System.out.println("Calculations using the method calculateScore(), but this time for values entered into the method call argument");
        calculateScore_arguments(true, 2500, 9, 250);
        calculateScore_arguments(gameOver, score, levelCompleted, bonus);

        System.out.println("Calculations and display can be made independent each other by adding a parameter that this method will return using return");
        finalScore = calculateScore_argumentsReturn(gameOver, score, levelCompleted, bonus);
        System.out.println("Your score #5 is " + finalScore);
        */
    }

    // Iterative method
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive method
    public static long factorialRecursive(int n) {
        if (n <= 1)
            return 1;
        return n * factorialRecursive(n - 1);
    }

    // Old methods (still present, but not used anymore)
    /*
    private static void calculateScore_noArguments() {
        boolean gameOver = true;
        int score = 150;
        int levelCompleted = 2;
        int bonus = 1000;

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your score #3 is " + finalScore);
        }
    }

    private static void calculateScore_arguments(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your score #4 is " + finalScore);
        }
    }

    private static int calculateScore_argumentsReturn(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
    */
}
