package ru.itis;


public class HumansFile<T extends Human>
        extends AbstractFile<T> {

    public HumansFile(String name) {
        super(name);
    }
}
