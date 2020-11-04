package ru.scooljava;

public class Main {
    public static void main(String[] args) {

    }
    //Написать публичный метод принимающий 2 параметра: первый типа byte и второй типа short. Метод должен возвращать сумму значений параметров. Тип возвращаемого значения должен быть byte.
    public static byte aByte(byte a, short b) {
        return (byte) (a+b);
    }
    //Написать публичный метод принимающий 2 параметра: первый типа int и второй типа long. Метод должен возвращать произведение значений параметров. Тип возвращаемого значения int.
    public static int aInt(int a, long b) {
        return (int) (a + b);
    }
    //Написать метод getMaxNumber принимающий 2 параметра: int и int. Метод должен сравнить переданные параметры между собой и вернуть максимальный. Для решения необходимо использовать IF или тернарный оператор ?:
    public static int getMaxNumber(int a, int b) {
        if (a > b) return a;
        else return b;
    }
    //Написать метод isCharA принимающий 1 параметр типа char. Если передана буква 'А', то возвращать true, а в остальных случаях false
    public static boolean isCharA(char c) {
        return c == 'a';
    }
    //Написать метод isCharNumber принимающий 1 параметр типа char. Если передано число, то вернуть true, а в остальных случаях false
    public static boolean isCharNumber(char f) {
        return Character.isDigit(f);
    }
    //Написать метод выводящий бинарное представление Integer.MAX_VALUE и Integer.MAX_VALUE + 1. Для вывода бинарного представления использовать Integer.toBinaryString(). Без входных параметров и не возвращающая ничего. Покажет, что переполнение не вызывает ошибку и как это выглядет в памяти
    public static void integerMaxvalue(){
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE+1));
    }
    //Написать метод выводящий на экран в цикле бинарное представление чисел от 0 до 30. Для вывода бинарного представления использовать Integer.toBinaryString(). Без входных параметров и не возвращающая ничего.
    public static void integer30(){
        for (int i = 0; i<30; i++) System.out.println(Integer.toBinaryString(i));
    }
    //Написать метод принимающий 1 параметр типа char и возвращающий его числовое представление.
    public static int charInt(char a){
        return (int) a;
    }
    //Написать метод принимающий 1 параметр типа int и возвращающий его представление в виде печатного символа
    public static char intChar (int a){
        return (char) a;
    }

}


