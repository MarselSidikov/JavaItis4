package ru.itis;

import ru.itis.id.IdGenerator;
import ru.itis.id.IdGeneratorImpl;
import ru.itis.storages.HumansDataStorageFileBasedImpl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("resources\\app.properties"));
        } catch (IOException e) {
            System.err.println("IO Exception");
        }

        String idFileName = properties.getProperty("id.file");
        String humanFileName = properties.getProperty("human.file");

        IdGenerator idGenerator = new IdGeneratorImpl(idFileName);
        HumansDataStorageFileBasedImpl dataStorage =
                new HumansDataStorageFileBasedImpl(humanFileName, idGenerator);

    }
}
