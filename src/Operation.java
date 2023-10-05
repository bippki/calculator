public class Operation {
    public class AdditionStrategy implements CalculatorStrategy {
        @Override
        public double calculate(double num1, double num2) {
            return num1 + num2;
        }
    }

    public class SubtractionStrategy implements CalculatorStrategy {
        @Override
        public double calculate(double num1, double num2) {
            return num1 - num2;
        }
    }

    public class MultiplicationStrategy implements CalculatorStrategy {
        @Override
        public double calculate(double num1, double num2) {
            return num1 * num2;
        }
    }

    public class DivisionStrategy implements CalculatorStrategy {
        @Override
        public double calculate(double num1, double num2) {
            if (num2 == 0) {
                throw new IllegalArgumentException("Деление на ноль невозможно.");
            }
            return num1 / num2;
        }
    }
}
