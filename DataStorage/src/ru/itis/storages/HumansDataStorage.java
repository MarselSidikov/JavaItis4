package ru.itis.storages;

import ru.itis.id.IdGenerator;
import ru.itis.models.Human;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HumansDataStorage implements BaseDataStorage<Human> {

    private String fileName;
    private IdGenerator idGenerator;

    public HumansDataStorage(String fileName, IdGenerator idGenerator) {
        this.fileName = fileName;
        this.idGenerator = idGenerator;
    }

    @Override
    public int save(Human model) {
        int generatedId = idGenerator.generateId();
        model.setId(generatedId);

        try {
            OutputStream outputStream =
                    new FileOutputStream(fileName, true);
            outputStream.write((model.toString() + "\n").getBytes());
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            return -1;
        } catch (IOException e) {
            System.err.println("Exception in IO");
            return -1;
        }

        return generatedId;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Human find(int id) {
        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            String currentHumanAsString = reader.readLine();

            while (currentHumanAsString != null) {
                String splitHuman[] = currentHumanAsString.split(" ");
                int humanId = Integer.parseInt(splitHuman[0]);
                String humanName = splitHuman[1];
                int humanAge = Integer.parseInt(splitHuman[2]);
                if (humanId == id) {
                    return new Human(id, humanName, humanAge);
                }
                currentHumanAsString = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            return null;
        } catch (IOException e) {
            System.err.println("Exception in IO");
            return null;
        }
        return null;
    }

    @Override
    public void update(Human model) {

    }

    @Override
    public List<Human> findAll() {
        List<Human> humans = new ArrayList<>();

        // открыть файл
        // все считать
        // закинуть в список
        // вернуть результат
    }
}
