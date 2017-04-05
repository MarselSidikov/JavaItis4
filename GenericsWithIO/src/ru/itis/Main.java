package ru.itis;

import ru.itis.cats.Tiger;
import ru.itis.dogs.Wolf;
import ru.itis.zoo.TigerZoo;
import ru.itis.zoo.WolfZoo;

public class Main {
    public static void main(String[] args) {
        TigerZoo tigerZoo = new TigerZoo();
        tigerZoo.add(new Tiger("Lev"));
        // tigerZoo.add(new Wolf("Petr"));
        WolfZoo wolfZoo = new WolfZoo();
        wolfZoo.add(new Wolf("Petr"));
    }
}
