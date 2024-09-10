
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class tryuisinghash {
    public static void main(String [] args){
    String[] fruits = {"Apple", "Ban", "Mangowwwwwwwww", "Orange"};
    logeststring(fruits);

    }
    public static void logeststring( String [] words){
        Map<String,Integer>hashmap=new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            hashmap.put(words[i], words[i].length());
        }

        int maxValue=Collections.max(hashmap.values());

        for(Map.Entry<String,Integer> entry:hashmap.entrySet()){
            if(entry.getValue()==maxValue){
                System.out.println("The largest value is " + entry.getKey() + " the size is " + entry.getValue());
                break;
            }
        }

        
}
}


