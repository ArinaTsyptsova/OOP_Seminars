package Task_5;

public class App {
    public static void main(String[] args) {

        Engine petrolEngine = new PetrolEngine();
        Engine diselEngine = new DiselEngine();

        Car petrolCar = new Car(petrolEngine);
        Car diselCar = new Car(diselEngine);

        petrolCar.start();
        diselCar.start();
    }
}
