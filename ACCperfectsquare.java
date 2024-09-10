
public class ACCperfectsquare {
    public static void main(String[] args) {
        int a[]={64,16,38,81,50,100};
        int count=0;
        for(int i=0;i<a.length;i++){
            int og=a[i];   // Keep each of the original array numbers in a variable 
             double dubsqrt=Math.sqrt(a[i]); // Why Double? - to get exact digits of the number 
             int sqrtint=(int)dubsqrt; // casting the number to nearest whole number (int)
             System.out.println(sqrtint);
             if(sqrtint*sqrtint==og){  // check if the square of the rounded number is equal to the og number
                count+=1;  // if true increse the counter
             }
        }

        System.out.println("The number of square plots is: "+count);
    }
}
