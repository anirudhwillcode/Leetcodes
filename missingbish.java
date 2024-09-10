public class missingbish {

    public static int missingbishh(int [] arr){
        int n=arr.length;
        int sumofnatnum=n*(n-1)/2;
        int sumofnumbers=0;

        for(int i=0;i<n;i++){
            sumofnumbers+=arr[i];
        }

        int numbermissing=sumofnatnum-sumofnumbers;

        return numbermissing;
    }
}
