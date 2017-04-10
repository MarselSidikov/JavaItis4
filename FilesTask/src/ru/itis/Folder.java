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
        for (int i = 0; i < files.size(); i++) {
            if (files.get(i).getName().equals(fileName)) {
                files.get(i).write(text);
            }
        }
    }
}
