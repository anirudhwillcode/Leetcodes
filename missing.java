import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class missing {
    public static void main(String[] args) {
        int [] arr={0,-10,1,3,-20};

        int min=Arrays.stream(arr).min().orElse(Integer.MIN_VALUE);
        int max=Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);

        Set<Integer>newset= new HashSet<>();

        for(int num:arr){
            newset.add(num);
        }
        
        StringBuilder sb= new StringBuilder();
        for(int i=min;i<=max;i++){
            if(i>0&& !newset.contains(i)){
                sb.append(i);
            }
        }

      System.out.println(sb);  
    }
}
