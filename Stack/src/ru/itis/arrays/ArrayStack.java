package ru.itis.arrays;

/**
 * 06.03.2017
 * ArrayStack
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ArrayStack {
    private final int MAX_STACK_SIZE = 10;
    private char stack[];
    private int count;

    public ArrayStack() {
        stack = new char[MAX_STACK_SIZE];
        count = 0;
    }

    // кладет элемент наверх стека
    public void push(char element) {
        stack[count] = element;
        count++;
    }

    // выталкивает элемент из стека
    public char pop() {
        char result = stack[count - 1];
        count--;
        return result;
    }

    // позволяет посмотреть последний элемент стека без выталкивания
    public char peek() {
        return stack[count - 1];
    }

    public int getCount() {
        return count;
    }
}
