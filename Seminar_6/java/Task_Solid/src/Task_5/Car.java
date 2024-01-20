package Task_5;

/**
 * Класс для автомобиля
 */
public class Car {
    private Engine engine;

    /**
     * Конструктор
     * 
     * @param engine тип двигателя
     */
    public Car(Engine engine) {
        this.engine = engine;
    }

    // Методы
    public void start() {
        this.engine.start();
    }
}
