package ru.itis;

public class CharSequence implements Comparable {
    private char sequence[];

    public CharSequence(char[] sequence) {
        this.sequence = sequence;
    }


    @Override
    public int compareTo(Object object) {
        char aSequence[] = this.sequence;
        char bSequence[] = ((CharSequence)object).sequence;

        int minLength = Math.min(aSequence.length, bSequence.length);

        // проверьте, что будет если подадите на вход Hello и Hellow и исправьте это
        for (int i = 0; i < minLength; i++) {
            if (aSequence[i] != bSequence[i]) {
                return aSequence[i] - bSequence[i];
            }
        }

        return 0;
    }
}
