package ru.itis;

public interface Comparable {
    // метод возвращет положительное число, если
    // наш объект БОЛЬШЕ object
    // отрицательно - МЕНЬШЕ
    // 0 когда равны
    int compareTo(Object object);
}
