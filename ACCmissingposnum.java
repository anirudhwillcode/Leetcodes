import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ACCmissingposnum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 6, 8, -1, -10, 15};

        int min=Arrays.stream(arr).min().orElse(Integer.MIN_VALUE);
        int max=Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
 
        //to store the numbers of the array for easy lookup
        Set<Integer>numbersinArray=new HashSet<>();

        for(int num:arr){
            numbersinArray.add(num);
        }
        //To store the positive numbers from the array
        StringBuilder sb=new StringBuilder();

        for(int i=min;i<=max;i++){
            if(i>0 && !numbersinArray.contains(i)){
                sb.append(i);
            }
        }

    }