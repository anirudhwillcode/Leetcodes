package AccentureProblems;
public class happynumber {
    public static void main(String[] args) {
        int n=19;
        int newnum=n;
    
        while(newnum!=1){
            n=newnum;
           int  sumofsqr=0;
            while(n>0){
                int digit=n%10;
                sumofsqr+=digit*digit;
                n=n/10;
            }
            newnum=sumofsqr;
        }
        System.out.println("true");

    }
}
