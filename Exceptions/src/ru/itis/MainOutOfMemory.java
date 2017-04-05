package ru.itis;

public class MainOutOfMemory {
    public static void main(String[] args) {
        Object objects[] = new Object[Integer.MAX_VALUE];
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            objects[i] = new Object();
        }
    }
}
