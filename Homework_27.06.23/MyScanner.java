// 1. Создайте методы с математическими операциями +, -, *, /
// a. Каждый метод принимает два числа в параметрах и возвращает результат
// 2. Вызовите все методы в main
// 3. Результат распечатайте в консоль

import java.util.Scanner;
public class MyScanner {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        System.out.println("Введите любых два числа");

        double num1 = mySc.nextDouble();
        double num2 = mySc.nextDouble();

        System.out.println("Сумма чисел = " +(num1 + num2));
        System.out.println("Разница чисел = " +(num1 - num2));
        System.out.println("Произведение чисел = " +(num1*num2));
        System.out.println("Частное чисел = " +(num1/num2));
    }
    static void summa(int num1, int num2) {
        int sum = num1 + num2;
    }
    static void minus(int num1, int num2) {
        int min = num1 - num2;
    }
    static  void multi(int num1, int num2) {
        int mul = num1 - num2;
    }
    static  void divis( int num1, int num2) {
        int div = num1 / num2;
    }
}
