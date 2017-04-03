package ru.itis.lists;

public class IntegerArrayList {
    private final int MAX_SIZE = 5;

    private int elements[];
    private int count;

    public IntegerArrayList() {
        this.elements = new int[MAX_SIZE];
        count = 0;
    }

    public void add(int element) {
        elements[count] = element;
        count++;
    }

    public int get(int index) {
        return elements[index];
    }
}
