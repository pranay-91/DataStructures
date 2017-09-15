
import datastructures.StackLinkedList;
import datastructures.StackArray;

public class DemoRunner {
    public static void main(String []args) {
        //StackLinkedList stack = new StackLinkedList();
        StackArray stack = new StackArray(10);
        stack.push("Be");
        stack.push("or");
        stack.push("not");
        stack.push("to");
        stack.push("be.");

        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        
        System.out.println("\nEnd of the program.");
    }
}