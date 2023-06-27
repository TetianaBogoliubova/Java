// 1. Создайте методы с математическими операциями +, -, *, /
// a. Каждый метод принимает два числа в параметрах и возвращает результат
// 2. Вызовите все методы в main
// 3. Результат распечатайте в консоль

import java.util.Scanner;
public class MyScanner {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        System.out.println("Введите любых два числа");

        int num1 = mySc.nextInt();
        int num2 = mySc.nextInt();

        System.out.println("Сумма чисел = " +(num1 + num2));
        System.out.println("Разница чисел = " +(num1 - num2));
        System.out.println("Произведение чисел = " +(num1*num2));
        System.out.println("Частное чисел = " +(num1/num2));
    }
}
