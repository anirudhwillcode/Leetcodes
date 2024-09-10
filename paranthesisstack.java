import java.util.Stack;

public class paranthesisstack {

    public static void main(String [] args){
        String exp="{{{[()]}}";
        System.out.println(balancedparanthesis(exp));
    }
    public static boolean balancedparanthesis(String str){
        Stack<Character>stack=new Stack<>();

        char [] arr =str.toCharArray(); // convert the string to char array

        for(char c:arr){                  // iterate through each individual character in the char array
            if(c=='{'||c=='('||c=='['){   // if its any of the opening brackets just push  it to the stack
                stack.push(c);
            }
            else if(c=='}'||c==')'||c==']'){  // if we encounter any closing brackets 
                if(stack.isEmpty()){            // check if u the stack is empty 
                    return false;
                }

                char top=stack.pop();     // we pop the top of the element 

                if(c==top){                 // we check if the popped element is equal to the  current bracket in the char array
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
