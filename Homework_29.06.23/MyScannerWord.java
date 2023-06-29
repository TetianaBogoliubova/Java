//Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//Например: ввод - mama, papa
//вывод - mapa
import java.util.Scanner;

public class MyScannerWord {
    static Scanner myScan = new Scanner(System.in);
    static String word1 = myScan.nextLine();
    static String word2 = myScan.nextLine();

    public static void main(String[] args) {
        System.out.println("Введите два слова с четным количеством букв");
        //int count = 0;
        if (word1.length() % 2 == 0) {
            System.out.println(word1);
        } else {
            System.out.println("Ошибка");
        }
        if (word2.length() % 2 == 0) {
            System.out.println(word2);
        } else {
            System.out.println("Ошибка");
        }
        String halfWord1 = word1.substring(0,word1.length() / 2);
        String halfWord2 = word2.substring(word2.length() / 2);
        System.out.println(halfWord1 + halfWord2);
    }
}


