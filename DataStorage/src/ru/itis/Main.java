package ru.itis;

import ru.itis.id.IdGenerator;
import ru.itis.id.IdGeneratorImpl;
import ru.itis.models.Human;
import ru.itis.storages.HumansDataStorage;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Human marsel = new Human("Marsel", 23);
        Human guzel = new Human("Guzel", 18);
        IdGenerator idGenerator = new IdGeneratorImpl("id.txt");
        HumansDataStorage dataStorage =
                new HumansDataStorage("human.txt", idGenerator);

        dataStorage.save(marsel);
        dataStorage.save(guzel);

        List<Human> fromStorage = dataStorage.findAll();

        for (int i  = 0; i < fromStorage.size(); i++) {
            System.out.println(fromStorage.get(i));
        }

        dataStorage.delete(4);

        Human newHuman = new Human(6, "Alina", 77);
        dataStorage.update(newHuman);
    }
}
