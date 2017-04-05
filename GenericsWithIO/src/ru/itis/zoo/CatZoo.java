package ru.itis.zoo;


import ru.itis.cats.Cat;

// Зоопарк - расширение зоопарка BaseZoo
// Я говорю, что зоопарк CatZoo можно обобщить
// только кошками
public interface CatZoo<T extends Cat> extends BaseZoo<T> {

}
