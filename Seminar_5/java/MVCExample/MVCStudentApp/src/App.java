import java.util.ArrayList;
import java.util.List;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClassHash;
import Model.Core.Student;
import View.ViewClass;
import View.ViewEngClass;

public class App {
    public static void main(String[] args) throws Exception {
        // Формируем студентов
        Student student1 = new Student("Иван", 21);
        Student student2 = new Student("Анна", 20);
        Student student3 = new Student("Сергей", 23);
        Student student4 = new Student("Василий", 21);
        Student student5 = new Student("Марина", 22);
        Student student6 = new Student("Виталий", 25);
        Student student7 = new Student("Добрыня", 44);
        Student student8 = new Student("Владимир", 24);
        Student student9 = new Student("Виктория", 21);
        Student student10 = new Student("Александра", 22);
        Student student11 = new Student("Корнелия", 23);
        Student student12 = new Student("Ева", 21);

        // Вывод списка студентов с помощью HashMap
        iGetModel modelHash1 = new ModelClassHash(new ArrayList<>());
        iGetModel modelHash2 = new ModelClassHash(new ArrayList<>());

        // Добавляем вторую модель в первую
        ((ModelClassHash) modelHash1).addOtherModel(modelHash2);

        modelHash1.addStudent(student1);
        modelHash1.addStudent(student3);
        modelHash1.addStudent(student5);
        modelHash1.addStudent(student7);
        modelHash1.addStudent(student9);
        modelHash1.addStudent(student11);

        modelHash2.addStudent(student2);
        modelHash2.addStudent(student4);
        modelHash2.addStudent(student6);
        modelHash2.addStudent(student8);
        modelHash2.addStudent(student10);
        modelHash2.addStudent(student12);

        // Выбор языка
        iGetView viewSimple = new ViewClass();
        String language = viewSimple.chooseLanguage();
        if ("EN".equals(language)) {
            viewSimple = new ViewEngClass();
        }

        ControllerClass controller = new ControllerClass(modelHash1, viewSimple);

        controller.run();
    }
}
