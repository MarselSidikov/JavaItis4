package ru.itis;

/**
 * 13.03.2017
 * MainQueue
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.put('a');
        queue.put('b');
        queue.put('c');

        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
    }
}
