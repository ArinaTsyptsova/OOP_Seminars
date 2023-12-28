import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controler.AccountController;
import Domain.Employee;
import Domain.PersonComparator;
import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;
import Domain.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        // Студенты
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

        // Формиурем списки
        List<Student> students1 = new ArrayList<>();
        students1.add(student1);
        students1.add(student2);
        students1.add(student3);

        List<Student> students2 = new ArrayList<>();
        students2.add(student4);
        students2.add(student5);
        students2.add(student6);

        List<Student> students3 = new ArrayList<>();
        students3.add(student7);
        students3.add(student8);

        List<Student> students4 = new ArrayList<>();
        students4.add(student9);
        students4.add(student10);
        students4.add(student11);
        students4.add(student12);

        // Общий список студентов
        List<Student> listStud = new ArrayList<Student>();
        listStud.add(student1);
        listStud.add(student2);
        listStud.add(student3);
        listStud.add(student4);
        listStud.add(student5);
        listStud.add(student6);
        listStud.add(student7);
        listStud.add(student8);
        listStud.add(student9);
        listStud.add(student10);
        listStud.add(student11);
        listStud.add(student12);

        // Формируем группы в соотвествии со списками
        StudentGroup studentGroup1 = new StudentGroup(5281, students1);
        StudentGroup studentGroup2 = new StudentGroup(5582, students2);
        StudentGroup studentGroup3 = new StudentGroup(5280, students3);
        StudentGroup studentGroup4 = new StudentGroup(5583, students4);

        // Список групп
        List<StudentGroup> studentGroups = new ArrayList<>();
        studentGroups.add(studentGroup1);
        studentGroups.add(studentGroup2);
        studentGroups.add(studentGroup3);
        studentGroups.add(studentGroup4);

        // Формируем поток
        StudentSteam studentSteam = new StudentSteam(1, studentGroups);

        // Печатаем список групп
        System.out.println(studentSteam);

        // Сортируем группы по количеству студентов, потом по идентификатору
        Collections.sort(studentSteam.getGroups());

        // Печатаем список групп
        System.out.println(studentSteam);

        // Создаем учителей и формируем список
        Teacher t1 = new Teacher("Татьяна", 55, "Docent");
        Teacher t2 = new Teacher("Галина", 57, "Docent");
        List<Teacher> listTeachers = new ArrayList<Teacher>();
        listTeachers.add(t1);
        listTeachers.add(t2);

        // Создаем работников и формируем список
        Employee e1 = new Employee("Владимир", 38, "Уборщик");
        Employee e2 = new Employee("Валерий", 50, "Главный по тарелкам");
        List<Employee> listEmployees = new ArrayList<Employee>();
        listEmployees.add(e1);
        listEmployees.add(e2);

        System.out.println(new PersonComparator<Student>().compare(student1, student2));

        // AccountController.paySalary(t1, 50000);

        // Печатаем средний возраст
        System.out.println("Средний возраст студентов = " + AccountController.averageAge(listStud));
        System.out.println("Средний возраст учителей = " + AccountController.averageAge(listTeachers));
        System.out.println("Средний возраст работников = " + AccountController.averageAge(listEmployees));

    }
}
