package ru.itis.zoo;

import ru.itis.cats.Cat;
import ru.itis.cats.Tiger;

public class TigerZoo implements CatZoo<Tiger> {

    private final int MAX_TIGERS_COUNT = 10;

    private Tiger tigers[];
    private int count = 0;

    public TigerZoo() {
        this.tigers = new Tiger[MAX_TIGERS_COUNT];
    }

    @Override
    public void add(Tiger animal) {
        if (count < MAX_TIGERS_COUNT) {
            this.tigers[count] = animal;
            count++;
        } else throw new IllegalArgumentException("Нет места");
    }

    @Override
    public void writeToFile(String animalName) {

    }

}
