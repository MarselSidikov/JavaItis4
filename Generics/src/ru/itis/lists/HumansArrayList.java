package ru.itis.lists;

import ru.itis.models.Human;

public class HumansArrayList {
    private final int MAX_SIZE = 5;

    private Human elements[];
    private int count;

    public HumansArrayList() {
        this.elements = new Human[MAX_SIZE];
        count = 0;
    }

    public void add(Human element) {
        elements[count] = element;
        count++;
    }

    public Human get(int index) {
        return elements[index];
    }
}
