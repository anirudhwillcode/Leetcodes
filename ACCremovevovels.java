public class ACCremovevovels {
    public static void main(String[] args){
        String str="abhiumanyaviru";
        StringBuilder sb =new StringBuilder(str);

        for(int i=0;i<sb.length();i++){
            
          if(isVowel(sb.charAt(i))){
            sb.deleteCharAt(i);
            i--;
          }  
            
         
        }
        System.out.println(sb.toString());
            
    }
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
