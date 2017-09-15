import datastructures.GenericStackArray;

public class DemoRunner {
    public static void main(String []args) {
        GenericStackArray<Integer> stack = new GenericStackArray<Integer>(10);
        
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