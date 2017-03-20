package ru.itis.linkeds;

public class Node {
    private char value;

    private Node next;

    public Node(char value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public char getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }
}
