package Controller.Interfaces;

import java.util.List;

import Model.Core.Student;

/**
 * Интерфейс с методами, взаимодействующими с данными
 */
public interface iGetModel {
    public List<Student> getStudents(); // Список студентов

    void addStudent(Student student); // Добавление студента

    void deleteStudent(int studentId); // Удаление студента по идентификатору

    Student getStudentById(int studentId); // Получение студента по идентификатору

    List<Student> searchStudentById(int studentId); // Поиск студента по идентификатору
}
