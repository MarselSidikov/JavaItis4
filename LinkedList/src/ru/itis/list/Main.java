package ru.itis.list;


public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addToEnd(10);
        linkedList.addToEnd(22);
        linkedList.addToEnd(30);

        linkedList.showAllNodes();
    }
}
