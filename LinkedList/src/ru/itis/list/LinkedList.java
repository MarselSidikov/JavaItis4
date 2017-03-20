package ru.itis.list;

import ru.itis.nodes.Node;

public class LinkedList {
    private Node first;
    private Node last;
    private int count;

    public LinkedList() {
        this.count = 0;
        this.first = null;
        this.last = null;
    }

    /*
    // процедура добавления элемента в конец связного списка
    public void addToEnd(int value) {
        // создаем новый узел
        Node newNode = new Node(value);
        // если в списке нет элементов
        if (count == 0) {
            // то новый узел и есть первый
            this.first = newNode;
        } else {
            // в противном случае получем первый узел
            Node current = first;
            // пока не дошли до последнего элемента
            // а у последнего элемента следующего нет,
            // поэтому getNext вернет null
            while (current.getNext() != null) {
                // идем дальше
                current = current.getNext();
            }
            // задаем новый узел как следующий после последнего
            current.setNext(newNode);
        }
        // увеличиваем количество
        count++;
    }
    */

    public void addToEnd(int value) {
        // создаем новый узел
        Node newNode = new Node(value);
        // если в списке нет элементов
        if (count == 0) {
            // то новый узел и есть первый
            this.first = newNode;
            this.last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        // увеличиваем количество
        count++;
    }


    public void showAllNodes() {
        Node current = this.first;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
