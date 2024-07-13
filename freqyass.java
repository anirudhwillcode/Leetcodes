import java.util.Map;
import java.util.TreeMap;

class freqyass {
    public static void main(String[] args) {
        String s = "treeyyytt";
        TreeMap<Character, Integer> result = charOccurrences(s);
        
        // Print the result
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static TreeMap<Character, Integer> charOccurrences(String s) {
        TreeMap<Character, Integer> occurrence = new TreeMap<>();
        
        for (char c : s.toCharArray()) {
            if (occurrence.containsKey(c)) {
                occurrence.put(c, occurrence.get(c) + 1); // If the character already exists, increment the count
            } else {
                occurrence.put(c, 1); // If the character doesn't exist, add it with a count of 1
            }
        }
        
        return occurrence;
    }
}
