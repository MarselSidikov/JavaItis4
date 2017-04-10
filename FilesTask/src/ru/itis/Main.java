package ru.itis;

import ru.itis.files.Folder;
import ru.itis.impl.HumansFile;
import ru.itis.models.Superhero;

public class Main {

    public static void main(String[] args) throws Exception{
        Folder<HumansFile<Superhero>> folder =
                new Folder<>();

        HumansFile<Superhero> superheroFileJava =
                new HumansFile<>("java-heroes.txt");
        HumansFile<Superhero> superheroFileByLife =
                new HumansFile<>("itits-5.txt");

        Superhero marat =
                new Superhero(17, "Иногда понимает, но иногда - не всегда");
        Superhero ruslan =
                new Superhero(16, "Сидит рядом с Маратом");
        Superhero guzel =
                new Superhero(18, "Я все сделала! Это правильно! ЭТОРАБОТАЕТ!!, но это не точно");

        Superhero marsel =
                new Superhero(23,"Лучший преподаватель по мнению Марата");
        Superhero alterMarsel =
                new Superhero(56, "Хочет домой");

        superheroFileJava.addToBuffer(marsel);
        superheroFileJava.addToBuffer(alterMarsel);
        superheroFileByLife.addToBuffer(marat);
        superheroFileByLife.addToBuffer(ruslan);
        superheroFileByLife.addToBuffer(guzel);

        folder.add(superheroFileByLife);
        folder.add(superheroFileJava);

        folder.writeAllFromBufferToFile("java-heroes.txt");
        folder.writeAllFromBufferToFile("itits-5.txt");
    }
}
