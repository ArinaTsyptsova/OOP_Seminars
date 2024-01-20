package Task_1;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(1998, 11, 27);

        DataEmployee employee = new DataEmployee("Марина", dob, 50000);
        System.out.println("Работник: " + employee.getEmpInfo());
        System.out.println("Зарплата: " + employee.CalculateSalary() + " рублей");
    }
}
