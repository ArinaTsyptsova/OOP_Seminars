package Domain;

public class Product {
    private String name;
    private int price;
    private int place;

    /**
     * Конструктор
     * 
     * @param name  - имя продукта
     * @param price - цена продукта
     * @param place - место продукта
     */
    public Product(String name, int price, int place) {
        this.name = name;
        this.price = price;
        this.place = place;
        // setPrsice(price); изменить цену
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int value) {
        if (value <= 0)
            this.price = 10;
        else
            this.price = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return String.format("Продукт = %s, Цена = %d, Место = %d", this.name, this.price, this.place);
    }
}
