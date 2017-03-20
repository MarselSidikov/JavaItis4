package ru.itis.nodes;

public class Main {

    public static void main(String[] args) {
	    Node a = new Node(10);
	    Node b = new Node(11);
	    Node c = new Node(-10);
	    Node d = new Node(6);

	    a.setNext(b);
	    b.setNext(c);
	    c.setNext(d);

	    // получили последний узел
	    int lastValue = a.getNext().getNext().getNext().getValue();
        // показали его значение
	    System.out.println(lastValue);

	    // current - текущий
	    Node current = a;

	    while (current != null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}


    }
}
