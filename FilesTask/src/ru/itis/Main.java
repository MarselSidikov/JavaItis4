package ru.itis;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {

    public static void main(String[] args) throws Exception{
        HumansFile file = new HumansFile("humans1.txt");
        HumansFile file1 = new HumansFile("humans2.txt");
        HumansFile file2 = new HumansFile("humans3.txt");

        Folder<HumansFile> humansFileFolder = new Folder<>();
        humansFileFolder.add(file);
        humansFileFolder.add(file1);
        humansFileFolder.add(file2);
        humansFileFolder.writeText("humans2.txt", "Guzel");
        humansFileFolder.writeText("humans1.txt", "Marat");
        humansFileFolder.writeText("humans3.txt", "Ruslan");
    }
}
