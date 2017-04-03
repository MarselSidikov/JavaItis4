package ru.itis;

import ru.itis.generics.GenericArrayList;
import ru.itis.models.Human;

public class MainGenerics {
    public static void main(String[] args) {
        GenericArrayList<String> stringGenericArrayList =
                new GenericArrayList<>();

        stringGenericArrayList.add("Hello");
        stringGenericArrayList.add("Bye");

        GenericArrayList<Human> humans =
                new GenericArrayList<>();

        // humans.add("Hello");

        String text = stringGenericArrayList.get(0);
    }
}
