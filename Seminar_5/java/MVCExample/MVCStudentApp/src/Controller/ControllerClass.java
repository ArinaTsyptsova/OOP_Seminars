package Controller;

import java.util.ArrayList;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Core.Student;

/**
 * Класс контроллера, который обспечивает взаимодейтсвие между Model и View
 */
public class ControllerClass {
    // Поля
    private iGetModel model;
    private iGetView view;
    // Поля mvp
    private List<Student> studentBuffer = new ArrayList<>();

    // Констурктор
    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    // Проверка наличия данных
    private boolean testData(List<Student> stud) {
        if (stud.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Метод обновления данных, вывод списка студентов
     */
    public void update() {

        // MVP
        studentBuffer = model.getStudents();

        if (testData(studentBuffer)) {
            view.printAllStudents(studentBuffer);
        } else {
            System.out.println("Список студентов пуст!");
        }
    }

    /**
     * Метод ля выполнения команд
     */
    public void run() {
        Command com = (Command) Command.NONE;
        boolean getNewIter = true;
        while (getNewIter) {
            String command = view.prompt("Введите команду одну из команд: " +
                    "\nLIST - для вывода списка студентов" +
                    "\nSEARCH - для поиска студента по id" +
                    "\nDELETE - для удаления студента из списка по id" +
                    "\nEXIT - для выхода из программы ");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIter = false;
                    System.out.println("Выход из программы");
                    break;
                case LIST:
                    listStudents();
                    break;
                case DELETE:
                    deleteStudent();
                    break;
                case SEARCH:
                    searchStudent();
                    break;
            }
        }
    }

    /**
     * Вывод списка студентов
     */
    private void listStudents() {
        view.printAllStudents(model.getStudents());
    }

    /**
     * Удаление студента
     */
    private void deleteStudent() {
        int studentId = view.promptStudentId();
        List<Student> students = model.getStudents();
        if (studentExists(students, studentId)) {
            model.deleteStudent(studentId);
            System.out.println("Студент удален");
        } else {
            System.out.println("Студента с таким номером не существует");
        }
    }

    /**
     * Проверка студента в списке
     */
    private boolean studentExists(List<Student> students, int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                return true;
            }
        }
        return false;
    }

    /**
     * Поиск студента по идентификатору, печать
     */
    private void searchStudent() {
        int studentId = view.promptStudentId();
        Student foundStudent = model.getStudentById(studentId);
        if (foundStudent != null) {
            view.printAllStudents(List.of(foundStudent));
        } else {
            System.out.println("Студент с id " + studentId + " не найден");
        }
    }
}