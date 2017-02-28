package ru.itis;

/**
 * 27.02.2017
 * ProgramCharactersFunction
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ProgramCharactersFunction {
    public static boolean isLetter(char c) {
        return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }

    /**
     * Преобразование цифры с формате char в число типа int.
     * @param c - символ-цифра, например - '9'
     * @return int-представление числа, 9
     */
    public static int toDigit(char c) {
        return (int)c - '0';
    }
}
