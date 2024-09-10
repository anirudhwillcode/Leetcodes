public class SumOfSquares {

    // Function to return the minimum count of squares that sum up to n
    public static int minSquares(int n) {
        // Create a dp array to store the results for each number from 0 to n
        int[] dp = new int[n + 1];

        // Initialize dp[0] to 0, as the minimum count for 0 is 0
        dp[0] = 0;

        // Loop through all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Initialize dp[i] to a large value
            dp[i] = i;

            // Check for every square number less than or equal to i
            for (int j = 1; j * j <= i; j++) {
                // Update dp[i] by considering the minimum count of squares
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        // Return the result for dp[n]
        return dp[n];
    }

    // Main method to test the function
    public static void main(String[] args) {
        int n = 13; // Example input
        System.out.println("Minimum number of squares for " + n + " is: " + minSquares(n));
    }
}
