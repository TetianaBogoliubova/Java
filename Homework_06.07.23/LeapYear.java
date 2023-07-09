//Реализуйте программу, которая попросит пользователя ввести год и напечатать:
// этот год isLeap (високосный) или нет.

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        int isLeapYear;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите год, начиная с 1584 ");
        isLeapYear = myScanner.nextInt();

        int startCountYear1 = isLeapYear % 100;
        int startCountYear2 = isLeapYear % 400;

        if (isLeapYear % 4 != 0)
            System.out.println("Невысокосный");

        else if ((startCountYear1 != 0) && (startCountYear1 % 4 == 0))
            System.out.println("Высокосный");

        else if ((startCountYear1 != 0) && (startCountYear1 % 4 != 0))
            System.out.println("Невысокосный");

        else if (startCountYear1 == 0 && startCountYear2 == 0)
            System.out.println("Высокосный");

        else System.out.println("Невысокосный");
    }
}

