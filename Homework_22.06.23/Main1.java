//1. В методе main инициализировать все примитивные типы и не примитивные типы.
//2. Вывести их результат в консоль:
//char: G
//int: 89
//byte: 4
//short: 56
//float: 4.7333436
//double: 4.355453532
//long: 12121
//Character: G
//Integer: 89
//Byte: 4
//Short: 56
//Float: 4.7333436
//Double: 4.355453532
//Long: 12121

package org.example;

public class Main {
    public static void main(String[] args) {

        char myChar = 'G';
        int myInt =89;
        byte myByte = 4;
        short myShort = 56;
        float myFloat = 4.7333436F;
        double myDouble = 4.355453532;
        long myLong = 12121;
        String myStr = "My string with text";

        Character box1;
        box1 = Character.valueOf(myChar);
        Integer box2;
        box2 = Integer.valueOf(myInt);
        Byte box3;
        box3 = Byte.valueOf(myByte);
        Short box4;
        box4 = Short.valueOf(myShort);
        Float box5;
        box5 = Float.valueOf(myFloat);
        Double box6;
        box6 = Double.valueOf(myDouble);
        Long box7;
        box7 = Long.valueOf(myLong);

        System.out.println("myChar=" + myChar + " " + box1);
        System.out.println("myInt=" + myInt + " " + box2);
        System.out.println("myByte=" + myByte+ " " + box3);
        System.out.println("myShort=" + myShort+ " " + box4);
        System.out.println("myFloat="+ myFloat+ " " + box5);
        System.out.println("myDouble="+myDouble+ " " + box6);
        System.out.println("myLong=" + myLong+ " " + box7);
        System.out.println("myStr="+myStr);

        //2. * Дано трехзначное число. Вывести на экран все цифры этого числа
//Пример: 345
//Вывод в консоль: Число 345 -> 3, 4, 5
        int mainNumber = 345;
        int[] array = new int[3];
        array[0] = 3;
        array[1] = 4;
        array[2] = 5;
        System.out.println("Число "+ mainNumber + "-->"+array[0]+", "+array[1]+", "+array[2]);
    }
}


