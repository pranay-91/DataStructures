/*
Stack implementation in Java using Resizing Array Data Structure
    
    items[] |to|be|or|not|to|be|null|null|
             0  1  2  3   4  5   6   7   
                      ^              
                    index           
                   push/pop
                   
Action: Push
Condition: 
    if stack is full
        increase size by 2
    
Action: Pop
Condition: 
    if stack is 25% full
        decrease the array size by 2

Invariant: Array is between 25% and 100% full.

Amortorized Analysis:
- Average running time per operation over a worst-case sequence of operations.
- Every operation takes constant amortized time.
- Less wasted space.
*/

package challenges;

public class StackWithMax<Item> {
    private int index = 0;
    private static int DEFAULT_SIZE = 10;
    private Item[] items = (Item[])new Object[DEFAULT_SIZE]; // Typecasting. Item extends Object Class.

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index == items.length;
    }

    // Helper function to resize an array
    private void resize(int size) {
        // Typecasting. Item extends Object Class. 
        // Need to investigate what are the possible drawbacks for typecasting during runtime.
        Item[] copy = (Item[])new Object[size]; 
        for(int i=0; i<index; ++i) {
            copy[i] = items[i];
        }
        items = copy;
    }

    public void push(Item s){
        if(isFull()) {
            // If full then increase the stack array by twice the current size
            // System.out.println("\n\tIncreasing stack array size.");
            resize(items.length * 2);
        }
        items[index++] = s;
    }

    public Item pop() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is Empty!");
        }

        Item s = items[--index];
        items[index] = null;
        
        if(index>0 && index == items.length/4) {
            // If only 25% is being used then shrink the array by half.
            // System.out.println("\n\tShrinking stack array size.");
            resize(items.length/2);
        }
        return s;
    }
}