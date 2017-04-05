package ru.itis;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainOutputStream {
    public static void main(String[] args) {
        try {
            OutputStream outputStream =
                    new FileOutputStream("hello.txt", true);

            String message = "MARSEL THE BEST";
            byte messageAsBytes[] = message.getBytes();
            outputStream.write(messageAsBytes);
        } catch (IOException e) {
            System.err.println("=(");
        }
    }
}
