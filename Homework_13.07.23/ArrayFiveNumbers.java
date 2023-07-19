//2. Создайте массив из 5 случайных целых чисел из интервала [10;99]
// Выведите его на консоль в строку.
// Определите и выведите на экран сообщение о том, является ли массив строго возрастающей
// последовательностью.

import java.util.Arrays;
import java.util.Random;

public class ArrayFiveNumbers {
    public static void main(String[] args) {
        int[] arrInt = new int[5];
        int min = 10;
        int max = 99;
        int diff = max - min;
        Random random = new Random();
        for (int i = 0; i < arrInt.length; i++) {
            int r = random.nextInt(diff + 1);
            arrInt[i] = r += min;
        }
        String str = Arrays.toString(arrInt);
        System.out.println(str);

        boolean rightArray = true;
        for (int i = 1; i <= arrInt.length; i++) {
            if (arrInt[i] <= arrInt[i - 1]) {
                rightArray = false;
                break;
            }
        }
        if (rightArray) System.out.println("Это - массив строго возрастающей последовательностью");
        else System.out.println("Это - НЕ массив строго возрастающей последовательности");
    }
}


