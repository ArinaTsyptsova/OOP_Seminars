package Domain;

/*
 * Дочерний класс для персонала
 */
public class Employee extends Person {
    // Поля
    private String special;

    /**
     * Конструктор
     * 
     * @param name    // Имя
     * @param age     // Возраст
     * @param special // Специальность
     */
    public Employee(String name, int age, String special) {
        super(name, age);
        this.special = special;
    }

    // Методы
    public String getSpecial() {
        return special;
    }

}
