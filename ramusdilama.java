import java.util.Scanner;

public class ramusdilama {
    public static void main(String [] args){
    String[] fruits = {"Apple", "Ban", "Mangowwwwwwwww", "Orange"};
    int rule=logeststring(fruits);
    System.out.println("The Length of string in the array which is the grratest:"+rule);

    }
    public static int logeststring( String [] words){
        int maxlength=Integer.MIN_VALUE;
        for(int i=0;i<words.length;i++){

            if(words[i].length()>maxlength){
                maxlength=words[i].length();
            }
        }

        return maxlength;
    }
}
