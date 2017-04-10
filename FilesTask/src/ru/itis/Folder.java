package ru.itis;

import java.util.ArrayList;

public class Folder<T extends File> {
    private ArrayList<T> files;

    public Folder() {
        files = new ArrayList<T>();
    }

    public void add(T file) {
        files.add(file);
    }

    public void writeText(String fileName, String text) {
        // TODO: реализовать
    }
}
