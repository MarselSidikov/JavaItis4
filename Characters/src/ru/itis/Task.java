package ru.itis;

/**
 * 27.02.2017
 * Task
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Task {
    public static boolean equals(char textA[], char textB[]) {
        if (textA.length != textB.length) {
            return false;
        } else {
            for (int i = 0; i < textA.length;i++) {
                if (textA[i] != textB[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     *
     * @param textA
     * @param textB
     * @return функция возвразает 0 если строки равны, -1 если textA меньше, чем textB
     * 1 если textA больше, чем textB
     */
    public static int compare(char textA[], char textB[]) {
        return 0;
    }
}
