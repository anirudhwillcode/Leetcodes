
public class ACCnumofbulb {
    public static void main(String[] args) {
        int n=50;
        int result=countnumofbulb(n);
        System.out.println("The Result is "+ result);
    }
    public static int countnumofbulb(int n ){
        int i=1;
        int count=0;
        while(i*i<n){
            count=count+1;
            i+=1;
        }
        
        return count;
    }
}
