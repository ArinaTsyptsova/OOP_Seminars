package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс для перебора студентов в группах
 */
public class StudentIterator implements Iterator<Student> {
    // Поля
    private int count;
    private List<Student> students;

    /**
     * 
     * @param students // Стуенты в группе
     */
    public StudentIterator(List<Student> students) {
        this.students = students;
        count = 0;
    }

    // Методы
    @Override
    public boolean hasNext() {
        return count < students.size();
    }

    @Override
    public Student next() {
        return students.get(count++);
    }

}
