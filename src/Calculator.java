public class Calculator {
    private CalculatorStrategy strategy;

    public void setStrategy(CalculatorStrategy strategy) {
        this.strategy = strategy;
    }

    public double performOperation(double num1, double num2) {
        if (strategy == null) {
            throw new IllegalStateException("Не задана стратегия для калькулятора.");
        }
        return strategy.calculate(num1, num2);
    }
}