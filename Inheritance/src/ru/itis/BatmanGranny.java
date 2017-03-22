package ru.itis;

public class BatmanGranny extends Granny {
    // два дополнительных поля
    private int enemyCount;
    private String batmobile;

    /**
     * Конструктор с параметрами
     * @param name имя
     * @param age возраст
     * @param grandsonsCount количество внуков
     * @param shawlColor цвет платка
     */
    public BatmanGranny(String name, int age, int grandsonsCount, String shawlColor, int enemyCount, String batmobile) {
        // вызов конструктора класса-предка
        super(name, age, grandsonsCount, shawlColor);
        this.batmobile = batmobile;

        if (enemyCount >= 0) {
            this.enemyCount = enemyCount;
        } else {
            this.enemyCount = 0;
        }
    }

    public int getEnemyCount() {
        return enemyCount;
    }

    public String getBatmobile() {
        return batmobile;
    }

    public void enemiesCatch() {
        for (int i = 0; i < enemyCount; i++) {
            System.out.println("Enemy was catch");
        }
    }
}
