import challenges.StackWithMax;

public class DemoRunner {
    public static void main(String []args) {
        StackWithMax stack = new StackWithMax(10);
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

       /* System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        */

        System.out.println("\nMaximum item: " + stack.returnTheMaximum());
        System.out.println("\nEnd of the program.");
    }
}