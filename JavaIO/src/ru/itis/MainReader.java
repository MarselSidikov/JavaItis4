package ru.itis;

import java.io.*;

public class MainReader {
    public static void main(String[] args) {
        try {
            Reader reader = new InputStreamReader(
                    new FileInputStream("hello"));
            char characters[] = new char[200];
            reader.read(characters);
        } catch (IOException e) {
            System.err.println("=(");
        }
    }
}
