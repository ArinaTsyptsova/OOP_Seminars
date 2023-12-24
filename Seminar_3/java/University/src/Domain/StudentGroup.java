package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс для группы студентов университета
 * Интерфейсы - Iterable для перебора списка студентов групп и Comparable для
 * сортировки групп
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    // Поля
    private int numberGroup; // Номер группы
    List<Student> students; // Список студентов группы

    /**
     * Конструктор
     * 
     * @param numberGroup // Номер группы
     * @param students    // Список студентов группы
     */
    public StudentGroup(int numberGroup, List<Student> students) {
        this.numberGroup = numberGroup;
        this.students = students;
    }

    // Методы
    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    /**
     * @return Возвращает значение количества учащихся в группе
     */
    public int getSizeStudentGroup() {
        return students.size();
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();
        list.append(String.format("Номер группы - %d, Количество студентов - %d; Список студентов:\n",
                getNumberGroup(), getSizeStudentGroup()));
        for (Student student : students) {
            list.append(student).append("\n");
        }
        return list.toString();
    }

    // Доступ к списку сдудентов в группе
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(students);
    }

    // Переопредление метода CompareTo
    @Override
    public int compareTo(StudentGroup o) {
        if (getSizeStudentGroup() < o.getSizeStudentGroup()) {
            return -1;
        } else if (getSizeStudentGroup() > o.getSizeStudentGroup()) {
            return 1;
        }
        if (getNumberGroup() < o.getNumberGroup()) {
            return -1;
        } else if (getNumberGroup() > o.getNumberGroup()) {
            return 1;
        }
        return 0;
    }
}
