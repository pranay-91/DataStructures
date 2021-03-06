/*
Stack implementation in Java using Linked List
  first->node->node->node->*
    ^
push/pop

Analysis:
- Every operation takes constant time in the worst case scenario.
- Uses extra time and space to deal with the links.
 */

package datastructures;

public class StackLinkedList {
    private Node first = null;

    private class Node {
         String item;
         Node next;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public void push(String s) {
        Node node = first;
        first = new Node();
        first.item = s;
        first.next = node;
    }

    public String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }
}
