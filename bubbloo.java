public class bubbloo {
    public static void main(String[] args) {
        int [] array={7,8,99,34,56,2};

        bubblesort(array);

        for(int i :array){
            System.out.print(" "+i+" ");
        }
    }

    public static void bubblesort(int[]array){

       for(int i=0;i<array.length-1;i++){
          for(int j=0;j<array.length-i-1;j++){
            if(array[j]>array[j+1]){
                int temp;
                temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
          }
       }

    }

}
