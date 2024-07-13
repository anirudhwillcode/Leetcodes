import java.util.HashMap;
import java.util.Map;

public class isomorphic {

    public static void main(String[] args) {
        isomorphic iso = new isomorphic();
        System.out.println(iso.isomorphicCheck("egg", "add")); // true
        System.out.println(iso.isomorphicCheck("foo", "bar")); // false
    }

    static boolean isomorphicCheck(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> myHash = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char next = t.charAt(i);

            if (!myHash.containsKey(original)) {
                if (!myHash.containsValue(next)) {
                    myHash.put(original, next);
                } else {
                    return false;
                }
            } else {
                char mapped = myHash.get(original);
                if (mapped != next) {
                    return false;
                }
            }
        }
        return true;
    }
}
