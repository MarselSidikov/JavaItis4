package ru.itis.generics;

public class GenericArrayList<T> {
    private final int MAX_SIZE = 5;

    private Object elements[];
    private int count;

    public GenericArrayList() {
        this.elements = new Object[MAX_SIZE];
        count = 0;
    }

    public void add(T element) {
        elements[count] = element;
        count++;
    }

    public T get(int index) {
        return (T)elements[index];
    }
}
