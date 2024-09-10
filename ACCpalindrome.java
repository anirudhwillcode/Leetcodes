// public class ACCpalindrome {
//     public static void main(String[] args) {
        
//     }
//     public static boolean panindrome(String str){
//         StringBuilder sb=new StringBuilder(str);
//         String reversed=sb.reverse().toString();
//         return str.equals(reversed)

//     }
// }

public class ACCpalindrome {
    public static void main(String[] args){

    }
    public static boolean palifornumbers(String str){
        int left=0;
        int right=str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}