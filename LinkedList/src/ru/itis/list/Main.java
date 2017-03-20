package ru.itis.list;


public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addToEnd(14);
        linkedList.addToEnd(22);
        linkedList.addToEnd(30);
        linkedList.addToEnd(2);
        linkedList.addToEnd(11);
        linkedList.addToEnd(15);

        linkedList.showAllNodes();

        linkedList.remove(14);

        System.out.println("After delete");
        linkedList.showAllNodes();
    }
}
