package ru.itis.impl;


import ru.itis.files.AbstractFile;
import ru.itis.models.Human;

public class HumansFile<T extends Human>
        extends AbstractFile<T> {

    public HumansFile(String name) {
        super(name);
    }
}
