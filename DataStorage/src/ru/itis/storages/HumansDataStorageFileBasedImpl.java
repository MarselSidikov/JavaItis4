package ru.itis.storages;

import ru.itis.id.IdGenerator;
import ru.itis.models.Human;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HumansDataStorageFileBasedImpl implements HumansDataStorage {

    private String fileName;
    private IdGenerator idGenerator;

    public HumansDataStorageFileBasedImpl(String fileName, IdGenerator idGenerator) {
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
        List<Human> humans = findAll();
        int indexForRemove = -1;
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getId() == id) {
                indexForRemove = i;
                break;
            }
        }

        if (indexForRemove > -1) {
            humans.remove(indexForRemove);
        }

        flushToFile(humans);

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
                    reader.close();
                    return new Human(id, humanName, humanAge);
                }
                currentHumanAsString = reader.readLine();
            }
            reader.close();
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
        List<Human> humans = findAll();
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getId() == model.getId()) {
                // humans.set(i, model);
                humans.get(i).setAge(model.getAge());
                humans.get(i).setName(model.getName());
            }
        }

        flushToFile(humans);
    }

    @Override
    public List<Human> findAll() {
        List<Human> humans = new ArrayList<>();

        // открыть файл
        try {
            BufferedReader reader =
                new BufferedReader(new FileReader(fileName));

            String currentHumanAsString = reader.readLine();

            while (currentHumanAsString != null) {
                // разбиваем считанную строку по пробелам
                String splitHuman[] = currentHumanAsString.split(" ");
                // получаем id
                int humanId = Integer.parseInt(splitHuman[0]);
                // получаем имя
                String humanName = splitHuman[1];
                // получаем возраст
                int humanAge = Integer.parseInt(splitHuman[2]);
                Human human = new Human(humanId, humanName, humanAge);
                humans.add(human);
                currentHumanAsString = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            return null;
        } catch (IOException e) {
            System.err.println("Exception in IO");
            return null;
        }
        return humans;
    }

    @Override
    public List<Human> findAllByName(String name) {
        List<Human> humans = new ArrayList<>();

        // открыть файл
        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            String currentHumanAsString = reader.readLine();

            while (currentHumanAsString != null) {
                // разбиваем считанную строку по пробелам
                String splitHuman[] = currentHumanAsString.split(" ");
                // получаем id
                int humanId = Integer.parseInt(splitHuman[0]);
                // получаем имя
                String humanName = splitHuman[1];
                // получаем возраст
                int humanAge = Integer.parseInt(splitHuman[2]);
                if (name.equals(humanName)) {
                    Human human = new Human(humanId, humanName, humanAge);
                    humans.add(human);
                }
                currentHumanAsString = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            return null;
        } catch (IOException e) {
            System.err.println("Exception in IO");
            return null;
        }
        return humans;
    }

    private void flushToFile(List<Human> humans) {
        try {
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < humans.size(); i++) {
                writer.write(humans.get(i).toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.err.println("File not found");
        }
    }
}
