package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyCalculatorTest {

    private MyCalculator calculator = new MyCalculator();

    @Test
    void testEvaluateSimpleAddition() {
        assertEquals(5.0, calculator.compute("2 3 +"));
    }

    @Test
    void testEvaluateSimpleSubtraction() {
        assertEquals(1.0, calculator.compute("5 4 -"));
    }

    @Test
    void testEvaluateSimpleMultiplication() {
        assertEquals(12.0, calculator.compute("3 4 *"));
    }

    @Test
    void testEvaluateSimpleDivision() {
        assertEquals(4.0, calculator.compute("8 2 /"));
    }

    @Test
    void testEvaluateMultipleOperations() {
        assertEquals(14.0, calculator.compute("3 4 + 2 *"));
    }

    @Test
    void testEvaluateWithDivisionByZero() {
        try {
            calculator.compute("2 0 /");
            fail("Expected ArithmeticException not thrown");
        } catch (ArithmeticException e) {
            // Expected exception
        }
    }

    @Test
    void testEvaluateEmptyExpression() {
        try {
            calculator.compute("");
            fail("Expected IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    void testEvaluateNullExpression() {
        try {
            calculator.compute(null);
            fail("Expected IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    void testEvaluateWithInvalidToken() {
        try {
            calculator.compute("3 4 @");
            fail("Expected IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }
}
