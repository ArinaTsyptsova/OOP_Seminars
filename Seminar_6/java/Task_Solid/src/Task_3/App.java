package Task_3;

public class App {
    public static void main(String[] args) {

        Cube cube = new Cube(5);
        Circle circle = new Circle(20);

        System.out.println("Площадь круга: " + circle.area());
        System.out.println("Объем куба: " + cube.volume());
        System.out.println("Площадь куба: " + cube.area());
    }
}
