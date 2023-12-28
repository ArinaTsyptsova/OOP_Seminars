package Controler;

import java.util.List;
import Domain.Person;

/**
 * Обощенный класс для контроля выплаты зарплаты
 */
public class AccountController {
    public static <T extends Person> void paySalary(T person, int paySalary) {
        System.out.println(String.format("%s выплачено %d рублей", person.getName(), paySalary));
    }

    // Метод вычисления среднего возраста
    public static <T extends Person> double averageAge(List<T> persons) {
        double sum = 0;
        for (T person : persons) {
            sum += person.getAge();
        }
        return sum / persons.size();
    }
}
