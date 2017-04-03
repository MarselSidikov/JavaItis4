package ru.itis.compare;

// GenericsCompare - назвать проект
public interface Comparable<T> {
    // метод возвращет положительное число, если
    // наш объект БОЛЬШЕ object
    // отрицательно - МЕНЬШЕ
    // 0 когда равны
    int compareTo(T object);
}
