package Task_3;

/*
 * Класс для куба
 */
public class Cube implements Shape, Volume {
    // Поля
    private int edge;

    /**
     * 
     * @param edge ребро куба
     */
    public Cube(int edge) {
        this.edge = edge;
    }

    // Методя для вычисления площади
    @Override
    public double area() {
        return 6 * edge * edge;
    }

    // Методя для вычисления объема
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
