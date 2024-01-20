package Task_2;

/**
 * Общий класс для транспорта
 */
public abstract class Vehicle {
    // Поля
    int maxSpeed;
    String type;

    /**
     * 
     * @param maxSpeed максимальная скорость
     * @param type     тип транспорта
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    // Получение макаимальной скорости
    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Получение типа
    public String getType() {
        return type;
    }

    // Метод для расчета скорости
    public abstract double calculateAllowedSpeed();
}
