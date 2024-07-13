public class recursionreverse {

    public static void  reverseit(int[]ar, int i){

        if(i<0 || i>=ar.length){
            return;
        }

        reverseit(ar, i-1);
        System.out.println(ar[i]+ " ");

    }

    public static void main(String[] args) {
        int [] array={1,2,3,4,5};
        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("The Reveresed Array");
        reverseit(array,array.length-1);
    }
}
