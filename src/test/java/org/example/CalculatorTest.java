package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = new Calculator();

    }
    // testing the add method
    @ParameterizedTest
    @CsvSource({"5,5,10", "3, 4,7"})
    @DisplayName("Test add with positive nrs")
    public void add_test_withPostiveNrs(double a, double b, double result) {
        double actual = calculator.add(a, b);
        assertEquals(result, actual);
    }

    // delta om om te gaan met afrondingsproblemen van double
    @Test
    public void addTimes_test_10times() {
        double result = calculator.addNrOfTimes(10);
        assertEquals(0.1, result, 0.00001);
    }

    @Test
    public void divide_test_by0() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(2, 0));
    }


}
