package ru.itis;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

// Параметризовать HumansFIle людьми
// добавить возможность добавления людей в файл
// добавить метод writeHumans() - запись всех людей в файл
public class HumansFile<T extends Human> implements File {

    private String name;
    private ArrayList<T> humans;

    public HumansFile(String name) {
        this.name = name;
    }

    public void add(T human) {
        humans.add(human);
    }

    public void writeAllToFile() {
        for (int i = 0; i < humans.size(); i++) {
            String humanAsString = humans.get(i).toString();
            write(humanAsString);
        }
    }


    @Override
    public void write(String text) {
        try {
            OutputStream outputStream =
                    new FileOutputStream(name);
            outputStream.write(text.getBytes());
            outputStream.close();

        } catch (Exception e) {
            System.err.println("File not found");
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
