package ru.scooljava;

public class Main {
    public static void main(String[] args) {
        System.out.println(getMaxNumber(3,10));
        System.out.println(isCharA('b'));
    }
    //Написать публичный метод принимающий 2 параметра: первый типа byte и второй типа short. Метод должен возвращать сумму значений параметров. Тип возвращаемого значения должен быть byte.
    public static byte aByte(byte a, short b) {
        return (byte) (a+b);
    }
    //Написать публичный метод принимающий 2 параметра: первый типа int и второй типа long. Метод должен возвращать произведение значений параметров. Тип возвращаемого значения int.
    public static int aInt(int a, long b) {
        return (int) (a+b);}
    //Написать метод getMaxNumber принимающий 2 параметра: int и int. Метод должен сравнить переданные параметры между собой и вернуть максимальный. Для решения необходимо использовать IF или тернарный оператор ?:
    public static int getMaxNumber(int a, int b) {
        if (a>b) return a;
        else return b; }
    //Написать метод isCharA принимающий 1 параметр типа char. Если передана буква 'А', то возвращать true, а в остальных случаях false
    public static boolean isCharA(char c) {
        return c == 'a'; }
    //Написать метод isCharNumber принимающий 1 параметр типа char. Если передано число, то вернуть true, а в остальных случаях false

}

