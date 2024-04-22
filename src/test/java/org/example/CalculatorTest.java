package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    // testing the add method
    @Test
    public void add_test_withPostiveNrs() {
        Calculator calculator = new Calculator();
        double result = calculator.add(2, 4);
        assertEquals(6.0, result);
    }

    // delta om om te gaan met afrondingsproblemen van double
    @Test
    public void addTimes_test_10times() {
        Calculator calculator = new Calculator();
        double result = calculator.addNrOfTimes(10);
        assertEquals(0.1, result, 0.00001);
    }

    @Test
    public void divide_test_by0() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(2, 0));
    }


}
