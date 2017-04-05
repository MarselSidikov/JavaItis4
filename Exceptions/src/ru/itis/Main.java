package ru.itis;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream stream =
                new FileInputStream("hello.txt");
    }
}
