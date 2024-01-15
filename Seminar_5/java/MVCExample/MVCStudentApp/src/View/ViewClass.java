package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

/**
 * Класс представления на русском языке
 */
public class ViewClass implements iGetView {
    // Вывод списка студентов
    public void printAllStudents(List<Student> students) {
        System.out.println("-----Список студентов-----");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("---------------------");
    }

    // Запрос ввода пользователя
    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }

    /**
     * Запрос ввода идентификатора студента
     */
    @Override
    public int promptStudentId() {
        String text = prompt("Введите идентификатор студента: ");
        try {
            return Integer.parseInt(text);
        } catch (Exception e) {
            System.out.println("Некорректный ввод");
            return promptStudentId();
        }
    }

    /**
     * Выбор языка
     */
    @Override
    public String chooseLanguage() {
        return prompt("Пожалуйста, выберите язык:\nRU - русский\nEN - английский ").toUpperCase();
    }
}