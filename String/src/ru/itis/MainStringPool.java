package ru.itis;

public class MainStringPool {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println("s1 == s2 : " + (s1 == s2));

        String a1 = new String("Hello");
        String a2 = new String("Hello");

        System.out.println("a1 == a2 : " + (a1 == a2));

        System.out.println("a1.equals(a2) : " + a1.equals(a2));

    }
}
