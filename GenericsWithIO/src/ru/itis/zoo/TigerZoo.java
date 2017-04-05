package ru.itis.zoo;

import ru.itis.cats.Cat;
import ru.itis.cats.Tiger;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class TigerZoo implements CatZoo<Tiger> {

    private final int MAX_TIGERS_COUNT = 10;

    private Tiger tigers[];
    private int count = 0;

    public TigerZoo() {
        this.tigers = new Tiger[MAX_TIGERS_COUNT];
    }

    @Override
    public void writeToFile(String animalName) throws Exception {
        for (int i = 0; i < tigers.length; i++) {
            if (tigers[i].getName().equals(animalName)) {
                OutputStream outputStream =
                        new FileOutputStream("animals.txt", true);

                byte tigerAsBytes[] = tigers[i].toString().getBytes();
                outputStream.write(tigerAsBytes);
                outputStream.write('\n');
                outputStream.close();
                return;
            }
        }
    }

    @Override
    public void add(Tiger animal) {
        if (count < MAX_TIGERS_COUNT) {
            this.tigers[count] = animal;
            count++;
        } else throw new IllegalArgumentException("Нет места");
    }
}
