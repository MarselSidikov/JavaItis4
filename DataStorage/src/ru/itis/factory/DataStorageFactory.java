package ru.itis.factory;

import ru.itis.id.IdGenerator;
import ru.itis.id.IdGeneratorImpl;
import ru.itis.storages.HumansDataStorageFileBasedImpl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 19.04.2017
 * DataStorageFactory
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class DataStorageFactory {
    public static HumansDataStorageFileBasedImpl getHumansDataStorage(String profile) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("resources\\app.properties"));
        } catch (IOException e) {
            System.err.println("IO exception");
        }
        String idFileName = "";
        String humanFileName = "";
        if (profile.equals("production")) {
            idFileName = properties.getProperty("id.prod.file");
            humanFileName = properties.getProperty("humans.prod.file");
        } else if (profile.equals("test")) {
            idFileName = properties.getProperty("id.test.file");
            humanFileName = properties.getProperty("humans.test.file");
        }

        IdGenerator idGenerator = new IdGeneratorImpl(idFileName);
        return new HumansDataStorageFileBasedImpl(humanFileName, idGenerator);
    }
}
