package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс для перебора групп в потоке
 */
public class StudentGroupIterator implements Iterator<StudentGroup> {
    // Поля
    private int count;
    private List<StudentGroup> groups;

    /**
     * 
     * @param groups // Группы
     */
    public StudentGroupIterator(List<StudentGroup> groups) {
        this.groups = groups;
        count = 0;
    }

    // Методы
    @Override
    public boolean hasNext() {
        return count < groups.size();
    }

    @Override
    public StudentGroup next() {
        return groups.get(count++);
    }

}
