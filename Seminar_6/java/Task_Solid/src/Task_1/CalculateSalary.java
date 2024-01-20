package Task_1;

public class CalculateSalary {
    // Поля
    private int baseSalary;

    // Констуруктор
    public CalculateSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Метод вычисления зарплаты
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.5);// calculate in otherway
        return baseSalary - tax;
    }
}
