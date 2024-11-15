package com.example.testwithgpt;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdditional() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 must be 5");
    }

    @Test
    public void testSubtract() {
        assertEquals(5, calculator.subtract(7, 2), "7 - 2 must be 5");
    }

    @Test
    public void testMultiplication() {
        assertEquals(12, calculator.multiplication(3, 4), "3 * 4 must be 12");
    }

    @Test
    public void testDivision() {
        assertEquals(5, calculator.division(25, 5), "25 / 5 must be 5");
    }

    @Test
    public void testDivisionByZero() {
        ArithmeticException e = assertThrows(
                ArithmeticException.class,
                () -> calculator.division(25, 0),
                "Expected divizion by zero to throw ArithmeticException"
        );
        assertEquals("Division by zero is not allowed", e.getMessage());
    }
    @Test
    public void testDivisionWithZeroNumerator() {
        assertEquals(0.0, calculator.division(0, 5), "0 / 5 must be 0.0");
    }


}
