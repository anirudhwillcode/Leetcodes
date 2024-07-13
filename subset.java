public class subset {

    public static int countSubsets(int[] ar,int sum,int i){
        if(sum==0){                       // if sum is 0 we return 1 is a base case(you might be wondering why 
           return 1;                      // look this is a valid base case as we are adding the recursive call 
        }                                 // we find out the number of subsets that equals to the given sum
        if(sum<0){
            return 0;

        }
        if(i==ar.length){
            return 0;
        }

        return countSubsets(ar, sum-ar[i], i+1) + countSubsets(ar, sum, i+1);
    }

    public static void main(String [] args){
        int[] ar={20,10,15,50,40,45};
        System.out.println(countSubsets(ar, 60, 0));
    }
}

/* how does this work : this is the beauty of recursion we are calling the function recursively 
   in each call if the sum becomes 0 it returns 1 this inturn is returning the count of subsets
   now we are calling 2 times one time is picking the number i.e countSubsets(ar, sum-ar[i], i+1)
   and not picking the number i.e countSubsets(ar, sum, i+1)
 */