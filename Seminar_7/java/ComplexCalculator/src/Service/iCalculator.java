package Service;

import Model.Core.ComplexNumber;
/**
 * Интерфейс для калькулятора
 */
public interface iCalculator {
    // Метод сложения
    ComplexNumber add(ComplexNumber num1, ComplexNumber num2);

    // Метод умножения
    ComplexNumber muliply(ComplexNumber num1, ComplexNumber num2);

    // Метод деления
    ComplexNumber divide(ComplexNumber num1, ComplexNumber num2);
}
