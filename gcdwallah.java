import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class gcdwallah {
    public static void main(String[] args) {

        int a=200;
        int b=300;
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        List<Integer> list3=new ArrayList<>();

        for(int i=1;i<=a;i++){
            if(a%i==0){
                list1.add(i);
            }
        }

        for(int j=1;j<=b;j++){
            if(b%j==0){
                list2.add(j);
            }
        }

        for (int i = 0; i < list1.size(); i++) { // Loop through list1
            for (int j = 0; j < list2.size(); j++) { // Loop through list2
                if (list1.get(i).equals(list2.get(j))) { // Compare elements
                    list3.add(list1.get(i)); // Add the common element to list3
                    break; // Exit inner loop once a match is found
                }
            }
        }

        int max = Collections.max(list3);
        
        
        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list3);
        System.out.println("The gcd is "+max);
        
    }
   
}
