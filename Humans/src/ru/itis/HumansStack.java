package ru.itis;

import java.util.Stack;

public class HumansStack {
    private Node head;
    private Node last;
    private int count;

    public HumansStack() {
        head = null;
        last = null;
        count = 0;
    }

    public void push(Human value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            last = head;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        count++;
    }

    public Human pop() {
        Human result = head.getValue();
        head = head.getNext();
        count--;
        return result;
    }

    public Human peek() {
        return head.getValue();
    }

    public int getCount() {
        return count;
    }

    public void addStack(HumansStack otherStack) {
        this.last.setNext(otherStack.head);
        this.last = otherStack.last;
        this.count = this.count + otherStack.count;
    }
}
