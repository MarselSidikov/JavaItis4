package ru.itis;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.err.println("Bye");

        try {
            int byteFromIn = System.in.read();
            System.out.println(byteFromIn);
            System.out.println((char)(byteFromIn + 1));
        } catch (IOException e) {
            System.out.println("Some problems");
        }
    }
}
