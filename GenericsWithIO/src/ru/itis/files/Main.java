package ru.itis.files;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        OutputStream outputStream =
                new FileOutputStream("animals.txt");
        String lion = "Lion";

        byte lionsByte[] = lion.getBytes();

        outputStream.write(lionsByte);

    }
}
