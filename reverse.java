import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to make it a reverse");
        int number=sc.nextInt();
        int result=reversenumber(number);
        System.out.println(result);
        sc.close();
    }

    public static int reversenumber(int number){
        
        int rev=0;
        
        while(number!=0){
            int rem=number%10;
            rev=rev*10+rem;
            number=number/10;
        }
       return rev;
    }
}
