package AccentureProblems;
import java.util.Scanner;

public class array1accenture {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int rightsum=0;
        int leftsum=0;
        int [] arr= new int[n];
       
        for(int i=0;i<n;i++){
            
            arr[i]=scanner.nextInt();

            rightsum+=arr[i];

        }

        int ans=-1;

        for(int i=0;i<n;i++){
            rightsum-=arr[i];

            if(leftsum==rightsum){
                ans=i;
                break;
            }
            leftsum=leftsum+a[i];
        }
    }

   
}
