package com.uglyeagle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    void testIsEven() {
        assertTrue(calc.isEven(4));
    }

    @Test
    void testIsPositive() {
        assertTrue(calc.isPositive(5));
        assertFalse(calc.isPositive(-5));
    }

    @Test
    void testMax() {
        assertEquals(5, calc.max(5, 2));
    }
}
