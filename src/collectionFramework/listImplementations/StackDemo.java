package collectionFramework.listImplementations;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        //add element to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.empty());
        System.out.println(stack.size());

        //peek method will check who's on the top. it wont delete the element
        System.out.println("Who is there on the top "+stack.peek());

        //to remove the element from top
        stack.remove(0);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       // System.out.println(stack.pop());

        //if we try to delete from a empty stack, we get StackEmptyException
        System.out.println(stack.pop());
    }
}
