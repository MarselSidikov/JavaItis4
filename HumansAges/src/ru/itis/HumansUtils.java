package ru.itis;

/**
 * 01.03.2017
 * HumansUtils
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class HumansUtils {
    /**
     * Метод подсчитывает количество людей определенного возраста
     * @param humans массив людей
     * @return массив, где на i-ой позиции, стоит количество людей i-го возраста
     * Например ages[10] = 3;
     */
    public static int[] countAges(Human[] humans) {
        int[] resultAges = new int[120];

        for (int i = 0; i < humans.length; i++) {
            // int currentAge = humans[i].getAge() - возраст i-го человека
            // resultAges[currentAge] = resultAges[currentAge] + 1;
            resultAges[humans[i].getAge()]++;
        }

        return resultAges;
    }
}
