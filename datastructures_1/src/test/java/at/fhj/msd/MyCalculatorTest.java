package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyCalculatorTest {

    private MyCalculator calc;

    @BeforeEach
    void setUp() {
        calc = new MyCalculator();
    }

    @Test
    void testAddition() {
        assertEquals(5.0, calc.evaluate("2 3 +"));
    }

    @Test
    void testSubtraction() {
        assertEquals(1.0, calc.evaluate("3 2 -"));
    }

    @Test
    void testMultiplication() {
        assertEquals(6.0, calc.evaluate("2 3 *"));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calc.evaluate("6 3 /"));
    }

    @Test
    void testComplexExpression() {
        assertEquals(14.0, calc.evaluate("5 1 2 + 4 * + 3 -")); // = 5 + (1 + 2)*4 - 3
    }

    @Test
    void testSingleNumber() {
        assertEquals(42.0, calc.evaluate("42"));
    }

    @Test
    void testInvalidToken() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> calc.evaluate("2 3 &"));
        assertTrue(ex.getMessage().contains("Invalid token"));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calc.evaluate("4 0 /"));
    }

    @Test
    void testEmptyInput() {
        assertThrows(IllegalArgumentException.class, () -> calc.evaluate(""));
    }

    @Test
    void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> calc.evaluate(null));
    }

    @Test
    void testTooFewOperands() {
        assertThrows(IllegalStateException.class, () -> calc.evaluate("5 +"));
    }

    @Test
    void testTooManyOperandsLeft() {
        assertThrows(IllegalStateException.class, () -> calc.evaluate("2 3 4 +"));
    }
}
