import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class maxelement {
    public static void main(String[] args) {
        Map<Integer,Integer>num=new HashMap<>();
        int a[]={6,2,8,9,5,4,1,3};
         
        for(int i=0;i<a.length;i++){
            num.put(a[i],i);
        }

        Arrays.sort(a);

        

    }
}
