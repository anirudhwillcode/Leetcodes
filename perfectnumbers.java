import java.util.ArrayList;
import java.util.List;

public class perfectnumbers {
    public static void main(String[] args) {
        List<Integer>perfectlist=new ArrayList<>();
        int number=2;
        int checknum=number;
        for(int i=1;i<number;i++){
            if(number%i==0){
                perfectlist.add(i);
            }
        }

        System.out.print(perfectlist);  
        int sum=0;
        for(int i=0;i<perfectlist.size();i++){
             sum=sum+perfectlist.get(i);
        }
        
        if(sum==checknum){
            System.out.println("The number is a perfect number");
        }else{
            System.out.println("The number is not a perfect number");
        }
        
    }

   
}
