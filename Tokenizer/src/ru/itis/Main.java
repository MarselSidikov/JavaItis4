package ru.itis;

public class Main {

    public static void main(String[] args) {
	    Tokenizer tokenizer = new Tokenizer();
        Token tokens[] = tokenizer.tokenize("Hello abc 111 qwerty".toCharArray());


        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }
}
