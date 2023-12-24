package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс для потока студентов из различных групп
 */
public class StudentSteam implements Iterable<StudentGroup> {
    private int numberSteam; // Идентификатор потока
    private List<StudentGroup> groups; // Список групп

    /**
     * Конструктор
     * 
     * @param numberSteam // Идентификатор потока
     * @param groups      // Список групп
     */
    public StudentSteam(int numberSteam, List<StudentGroup> groups) {
        this.numberSteam = numberSteam;
        this.groups = groups;
    }

    // Методы
    public int getNumberSteam() {
        return numberSteam;
    }

    public void setNumberSteam(int numberSteam) {
        this.numberSteam = numberSteam;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    // Метод для доступа к списку стдентов в группе
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentGroupIterator(groups);
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();
        list.append(String.format("Номер потока - %d; Количество групп - %d\n\n", getNumberSteam(), groups.size()));
        for (StudentGroup group : groups) {
            list.append(group.toString()).append("\n");
        }
        return list.toString();
    }
}
