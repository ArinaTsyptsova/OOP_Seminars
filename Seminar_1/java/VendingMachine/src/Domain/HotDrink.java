package Domain;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, int price, int place, int temperature) {
        super(name, price, place);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Температура = %d", this.temperature);
    }
}