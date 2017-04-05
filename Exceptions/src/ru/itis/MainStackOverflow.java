package ru.itis;

public class MainStackOverflow {

    public static void rec() {
        rec();
    }

    public static void main(String[] args) {
        try {
            rec();
        } catch (StackOverflowError e) {
            System.out.println("Ты болван, где терминальное условие!");
        }
    }
}
