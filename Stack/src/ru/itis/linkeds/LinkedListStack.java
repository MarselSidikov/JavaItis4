package ru.itis.linkeds;

public class LinkedListStack {
    private Node head;
    private int count;

    public LinkedListStack() {
        head = null;
        count = 0;
    }

    public void push(char value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        count++;
    }

    public char pop() {
        char result = head.getValue();
        head = head.getNext();
        count--;
        return result;
    }

    public char peek() {
        return head.getValue();
    }

    public int getCount() {
        return count;
    }
}
