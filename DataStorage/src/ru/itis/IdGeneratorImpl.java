package ru.itis;

public class IdGeneratorImpl implements IdGenerator {

    private String fileName;
    private int lastGeneratedId;

    public IdGeneratorImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public int generateId() {
        return 0;
    }
}
