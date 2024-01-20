package Task_2;

public class Car extends Vehicle {
    /**
     * 
     * @param maxSpeed мааимальная скорость автомобиля
     */
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    // Метод для расчета скорости
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }

}
