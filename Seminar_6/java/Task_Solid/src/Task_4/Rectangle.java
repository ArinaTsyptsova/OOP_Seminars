package Task_4;

/**
 * Класс для прямогульника
 */
public class Rectangle extends Square {
    // Поля
    private int width;
    private int height;

    /**
     * Конструктор для квадрата
     * 
     * @param width ширина
     */
    public Rectangle(int width) {
        this(width, width);
    }

    /**
     * Конструктор для прямоугольника
     * 
     * @param width  ширина
     * @param height высота
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Методы
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }
}
