package returnParameters;
//
//Сформировать SQL запрос:  Вернуть все записи из cars,
// где параметры равны заданным, используя StringBuilder.
//Если значение null, то параметр не должен попадать в запрос.
//{"model", "V-60", "country", "Germany", "city", "Berlin",
// "year", null, "active", true}

//Пример: {"id", 1, "country", null, "city", "Helsinki",
// "year", null}
//Результат: SELECT * FROM users WHERE id = '1'
// AND city = 'Helsilnki';

public class ParametersCarsReturn {

    public static void main(String[] args) {
        String model = "V-60";
        String country = "Germany";
        String city = "Berlin";
        Integer year = null;
        boolean artive = true;
        String allString;

        if (year == null) {
            allString = "Car! model: %s, country: %s, city: %s, active: %b";
            System.out.println(String.format(allString, model, country, city, artive));
        } else {
            allString = "Car! model: %s, country: %s, city: %s, year: %s, active: %b";
            System.out.println(String.format(allString, model, country, city, year, artive));
        }
    }
}







