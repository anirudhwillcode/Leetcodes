import java.util.Scanner;
public class sumofevenandodd {
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of the array: ");
       int n=sc.nextInt();
       int [] arr=new int[n];
       System.out.println("Enter the array elements: ");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       int [] result= sumofoddeven(arr);4
       System.out.println("Sum of even numbers: " + result[0]);
       System.out.println("Sum of odd numbers: " + result[1]);
       sc.close();
       
       
    }

    public static int[] sumofoddeven(int [] arr){
        int sumofeven=0;
        int sumofodd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sumofeven+=arr[i];
            }else{
                sumofodd+=arr[i];
            }
        }
        int [] result={sumofeven,sumofodd};
        return result;
    }
}