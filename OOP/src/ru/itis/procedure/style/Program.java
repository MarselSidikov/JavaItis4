package ru.itis.procedure.style;

/**
 * 20.02.2017
 * Program
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Program {

    public static void main(String[] args) {
        // int a[] = new int[10];
        Human marsel = new Human();
        marsel.name = "Marsel";
        marsel.age = 23;

        Human guzel = marsel;
        guzel.age = 18;

        System.out.println(marsel.age);


    }
}
