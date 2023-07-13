//№2. У вас на банковском счету N долларов. Вы хотите снять все, но банк разрешает
//снять только сумму, которая является делителем текущей суммы на счету и меньше текущей суммы.
//Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится,
//чтобы забрать все свои деньги из банка?
//Примечание: если оставшаяся сумма равна 1, вы можете снять ее. Пример:
//Ввод: N = 21
//        Выход: 7
//        Объяснение: N = 21
//        Снято 7, осталось = 14
//        Снято 7, осталось = 7
//        Снято 1, осталось = 6
//        Снято 3, осталось = 3
//        Снято 1, осталось = 2
//        Снято 1, Осталось = 1
//        Снято 1, осталось = 0

import java.util.Scanner;

public class BankAccountCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму, которую хотите снять ");
        int sumInput = scanner.nextInt();
        int testSum = sumInput;
        int razn1 = sumInput - getMaxDiv(sumInput, testSum);
        int razn2 = razn1 - getMaxDiv(razn1, razn1);
        int razn3 = razn2 - getMaxDiv(razn2, razn2);
        int razn4 = razn3 - getMaxDiv(razn3, razn3);
        int razn5 = razn4 - getMaxDiv(razn4, razn4);
        int razn6 = razn5 - getMaxDiv(razn5, razn5);
        int razn7 = razn6 - getMaxDiv(razn6, razn6);
        int razn8 = razn7 - getMaxDiv(razn7, razn7);
        int razn9 = razn8 - getMaxDiv(razn8, razn8);
        int razn10 = razn9 - getMaxDiv(razn9, razn9);
        int razn11 = razn10 - getMaxDiv(razn10, razn10);
        int razn12 = razn11 - getMaxDiv(razn11, razn11);

        System.out.println("1 День. Из указанной суммы Вы можете снять = "
                + getMaxDiv(sumInput, testSum) + " остаток " + razn1);

        getCount1(razn1, getMaxDiv(razn1, razn1), (razn1 - getMaxDiv(razn1, razn1)));
        getCount1(razn2, getMaxDiv(razn2, razn2), (razn2 - getMaxDiv(razn2, razn2)));
        getCount1(razn3, getMaxDiv(razn3, razn3), (razn3 - getMaxDiv(razn3, razn3)));
        getCount1(razn4, getMaxDiv(razn4, razn4), (razn4 - getMaxDiv(razn4, razn4)));
        getCount1(razn5, getMaxDiv(razn5, razn5), (razn5 - getMaxDiv(razn5, razn5)));
        getCount1(razn6, getMaxDiv(razn6, razn6), (razn6 - getMaxDiv(razn6, razn6)));
        getCount1(razn7, getMaxDiv(razn7, razn7), (razn7 - getMaxDiv(razn7, razn7)));
        getCount1(razn8, getMaxDiv(razn8, razn8), (razn8 - getMaxDiv(razn8, razn8)));
        getCount1(razn9, getMaxDiv(razn9, razn9), (razn9 - getMaxDiv(razn9, razn9)));
        getCount1(razn10, getMaxDiv(razn10, razn10), (razn10 - getMaxDiv(razn10, razn10)));
        getCount1(razn11, getMaxDiv(razn11, razn11), (razn11 - getMaxDiv(razn11, razn11)));
        getCount1(razn12, getMaxDiv(razn12, razn12), (razn12 - getMaxDiv(razn12, razn12)));
    }
    public static int getMaxDiv(int a, int b) {
        int maxDiv = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0 && a != i && b != i) {
                maxDiv = i;
            }
        }
        return maxDiv;
    }
    public static void getCount1(int razn, int metod, int ost) {

        for (int i = 1; i <= razn; i++)
            i = razn;
        ost = razn - metod;
        if ((ost >= 1) && (metod != razn)) {
            int j = 0;
            j++;
            System.out.println(j + " День. Снято " + metod + ", осталось - " + ost);
        } else if (ost == 0)
            System.out.println("Снято 1, осталось = 0");
    }
}
// Я знаю, что при больших суммах 12 методов для полного вычисления снятия денег с карты недостаточно.
// Но у меня не получилось зациклить метод, в котором вычисляюся и разница, и остаток, и больший делитель.
// Также у меня не срабатывает итерация (j++) для подсчета дней, хотя на занятии с Александром делали также.
