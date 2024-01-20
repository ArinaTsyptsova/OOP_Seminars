package Task_2;

public class App {
    public static void main(String[] args) {

        Car car = new Car(115);
        Bus bus = new Bus(80);

        SpeedCalculation speed = new SpeedCalculation();

        double speedCar = speed.calculateAllowedSpeed(car);
        double speedBus = speed.calculateAllowedSpeed(bus);

        System.out.println("Скорость автомобиля: " + speedCar);
        System.out.println("Скорость автобуса: " + speedBus);
    }
}
