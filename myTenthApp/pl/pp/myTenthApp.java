package pl.pp;
public class myTenthApp {
    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0) {
            return null;
        }
        int negativeCount = 0;
        int positiveSum = 0;

        for (int num : input) {
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveSum += num;
            }
        }

        return new int[] { negativeCount, positiveSum };
    }
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, -3, -2, -1};
        int[] result = countAndSumElements(input);
        System.out.println("Negative Count: " + result[0]);
        System.out.println("Sum of Positives: " + result[1]);
    }
}