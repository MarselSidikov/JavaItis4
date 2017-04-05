package ru.itis.zoo;

import ru.itis.animal.Animal;

// определяет базовый функционал зоопарка по
// работе с живтоными
// Зоопарк BaseZoo можно обобщить только
// типом "Animal"
public interface BaseZoo<T extends Animal> {
    void add(T animal);

    void writeToFile(String animalName) throws Exception;
}
