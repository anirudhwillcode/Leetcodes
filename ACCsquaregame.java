/* John and Linda are playing a numbers game. John asked Linda to find the number whose square ends with the
number itself. The number should also be a positive integer. Write a program to implement the above logic.
Input Format :
Input contains an integer 'N' denoting the number.
Output Format :
If the number whose square ends with the number itself, print "Correct Number", otherwise print "Incorrect Number"
If the user enters negative integer, the result should display "Wrong Input".
Constraints 1 <= N <= 10^8
Sample 1:
Input: 5
Output: Correct Number
Sample 2:
Input: 9
Output: Incorrect Number
Sample 3:
Input: -6
Output: Wrong Input*/

/*public class ACCsquaregame {
    public static void main(String[] args) {
        int num=0;
        squareitup(num);
        
    }
    public static void squareitup(int num){
        if(num==0||num<0){
            System.out.println("Wrong Input");
            return;
        }
        
        
        int originalnumber=num;
        int sqrnum=num*num;
        int lastdigit=sqrnum%10;

        if(originalnumber==lastdigit){
            System.out.println("Correct Number");
        }else if(originalnumber%10==lastdigit){
            System.out.println("Correct Number");
        }else{
            System.out.println("Wrong Number");
        }
    }
} */

/*
Your code has a few issues that need to be addressed:

Input Handling: The code currently does not handle user input. 
It sets num to 0 and calls squareitup(num) with it, which will always result in 
"Wrong Input".
Logic for Correct Number: 
The logic to check if a number's square ends with the number
 itself is incorrect. Specifically, you need to check the last digits 
 of the square and the number, not just a single digit. */


 import java.util.Scanner;

public class ACCsquaregame {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        squareitup(num);
        scanner.close();
        

    }

    public static void squareitup(int num) {
        if(num<=0){
            System.out.println("Wrong input");
        }

        int originalNumber = num;
        int squaredNumber = num * num;


        // Calculate the number of digits in the original number

        int numberofDigits=(int)Math.log10(num)+1;

        //Extract the last digits of the squared number 

        int lastDigitofSqaure=squaredNumber%(int)Math.pow(10,numberofDigits);

        if (originalNumber == lastDigitofSqaure) {
            System.out.println("Correct Number");
        } else {
            System.out.println("Incorrect Number");
        }




    }

}

