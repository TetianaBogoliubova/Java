//№1.
//Увеличьте одновременное количество игроков до трех.
//Три игрока вводят номера для игры.
//Лотерея играет один раз.
//№2.
//**Используя библиотеку JUnit, напишите тесты, которые проверяют методы, реализованные в приложении - лотерея и Utils классе.

        package lotteryPavel;

import java.util.Random;
import java.util.Scanner;

public class LotteryHomework {
    public static final int[] winningNumbers = new int[5];
    private static int[] customerNumbers1;
    private static int[] customerNumbers2;
    private static int[] customerNumbers3;

    public void run() {
        initializeWinningNumbers();
        setCustomerNumbers();
        printWinningAndCustomerNumbersTable();
        checkWinnings();
    }


    public static int[] initializeWinningNumbers() {
        Random random = new Random();
        int i = 0;
        int randomNumber;

        while (i < winningNumbers.length) {
            randomNumber = random.nextInt(50) + 1;

            if (!isThisNumberPresentInArray(randomNumber, winningNumbers)) {
                winningNumbers[i] = randomNumber;
                i++;
            }
        }
        return winningNumbers;
    }
   private void setCustomerNumbers() {
       Scanner scanner = new Scanner(System.in);
       int[] customerNumbers1 = new int[5];
       int[] customerNumbers2 = new int[5];
       int[] customerNumbers3 = new int[5];


       System.out.println("Customer № 1, попробуйте угадать 5 чисел");

       for (int i = 0; i < customerNumbers1.length; i++) {
           System.out.print((i + 1) + " число: ");
           customerNumbers1[i] = scanner.nextInt();
       }


       for (int i = 0; i < customerNumbers2.length; i++) {
           System.out.print("Customer № 2, попробуйте угадать 5 чисел. Число " + (i + 1) + " ");
           customerNumbers2[i] = scanner.nextInt();
       }

       for (int i = 0; i < customerNumbers3.length; i++) {
           System.out.print("Customer № 3, попробуйте угадать 5 чисел. Число " + (i + 1) + " ");
           customerNumbers3[i] = scanner.nextInt();
       }

       this.customerNumbers1 = customerNumbers1;
       this.customerNumbers2 = customerNumbers2;
       this.customerNumbers3 = customerNumbers3;

    }
    private void printWinningAndCustomerNumbersTable() {
        System.out.println("Winning num. : Customer1 Customer2 Customer3");
        for (int i = 0; i < customerNumbers1.length &&
                        i < customerNumbers2.length &&
                        i < customerNumbers3.length; i++) {

            System.out.println(winningNumbers[i] + "                "
                            + customerNumbers1[i] + "        "
                            + customerNumbers2[i] + "        "
                            + customerNumbers3[i]);
        }
    }
    private void checkWinnings() {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int customerNumber1 : customerNumbers1) {
            if (isThisNumberPresentInArray(customerNumber1, winningNumbers)) {
                count1++;
            }
        }
        for (int customerNumber2 : customerNumbers2) {
            if (isThisNumberPresentInArray(customerNumber2, winningNumbers)) {
                count1++;
            }
        }
        for (int customerNumber3 : customerNumbers3) {
            if (isThisNumberPresentInArray(customerNumber3, winningNumbers)) {
                count1++;
            }
        }

        if (count1 >= 3) {
            System.out.println("Поздравляем, игрок № 1 выиграл в лотерею!");
        } else System.out.println("Customer № 1, Вы - проиграли");

        if (count2 >= 3) {
            System.out.println("Поздравляем, игрок № 2 выиграл в лотерею!");
        } else System.out.println("Customer № 2, Вы - проиграли");

        if (count3 >= 3) {
            System.out.println("Поздравляем, игрок № 3 выиграл в лотерею!");
        } else System.out.println("Customer № 3, Вы - проиграли");

    }

    public static boolean isThisNumberPresentInArray(int targetNumber, int[] array) {
        for (int curringNumber : array) {
            if (curringNumber == targetNumber) {
                return true;
            }
        }
return false;
    }
}


