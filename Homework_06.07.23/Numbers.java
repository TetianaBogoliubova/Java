//Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер)
// и напечатает максимум из трех чисел.

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите три числа ");
        num1 = myScanner.nextInt();
        num2 = myScanner.nextInt();
        num3 = myScanner.nextInt();

        if ((num1 >= num2) && (num1 >= num3)) {
            int max1 = num1;
            System.out.println("Наибольшее число = " + max1);
        }
        if ((num2 >= num1) && (num2 >= num3)) {
            int max2 = num2;
            System.out.println("Наибольшее число = " + max2);
        }
        if ((num3 > num1) && (num3 > num2)) {
            int max3 = num3;
            System.out.println("Наибольшее число = " + max3);
        }
    }
}
