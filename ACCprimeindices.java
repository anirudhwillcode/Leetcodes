import java.util.Scanner;

public class ACCprimeindices {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array broooo: ");
        int n=sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the numbers in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int result=primeindice(arr);

        System.out.println("The sum of prime indices are: "+result);
        sc.close();
        
    }
    public static int primeindice(int [] arr){
        int sumofprime=0;
        for(int i=0;i<arr.length;i++){
            if(isPrime(i)){
                sumofprime+=arr[i];
            }
        }

        return sumofprime;
    }

    public static boolean isPrime(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }

        if(count==2){
            return true;
        }else return false;



    }
}
