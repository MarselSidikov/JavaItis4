package ru.itis.zoo;

import ru.itis.animal.Animal;
import ru.itis.cats.Tiger;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by User on 05.04.2017.
 */
public class AbstractZoo<T extends Animal> implements BaseZoo<T> {

    private final int MAX_ANIMALS_COUNT = 10;

    private Animal animals[];
    private int count = 0;

    public AbstractZoo() {
        this.animals = new Animal[MAX_ANIMALS_COUNT];
    }

    @Override
    public void writeToFile(String animalName) throws Exception {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getName().equals(animalName)) {
                OutputStream outputStream =
                        new FileOutputStream("animals.txt", true);

                byte animalAsBytes[] = animals[i].toString().getBytes();
                outputStream.write(animalAsBytes);
                outputStream.write('\n');
                outputStream.close();
                return;
            }
        }
    }

    @Override
    public void add(T animal) {
        if (count < MAX_ANIMALS_COUNT) {
            this.animals[count] = animal;
            count++;
        } else throw new IllegalArgumentException("Нет места");
    }
}
