
//import datastructures.StackLinkedList;
//import datastructures.StackArray;
import datastructures.StackResizingArray;


public class DemoRunner {
    public static void main(String []args) {
        //StackLinkedList stack = new StackLinkedList();
        //StackArray stack = new StackArray(10);
        StackResizingArray stack = new StackResizingArray();
        
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