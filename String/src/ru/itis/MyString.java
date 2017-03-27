package ru.itis;

/**
 * Created by User on 27.03.2017.
 */
public class MyString {
    private char[] array;

    public MyString(char[] array) {
        this.array = array;
    }

    public boolean equals(Object object) {
        // проверяем, тот объект, с которым сравниваем является экземпляром MyString
        if (object instanceof MyString) {
            // преобразовал объект, с которым сравниваем в MyString
            MyString that = (MyString)object;
            // забираем у него массив символов
            char arrayThat[] = that.array;
            // если длины нашего массива и другого равны
            if (arrayThat.length == this.array.length) {
                // посимвольного сравниваем
                for (int i = 0; i < arrayThat.length; i++) {
                    if (arrayThat[i] != array[i]) {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
