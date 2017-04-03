package ru.itis.methods;

import ru.itis.compare.Human;

public class Program {
    public static <T> T myConvert(T source, ConvertFunction<T> function) {
        return function.convert(source);
    }

    public static void main(String[] args) {
        Human marsel = new Human("Marsel", 23, 185);
        Human newMarsel = myConvert(marsel, new ConvertHumanFunctionImpl());

        String hello = "hello";
        String newHello = myConvert(hello, new ConvertStringFunctionImpl());

        System.out.println(newMarsel);
        System.out.println(newHello);

        // String temp = myConvert(marsel, new ConvertStringFunctionImpl());
    }
}
