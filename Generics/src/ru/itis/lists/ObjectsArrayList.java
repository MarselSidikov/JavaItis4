package ru.itis.lists;

public class ObjectsArrayList {
    private final int MAX_SIZE = 5;

    private Object elements[];
    private int count;

    public ObjectsArrayList() {
        this.elements = new Object[MAX_SIZE];
        count = 0;
    }

    public void add(Object element) {
        elements[count] = element;
        count++;
    }

    public Object get(int index) {
        return elements[index];
    }
}
