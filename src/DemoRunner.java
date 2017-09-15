import datastructures.GenericStackLinkedList;

public class DemoRunner {
    public static void main(String []args) {

        GenericStackLinkedList<Integer> stack = new GenericStackLinkedList<Integer>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        
        System.out.println("\nEnd of the program.");
    }
}