package Task_4;

public class App {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7);
        Rectangle square = new Rectangle(8);

        System.out.println("Площадь прямоугольника: " + rectangle.area());
        System.out.println("Площадь квадрата:" + square.area());
    }
}