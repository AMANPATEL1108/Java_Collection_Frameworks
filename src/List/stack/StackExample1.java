package List.stack;

import java.util.Stack;

public class StackExample1 {
    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.add(10);
        stack.push(25);
        System.out.println("first"+stack.getFirst());
        System.out.println("last"+stack.getLast());
        System.out.println("gett"+ stack.search(10));
        System.out.println("pp"+stack.get(0));
        System.out.println(stack);




    }
}
