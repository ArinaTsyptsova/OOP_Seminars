import Model.Core.ComplexNumber;
import Service.ComplexCalculator;

public class App {
    public static void main(String[] args) throws Exception {
        // Задаем числа
        ComplexNumber number1 = new ComplexNumber(1, 2);
        ComplexNumber number2 = new ComplexNumber(5, 8);

        ComplexCalculator complexCal = new ComplexCalculator();

        ComplexNumber resultAdd = complexCal.add(number1, number2);
        ComplexNumber resultMul = complexCal.muliply(number1, number2);
        ComplexNumber resultDiv = complexCal.divide(number1, number2);
        
    }
}
