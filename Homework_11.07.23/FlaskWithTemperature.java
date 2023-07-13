import java.util.Random;

//№1. Представим, что у нас есть устройство, в котором две колбы. Прибор работает корректно,
//если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
// a. Вы должны написать метод, который проверяет это устройство.
// b. Ваша программа должна иметь переменные temperature1 и temperature2.
// c. В результате метод возвращает true или false.
public class FlaskWithTemperature {



    public static void main(String[] args) {
        Random random = new Random();
        int temperature1 = random.nextInt(2000) - 273;
        int temperature2 = random.nextInt(2000) -273;
        System.out.println("Температура первой колбы = "+ temperature1);
        System.out.println("Температура второй колбы = "+ temperature2);

changeFlask1(temperature1, temperature2);

    }
    static void changeFlask1(int tem1, int tem2) {
      if ((tem1 >= 100) && (tem2 <= 100))
          System.out.println("Устройство работает корректно " + true);
      else System.out.println("Ошибка в работе устройства " + false);

    }

    }


