package Model;

import Controller.Interfaces.iGetModel;
import Model.Core.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс c модель. данных с использованием HashMap
 */
public class ModelClassHash implements iGetModel {
    private HashMap<Integer, Student> studentHashMap;
    private List<iGetModel> otherModels; // список других моделей

    /**
     * Конструктор
     */
    public ModelClassHash(List<iGetModel> otherModels) {
        this.studentHashMap = new HashMap<>();
        this.otherModels = otherModels;
    }

    /**
     * Получение списка студентов из текущей модели
     */
    @Override
    public List<Student> getStudents() {
        return new ArrayList<>(studentHashMap.values());
    }

    /**
     * Добавление студентов по идентификатору
     */
    public void addStudent(Student student) {
        studentHashMap.put(student.getId(), student);
    }

    /**
     * Получение студентов по идентификатору
     */
    @Override
    public Student getStudentById(int studentId) {
        Student student = studentHashMap.get(studentId);
        if (student == null) {
            for (iGetModel otherModel : otherModels) {
                student = otherModel.getStudentById(studentId);
                if (student != null) {
                    break;
                }
            }
        }
        return student;
    }

    /**
     * Удаление студентов по идентификатору
     */
    @Override
    public void deleteStudent(int studentId) {
        studentHashMap.remove(studentId);
    }

    /**
     * Поиск студента по идентификатору
     */
    @Override
    public List<Student> searchStudentById(int studentId) {
        List<Student> result = new ArrayList<>();
        Student student = getStudentById(studentId);
        if (student != null) {
            result.add(student);
        }
        return result;
    }

    /**
     * Добавление модели к текущей
     */
    public void addOtherModel(iGetModel otherModel) {
        this.otherModels.add(otherModel);
    }
}
