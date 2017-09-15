/*
Stack implementation in Java using Array Data Structure
    
    items[] |to|be|or|not|to|be|null|null|
             0  1  2  3   4  5   6   7   
                      ^              ^
                    index           size
                   push/pop

Analysis:
- Every operation takes constant time.
- Stack Array is fixed and cannot be increased during run time.
*/

package datastructures;

public class StackArray {
    private int index = 0;
    private String[] items;

    public StackArray(int size) {
        items = new String[size];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index == items.length;
    }

    public void push(String s){
        if(isFull()) {
            throw new RuntimeException("Stack is Full!");
        }
        //use to index the array and then increase the index
        items[index++] = s;
    }

    public String pop() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is Empty!");
        }
        // reduce index and then access the array
        return items[--index];
    }
}