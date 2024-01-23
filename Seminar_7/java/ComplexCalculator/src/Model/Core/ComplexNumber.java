package Model.Core;
/**
 * Класс для комплексных чисел
 */
public class ComplexNumber {
    // Поля
    public double realPart;
    public double imagPart;

    /**
     * Конструктор
     * 
     * @param realPart реальная часть числа
     * @param imagPart мнимая часть числа
     */
    public ComplexNumber(double realPart, double imagPart) {
        this.realPart = realPart;
        this.imagPart = imagPart;
    }

    // Геттеры и сеттеры
    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImagPart() {
        return imagPart;
    }

    public void setImagPart(double imagPart) {
        this.imagPart = imagPart;
    }

}
