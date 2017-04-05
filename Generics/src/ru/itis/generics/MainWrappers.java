package ru.itis.generics;

public class MainWrappers {
    public static void main(String[] args) {
        GenericArrayList<Integer> integerArrayList = new GenericArrayList<>();
        integerArrayList.add(16);
        integerArrayList.add(17);

        // autoboxing - автоупаковка примитивного значения в
        // ссылочный тип
        Integer integer = 65;
        // boxing
        Integer integer1 = new Integer(65);

        // autounboxing
        int myInt = integer;

        // unboxing
        int myInt2 = integer.intValue();

        Integer a = 128;
        Integer b = 128;

        System.out.println(a == b);
    }
}
