package Domain;

/**
 * Дочерний класс для преподавателя
 */
public class Teacher extends Person {
    // Поля
    private String degree;

    /**
     * Констурктор
     * 
     * @param name   // Имя
     * @param age    // Возраст
     * @param degree // Ученая степень
     */
    public Teacher(String name, int age, String degree) {
        super(name, age);
        this.degree = degree;
    }

    // Методы
    public String getDegree() {
        return degree;
    }

}
