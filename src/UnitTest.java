import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class UnitTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        calculator.setStrategy(new AdditionStrategy());
        double result = calculator.performOperation(5, 3);
        assertEquals(8, result, 0.001); // Ожидаем, что 5 + 3 = 8
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        calculator.setStrategy(new SubtractionStrategy());
        double result = calculator.performOperation(10, 4);
        assertEquals(6, result, 0.001);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        calculator.setStrategy(new MultiplicationStrategy());
        double result = calculator.performOperation(7, 2);
        assertEquals(14, result, 0.001);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        calculator.setStrategy(new DivisionStrategy());
        double result = calculator.performOperation(8, 2);
        assertEquals(4, result, 0.001);
    }


    @Test
    public void testExponentiation() {
        Calculator calculator = new Calculator();
        calculator.setStrategy(new ExponentiationStrategy());
        double result = calculator.performOperation(2, 4);
        assertEquals(16, result, 0.001);
    }

    @Test
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        calculator.setStrategy(new DivisionStrategy());
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.performOperation(8, 0));

        assertEquals("Деление на ноль невозможно.", exception.getMessage());

    }

    @Test
    public void testExponentiationOverflow() {
        Calculator calculator = new Calculator();
        calculator.setStrategy(new ExponentiationStrategy());

        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.performOperation(Double.MAX_VALUE, 2));

        assertEquals("Результат возведения в степень слишком велик (переполнение).", exception.getMessage());
    }

}