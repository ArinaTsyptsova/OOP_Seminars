package Task_1;

import java.time.LocalDate;

/**
 * Класс для общих данных о работнике - имени, дате рождения и зарплате
 */
public class DataEmployee {
    // Поля
    private Employee employee;
    private CalculateSalary salary;

    /**
     * Конструктор
     * 
     * @param name       имя работника
     * @param dob        дата рождения
     * @param baseSalary зарплата
     */
    public DataEmployee(String name, LocalDate dob, int baseSalary) {
        this.employee = new Employee(name, dob);
        this.salary = new CalculateSalary(baseSalary);
    }

    // Данные о работнике
    public String getEmpInfo() {
        return employee.getEmpInfo();
    }

    // Данные о зарплате
    public int CalculateSalary() {
        return salary.calculateNetSalary();
    }
}
