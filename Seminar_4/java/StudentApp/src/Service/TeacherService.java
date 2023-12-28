package Service;

import java.util.ArrayList;
import java.util.List;
import Domain.PersonComparator;
import Domain.Teacher;

/**
 * Класс для управления учителями
 */
public class TeacherService implements iPersonService<Teacher> {
    // Поля
    private int count;
    private List<Teacher> teacherList;

    // Список учителей
    public TeacherService() {
        teacherList = new ArrayList<>();
    }

    // Методы
    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void create(String name, int age) {
        Teacher teacher = new Teacher(name, age, "basic");
        count++;
        teacherList.add(teacher);
    }

    // Метод для сортировки по ФИО
    public void sortByFio() {
        PersonComparator<Teacher> personComparator = new PersonComparator<Teacher>();
        teacherList.sort(personComparator);
    }

}
