package Task_1;

import java.time.LocalDate;

public class Employee {
    // Поля
    private String name;
    private LocalDate dob;

    /**
     * Конструктор
     * 
     * @param name Имя работника
     * @param dob  Дата рождения работника
     */
    public Employee(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    // Информация о работнике
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}
