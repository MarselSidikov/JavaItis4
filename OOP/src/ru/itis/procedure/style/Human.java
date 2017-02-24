package ru.itis.procedure.style;

/**
 * 20.02.2017
 * Human
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

/**
 * Описали класс - описали свой тип данных
 * В java есть int, double, int[], char  - а вы написали свой.
 * У обычного типа данных экземпляром является переменная
 * У класса экземпляром является ОБЪЕКТ
 * Объект характеризуется состоянием и поведением.
 * Состояние объекта определяется конкретными значениям его полей
 */
public class Human {
    // поля - имя, возраст
    private String name;
    private int age;

    // пустой конструктор, не имеющий параметров
    public Human() {
        this.name = "DEFAULT_NAME";
        this.age = 1;
    }

    public Human(String name, int age) {
        this.setAge(age);
        this.setName(name);
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            this.age = 1;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
