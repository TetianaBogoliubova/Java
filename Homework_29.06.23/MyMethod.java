//Реализовать программу, выводящую на экран результаты:
// ● Сложения двух чисел
// ● Вычитания двух чисел
// ● Умножения двух чисел
// ● Деления двух чисел
// Каждая из арифметических операций должна быть реализована как отдельный метод.

import java.util.Scanner;
//
public class MyMethod {
    static Scanner myScan = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Введите два числа");
         double arg1 = myScan.nextDouble();
         double arg2 = myScan.nextDouble();
        System.out.println("Сумма чисел = " + (arg1 + arg2));
        System.out.println("Разница чисел = " + (arg1 - arg2));
        System.out.println("Произведение чисел = " + (arg1 * arg2));
        System.out.println("Частное чисел = " + (arg1 / arg2) );
    }
    static int summaResult(int arg1, int arg2) {
        int sum = arg1 + arg2;
        return sum;
    }
    static int subtractionResult(int arg1, int arg2) {
        int minus = arg1 - arg2;
        return minus;
    }
    static int multiplicationResult(int arg1, int arg2) {
    int mult = arg1 * arg2;
    return mult;
    }
    static  int divisionResult(int arg1, int arg2) {
     int div = arg1 / arg2;
     return div;
    }
}
