import java.util.Stack;

public class stackimplementation {
    public static void main(String[] args){
        Stack<Integer>stack=new Stack<>();

        stack.push(3);
        stack.push(56);
        stack.push(67);

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack);

        System.out.println("Is the stack empty? " + stack.isEmpty());

        

    
    }
}
