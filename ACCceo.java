
public class ACCceo {
    public static void main(String[]args){
        int a[]={64,16,38,81,50,100};
        int n=a.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]%4==0){
                count+=1;
            }
        }

        System.out.println("The number of square plots is "+count);
    }
}
