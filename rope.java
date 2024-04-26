import java.util.*;

public class rope {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rope length: ");
        int n=sc.nextInt();
        System.out.println("Enter the a length: ");
        int a=sc.nextInt();

        System.out.println("Enter the b length: ");
        int b=sc.nextInt();
        System.out.println("Enter the c length: ");
        int c=sc.nextInt();

        System.out.println("The Max is"+ropecut(n,a,b,c));

    }
    public static int ropecut(int n,int a,int b,int c){
      int pieces=0;

      if(n==0){
        return 0;
      }else if(n<0){
        return -1;
      }
      int temp1=ropecut(n-a,a,b,c);
      int temp2=ropecut(n-b,a,b,c);
      int temp3=ropecut(n-c,a,b,c);

     pieces=max(temp1,temp2,temp3);
     //pieces=Math.max(temp1,Math.max(temp2,temp3)); 
     if(pieces==-1) return -1;

     return pieces+1;
    }
    
    public static int max(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if(b>a &&b>c){
            return b;
        }else 
        return c;
        

    }
}
