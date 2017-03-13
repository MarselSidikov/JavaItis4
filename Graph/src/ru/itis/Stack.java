package ru.itis;

/**
 * 13.03.2017
 * Stack
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Stack {
    private final int MAX_STACK_SIZE = 10;
    private int stack[];
    private int count;

    public Stack() {
        stack = new int[MAX_STACK_SIZE];
        count = 0;
    }

    // кладет элемент наверх стека
    public void push(int element) {
        stack[count] = element;
        count++;
    }

    // выталкивает элемент из стека
    public int pop() {
        int result = stack[count - 1];
        count--;
        return result;
    }

    // позволяет посмотреть последний элемент стека без выталкивания
    public int peek() {
        return stack[count - 1];
    }

    public int getCount() {
        return count;
    }

    public String toString() {
        String result = "";

        for (int i = 0; i < count; i++) {
            result += stack[i] + ",";
        }

        return result;
    }
}
