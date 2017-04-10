package ru.itis;

public interface File<T> {
    void addToBuffer(T data);
    void writeAllFromBuffer();
    void write(T value);
    String getName();
}
