package ru.itis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MainInputStream {
    public static void main(String[] args) {
        try {
            InputStream stream = new FileInputStream("hello.txt");
            int byteFromFile = stream.read();
            System.out.println((char)byteFromFile);

            byte bytesFromFile[] = new byte[50];
            int length = stream.read(bytesFromFile);

            for (int i = 0; i < length; i++) {
                System.out.print((char)bytesFromFile[i]);
            }
        } catch (IOException e) {
            System.err.println("Что-то пошло не так: " + e);
        }


    }
}
