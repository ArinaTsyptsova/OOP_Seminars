package Service;

import java.util.ArrayList;
import java.util.List;
import Domain.PersonComparator;
import Domain.Student;

/**
 * Класс для управления студентами
 */
public class StudentService implements iPersonService<Student> {
    private int count;
    private List<Student> studentList;

    // Список студентов
    public StudentService() {
        studentList = new ArrayList<>();
    }

    // Методы
    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public void create(String name, int age) {
        Student student = new Student(name, age);
        count++;
        studentList.add(student);
    }

    // Метод для сортировки по ФИО
    public void sortByFio() {
        PersonComparator<Student> personComparator = new PersonComparator<Student>();
        studentList.sort(personComparator);
    }
}
