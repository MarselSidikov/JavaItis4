package ru.itis;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {

    public static void main(String[] args) throws Exception{
        OutputStream outputStream
                = new FileOutputStream("hello.txt");
        String hello = "hello" + '\n';
        outputStream.write(hello.getBytes());

    }
}
