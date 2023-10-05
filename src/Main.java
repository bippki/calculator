





// Шаг 3: Создаем класс Calculator, который использует стратегию

// Шаг 4: Используем калькулятор в основном классе
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            calculator.setStrategy(new AdditionStrategy());
            double result1 = calculator.performOperation(5, 3);
            System.out.println("Результат сложения: " + result1);

            calculator.setStrategy(new SubtractionStrategy());
            double result2 = calculator.performOperation(10, 4);
            System.out.println("Результат вычитания: " + result2);

            calculator.setStrategy(new MultiplicationStrategy());
            double result3 = calculator.performOperation(700000000, 700000000);
            System.out.println("Результат умножения: " + result3);

            calculator.setStrategy(new DivisionStrategy());
            double result4 = calculator.performOperation(8, 1); // Попытка деления на ноль
            System.out.println("Результат деления: " + result4);

            calculator.setStrategy(new ExponentiationStrategy());
            double result5 = calculator.performOperation(2, 4); // Возведение в степень
            System.out.println("Результат возведения в степень: " + result5);


        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}