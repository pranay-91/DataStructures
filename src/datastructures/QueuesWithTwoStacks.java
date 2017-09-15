package datastructures;

import datastructures.StackResizingArray;

public class QueuesWithTwoStacks {
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
}