package ru.itis;

public class Main {

    public static void main(String[] args) {
        Human marsel = new Human("Marsel", 23);
        Human guzel = new Human("Guzel", 18);

        HumansDataStorage dataStorage = new HumansDataStorage("human.txt");
        dataStorage.save(marsel);
        int guzelId = dataStorage.save(guzel);
        dataStorage.find(1);

        Human guzelFromFile = dataStorage.find(guzelId);
        System.out.println(guzelFromFile);
    }
}
