//1. Создайте две переменные *isEdekaOpen* и *isReweOpen*, значения которых зависят от того,
//    открыты магазины или нет.
// a. Реализует логический метод *canBuy*, возвращающий boolean
// b. Значение этой переменной должно быть true, если хотя бы один
//    магазин открыт, иначе false.
// c. Отобразите строку «Я могу купить еду, это ……» и значение.

import java.util.Scanner;

public class WorkTimeShop {
    static boolean isEdekaOpen;
    static boolean isReweOpen;

    public static void main(String[] args) {

        int currentTime, startTime1, endTime1, startTime2, endTime2;
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Введите начало работы магазина Edeka ");
        startTime1 = myScanner.nextInt(24);
        System.out.print("Введите окончание работы магазина Edeka ");
        endTime1 = myScanner.nextInt(24);

        System.out.print("Введите начало работы магазина Rewe ");
        startTime2 = myScanner.nextInt(24);
        System.out.print("Введите окончание работы магазина Rewe ");
        endTime2 = myScanner.nextInt(24);

        System.out.print("Введите текущее время ");
        currentTime = myScanner.nextInt(24);


        if (currentTime >= startTime1 && currentTime <= endTime1) {
            System.out.println("Магазин Edeka работает");
            isEdekaOpen = true;
        } else {
            System.out.println("Магазин Edeka не работает");
            isEdekaOpen = false;
        }
        if (currentTime >= startTime2 && currentTime <= endTime2) {
            System.out.println("Магазин Rewe работает");
            isReweOpen = true;
        } else {
            System.out.println("Магазин Rewe не работает");
            isReweOpen = false;
        }
        canBay(isEdekaOpen, isReweOpen);
    }

    static void canBay(boolean a, boolean b) {

        if ((a || b) || (a && b)) {
            a = isReweOpen = true;
            b = isEdekaOpen = true;
            System.out.println("Я могу купить еду, это - " + true);
        }
        if (!(a && b)) {
            System.out.println("Я могу купить еду? Нет, это - " + false);
        }
    }
}










