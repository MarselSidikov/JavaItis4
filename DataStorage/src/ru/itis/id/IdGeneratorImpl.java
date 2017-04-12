package ru.itis.id;

import java.io.*;

public class IdGeneratorImpl implements IdGenerator {
    // поле - имя файла, где находится последний сгенерированный id
    private String fileName;
    // поле - последний сгенерированный id
    private int lastGeneratedId;

    public IdGeneratorImpl(String fileName) {
        this.fileName = fileName;
        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));
            String idAsString = reader.readLine();
            lastGeneratedId = Integer.parseInt(idAsString);
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("IO exception");
        }
    }

    @Override
    public int generateId() {
        int newId = lastGeneratedId + 1;
        lastGeneratedId = newId;
        try {
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(fileName));
            writer.write(String.valueOf(newId));
            writer.close();
        } catch (IOException e) {
            System.err.println("Error");
        }
        return newId;
    }
}
