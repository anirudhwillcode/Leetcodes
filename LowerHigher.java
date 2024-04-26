class LowerHigher {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 3, 4, 8, 15, 7, 5}; // Example array
        int target = 7; // Example target value

        int[] result = firstLastPos(arr, target); // Call the method to get the result
        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
    }

    public static int[] firstLastPos(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            if (arr[low] != target) {
                low += 1;
            }
            if (arr[high] != target) {
                high -= 1;
            }
        }
        int[] result={low,high};
        return result;
    }
}
