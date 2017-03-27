package ru.itis;


public class Tokenizer {
    // константы

    // максимальное количество токенов
    private static final int MAX_TOKENS_COUNT = 10;
    // максимальная длина токена
    private static final int MAX_TOKEN_LENGTH = 20;

    // метод токенизации - разбивает текст на токены по пробелам
    public Token[] tokenize(char text[]) {
        // создали результирующий массив токенов
        Token tokens[] = new Token[MAX_TOKENS_COUNT];
        // количество выделенных токенов
        int tokensCount = 0;
        // массив символов текущего токена
        char currentToken[] = new char[MAX_TOKEN_LENGTH];
        // позиция в текущем токене
        int positionInCurrentToken = 0;
        // начинаем с начала
        int i = 0;
        // пока не обработали всю строку
        while (i < text.length) {
            // если символ не пробел
            if (text[i] != ' ') {
                // кидаем его в массив символов текущего токена
                currentToken[positionInCurrentToken] = text[i];
                positionInCurrentToken++;
            } else {
                // если встретили пробел - создаем новый токен
                Token newToken = new Token(currentToken, positionInCurrentToken);
                // кидаем токен в массив
                tokens[tokensCount] = newToken;
                tokensCount++;
                // начали новый токен
                positionInCurrentToken = 0;
            }
            i++;
        }
        // добавляем последний токен, после которого нет пробела
        Token newToken = new Token(currentToken, positionInCurrentToken);
        tokens[tokensCount] = newToken;
        return tokens;
    }
}
