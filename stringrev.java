public class stringrev {
    public String reverseWords(String s) {
        String[] splitted = s.split("\\s+");
        
        for (int i = 0; i < splitted.length / 2; i++) {
            int f = i;
            int b = splitted.length - 1 - i;
            
            swapStrings(splitted, f, b );
        }
        
        // Print the swapped array
        // for (String word : splitted) {
        //     System.out.print(word + " ");
        // }

        return splitted;
    }

    public static void swapStrings(String[] array, int index1, int index2) {
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
