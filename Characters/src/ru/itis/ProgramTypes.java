package ru.itis;

/**
 * 27.02.2017
 * ProgramTypes
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ProgramTypes {
    public static void main(String[] args) {
        int x = 7;
        // операция деления смотрит левый операнд и правый операнд
        // они оба целые, значит результат целый
        int y = x / 2;
        System.out.println(y);

        // x / 2 - результат будет равен 3, а вот когда результат попадет
        // в d, он уже будет преобразован в double

        // происходит неявное преобразование int в double без потери данных
        double d = x / 2;
        System.out.println(d);

        // слева от / число double, поэтому деление нецелочисленное
        d = x / 2.0;
        System.out.println(d);

        // тип справа double, следовательно у него есть вещественная часть
        // следовательно, при конвертации в int она будет отброшена
        // чтобы программист явно понимал, что здесь возможна потеря данных
        // необходимо явно указать, что мы выполняем преобразование
        y = (int)d;
        System.out.println(y);

    }
}
