package ru.itis;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class AbstractFile<T> implements File<T> {

    private String name;
    private ArrayList<T> buffer;

    public AbstractFile(String name) {
        this.name = name;
        this.buffer = new ArrayList<T>();
    }

    @Override
    public void addToBuffer(T data) {
        this.buffer.add(data);
    }

    @Override
    public void write(T value) {
        String valueAsString = value.toString();
        try {
            OutputStream outputStream = new FileOutputStream(name, true);
            byte bytes[] = (valueAsString + "\n").getBytes();
            outputStream.write(bytes);
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Some problems with write");
        }
    }

    @Override
    public void writeAllFromBuffer() {
        for (int i = 0; i < buffer.size(); i++) {
            write(buffer.get(i));
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
