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

public class StackWithMax {
    private int index = 0;
    private double[] items;

    public StackWithMax(int size) {
        items = new double[size];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index == items.length;
    }

    public void push(double s){
        if(isFull()) {
            throw new RuntimeException("Stack is Full!");
        }
        //use to index the array and then increase the index
        items[index++] = s;
    }

    public double pop() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is Empty!");
        }
        // reduce index and then access the array
        return items[--index];
    }

    public double returnTheMaximum() {
        double max = items[index];

        for(int i=0; i<=index; ++i) {
            if(max<items[i]) {
                max = items[i];
            }
        }
        return max;
    }
    

}