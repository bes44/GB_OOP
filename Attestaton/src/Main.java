/**
 * Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
 * Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
 * Соблюдать принципы SOLID, паттерны проектирования.
 * Можно выбрать другой язык программирования, например C# или Python, если выбран язык, отличный от JAVA,
 * то необходимо написать документ, каким образом можно запустить приложение (что необходимо установить,
 * каким образом запускать и т.п.).
 */

public class Main {
    public static void main(String[] args) {
        ComplexCalculator calculator = new ComplexCalculator();
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, 4);

        ComplexNumber resultAdd = calculator.add(num1, num2);
        CalculatorLogger.log("Addition: " + resultAdd);

        ComplexNumber resultMultiply = calculator.multiply(num1, num2);
        CalculatorLogger.log("Multiplication: " + resultMultiply);

        ComplexNumber resultDivide = calculator.divide(num1, num2);
        CalculatorLogger.log("Division: " + resultDivide);
    }
}