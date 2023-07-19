//1. Создайте массив из 8 случайных целых чисел из интервала [1;50]
// Выведите массив на консоль в строку.
// Замените каждый элемент с нечетным индексом на ноль.
// Снова выведете массив на консоль в отдельной строке.

import java.util.Arrays;
import java.util.Random;

public class ArrayEightNumbers {

    public static void main(String[] args) {
        int[] arrInt = new int[8];

        Random random = new Random();
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = random.nextInt(50) + 1;
        }
        String str = Arrays.toString(arrInt);
        System.out.println(str);
        for (int i = 0; i < arrInt.length; i++) {
            if (i % 2 != 0) {
                arrInt[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arrInt));
    }
}



