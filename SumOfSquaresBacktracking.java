public class SumOfSquaresBacktracking {

    // Function to find the minimum number of squares for n using backtracking
    public static int minSquares(int n) {
        // Start backtracking with the largest possible square number
        return backtrack(n, (int) Math.sqrt(n), 0);
    }

    // Backtracking function
    private static int backtrack(int n, int largestSquare, int count) {
        // If n becomes 0, we have found a valid combination
        if (n == 0) {
            return count;
        }

        // Variable to store the minimum number of squares
        int minSquares = Integer.MAX_VALUE;

        // Loop through all square numbers less than or equal to largestSquare
        for (int i = largestSquare; i > 0; i--) {
            int square = i * i;

            // If square is less than or equal to n, explore further
            if (square <= n) {
                // Recursively call backtracking with the new value n - square
                minSquares = Math.min(minSquares, backtrack(n - square, i, count + 1));
            }
        }

        return minSquares;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int n = 13; // Example input
        System.out.println("Minimum number of squares for " + n + " is: " + minSquares(n));
    }
}
