import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s="anagram";
        String t="cat";
        boolean result=isAnagram(s,t);
        System.out.println(result);

    }
    
    public boolean isAnagram(String s, String t) {
        
        //convert to char array
        char[]schar=s.toCharArray();
        char[]tchar=t.toCharArray();

        //sort char arrays
        Arrays.sort(schar);
        Arrays.sort(tchar);

        //convert it to string
        String sortedSchar=new String(schar);
        String sortedTchar=new String(tchar);
    
        return sortedSchar.equals(sortedTchar);
}

}