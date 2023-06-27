public class MyString {
    public static void main(String[] args) {
        // 1. Создайте строку через new - I study Basic Java!
        // 2. Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
        // 3. Распечатать пред-последний символ строки. Используем метод String.charAt().
        // 4. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        // 5. Вырезать строку Java c помощью метода String.substring().
        // 6. Заменить все символы “а” на “о”.
        // 7. Преобразуйте строку к верхнему регистру.
        // 8. Преобразуйте строку к нижнему регистру.

        String myStr = new String("I study Basic Java!");
        System.out.println(myStr);
        System.out.println(myStr.charAt(myStr.length()-2));
        System.out.println(myStr.contains("Java"));
        System.out.println(myStr.substring(14,18));
        System.out.println(myStr.replace('a', 'o'));
        System.out.println(myStr.toUpperCase());
        System.out.println(myStr.toLowerCase());
    }
}

