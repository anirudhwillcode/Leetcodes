
public class ACCsingledigitnumber {
public static void main(String[] args) {
   double n=6;
    while(n>=10){
        if(n%2!=0){
            n=Math.floor(n/2);
        }else{
            n=Math.floor(n-2/2);
        }
    }

    System.out.println("The thing is"+n);
}
}