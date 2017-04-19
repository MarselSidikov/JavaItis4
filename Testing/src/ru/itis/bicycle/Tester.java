package ru.itis.bicycle;

/**
 * 19.04.2017
 * Tester
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Tester {

    /**
     * Метод проверяет равенство expected и actual
     * @param expected
     * @param actual
     * @return true, если равны, false - если не равны
     */
    public static void assertEquals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionException();
        }
    }
}
