import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingHash {
    public static void main(String[] args) {
        Map<Integer, Integer> hashy = new HashMap<>();

        int[] arr = {8, 7, 4, 3, 5, 2, 55, 7};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (hashy.containsKey(complement)) {
                // Found the pair
                int value = hashy.get(complement);
                int key = i;
                System.out.println("Indices: " + value + " and " + key);
                System.out.println("Values: " + arr[value] + " and " + arr[key]);
                return; // Exit after finding the first valid pair
            }

            // Store the index of the current element
            hashy.put(arr[i], i);
        }

        System.out.println("No pair found");
    }
}
