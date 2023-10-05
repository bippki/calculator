public class DivisionStrategy implements CalculatorStrategy {
    @Override
    public double calculate(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно.");
        }
        return num1 / num2;
    }
}