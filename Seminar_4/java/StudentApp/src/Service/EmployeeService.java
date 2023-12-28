package Service;

import java.util.ArrayList;
import java.util.List;
import Domain.Employee;
import Domain.PersonComparator;

/**
 * Класс для управления работниками
 */
public class EmployeeService implements iPersonService<Employee> {
    private int count;
    private List<Employee> employeeList;

    // Список работников
    public EmployeeService() {
        employeeList = new ArrayList<>();
    }

    // Методы
    @Override
    public List<Employee> getAll() {
        return employeeList;
    }

    @Override
    public void create(String name, int age) {
        Employee employee = new Employee(name, age, "Разнорабочий");
        count++;
        employeeList.add(employee);
    }

    // Метод для сортировки по ФИО
    public void sortByFio() {
        PersonComparator<Employee> personComparator = new PersonComparator<Employee>();
        employeeList.sort(personComparator);
    }
}
