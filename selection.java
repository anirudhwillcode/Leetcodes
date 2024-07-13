public class selection {
    public static void main(String[] args) {
        int array[]={23,45,78,11,2,45,7,22,1,88};

        selectionsort(array);

        for(int i:array){
            System.out.print(" "+i+" ");
        }
    }

    public static void selectionsort(int[]array){

        for(int i=0;i<array.length-1;i++){
            int min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }

            int temp=array[i];
            array[i]=array[min];
            array[min]=temp;
        }
    }
}
