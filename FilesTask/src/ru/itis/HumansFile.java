package ru.itis;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class HumansFile implements File {

    private String name;

    public HumansFile(String name) {
        this.name = name;
    }
    @Override
    public void write(String text) {
        try {
            OutputStream outputStream =
                    new FileOutputStream(name);
            outputStream.write(text.getBytes());
            outputStream.close();

        } catch (Exception e) {
            System.err.println("File not found");
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
