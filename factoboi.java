import java.util.Scanner;

public class factoboi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Factorial of the : ");
        int number=sc.nextInt();
        int result=factorial(number);
        System.out.println(result);
        sc.close();


    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n * factorial(n-1);
    }

}
