package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MyCalculatorTest {

    @Test
    public void testCompute_Addition() {
        MyCalculator calculator = new MyCalculator();
        String expression = "2 3 +";
        int result = calculator.compute(expression);
        assertEquals(5, result, "2 + 3 should be 5");
    }

    @Test
    public void testCompute_Subtraction() {
        MyCalculator calculator = new MyCalculator();
        String expression = "5 3 -";
        int result = calculator.compute(expression);
        assertEquals(2, result, "5 - 3 should be 2");
    }

    @Test
    public void testCompute_Multiplication() {
        MyCalculator calculator = new MyCalculator();
        String expression = "2 3 *";
        int result = calculator.compute(expression);
        assertEquals(6, result, "2 * 3 should be 6");
    }

    @Test
    public void testCompute_Division() {
        MyCalculator calculator = new MyCalculator();
        String expression = "6 3 /";
        int result = calculator.compute(expression);
        assertEquals(2, result, "6 / 3 should be 2");
    }

    @Test
    public void testCompute_ComplexExpression() {
        MyCalculator calculator = new MyCalculator();
        String expression = "2 3 + 1 4 + *";
        int result = calculator.compute(expression);
        assertEquals(25, result, "The expression 2 3 + 1 4 + * should be 14");
    }

    @Test
    public void testCompute_MixedOperations() {
        MyCalculator calculator = new MyCalculator();
        String expression = "5 1 2 + 4 * + 3 -";
        int result = calculator.compute(expression);
        assertEquals(14, result, "The expression 5 1 2 + 4 * + 3 - should be 14");
    }

    @Test
    public void testCompute_DivisionByZero() {
        MyCalculator calculator = new MyCalculator();
        String expression = "5 0 /";
        try {
            calculator.compute(expression);
        } catch (ArithmeticException e) {
            assertEquals("/ by zero", e.getMessage(), "Division by zero should throw an ArithmeticException");
        }
    }
}
