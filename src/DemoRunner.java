import datastructures.QueuesWithTwoStacks;

public class DemoRunner {
    public static void main(String []args) {
        QueuesWithTwoStacks queue = new QueuesWithTwoStacks();
        
        queue.enqueue("Be");
        queue.enqueue("or");
        queue.enqueue("not");
        queue.enqueue("to");
        queue.enqueue("be");

        System.out.print(queue.dequeue() + " ");
        System.out.print(queue.dequeue() + " ");
        System.out.print(queue.dequeue() + " ");
        System.out.print(queue.dequeue() + " ");
        System.out.print(queue.dequeue() + " ");
        
        System.out.println("\nEnd of the program.");
    }
}