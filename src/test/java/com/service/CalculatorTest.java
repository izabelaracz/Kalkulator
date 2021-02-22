package com.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MyTestWatcher.class)
 class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void init() {
        this.calculator = new Calculator();
    }

    @Test
    void addTestPlusPlus() {
        assertEquals(8.0f, calculator.add(4.0f, 4.0f));
    }

    @Test
    void addTestPlusMinus() {
        assertEquals(0.0f, calculator.add(4.0f, -4.0f));
    }

    @Test
    void addTestMinusMinus() {
        assertEquals(-8.0f, calculator.add(-4.0f, -4.0f));
    }

    @Test
    void addTestZero() {
        assertEquals(-4.0f, calculator.add(0.0f, -4.0f));
    }

    @Test
    void subTestPlusPlus() {
        assertEquals(0.0f, calculator.sub(4.0f, 4.0f));
    }

    @Test
    void subTestPlusMinus() {
        assertEquals(8.0f, calculator.sub(4.0f, -4.0f));
    }

    @Test
    void subTestMinusPlus() {
        assertEquals(-8.0f, calculator.sub(-4.0f, 4.0f));
    }

    @Test
    void subTestMinusMinus() {
        assertEquals(0.0f, calculator.sub(-4.0f, -4.0f));
    }

    @Test
    void multiTestPlusPlus() {
        assertEquals(16.0f, calculator.multi(4.0f, 4.0f));
    }

    @Test
    void multiTestPlusMinus() {
        assertTrue(calculator.multi(4.0f, -4.0f) < 0);
    }

    @Test
    void multiTestZero() {
        assertEquals(0.0f, calculator.multi(4.0f, 0.0f));
    }

    @Test
    void divTestPlusPlus() {
        assertEquals(2.0f, calculator.div(4.0f, 2.0f));
    }

    @Test
    void divTestPlusMinus() {
        assertEquals(-2.0f, calculator.div(4.0f, -2.0f));
    }

    @Test
    void divTestMinusMinus() {
        assertEquals(2.0f, calculator.div(-4.0f, -2.0f));
    }

    @Test
    void divTestByZero() {
        assertThrows(ArithmeticException.class, () ->
                calculator.div(2.0f, 0.0f));
    }

    @Test
    void modTestByZero() {
        assertThrows(ArithmeticException.class, () ->
                calculator.mod(2.0f, 0.0f));
    }

    @Test
    void modTestBasic() {
        assertEquals(1.0f, calculator.mod(13.0f, 2.0f));
    }

}
