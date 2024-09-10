// public class ACCparenthesis {
//     public static void main(String []args){
//         String str="HELLO AND (WELCOME (TO THE)TCEA (CONTEST)TODAY) IS (SATURDAY())";
//         int leftpara=0;
//         int rightpara=0;

//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)=='('){
//                 leftpara+=1;
//             }else if(str.charAt(i)==')'){
//                 rightpara+=1;
//             }
//         }

//         if(leftpara==rightpara){
//             System.out.println("0 bro");;
//         }else{
//             System.out.println("1 bro");
//         }
//     }
// }

/*Your solution counts the number of opening and closing parentheses 
and checks if they are equal, which works for some cases but not all. 
For instance, your solution will fail for inputs like ")(" or "(())(", 
where the count is correct but the parentheses are not properly nested or balanced.
A more robust solution involves using a stack to ensure that each opening parenthesis 
has a matching closing parenthesis in the correct order. Here’s a revised version of 
your program using a stack:*/

import java.util.Stack;

/**
 * ACCparenthesis
 */
public class ACCparenthesis {
    public static void main(String[] args) {
        String str="HELLO AND (WELCOME (TO THE)TCEA (CONTEST)TODAY) IS (SATURDAY())";
        boolean result=isbalanced(str);

        if(result==false){
            System.out.println("1 bro");
        }else{
            System.out.println("0 brooo");
        }
    }
    public static boolean isbalanced(String str){
        Stack<Character>stack=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='('){
                stack.push(ch);
            }else if(ch==')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
    
}

/*This program uses a stack to track the parentheses. Here's how it works:

Traverse the string character by character.
Push each opening parenthesis ( onto the stack.
For each closing parenthesis ), check if the stack is empty. 
If it is, return false because there's no matching opening parenthesis. 
If the stack is not empty, pop the top element from the stack.
After traversing the string, if the stack is empty, 
it means all parentheses were properly matched; otherwise, return false.
This approach ensures that the parentheses are balanced and correctly nested, 
handling all possible edge cases. */