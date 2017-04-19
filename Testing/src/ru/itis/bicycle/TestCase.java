package ru.itis.bicycle;

import ru.itis.Summator;

/**
 * 19.04.2017
 * TestCase
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class TestCase {
    public static void main(String[] args) {
        Summator testingSummator = new Summator();

        // результат, который мы получили
        int actual = testingSummator.sum(5, 6);
        // результат, который мы ожидаем получить
        int expected = 12;

        Tester.assertEquals(expected, actual);
    }
}
