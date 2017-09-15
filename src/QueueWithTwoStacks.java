class StackResizingArray {
    private int index = 0;
    private static int DEFAULT_SIZE = 1;
    private String[] items = new String[DEFAULT_SIZE];

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index == items.length;
    }

    // Helper function to resize an array
    private void resize(int size) {
        String[] copy = new String[size];
        for(int i=0; i<index; ++i) {
            copy[i] = items[i];
        }
        items = copy;
    }

    public void push(String s){
        if(isFull()) {
            // If full then increase the stack array by twice the current size
            //System.out.println("\n\tIncreasing stack array size.");
            resize(items.length * 2);
        }
        items[index++] = s;
    }
    
    public String pop() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is Empty!");
        }

        String s = items[--index];
        items[index] = null;
        
        if(index>0 && index == items.length/4) {
            // If only 25% is being used then shrink the array by half.
            //System.out.println("\n\tShrinking stack array size.");
            resize(items.length/2);
        }
        return s;
    }
}

public class QueueWithTwoStacks {
    private StackResizingArray enqueueStack =  new StackResizingArray();
    private StackResizingArray dequeStack = new StackResizingArray();

    public void enqueue(String s) {
        enqueueStack.push(s);
    }

    public String dequeue() {
        while(!enqueueStack.isEmpty()) {
            dequeStack.push(enqueueStack.pop());
        }
        return dequeStack.pop();
    }

   public static void main(String []args) {
        QueueWithTwoStacks queue = new QueueWithTwoStacks();
        
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