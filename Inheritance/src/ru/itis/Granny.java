package ru.itis;

/**
 * Класс Бабушка
 */
public class Granny {
    private String name;
    private int age;
    private int grandsonsCount;
    private String shawlColor;

    /**
     * Конструктор с параметрами
     * @param name имя
     * @param age возраст
     * @param grandsonsCount количество внуков
     * @param shawlColor цвет платка
     */
    public Granny(String name, int age, int grandsonsCount, String shawlColor) {
        this.name = name;

        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            this.age = 55;
        }

        if (grandsonsCount >= 0) {
            this.grandsonsCount = grandsonsCount;
        } else {
            this.grandsonsCount = 0;
        }
        this.shawlColor = shawlColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrandsonsCount() {
        return grandsonsCount;
    }

    public String getShawlColor() {
        return shawlColor;
    }

    public void grandsonsFeed() {
        for (int i = 0; i < grandsonsCount; i++) {
            System.out.println("Grandson was feed");
        }
    }

    public Shawl shawlMake(String color) {
        return new Shawl(color);
    }
}
