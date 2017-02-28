package ru.itis;

public class ProgramCharacters {

    public static void main(String[] args) {
        char character;
        character = 'A';
        int characterCode = character;
        character = (char)(character + 1);
        System.out.println(character);
        System.out.println(characterCode);

        System.out.println("Print table");
        for (int i = 1024; i < 1100; i++) {
            System.out.println(i + " " + (char)i);
        }
    }
}
