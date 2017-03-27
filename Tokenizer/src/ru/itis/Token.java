package ru.itis;

public class Token {
    // массив символов
    private char[] characters;

    // конструктор принимает на вход массив символов
    // и количество значимых символов
    public Token(char[] characters, int charactersCount) {
        // создаем новый массив уже нормальной длины
        this.characters = new char[charactersCount];
        // копируем данные в новый массив
        for (int i = 0; i < charactersCount; i++) {
            this.characters[i] = characters[i];
        }
    }

    public char[] getCharacters() {
        return characters;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < characters.length; i++) {
            result = result + characters[i];
        }
        return result;
    }
}
