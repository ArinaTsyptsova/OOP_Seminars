package Task_3;

/*
 * Класс для круга
 */
public class Circle implements Shape {
    // Поля
    private double radius;

    /**
     * 
     * @param radius радиус круга
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    // Методя для вычисления площади
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
