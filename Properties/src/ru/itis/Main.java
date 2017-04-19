package ru.itis;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("resources\\messages.properties"));
            String message = properties.getProperty("message.text");
            System.out.println(message);
        } catch (IOException e) {
            System.err.println("IO Exception");
        }
    }
}
