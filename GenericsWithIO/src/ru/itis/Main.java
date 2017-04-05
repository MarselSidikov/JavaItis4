package ru.itis;

import ru.itis.cats.Lion;
import ru.itis.cats.Tiger;
import ru.itis.zoo.TigerZoo;

public class Main {
    public static void main(String[] args) {
        TigerZoo zoo = new TigerZoo();

        Tiger tiger = new Tiger("Lev");
        Lion lion = new Lion("Gav");

        zoo.add(tiger);
        // zoo.add(lion);
    }
}
