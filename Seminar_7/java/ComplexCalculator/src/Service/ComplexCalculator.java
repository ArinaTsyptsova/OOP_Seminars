package Service;
import java.util.logging.Level;
import java.util.logging.Logger;

import Model.Core.ComplexNumber;

/**
 * Класс для комплесксного калькулятора
 */
public class ComplexCalculator implements iCalculator {
    // Поля
    private Logger logger;

    /**
     * Конструктор
     */
    public ComplexCalculator() {
        logger = Logger.getLogger(ComplexCalculator.class.getName());
    }

    // Переоопредление методов сложения, умножения и деления
    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getRealPart() + num2.getRealPart();
        double imagPart = num1.getImagPart() + num2.getImagPart();

        ComplexNumber result = new ComplexNumber(realPart, imagPart);

        logger.log(Level.INFO, "Результат сложения: " + result.getRealPart() + " + " + result.getImagPart() + "i");
        return result;
    }

    @Override
    public ComplexNumber muliply(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getRealPart() * num2.getRealPart() - num1.getImagPart() * num2.getImagPart();
        double imagPart = num1.getImagPart() * num2.getImagPart() + num1.getImagPart() * num2.getRealPart();

        ComplexNumber result = new ComplexNumber(realPart, imagPart);

        logger.log(Level.INFO, "Результат умножения: " + result.getRealPart() + " + " + result.getImagPart() + "i");
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        double denominator = num1.getRealPart() * num2.getRealPart() + num1.getImagPart() * num2.getImagPart();
        double realPart = (num1.getRealPart() * num2.getRealPart() + num1.getImagPart() * num2.getImagPart())
                / denominator;
        double imagPart = (num1.getImagPart() * num2.getRealPart() - num1.getRealPart() * num2.getImagPart())
                / denominator;

        ComplexNumber result = new ComplexNumber(realPart, imagPart);

        logger.log(Level.INFO, "Результат деления: " + result.getRealPart() + " + " + result.getImagPart() + "i");
        return result;
    }

}
