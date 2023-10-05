public class AdditionStrategy implements CalculatorStrategy {
    @Override
    public double calculate(double num1, double num2) {
        return num1 + num2;
    }
}