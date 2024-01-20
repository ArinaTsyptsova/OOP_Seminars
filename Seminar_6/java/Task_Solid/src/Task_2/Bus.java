package Task_2;

public class Bus extends Vehicle {
    /**
     * 
     * @param maxSpeed максимальная скорость автобуса
     */
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    // Метод для расчета скорости
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }

}
