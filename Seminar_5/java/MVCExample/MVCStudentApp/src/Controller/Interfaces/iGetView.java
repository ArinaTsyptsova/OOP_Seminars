package Controller.Interfaces;

import java.util.List;

import Model.Core.Student;

/**
 * Интерфейс с методами, взаимодействующими с интерфейсом пользователя
 */
public interface iGetView {
    void printAllStudents(List<Student> students);

    String prompt(String msg);

    int promptStudentId();

    String chooseLanguage();
}
