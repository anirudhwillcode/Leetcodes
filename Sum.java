public class Sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int n = arr.length;
        int target = 12;
        boolean found=false;
    
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                
                if (sum == target) {
        
                    System.out.println("Starting index: " + i);
                    System.out.println("Ending index: " + j);
                    found=true;
                    break; 
                }
            }
            if(found){
                break;
            }
        
        }

        if(!found){
            System.out.println("not found broooooooooooooooooooooooooooooooooooooooooooooooooooo");
        }
    }
}