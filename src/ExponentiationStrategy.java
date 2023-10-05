public class ExponentiationStrategy implements CalculatorStrategy {
    @Override
    public double calculate(double num1, double num2) {
        double result = Math.pow(num1, num2);

        if (Double.isInfinite(result)) {
            throw new ArithmeticException("Результат возведения в степень слишком велик (переполнение).");
        }

        return result;
    }
}