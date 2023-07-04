import javafx.concurrent.ScheduledService;
//    Домашнее задание №1
//    Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//    Числа могут быть, как целочисленные, так и дробные.
//    Например :
//    ввод : m=10.5, n=10.45
//    вывод: Число 10.45 ближе к 10.
import java.util.Scanner;

public class NearNumber {

    static Scanner myScan = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Введите два числа");
        double number1 = myScan.nextDouble();
        double number2 = myScan.nextDouble();

        double res1 = number1 - 10;
        double res2 = number2 - 10;
    if(Math.abs(res1) < Math.abs(res2)) {
            System.out.println("Ближайшее к 10 число = " + number1);
    }
        if(Math.abs(res1) == Math.abs(res2)) {
            System.out.println("Данные числа равноудалены от 10");
        }
    else {
        System.out.println("Ближайшее к 10 число = " + number2);
    }
    }
}


