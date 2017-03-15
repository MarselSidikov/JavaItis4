package ru.itis;

/**
 * 13.03.2017
 * Queue
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Queue {
    private final int MAX_QUEUE_SIZE = 50;
    private int queue[];
    private int count;

    public Queue() {
        queue = new int[MAX_QUEUE_SIZE];
        count = 0;
    }

    public void put(int element) {
        for (int i = count; i > 0; i--) {
            queue[i] = queue[i-1];
        }

        queue[0] = element;
        count++;
    }

    public int get() {
        int result = queue[count - 1];
        count--;
        return result;
    }

    public int getCount() {
        return count;
    }
}
