package ru.itis;

import ru.itis.factory.DataStorageFactory;
import ru.itis.id.IdGenerator;
import ru.itis.id.IdGeneratorImpl;
import ru.itis.storages.HumansDataStorageFileBasedImpl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        HumansDataStorageFileBasedImpl humansDataStorage =
                DataStorageFactory.getHumansDataStorage("production");
        System.out.println(humansDataStorage.find(5));
    }
}
