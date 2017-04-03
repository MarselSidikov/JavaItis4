package ru.itis;

public class ArrayList<V> {
    private final int MAX_SIZE = 5;
    private Object elements[];
    private int count;

    public ArrayList() {
        this.elements = new Object[MAX_SIZE];
        this.count = count;
    }

    public V get(int index) {
        if (index >= 0 && index < count) {
            return (V)elements[index];
        } else {
            throw new IllegalArgumentException("Illegal index");
        }
    }

    public void add(V element) {
        if (count < MAX_SIZE) {
            elements[count] = element;
            count++;
        } else new ArrayIndexOutOfBoundsException("Not empty bucket");
    }
}
